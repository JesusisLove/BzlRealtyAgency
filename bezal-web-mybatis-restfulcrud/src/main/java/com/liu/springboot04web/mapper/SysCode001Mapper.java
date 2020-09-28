package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.SysCode001Bean;

import java.util.List;
import java.util.Map;

public interface SysCode001Mapper {
    public List<SysCode001Bean> getInfoList();

    public SysCode001Bean getInfoById(String id);

    public void updateInfo(SysCode001Bean bean);

    public void insertInfo(SysCode001Bean bean);

    public void deleteInfo(String id);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}
