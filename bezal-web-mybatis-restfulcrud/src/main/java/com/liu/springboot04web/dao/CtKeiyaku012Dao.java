package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku012Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku012Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;@Repository
public class CtKeiyaku012Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku012Mapper ctKeiyaku012Mapper;
    public List<CtKeiyaku012Bean> getInfoList() {
        List<CtKeiyaku012Bean> list =ctKeiyaku012Mapper.getInfoList();
        System.out.println("selectの保証会社情報データ：" + list.toString());
        return list;
    }
    public CtKeiyaku012Bean getInfoById(String id) {
        CtKeiyaku012Bean ctKeiyaku012Bean = ctKeiyaku012Mapper.getInfoById(id);
        System.out.println("selectの保証会社情報データ：" + ctKeiyaku012Bean.toString());
        return ctKeiyaku012Bean;
    }
    public void save(CtKeiyaku012Bean ctKeiyaku012Bean) {
        if (ctKeiyaku012Bean.getHoshoCopMngNo() == null
                || ctKeiyaku012Bean.getHoshoCopMngNo().isEmpty()) {
// システムID
            ctKeiyaku012Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_HK);
// 保証会社管理番号の自動採番
            ctKeiyaku012Mapper.getNextSequence(map);
            ctKeiyaku012Bean.setHoshoCopMngNo(BzlSeqConstant.CONSTANT_BZL_HK+(Integer)map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku012Bean);
        } else {
            update(ctKeiyaku012Bean);
        }
    }
    // 新規
    private void insert(CtKeiyaku012Bean ctKeiyaku012Bean) {
        System.out.println("insertの保証会社情報データ：" + ctKeiyaku012Bean.toString());
        ctKeiyaku012Mapper.insertInfo(ctKeiyaku012Bean);
    }
    // 変更
    private void update(CtKeiyaku012Bean ctKeiyaku012Bean) {
        System.out.println("updateの保証会社情報データ：" + ctKeiyaku012Bean.toString());
        ctKeiyaku012Mapper.updateInfo(ctKeiyaku012Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("deleteの保証会社情報データ：keiyaku_mng_no = " + id);
        ctKeiyaku012Mapper.deleteInfo(id);
    }
}

