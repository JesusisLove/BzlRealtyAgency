package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku007Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku007Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;@Repository
public class CtKeiyaku007Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku007Mapper ctKeiyaku007Mapper;
    public List<CtKeiyaku007Bean> getInfoList() {
        List<CtKeiyaku007Bean> list =ctKeiyaku007Mapper.getInfoList();
        System.out.println("selectの口座管理データ：" + list.toString());
        return list;
    }
    public CtKeiyaku007Bean getInfoById(String id) {
        CtKeiyaku007Bean ctKeiyaku007Bean = ctKeiyaku007Mapper.getInfoById(id);
        System.out.println("selectの口座管理データ：" + ctKeiyaku007Bean.toString());
        return ctKeiyaku007Bean;
    }
    public void save(CtKeiyaku007Bean ctKeiyaku007Bean) {
        if (ctKeiyaku007Bean.getBankAccountMngNo() == null
                || ctKeiyaku007Bean.getBankAccountMngNo().isEmpty()) {
            // システムID
            ctKeiyaku007Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_KZ);
            // 口座管理番号の自動採番
            ctKeiyaku007Mapper.getNextSequence(map);
            ctKeiyaku007Bean.setBankAccountMngNo(BzlSeqConstant.CONSTANT_BZL_KZ+(Integer)map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku007Bean);
        } else {
            update(ctKeiyaku007Bean);
        }
    }
    // 新規
    private void insert(CtKeiyaku007Bean ctKeiyaku007Bean) {
        System.out.println("insertの口座管理データ：" + ctKeiyaku007Bean.toString());
        ctKeiyaku007Mapper.insertInfo(ctKeiyaku007Bean);
    }
    // 変更
    private void update(CtKeiyaku007Bean ctKeiyaku007Bean) {
        System.out.println("updateの口座管理データ：" + ctKeiyaku007Bean.toString());
        ctKeiyaku007Mapper.updateInfo(ctKeiyaku007Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("deleteの口座管理データ：keiyaku_mng_no = " + id);
        ctKeiyaku007Mapper.deleteInfo(id);
    }
}

