package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.SysCode002Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.SysCode002Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SysCode002Dao {
    @Autowired
    private SysCode002Mapper sysCode002Mapper;

    public List<SysCode002Bean> getInfoList() {
        List<SysCode002Bean> list = sysCode002Mapper.getInfoList();
        System.out.println("selectのコード一覧項目データ：" + list.toString());
        return list;
    }

    public List<SysCode002Bean> getInfoListById(String id) {
        List<SysCode002Bean> list = sysCode002Mapper.getInfoListById(id);
        System.out.println("selectのコード一覧項目データ：" + list.toString());
        return list;
    }

    public SysCode002Bean getInfoById(String id, String no) {
        SysCode002Bean sysCode002Bean = sysCode002Mapper.getInfoById(id, no);
        System.out.println("selectのコード一覧項目データ：" + sysCode002Bean.toString());
        return sysCode002Bean;
    }

    public void save(SysCode002Bean sysCode002Bean) {

        SysCode002Bean bean = sysCode002Mapper.getInfoById(sysCode002Bean.getTableFieldNo(), sysCode002Bean.getTableMngNo());
        if (bean == null) {
            // システムID
            sysCode002Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);

            insert(sysCode002Bean);
        } else {
            update(sysCode002Bean);
        }
    }

    // 新規
    private void insert(SysCode002Bean sysCode002Bean) {
        System.out.println("insertのコード一覧項目データ：" + sysCode002Bean.toString());
        sysCode002Mapper.insertInfo(sysCode002Bean);
    }

    // 変更
    private void update(SysCode002Bean sysCode002Bean) {
        System.out.println("updateのコード一覧項目データ：" + sysCode002Bean.toString());
        sysCode002Mapper.updateInfo(sysCode002Bean);
    }

    // 削除
    public void delete(String id, String no) {
        System.out.println("deleteのコード一覧項目データ：table_field_no = " + '\'' + id + "table_mng_no = " + no);
        sysCode002Mapper.deleteInfo(id, no);
    }
}

