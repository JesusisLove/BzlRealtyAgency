package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku004Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku004Mapper  {

    public List<CtKeiyaku004Bean> getInfoList();
    public CtKeiyaku004Bean getInfoById(String id);
    public void updateInfo(CtKeiyaku004Bean bean);
    public void insertInfo(CtKeiyaku004Bean bean);
    public void deleteInfo(String id);

    //查询存储过程的方法
    public void callProcedure(Map map);
    //查询函数的方法:
    public void getNextSequence(Map map);

}

