package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku013Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku013Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;@Repository
public class CtKeiyaku013Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku013Mapper ctKeiyaku013Mapper;
    public List<CtKeiyaku013Bean> getInfoList() {
        List<CtKeiyaku013Bean> list =ctKeiyaku013Mapper.getInfoList();
        System.out.println("selectの保証会社プラン情報データ：" + list.toString());
        return list;
    }
    public CtKeiyaku013Bean getInfoById(String id) {
        CtKeiyaku013Bean ctKeiyaku013Bean = ctKeiyaku013Mapper.getInfoById(id);
        System.out.println("selectの保証会社プラン情報データ：" + ctKeiyaku013Bean.toString());
        return ctKeiyaku013Bean;
    }
    public void save(CtKeiyaku013Bean ctKeiyaku013Bean) {
        if (ctKeiyaku013Bean.getHokenPlanCode() == null
                || ctKeiyaku013Bean.getHokenPlanCode().isEmpty()) {
            // システムID
            ctKeiyaku013Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_HKP);
            // 保証会社プランコードの自動採番
            ctKeiyaku013Mapper.getNextSequence(map);
            ctKeiyaku013Bean.setHokenPlanCode(BzlSeqConstant.CONSTANT_BZL_HKP+(Integer)map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku013Bean);
        } else {
            update(ctKeiyaku013Bean);
        }
    }
    // 新規
    private void insert(CtKeiyaku013Bean ctKeiyaku013Bean) {
        System.out.println("insertの保証会社プラン情報データ：" + ctKeiyaku013Bean.toString());
        ctKeiyaku013Mapper.insertInfo(ctKeiyaku013Bean);
    }
    // 変更
    private void update(CtKeiyaku013Bean ctKeiyaku013Bean) {
        System.out.println("updateの保証会社プラン情報データ：" + ctKeiyaku013Bean.toString());
        ctKeiyaku013Mapper.updateInfo(ctKeiyaku013Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("deleteの保証会社プラン情報データ：keiyaku_mng_no = " + id);
        ctKeiyaku013Mapper.deleteInfo(id);
    }
}

