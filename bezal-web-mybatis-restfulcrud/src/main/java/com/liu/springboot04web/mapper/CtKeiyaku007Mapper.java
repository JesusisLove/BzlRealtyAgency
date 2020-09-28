package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku007Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku007Mapper {
    public List<CtKeiyaku007Bean> getInfoList();

    public CtKeiyaku007Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku007Bean bean);

    public void insertInfo(CtKeiyaku007Bean bean);

    public void deleteInfo(String id);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}