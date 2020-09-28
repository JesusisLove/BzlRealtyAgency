package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku021Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku021Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;@Repository
public class CtKeiyaku021Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku021Mapper ctKeiyaku021Mapper;
    public List<CtKeiyaku021Bean> getInfoList() {
        List<CtKeiyaku021Bean> list =ctKeiyaku021Mapper.getInfoList();
        System.out.println("selectの緊急連絡先データ：" + list.toString());
        return list;
    }
    public CtKeiyaku021Bean getInfoById(String id) {
        CtKeiyaku021Bean ctKeiyaku021Bean = ctKeiyaku021Mapper.getInfoById(id);
        System.out.println("selectの緊急連絡先データ：" + ctKeiyaku021Bean.toString());
        return ctKeiyaku021Bean;
    }
    public void save(CtKeiyaku021Bean ctKeiyaku021Bean) {
        if (ctKeiyaku021Bean.getEmrgcyCntctMngNo() == null
                || ctKeiyaku021Bean.getEmrgcyCntctMngNo().isEmpty()) {
// システムID
            ctKeiyaku021Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_KL);
// 緊急連絡先管理番号の自動採番
            ctKeiyaku021Mapper.getNextSequence(map);
            ctKeiyaku021Bean.setEmrgcyCntctMngNo(BzlSeqConstant.CONSTANT_BZL_KL+(Integer)map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku021Bean);
        } else {
            update(ctKeiyaku021Bean);
        }
    }
    // 新規
    private void insert(CtKeiyaku021Bean ctKeiyaku021Bean) {
        System.out.println("insertの緊急連絡先データ：" + ctKeiyaku021Bean.toString());
        ctKeiyaku021Mapper.insertInfo(ctKeiyaku021Bean);
    }
    // 変更
    private void update(CtKeiyaku021Bean ctKeiyaku021Bean) {
        System.out.println("updateの緊急連絡先データ：" + ctKeiyaku021Bean.toString());
        ctKeiyaku021Mapper.updateInfo(ctKeiyaku021Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("deleteの緊急連絡先データ：keiyaku_mng_no = " + id);
        ctKeiyaku021Mapper.deleteInfo(id);
    }
}

