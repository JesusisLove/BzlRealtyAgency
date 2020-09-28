package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku006Bean;

import java.util.List;
import java.util.Map;

public interface CtKeiyaku006Mapper {

    public List<CtKeiyaku006Bean> getInfoList();

    public CtKeiyaku006Bean getInfoById(String id);

    public void updateInfo(CtKeiyaku006Bean bean);

    public void insertInfo(CtKeiyaku006Bean bean);

    public void deleteInfo(String id);

    //プロシージャーをInvokeする
    public void callProcedure(Map map);

    //プロシージャーでPK番号を採番:
    public void getNextSequence(Map map);

}
