package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.SysCode001Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.SysCode001Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SysCode001Dao implements BzlFudousanDao {
    @Autowired
    private SysCode001Mapper sysCode001Mapper;
    public List<SysCode001Bean> getInfoList() {
        List<SysCode001Bean> list =sysCode001Mapper.getInfoList();
        System.out.println("selectのコード一覧テーブルデータ：" + list.toString());
        return list;
    }
    public SysCode001Bean getInfoById(String id) {
        SysCode001Bean sysCode001Bean = sysCode001Mapper.getInfoById(id);
        System.out.println("selectのコード一覧テーブルデータ：" + sysCode001Bean.toString());
        return sysCode001Bean;
    }
    public void save(SysCode001Bean sysCode001Bean) {

        SysCode001Bean bean = sysCode001Mapper.getInfoById(sysCode001Bean.getTableMngNo());
        if (bean == null) {
            // システムID
            sysCode001Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            insert(sysCode001Bean);
        } else {
            update(sysCode001Bean);
        }
    }
    // 新規
    private void insert(SysCode001Bean sysCode001Bean) {
        System.out.println("insertのコード一覧テーブルデータ：" + sysCode001Bean.toString());
        sysCode001Mapper.insertInfo(sysCode001Bean);
    }
    // 変更
    private void update(SysCode001Bean sysCode001Bean) {
        System.out.println("updateのコード一覧テーブルデータ：" + sysCode001Bean.toString());
        sysCode001Mapper.updateInfo(sysCode001Bean);
    }
    // 削除
    public void delete(String id) {
        System.out.println("deleteのコード一覧テーブルデータ：keiyaku_mng_no = " + id);
        sysCode001Mapper.deleteInfo(id);
    }
}
