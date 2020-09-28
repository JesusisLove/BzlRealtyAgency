package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku001Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku001Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;@Repository
public class CtKeiyaku001Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku001Mapper ctKeiyaku001Mapper;
    public List<CtKeiyaku001Bean> getInfoList() {
        List<CtKeiyaku001Bean> list =ctKeiyaku001Mapper.getInfoList();
        System.out.println("select的物件情報数据：" + list.toString());
        return list;
    }
    public CtKeiyaku001Bean getInfoById(String id) {
        CtKeiyaku001Bean ctKeiyaku001Bean = ctKeiyaku001Mapper.getInfoById(id);
        System.out.println("select的物件情報数据：" + ctKeiyaku001Bean.toString());
        return ctKeiyaku001Bean;
    }
    public void save(CtKeiyaku001Bean ctKeiyaku001Bean) {
        if (ctKeiyaku001Bean.getBukenMngNo() == null
                || ctKeiyaku001Bean.getBukenMngNo().isEmpty()) {
            // システムID
            ctKeiyaku001Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_BG);
            // 物件管理番号的自_采番
            ctKeiyaku001Mapper.getNextSequence(map);
            ctKeiyaku001Bean.setBukenMngNo(BzlSeqConstant.CONSTANT_BZL_BG+(Integer)map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku001Bean);
        } else {
            update(ctKeiyaku001Bean);
        }
    }
    // 新規
    private void insert(CtKeiyaku001Bean ctKeiyaku001Bean) {
        System.out.println("insert的物件情報数据：" + ctKeiyaku001Bean.toString());
        ctKeiyaku001Mapper.insertInfo(ctKeiyaku001Bean);
    }
    // 変更
    private void update(CtKeiyaku001Bean ctKeiyaku001Bean) {
        System.out.println("update的物件情報数据：" + ctKeiyaku001Bean.toString());
        ctKeiyaku001Mapper.updateInfo(ctKeiyaku001Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("delete的物件情報数据：keiyaku_mng_no = " + id);
        ctKeiyaku001Mapper.deleteInfo(id);
    }
}

