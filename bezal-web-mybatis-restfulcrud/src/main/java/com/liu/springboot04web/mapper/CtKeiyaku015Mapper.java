package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku015Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku015Mapper {
    public List<CtKeiyaku015Bean> getInfoList();

    public CtKeiyaku015Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku015Bean bean);

    public void insertInfo(CtKeiyaku015Bean bean);

    public void deleteInfo(String id);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}

