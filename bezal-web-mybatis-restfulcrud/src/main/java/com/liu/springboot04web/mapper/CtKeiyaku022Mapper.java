package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku022Bean;

import java.util.List;
import java.util.Map;
public interface CtKeiyaku022Mapper  {
    public List<CtKeiyaku022Bean> getInfoList();
    public CtKeiyaku022Bean getInfoById(String id);
    public void updateInfo(CtKeiyaku022Bean bean);
    public void insertInfo(CtKeiyaku022Bean bean);
    public void deleteInfo(String id);
    // DBプロシージャを行う
    public void callProcedure(Map map);
    // DB関数を行う
    public void getNextSequence(Map map);
}

