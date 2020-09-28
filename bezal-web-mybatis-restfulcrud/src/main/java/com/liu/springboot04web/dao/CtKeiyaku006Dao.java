package com.liu.springboot04web.dao;
import com.liu.springboot04web.bean.CtKeiyaku006Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku006Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;@Repository
public class CtKeiyaku006Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku006Mapper ctKeiyaku006Mapper;
    public List<CtKeiyaku006Bean> getInfoList() {
        List<CtKeiyaku006Bean> list =ctKeiyaku006Mapper.getInfoList();
        System.out.println("selectの物件管理会社データ：" + list.toString());
        return list;
    }
    public CtKeiyaku006Bean getInfoById(String id) {
        CtKeiyaku006Bean ctKeiyaku006Bean = ctKeiyaku006Mapper.getInfoById(id);
        System.out.println("selectの物件管理会社データ：" + ctKeiyaku006Bean.toString());
        return ctKeiyaku006Bean;
    }
    public void save(CtKeiyaku006Bean ctKeiyaku006Bean) {
        if (ctKeiyaku006Bean.getBukenMngCopNo() == null
                || ctKeiyaku006Bean.getBukenMngCopNo().isEmpty()) {
            // システムID
            ctKeiyaku006Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_BG_CP);
            // 物件管理会社管理番号の自動採番
            ctKeiyaku006Mapper.getNextSequence(map);
            ctKeiyaku006Bean.setBukenMngCopNo(BzlSeqConstant.CONSTANT_BZL_BG_CP+(Integer)map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku006Bean);
        } else {
            update(ctKeiyaku006Bean);
        }
    }
    // 新規
    private void insert(CtKeiyaku006Bean ctKeiyaku006Bean) {
        System.out.println("insertの物件管理会社データ：" + ctKeiyaku006Bean.toString());
        ctKeiyaku006Mapper.insertInfo(ctKeiyaku006Bean);
    }
    // 変更
    private void update(CtKeiyaku006Bean ctKeiyaku006Bean) {
        System.out.println("updateの物件管理会社データ：" + ctKeiyaku006Bean.toString());
        ctKeiyaku006Mapper.updateInfo(ctKeiyaku006Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("deleteの物件管理会社データ：keiyaku_mng_no = " + id);
        ctKeiyaku006Mapper.deleteInfo(id);
    }
}
