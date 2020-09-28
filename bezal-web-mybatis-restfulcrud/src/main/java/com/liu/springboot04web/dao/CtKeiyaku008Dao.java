package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku008Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku008Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CtKeiyaku008Dao implements BzlFudousanDao {

    @Autowired
    private CtKeiyaku008Mapper ctKeiyaku008Mapper;

    public List<CtKeiyaku008Bean> getInfoList() {
        List<CtKeiyaku008Bean> list = ctKeiyaku008Mapper.getInfoList();
        System.out.println("select的個人契約者数据：" + list.toString());
        return list;
    }


    public CtKeiyaku008Bean getInfoById(String id) {
        CtKeiyaku008Bean ctKeiyaku008Bean = ctKeiyaku008Mapper.getInfoById(id);
        System.out.println("select的個人契約者数据：" + ctKeiyaku008Bean.toString());
        return ctKeiyaku008Bean;
    }

    public void save(CtKeiyaku008Bean ctKeiyaku008Bean) {
        if (ctKeiyaku008Bean.getKeiyakuMngNo() == null
                || ctKeiyaku008Bean.getKeiyakuMngNo().isEmpty()) {

            // システムID
            ctKeiyaku008Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);

            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_KK);
            // 個人契約者的自动采番
            ctKeiyaku008Mapper.getNextSequence(map);
            ctKeiyaku008Bean.setKeiyakuMngNo(BzlSeqConstant.CONSTANT_BZL_KK + (Integer) map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku008Bean);
        } else {
            update(ctKeiyaku008Bean);
        }
    }


    // 新規
    private void insert(CtKeiyaku008Bean ctKeiyaku008Bean) {
        System.out.println("insert的個人契約者数据：" + ctKeiyaku008Bean.toString());
        ctKeiyaku008Mapper.insertInfo(ctKeiyaku008Bean);

    }


    // 変更
    private void update(CtKeiyaku008Bean ctKeiyaku008Bean) {
        System.out.println("update的個人契約者数据：" + ctKeiyaku008Bean.toString());
        ctKeiyaku008Mapper.updateInfo(ctKeiyaku008Bean);
    }


    // 削除
    public void delete(String id) {
        System.out.println("delete的個人契約者数据：keiyaku_mng_no = " + id);
        ctKeiyaku008Mapper.deleteInfo(id);
    }


}

