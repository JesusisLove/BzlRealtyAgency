package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku010Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku010Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CtKeiyaku010Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku010Mapper ctKeiyaku010Mapper;

    public List<CtKeiyaku010Bean> getInfoList() {
        List<CtKeiyaku010Bean> list = ctKeiyaku010Mapper.getInfoList();
        System.out.println("selectの賃貸契約データ：" + list.toString());
        return list;
    }

    public CtKeiyaku010Bean getInfoById(String id) {
        CtKeiyaku010Bean ctKeiyaku010Bean = ctKeiyaku010Mapper.getInfoById(id);
        System.out.println("selectの賃貸契約データ：" + ctKeiyaku010Bean.toString());
        return ctKeiyaku010Bean;
    }

    public void save(CtKeiyaku010Bean ctKeiyaku010Bean) {
        if (ctKeiyaku010Bean.getAnkenMngNo() == null
                || ctKeiyaku010Bean.getAnkenMngNo().isEmpty()) {
            // システムID
            ctKeiyaku010Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_AK);
            // 案件管理番号の自動採番
            ctKeiyaku010Mapper.getNextSequence(map);
            ctKeiyaku010Bean.setAnkenMngNo(BzlSeqConstant.CONSTANT_BZL_AK + (Integer) map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku010Bean);
        } else {
            update(ctKeiyaku010Bean);
        }
    }

    // 新規
    private void insert(CtKeiyaku010Bean ctKeiyaku010Bean) {
        System.out.println("insertの賃貸契約データ：" + ctKeiyaku010Bean.toString());
        ctKeiyaku010Mapper.insertInfo(ctKeiyaku010Bean);
    }

    // 変更
    private void update(CtKeiyaku010Bean ctKeiyaku010Bean) {
        System.out.println("updateの賃貸契約データ：" + ctKeiyaku010Bean.toString());
        ctKeiyaku010Mapper.updateInfo(ctKeiyaku010Bean);
    }

    // 削除
    public void delete(String id) {
        System.out.println("deleteの賃貸契約データ：keiyaku_mng_no = " + id);
        ctKeiyaku010Mapper.deleteInfo(id);
    }
}

