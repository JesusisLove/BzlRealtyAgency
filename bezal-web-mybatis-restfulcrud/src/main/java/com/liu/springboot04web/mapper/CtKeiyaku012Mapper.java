package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku012Bean;

import java.util.List;
import java.util.Map;
public interface CtKeiyaku012Mapper  {
    public List<CtKeiyaku012Bean> getInfoList();
    public CtKeiyaku012Bean getInfoById(String id);
    public void updateInfo(CtKeiyaku012Bean bean);
    public void insertInfo(CtKeiyaku012Bean bean);
    public void deleteInfo(String id);
    // DBプロシージャを行う
    public void callProcedure(Map map);
    // DB関数を行う
    public void getNextSequence(Map map);
}
