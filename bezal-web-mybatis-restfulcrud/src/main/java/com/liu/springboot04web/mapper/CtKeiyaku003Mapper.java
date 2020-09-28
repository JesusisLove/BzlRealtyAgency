package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku003Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku003Mapper {

    public List<CtKeiyaku003Bean> getInfoList();

    public CtKeiyaku003Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku003Bean bean);

    public void insertInfo(CtKeiyaku003Bean bean);

    public void deleteInfo(String id);

    //查询存储过程的方法
    public void callProcedure(Map map);

    //查询函数的方法:
    public void getNextSequence(Map map);

}

