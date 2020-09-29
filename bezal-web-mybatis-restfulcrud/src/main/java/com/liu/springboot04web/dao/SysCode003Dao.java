package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.SysCode003Bean;
import com.liu.springboot04web.constant.BzlSeqConstant;
import com.liu.springboot04web.mapper.SysCode003Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SysCode003Dao {
    @Autowired
    private SysCode003Mapper sysCode003Mapper;

    public List<SysCode003Bean> getInfoList() {
        List<SysCode003Bean> list =sysCode003Mapper.getInfoList();
        System.out.println("selectのコード値一覧データ：" + list.toString());
        return list;
    }

    public List<SysCode003Bean> getInfoListByParm(String tableMngNo,String tableFieldNo) {
        List<SysCode003Bean> list = sysCode003Mapper.getInfoListByParm(tableMngNo,tableFieldNo);
        System.out.println("selectのコード値一覧データ：" + list.toString());
        return list;
    }

    public SysCode003Bean getInfoById(String tableCodeId, String tableMngNo, String tableFieldNo) {
        SysCode003Bean sysCode003Bean = sysCode003Mapper.getInfoById(tableCodeId,tableMngNo,tableFieldNo);
        System.out.println("selectのコード値一覧データ：" + sysCode003Bean.toString());
        return sysCode003Bean;
    }

    public SysCode003Bean getMaxCodeById(String tableMngNo, String tableFieldNo) {
        SysCode003Bean sysCode003Bean = sysCode003Mapper.getMaxCodeById(tableMngNo,tableFieldNo);

        // 抽出したデータがnullの場合は
        if (sysCode003Bean == null) {
            SysCode003Bean bean = new SysCode003Bean();
            bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            bean.setTableMngNo(tableMngNo);
            bean.setTableFieldNo(tableFieldNo);
            bean.setTableCodeId("-1");
            sysCode003Bean = bean;
        }
        // 最大コード番号を設定する
        Integer maxItemNo = Integer.valueOf(sysCode003Bean.getTableCodeId()) + 1 ;
        sysCode003Bean.setTableCodeId(maxItemNo.toString());

        System.out.println("selectのコードMax値データ：" + sysCode003Bean.toString());
        return sysCode003Bean;
    }

    public void save(SysCode003Bean sysCode003Bean) {
        SysCode003Bean bean = sysCode003Mapper.getInfoById(sysCode003Bean.getTableCodeId(),
                                                           sysCode003Bean.getTableMngNo(),
                                                           sysCode003Bean.getTableFieldNo());
        if (bean == null) {
            // システムID
            sysCode003Bean.setSysId(BzlSeqConstant.CONSTANT_SYSID);
            insert(sysCode003Bean);
        } else {
            update(sysCode003Bean);
        }
    }
    // 新規
    private void insert(SysCode003Bean sysCode003Bean) {
        System.out.println("insertのコード値一覧データ：" + sysCode003Bean.toString());
        sysCode003Mapper.insertInfo(sysCode003Bean);
    }
    // 変更
    private void update(SysCode003Bean sysCode003Bean) {
        System.out.println("updateのコード値一覧データ：" + sysCode003Bean.toString());
        sysCode003Mapper.updateInfo(sysCode003Bean);
    }
    // 削除
    public void delete(String tableCodeId, String tableMngNo, String tableFieldNo) {
        System.out.println("deleteのコード値一覧データ：table_code_id = " +  tableCodeId +"table_code_id = " + tableMngNo + "table_code_id = " + tableFieldNo);
        sysCode003Mapper.deleteInfo( tableCodeId,  tableMngNo,  tableFieldNo);
    }
}

