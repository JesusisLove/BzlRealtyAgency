package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku021Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku021Mapper {
    public List<CtKeiyaku021Bean> getInfoList();

    public CtKeiyaku021Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku021Bean bean);

    public void insertInfo(CtKeiyaku021Bean bean);

    public void deleteInfo(String id);

    // DBプロシージャを行う
    public void callProcedure(Map map);

    // DB関数を行う
    public void getNextSequence(Map map);
}

