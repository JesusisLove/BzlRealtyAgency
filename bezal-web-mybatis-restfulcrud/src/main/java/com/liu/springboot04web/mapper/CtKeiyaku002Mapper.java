package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku002Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku002Mapper {

    public List<CtKeiyaku002Bean> getInfoList();

    public CtKeiyaku002Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku002Bean bean);

    public void insertInfo(CtKeiyaku002Bean bean);

    public void deleteInfo(String id);

    //查询存储过程的方法
    public void callProcedure(Map map);

    //查询函数的方法:
    public void getNextSequence(Map map);

}
