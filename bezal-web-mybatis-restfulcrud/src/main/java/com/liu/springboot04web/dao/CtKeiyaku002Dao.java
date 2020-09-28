package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku002Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku002Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CtKeiyaku002Dao implements BzlFudousanDao {

    @Autowired
    private CtKeiyaku002Mapper ctKeiyaku002Mapper;

    public List<CtKeiyaku002Bean> getInfoList() {
        List<CtKeiyaku002Bean> list = ctKeiyaku002Mapper.getInfoList();
        System.out.println("select的鍵情報数据：" + list.toString());
        return list;
    }

    public CtKeiyaku002Bean getInfoById(String id) {
        CtKeiyaku002Bean ctKeiyaku002Bean = ctKeiyaku002Mapper.getInfoById(id);
        System.out.println("select的鍵情報数据：" + ctKeiyaku002Bean.toString());
        return ctKeiyaku002Bean;
    }

    public void save(CtKeiyaku002Bean ctKeiyaku002Bean) {
        if (ctKeiyaku002Bean.getJisyaKeyNo() == null
                || ctKeiyaku002Bean.getJisyaKeyNo().isEmpty()) {
            // システムID
            ctKeiyaku002Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);

            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_S_KEY);
            // 自社鍵番号的自动采番
            ctKeiyaku002Mapper.getNextSequence(map);
            ctKeiyaku002Bean.setJisyaKeyNo(BzlSeqConstant.CONSTANT_BZL_S_KEY + (Integer) map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku002Bean);
        } else {
            update(ctKeiyaku002Bean);
        }
    }

    // 新規
    private void insert(CtKeiyaku002Bean ctKeiyaku002Bean) {
        System.out.println("insert的鍵情報数据：" + ctKeiyaku002Bean.toString());
        ctKeiyaku002Mapper.insertInfo(ctKeiyaku002Bean);
    }

    // 変更
    private void update(CtKeiyaku002Bean ctKeiyaku002Bean) {
        System.out.println("update的鍵情報数据：" + ctKeiyaku002Bean.toString());
        ctKeiyaku002Mapper.updateInfo(ctKeiyaku002Bean);
    }

    // 削除
    public void delete(String id) {
        System.out.println("delete的鍵情報数据：keiyaku_mng_no = " + id);
        ctKeiyaku002Mapper.deleteInfo(id);
    }
}

