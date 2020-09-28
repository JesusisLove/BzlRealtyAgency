package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku008Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku008Mapper {

    public List<CtKeiyaku008Bean> getInfoList();

    public CtKeiyaku008Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku008Bean bean);

    public void insertInfo(CtKeiyaku008Bean bean);

    public void deleteInfo(String id);

    //查询存储过程的方法
    public void callProcedure(Map map);

    //查询函数的方法:
    public void getNextSequence(Map map);

}
