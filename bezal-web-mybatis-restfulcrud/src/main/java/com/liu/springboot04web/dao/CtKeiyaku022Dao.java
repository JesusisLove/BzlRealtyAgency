package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku022Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku022Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CtKeiyaku022Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku022Mapper ctKeiyaku022Mapper;

    public List<CtKeiyaku022Bean> getInfoList() {
        List<CtKeiyaku022Bean> list = ctKeiyaku022Mapper.getInfoList();
        System.out.println("selectの意向金情報データ：" + list.toString());
        return list;
    }

    public CtKeiyaku022Bean getInfoById(String id) {
        CtKeiyaku022Bean ctKeiyaku022Bean = ctKeiyaku022Mapper.getInfoById(id);
        System.out.println("selectの意向金情報データ：" + ctKeiyaku022Bean.toString());
        return ctKeiyaku022Bean;
    }

    public void save(CtKeiyaku022Bean ctKeiyaku022Bean) {
        if (ctKeiyaku022Bean.getIkoukinMngNo() == null
                || ctKeiyaku022Bean.getIkoukinMngNo().isEmpty()) {
            // システムID
            ctKeiyaku022Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_IK);
            // 意向金管理番号の自動採番
            ctKeiyaku022Mapper.getNextSequence(map);
            ctKeiyaku022Bean.setIkoukinMngNo(BzlSeqConstant.CONSTANT_BZL_IK + (Integer) map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku022Bean);
        } else {
            update(ctKeiyaku022Bean);
        }
    }

    // 新規
    private void insert(CtKeiyaku022Bean ctKeiyaku022Bean) {
        System.out.println("insertの意向金情報データ：" + ctKeiyaku022Bean.toString());
        ctKeiyaku022Mapper.insertInfo(ctKeiyaku022Bean);
    }

    // 変更
    private void update(CtKeiyaku022Bean ctKeiyaku022Bean) {
        System.out.println("updateの意向金情報データ：" + ctKeiyaku022Bean.toString());
        ctKeiyaku022Mapper.updateInfo(ctKeiyaku022Bean);
    }

    // 削除
    public void delete(String id) {
        System.out.println("deleteの意向金情報データ：keiyaku_mng_no = " + id);
        ctKeiyaku022Mapper.deleteInfo(id);
    }
}

