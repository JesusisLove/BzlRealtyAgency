package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku016Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku016Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;@Repository
public class CtKeiyaku016Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku016Mapper ctKeiyaku016Mapper;
    public List<CtKeiyaku016Bean> getInfoList() {
        List<CtKeiyaku016Bean> list =ctKeiyaku016Mapper.getInfoList();
        System.out.println("selectの仲介会社データ：" + list.toString());
        return list;
    }
    public CtKeiyaku016Bean getInfoById(String id) {
        CtKeiyaku016Bean ctKeiyaku016Bean = ctKeiyaku016Mapper.getInfoById(id);
        System.out.println("selectの仲介会社データ：" + ctKeiyaku016Bean.toString());
        return ctKeiyaku016Bean;
    }
    public void save(CtKeiyaku016Bean ctKeiyaku016Bean) {
        if (ctKeiyaku016Bean.getChukaiCopMngNo() == null
                || ctKeiyaku016Bean.getChukaiCopMngNo().isEmpty()) {
// システムID
            ctKeiyaku016Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_CK);
// 仲介会社管理番号の自動採番
            ctKeiyaku016Mapper.getNextSequence(map);
            ctKeiyaku016Bean.setChukaiCopMngNo(BzlSeqConstant.CONSTANT_BZL_CK+(Integer)map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku016Bean);
        } else {
            update(ctKeiyaku016Bean);
        }
    }
    // 新規
    private void insert(CtKeiyaku016Bean ctKeiyaku016Bean) {
        System.out.println("insertの仲介会社データ：" + ctKeiyaku016Bean.toString());
        ctKeiyaku016Mapper.insertInfo(ctKeiyaku016Bean);
    }
    // 変更
    private void update(CtKeiyaku016Bean ctKeiyaku016Bean) {
        System.out.println("updateの仲介会社データ：" + ctKeiyaku016Bean.toString());
        ctKeiyaku016Mapper.updateInfo(ctKeiyaku016Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("deleteの仲介会社データ：keiyaku_mng_no = " + id);
        ctKeiyaku016Mapper.deleteInfo(id);
    }
}

