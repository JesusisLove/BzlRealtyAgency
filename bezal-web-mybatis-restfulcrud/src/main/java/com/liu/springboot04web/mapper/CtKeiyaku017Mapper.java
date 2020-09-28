package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku017Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku017Mapper {
    public List<CtKeiyaku017Bean> getInfoList();

    public CtKeiyaku017Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku017Bean bean);

    public void insertInfo(CtKeiyaku017Bean bean);

    public void deleteInfo(String id);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}

