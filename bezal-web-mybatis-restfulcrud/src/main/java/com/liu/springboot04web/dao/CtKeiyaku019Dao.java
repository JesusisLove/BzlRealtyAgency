package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku019Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku019Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CtKeiyaku019Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku019Mapper ctKeiyaku019Mapper;

    public List<CtKeiyaku019Bean> getInfoList() {
        List<CtKeiyaku019Bean> list = ctKeiyaku019Mapper.getInfoList();
        System.out.println("selectの入居者管理データ：" + list.toString());
        return list;
    }

    public CtKeiyaku019Bean getInfoById(String id) {
        CtKeiyaku019Bean ctKeiyaku019Bean = ctKeiyaku019Mapper.getInfoById(id);
        System.out.println("selectの入居者管理データ：" + ctKeiyaku019Bean.toString());
        return ctKeiyaku019Bean;
    }

    public void save(CtKeiyaku019Bean ctKeiyaku019Bean) {
        if (ctKeiyaku019Bean.getResidentMngNo() == null
                || ctKeiyaku019Bean.getResidentMngNo().isEmpty()) {
            // システムID
            ctKeiyaku019Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_NS);
            // 入居者管理番号の自動採番
            ctKeiyaku019Mapper.getNextSequence(map);
            ctKeiyaku019Bean.setResidentMngNo(BzlSeqConstant.CONSTANT_BZL_NS + (Integer) map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku019Bean);
        } else {
            update(ctKeiyaku019Bean);
        }
    }

    // 新規
    private void insert(CtKeiyaku019Bean ctKeiyaku019Bean) {
        System.out.println("insertの入居者管理データ：" + ctKeiyaku019Bean.toString());
        ctKeiyaku019Mapper.insertInfo(ctKeiyaku019Bean);
    }

    // 変更
    private void update(CtKeiyaku019Bean ctKeiyaku019Bean) {
        System.out.println("updateの入居者管理データ：" + ctKeiyaku019Bean.toString());
        ctKeiyaku019Mapper.updateInfo(ctKeiyaku019Bean);
    }

    // 削除
    public void delete(String id) {
        System.out.println("deleteの入居者管理データ：keiyaku_mng_no = " + id);
        ctKeiyaku019Mapper.deleteInfo(id);
    }
}

