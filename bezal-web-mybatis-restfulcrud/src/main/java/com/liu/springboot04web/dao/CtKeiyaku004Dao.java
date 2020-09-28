package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku004Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku004Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;@Repository
public class CtKeiyaku004Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku004Mapper ctKeiyaku004Mapper;
    public List<CtKeiyaku004Bean> getInfoList() {
        List<CtKeiyaku004Bean> list =ctKeiyaku004Mapper.getInfoList();
        System.out.println("selectの修繕履歴データ：" + list.toString());
        return list;
    }
    public CtKeiyaku004Bean getInfoById(String id) {
        CtKeiyaku004Bean ctKeiyaku004Bean = ctKeiyaku004Mapper.getInfoById(id);
        System.out.println("selectの修繕履歴データ：" + ctKeiyaku004Bean.toString());
        return ctKeiyaku004Bean;
    }
    public void save(CtKeiyaku004Bean ctKeiyaku004Bean) {
        if (ctKeiyaku004Bean.getRepairMngNo() == null
                || ctKeiyaku004Bean.getRepairMngNo().isEmpty()) {
            // システムID
            ctKeiyaku004Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_RH);
            // 修繕履歴管理番号の自動採番
            ctKeiyaku004Mapper.getNextSequence(map);
            ctKeiyaku004Bean.setRepairMngNo(BzlSeqConstant.CONSTANT_BZL_RH+(Integer)map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku004Bean);
        } else {
            update(ctKeiyaku004Bean);
        }
    }
    // 新規
    private void insert(CtKeiyaku004Bean ctKeiyaku004Bean) {
        System.out.println("insertの修繕履歴データ：" + ctKeiyaku004Bean.toString());
        ctKeiyaku004Mapper.insertInfo(ctKeiyaku004Bean);
    }
    // 変更
    private void update(CtKeiyaku004Bean ctKeiyaku004Bean) {
        System.out.println("updateの修繕履歴データ：" + ctKeiyaku004Bean.toString());
        ctKeiyaku004Mapper.updateInfo(ctKeiyaku004Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("deleteの修繕履歴データ：keiyaku_mng_no = " + id);
        ctKeiyaku004Mapper.deleteInfo(id);
    }
}
