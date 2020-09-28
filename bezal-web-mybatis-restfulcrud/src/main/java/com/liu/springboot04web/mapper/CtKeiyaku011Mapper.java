package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku010Bean;
import com.liu.springboot04web.bean.CtKeiyaku011Bean;

import java.util.List;
import java.util.Map;

import java.util.List;
import java.util.Map;
public interface CtKeiyaku011Mapper  {
    public List<CtKeiyaku011Bean> getInfoList();
    public CtKeiyaku011Bean getInfoById(String id);
    public void updateInfo(CtKeiyaku011Bean bean);
    public void insertInfo(CtKeiyaku011Bean bean);
    public void deleteInfo(String id);
    // DBプロシージャを行う
    public void callProcedure(Map map);
    // DB関数を行う
    public void getNextSequence(Map map);
}
