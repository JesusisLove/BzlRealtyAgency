package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku010Bean;

import java.util.List;
import java.util.Map;
public interface CtKeiyaku010Mapper  {
    public List<CtKeiyaku010Bean> getInfoList();
    public CtKeiyaku010Bean getInfoById(String id);
    public void updateInfo(CtKeiyaku010Bean bean);
    public void insertInfo(CtKeiyaku010Bean bean);
    public void deleteInfo(String id);
    // DBプロシージャを行う
    public void callProcedure(Map map);
    // DB関数を行う
    public void getNextSequence(Map map);
}

