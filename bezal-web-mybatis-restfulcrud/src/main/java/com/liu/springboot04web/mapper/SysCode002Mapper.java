package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.SysCode002Bean;

import java.util.List;
import java.util.Map;

public interface SysCode002Mapper {
    public List<SysCode002Bean> getInfoList();

    public List<SysCode002Bean> getInfoListById(String tableMngNo);

    public SysCode002Bean getInfoById(String tableFieldNo, String tableMngNo);

    public void updateInfo(SysCode002Bean bean);

    public void insertInfo(SysCode002Bean bean);

    public void deleteInfo(String tableFieldNo, String tableMngNo);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}

