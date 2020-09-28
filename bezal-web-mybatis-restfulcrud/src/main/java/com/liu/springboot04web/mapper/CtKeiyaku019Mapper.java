package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku019Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku019Mapper {
    public List<CtKeiyaku019Bean> getInfoList();

    public CtKeiyaku019Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku019Bean bean);

    public void insertInfo(CtKeiyaku019Bean bean);

    public void deleteInfo(String id);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}

