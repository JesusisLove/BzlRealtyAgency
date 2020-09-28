package com.liu.springboot04web.dao;
import com.liu.springboot04web.bean.CtKeiyaku005Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku005Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;@Repository
public class CtKeiyaku005Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku005Mapper ctKeiyaku005Mapper;
    public List<CtKeiyaku005Bean> getInfoList() {
        List<CtKeiyaku005Bean> list =ctKeiyaku005Mapper.getInfoList();
        System.out.println("selectの物件所有者データ：" + list.toString());
        return list;
    }
    public CtKeiyaku005Bean getInfoById(String id) {
        CtKeiyaku005Bean ctKeiyaku005Bean = ctKeiyaku005Mapper.getInfoById(id);
        System.out.println("selectの物件所有者データ：" + ctKeiyaku005Bean.toString());
        return ctKeiyaku005Bean;
    }
    public void save(CtKeiyaku005Bean ctKeiyaku005Bean) {
        if (ctKeiyaku005Bean.getBukenOwnNo() == null
                || ctKeiyaku005Bean.getBukenOwnNo().isEmpty()) {
// システムID
            ctKeiyaku005Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_OW);
// 物件所有者管理番号の自動採番
            ctKeiyaku005Mapper.getNextSequence(map);
            ctKeiyaku005Bean.setBukenOwnNo(BzlSeqConstant.CONSTANT_BZL_OW+(Integer)map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku005Bean);
        } else {
            update(ctKeiyaku005Bean);
        }
    }
    // 新規
    private void insert(CtKeiyaku005Bean ctKeiyaku005Bean) {
        System.out.println("insertの物件所有者データ：" + ctKeiyaku005Bean.toString());
        ctKeiyaku005Mapper.insertInfo(ctKeiyaku005Bean);
    }
    // 変更
    private void update(CtKeiyaku005Bean ctKeiyaku005Bean) {
        System.out.println("updateの物件所有者データ：" + ctKeiyaku005Bean.toString());
        ctKeiyaku005Mapper.updateInfo(ctKeiyaku005Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("deleteの物件所有者データ：keiyaku_mng_no = " + id);
        ctKeiyaku005Mapper.deleteInfo(id);
    }
}
