package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku020Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku020Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CtKeiyaku020Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku020Mapper ctKeiyaku020Mapper;

    public List<CtKeiyaku020Bean> getInfoList() {
        List<CtKeiyaku020Bean> list = ctKeiyaku020Mapper.getInfoList();
        System.out.println("selectの勤務先データ：" + list.toString());
        return list;
    }

    public CtKeiyaku020Bean getInfoById(String id) {
        CtKeiyaku020Bean ctKeiyaku020Bean = ctKeiyaku020Mapper.getInfoById(id);
        System.out.println("selectの勤務先データ：" + ctKeiyaku020Bean.toString());
        return ctKeiyaku020Bean;
    }

    public void save(CtKeiyaku020Bean ctKeiyaku020Bean) {
        if (ctKeiyaku020Bean.getKinmuMngNo() == null
                || ctKeiyaku020Bean.getKinmuMngNo().isEmpty()) {
            // システムID
            ctKeiyaku020Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_KM);
            // 勤務管理番号の自動採番
            ctKeiyaku020Mapper.getNextSequence(map);
            ctKeiyaku020Bean.setKinmuMngNo(BzlSeqConstant.CONSTANT_BZL_KM + (Integer) map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku020Bean);
        } else {
            update(ctKeiyaku020Bean);
        }
    }

    // 新規
    private void insert(CtKeiyaku020Bean ctKeiyaku020Bean) {
        System.out.println("insertの勤務先データ：" + ctKeiyaku020Bean.toString());
        ctKeiyaku020Mapper.insertInfo(ctKeiyaku020Bean);
    }

    // 変更
    private void update(CtKeiyaku020Bean ctKeiyaku020Bean) {
        System.out.println("updateの勤務先データ：" + ctKeiyaku020Bean.toString());
        ctKeiyaku020Mapper.updateInfo(ctKeiyaku020Bean);
    }

    // 削除
    public void delete(String id) {
        System.out.println("deleteの勤務先データ：keiyaku_mng_no = " + id);
        ctKeiyaku020Mapper.deleteInfo(id);
    }
}

