package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.CtKeiyaku017Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.CtKeiyaku017Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CtKeiyaku017Dao implements BzlFudousanDao {
    @Autowired
    private CtKeiyaku017Mapper ctKeiyaku017Mapper;

    public List<CtKeiyaku017Bean> getInfoList() {
        List<CtKeiyaku017Bean> list = ctKeiyaku017Mapper.getInfoList();
        System.out.println("selectの紹介人データ：" + list.toString());
        return list;
    }

    public CtKeiyaku017Bean getInfoById(String id) {
        CtKeiyaku017Bean ctKeiyaku017Bean = ctKeiyaku017Mapper.getInfoById(id);
        System.out.println("selectの紹介人データ：" + ctKeiyaku017Bean.toString());
        return ctKeiyaku017Bean;
    }

    public void save(CtKeiyaku017Bean ctKeiyaku017Bean) {
        if (ctKeiyaku017Bean.getShokaishaMngNo() == null
                || ctKeiyaku017Bean.getShokaishaMngNo().isEmpty()) {
            // システムID
            ctKeiyaku017Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            Map map = new HashMap();
            map.put("parm_in", BzlSeqConstant.CONSTANT_BZL_SJ);
            // 紹介人管理番号の自動採番
            ctKeiyaku017Mapper.getNextSequence(map);
            ctKeiyaku017Bean.setShokaishaMngNo(BzlSeqConstant.CONSTANT_BZL_SJ + (Integer) map.get("parm_out"));
            System.out.println(map.get("parm_out"));
            insert(ctKeiyaku017Bean);
        } else {
            update(ctKeiyaku017Bean);
        }
    }

    // 新規
    private void insert(CtKeiyaku017Bean ctKeiyaku017Bean) {
        System.out.println("insertの紹介人データ：" + ctKeiyaku017Bean.toString());
        ctKeiyaku017Mapper.insertInfo(ctKeiyaku017Bean);
    }

    // 変更
    private void update(CtKeiyaku017Bean ctKeiyaku017Bean) {
        System.out.println("updateの紹介人データ：" + ctKeiyaku017Bean.toString());
        ctKeiyaku017Mapper.updateInfo(ctKeiyaku017Bean);
    }

    // 削除
    public void delete(String id) {
        System.out.println("deleteの紹介人データ：keiyaku_mng_no = " + id);
        ctKeiyaku017Mapper.deleteInfo(id);
    }
}

