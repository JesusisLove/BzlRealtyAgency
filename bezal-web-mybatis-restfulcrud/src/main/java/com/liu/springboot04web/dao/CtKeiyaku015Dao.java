package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku015Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku015Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;@Repository
public class CtKeiyaku015Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku015Mapper ctKeiyaku015Mapper;
    public List<CtKeiyaku015Bean> getInfoList() {
        List<CtKeiyaku015Bean> list =ctKeiyaku015Mapper.getInfoList();
        System.out.println("selectの家財保険プラン情報データ：" + list.toString());
        return list;
    }
    public CtKeiyaku015Bean getInfoById(String id) {
        CtKeiyaku015Bean ctKeiyaku015Bean = ctKeiyaku015Mapper.getInfoById(id);
        System.out.println("selectの家財保険プラン情報データ：" + ctKeiyaku015Bean.toString());
        return ctKeiyaku015Bean;
    }
    public void save(CtKeiyaku015Bean ctKeiyaku015Bean) {
        if (ctKeiyaku015Bean.getKasaiPlanCode() == null
                || ctKeiyaku015Bean.getKasaiPlanCode().isEmpty()) {
            // システムID
            ctKeiyaku015Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_KSP);
            // 家財保険プランコードの自動採番
            ctKeiyaku015Mapper.getNextSequence(map);
            ctKeiyaku015Bean.setKasaiPlanCode(BzlSeqConstant.CONSTANT_BZL_KSP+(Integer)map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku015Bean);
        } else {
            update(ctKeiyaku015Bean);
        }
    }
    // 新規
    private void insert(CtKeiyaku015Bean ctKeiyaku015Bean) {
        System.out.println("insertの家財保険プラン情報データ：" + ctKeiyaku015Bean.toString());
        ctKeiyaku015Mapper.insertInfo(ctKeiyaku015Bean);
    }
    // 変更
    private void update(CtKeiyaku015Bean ctKeiyaku015Bean) {
        System.out.println("updateの家財保険プラン情報データ：" + ctKeiyaku015Bean.toString());
        ctKeiyaku015Mapper.updateInfo(ctKeiyaku015Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("deleteの家財保険プラン情報データ：keiyaku_mng_no = " + id);
        ctKeiyaku015Mapper.deleteInfo(id);
    }
}

