package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku009Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku009Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;@Repository
public class CtKeiyaku009Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku009Mapper ctKeiyaku009Mapper;
    public List<CtKeiyaku009Bean> getInfoList() {
        List<CtKeiyaku009Bean> list =ctKeiyaku009Mapper.getInfoList();
        System.out.println("selectの法人契約者データ：" + list.toString());
        return list;
    }
    public CtKeiyaku009Bean getInfoById(String id) {
        CtKeiyaku009Bean ctKeiyaku009Bean = ctKeiyaku009Mapper.getInfoById(id);
        System.out.println("selectの法人契約者データ：" + ctKeiyaku009Bean.toString());
        return ctKeiyaku009Bean;
    }
    public void save(CtKeiyaku009Bean ctKeiyaku009Bean) {
        if (ctKeiyaku009Bean.getHojinMngNo() == null
                || ctKeiyaku009Bean.getHojinMngNo().isEmpty()) {
            // システムID
            ctKeiyaku009Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_HJ);
            // 法人管理番号の自動採番
            ctKeiyaku009Mapper.getNextSequence(map);
            ctKeiyaku009Bean.setHojinMngNo(BzlSeqConstant.CONSTANT_BZL_HJ+(Integer)map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku009Bean);
        } else {
            update(ctKeiyaku009Bean);
        }
    }
    // 新規
    private void insert(CtKeiyaku009Bean ctKeiyaku009Bean) {
        System.out.println("insertの法人契約者データ：" + ctKeiyaku009Bean.toString());
        ctKeiyaku009Mapper.insertInfo(ctKeiyaku009Bean);
    }
    // 変更
    private void update(CtKeiyaku009Bean ctKeiyaku009Bean) {
        System.out.println("updateの法人契約者データ：" + ctKeiyaku009Bean.toString());
        ctKeiyaku009Mapper.updateInfo(ctKeiyaku009Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("deleteの法人契約者データ：keiyaku_mng_no = " + id);
        ctKeiyaku009Mapper.deleteInfo(id);
    }
}

