package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku018Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku018Mapper {
    public List<CtKeiyaku018Bean> getInfoList();

    public CtKeiyaku018Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku018Bean bean);

    public void insertInfo(CtKeiyaku018Bean bean);

    public void deleteInfo(String id);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}

