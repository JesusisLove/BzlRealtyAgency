package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku005Bean;

import java.util.List;
import java.util.Map;
public interface CtKeiyaku005Mapper  {

    public List<CtKeiyaku005Bean> getInfoList();
    public CtKeiyaku005Bean getInfoById(String id);
    public void updateInfo(CtKeiyaku005Bean bean);
    public void insertInfo(CtKeiyaku005Bean bean);
    public void deleteInfo(String id);

    //プロシージャーをInvokeする
    public void callProcedure(Map map);
    //プロシージャーでPK番号を採番:
    public void getNextSequence(Map map);

}
