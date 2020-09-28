package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku014Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku014Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CtKeiyaku014Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku014Mapper ctKeiyaku014Mapper;

    public List<CtKeiyaku014Bean> getInfoList() {
        List<CtKeiyaku014Bean> list = ctKeiyaku014Mapper.getInfoList();
        System.out.println("selectの家財保険会社情報データ：" + list.toString());
        return list;
    }

    public CtKeiyaku014Bean getInfoById(String id) {
        CtKeiyaku014Bean ctKeiyaku014Bean = ctKeiyaku014Mapper.getInfoById(id);
        System.out.println("selectの家財保険会社情報データ：" + ctKeiyaku014Bean.toString());
        return ctKeiyaku014Bean;
    }

    public void save(CtKeiyaku014Bean ctKeiyaku014Bean) {
        if (ctKeiyaku014Bean.getKazaihokenMngNo() == null
                || ctKeiyaku014Bean.getKazaihokenMngNo().isEmpty()) {
            // システムID
            ctKeiyaku014Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_KS);
            // 家財保険管理番号の自動採番
            ctKeiyaku014Mapper.getNextSequence(map);
            ctKeiyaku014Bean.setKazaihokenMngNo(BzlSeqConstant.CONSTANT_BZL_KS + (Integer) map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku014Bean);
        } else {
            update(ctKeiyaku014Bean);
        }
    }

    // 新規
    private void insert(CtKeiyaku014Bean ctKeiyaku014Bean) {
        System.out.println("insertの家財保険会社情報データ：" + ctKeiyaku014Bean.toString());
        ctKeiyaku014Mapper.insertInfo(ctKeiyaku014Bean);
    }

    // 変更
    private void update(CtKeiyaku014Bean ctKeiyaku014Bean) {
        System.out.println("updateの家財保険会社情報データ：" + ctKeiyaku014Bean.toString());
        ctKeiyaku014Mapper.updateInfo(ctKeiyaku014Bean);
    }

    // 削除
    public void delete(String id) {
        System.out.println("deleteの家財保険会社情報データ：keiyaku_mng_no = " + id);
        ctKeiyaku014Mapper.deleteInfo(id);
    }
}

