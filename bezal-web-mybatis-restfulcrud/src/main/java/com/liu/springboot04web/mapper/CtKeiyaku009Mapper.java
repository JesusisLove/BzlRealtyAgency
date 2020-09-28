package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku009Bean;

import java.util.List;
import java.util.Map;
public interface CtKeiyaku009Mapper  {
    public List<CtKeiyaku009Bean> getInfoList();
    public CtKeiyaku009Bean getInfoById(String id);
    public void updateInfo(CtKeiyaku009Bean bean);
    public void insertInfo(CtKeiyaku009Bean bean);
    public void deleteInfo(String id);
    // DBプロシージャを行う
    public void callProcedure(Map map);
    // DB関数を行う
    public void getNextSequence(Map map);
}

