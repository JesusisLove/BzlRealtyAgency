package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku013Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku013Mapper {
    public List<CtKeiyaku013Bean> getInfoList();

    public CtKeiyaku013Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku013Bean bean);

    public void insertInfo(CtKeiyaku013Bean bean);

    public void deleteInfo(String id);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}