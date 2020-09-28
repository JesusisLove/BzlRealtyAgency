package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku016Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku016Mapper {
    public List<CtKeiyaku016Bean> getInfoList();

    public CtKeiyaku016Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku016Bean bean);

    public void insertInfo(CtKeiyaku016Bean bean);

    public void deleteInfo(String id);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}

