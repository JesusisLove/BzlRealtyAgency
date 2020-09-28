package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku014Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku014Mapper {
    public List<CtKeiyaku014Bean> getInfoList();

    public CtKeiyaku014Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku014Bean bean);

    public void insertInfo(CtKeiyaku014Bean bean);

    public void deleteInfo(String id);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}