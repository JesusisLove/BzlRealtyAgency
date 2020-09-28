package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku003Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku003Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CtKeiyaku003Dao implements BzlFudousanDao {

    @Autowired
    private CtKeiyaku003Mapper ctKeiyaku003Mapper;

    public List<CtKeiyaku003Bean> getInfoList() {
        List<CtKeiyaku003Bean> list = ctKeiyaku003Mapper.getInfoList();
        System.out.println("select的日勤管理会社数据：" + list.toString());
        return list;
    }


    public CtKeiyaku003Bean getInfoById(String id) {
        CtKeiyaku003Bean ctKeiyaku003Bean = ctKeiyaku003Mapper.getInfoById(id);
        System.out.println("select的日勤管理会社数据：" + ctKeiyaku003Bean.toString());
        return ctKeiyaku003Bean;
    }

    public void save(CtKeiyaku003Bean ctKeiyaku003Bean) {
        if (ctKeiyaku003Bean.getDaytimeMngCopMngNo() == null
                || ctKeiyaku003Bean.getDaytimeMngCopMngNo().isEmpty()) {
            // システムID
            ctKeiyaku003Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);

            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_NK);
            // 日勤管理会社管理番号的自动采番
            ctKeiyaku003Mapper.getNextSequence(map);
            ctKeiyaku003Bean.setDaytimeMngCopMngNo(BzlSeqConstant.CONSTANT_BZL_NK + (Integer) map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku003Bean);
        } else {
            update(ctKeiyaku003Bean);
        }
    }

    // 新規
    private void insert(CtKeiyaku003Bean ctKeiyaku003Bean) {
        System.out.println("insert的日勤管理会社数据：" + ctKeiyaku003Bean.toString());
        ctKeiyaku003Mapper.insertInfo(ctKeiyaku003Bean);

    }

    // 変更
    private void update(CtKeiyaku003Bean ctKeiyaku003Bean) {
        System.out.println("update的日勤管理会社数据：" + ctKeiyaku003Bean.toString());
        ctKeiyaku003Mapper.updateInfo(ctKeiyaku003Bean);
    }

    // 削除
    public void delete(String id) {
        System.out.println("delete的日勤管理会社数据：keiyaku_mng_no = " + id);
        ctKeiyaku003Mapper.deleteInfo(id);
    }
}

