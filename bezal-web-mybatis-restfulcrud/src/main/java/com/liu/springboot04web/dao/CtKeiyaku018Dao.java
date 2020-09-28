package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku018Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku018Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CtKeiyaku018Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku018Mapper ctKeiyaku018Mapper;

    public List<CtKeiyaku018Bean> getInfoList() {
        List<CtKeiyaku018Bean> list = ctKeiyaku018Mapper.getInfoList();
        System.out.println("selectの保証人情報データ：" + list.toString());
        return list;
    }

    public CtKeiyaku018Bean getInfoById(String id) {
        CtKeiyaku018Bean ctKeiyaku018Bean = ctKeiyaku018Mapper.getInfoById(id);
        System.out.println("selectの保証人情報データ：" + ctKeiyaku018Bean.toString());
        return ctKeiyaku018Bean;
    }

    public void save(CtKeiyaku018Bean ctKeiyaku018Bean) {
        if (ctKeiyaku018Bean.getHoshoshaMngNo() == null
                || ctKeiyaku018Bean.getHoshoshaMngNo().isEmpty()) {
            // システムID
            ctKeiyaku018Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_HS);
            // 保証人管理番号の自動採番
            ctKeiyaku018Mapper.getNextSequence(map);
            ctKeiyaku018Bean.setHoshoshaMngNo(BzlSeqConstant.CONSTANT_BZL_HS + (Integer) map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku018Bean);
        } else {
            update(ctKeiyaku018Bean);
        }
    }

    // 新規
    private void insert(CtKeiyaku018Bean ctKeiyaku018Bean) {
        System.out.println("insertの保証人情報データ：" + ctKeiyaku018Bean.toString());
        ctKeiyaku018Mapper.insertInfo(ctKeiyaku018Bean);
    }

    // 変更
    private void update(CtKeiyaku018Bean ctKeiyaku018Bean) {
        System.out.println("updateの保証人情報データ：" + ctKeiyaku018Bean.toString());
        ctKeiyaku018Mapper.updateInfo(ctKeiyaku018Bean);
    }

    // 削除
    public void delete(String id) {
        System.out.println("deleteの保証人情報データ：keiyaku_mng_no = " + id);
        ctKeiyaku018Mapper.deleteInfo(id);
    }
}

