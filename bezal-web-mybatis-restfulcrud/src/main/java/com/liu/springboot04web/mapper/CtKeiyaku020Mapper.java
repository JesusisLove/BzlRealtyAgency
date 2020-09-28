package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku020Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku020Mapper {
    public List<CtKeiyaku020Bean> getInfoList();

    public CtKeiyaku020Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku020Bean bean);

    public void insertInfo(CtKeiyaku020Bean bean);

    public void deleteInfo(String id);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}

