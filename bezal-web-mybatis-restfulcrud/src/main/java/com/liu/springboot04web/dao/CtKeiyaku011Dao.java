package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku011Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku011Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;@Repository
public class CtKeiyaku011Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku011Mapper ctKeiyaku011Mapper;
    public List<CtKeiyaku011Bean> getInfoList() {
        List<CtKeiyaku011Bean> list =ctKeiyaku011Mapper.getInfoList();
        System.out.println("selectの大家さん契約データ：" + list.toString());
        return list;
    }
    public CtKeiyaku011Bean getInfoById(String id) {
        CtKeiyaku011Bean ctKeiyaku011Bean = ctKeiyaku011Mapper.getInfoById(id);
        System.out.println("selectの大家さん契約データ：" + ctKeiyaku011Bean.toString());
        return ctKeiyaku011Bean;
    }
    public void save(CtKeiyaku011Bean ctKeiyaku011Bean) {
        if (ctKeiyaku011Bean.getOwnKeiyakuMngNo() == null
                || ctKeiyaku011Bean.getOwnKeiyakuMngNo().isEmpty()) {
            // システムID
            ctKeiyaku011Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_OY);
            // 大家さん契約管理番号の自動採番
            ctKeiyaku011Mapper.getNextSequence(map);
            ctKeiyaku011Bean.setOwnKeiyakuMngNo(BzlSeqConstant.CONSTANT_BZL_OY+(Integer)map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku011Bean);
        } else {
            update(ctKeiyaku011Bean);
        }
    }
    // 新規
    private void insert(CtKeiyaku011Bean ctKeiyaku011Bean) {
        System.out.println("insertの大家さん契約データ：" + ctKeiyaku011Bean.toString());
        ctKeiyaku011Mapper.insertInfo(ctKeiyaku011Bean);
    }
    // 変更
    private void update(CtKeiyaku011Bean ctKeiyaku011Bean) {
        System.out.println("updateの大家さん契約データ：" + ctKeiyaku011Bean.toString());
        ctKeiyaku011Mapper.updateInfo(ctKeiyaku011Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("deleteの大家さん契約データ：keiyaku_mng_no = " + id);
        ctKeiyaku011Mapper.deleteInfo(id);
    }
}

