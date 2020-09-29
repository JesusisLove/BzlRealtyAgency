package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.SysCode003Bean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SysCode003Mapper {
    public List<SysCode003Bean> getInfoList();

    // 当传递两个以上的参数时，变量名要和xml文件里的变量名前后一致。如果非要用不一致的变量名，则需要用关键字@Param（"xxx"）来指定【xxx是xml文件的变量名】
    public List<SysCode003Bean> getInfoListByParm(String tableMngNo, String tableFieldNo);

    public SysCode003Bean getInfoById(String tableCodeId, String tableMngNo, String tableFieldNo);

    // 対象Tableにて、最大項目IDを抽出するメソッド
    public SysCode003Bean getMaxCodeById(String tableMngNo, String tableFieldNo);

    public void updateInfo(SysCode003Bean bean);

    public void insertInfo(SysCode003Bean bean);

    public void deleteInfo(String tableCodeId, String tableMngNo, String tableFieldNo);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}

