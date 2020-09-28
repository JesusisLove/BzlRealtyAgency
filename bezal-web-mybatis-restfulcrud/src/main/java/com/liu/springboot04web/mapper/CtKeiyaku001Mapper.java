package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.CtKeiyaku001Bean;

import java.util.List;
import java.util.Map;
public interface CtKeiyaku001Mapper  {
    public List<CtKeiyaku001Bean> getInfoList();
    public CtKeiyaku001Bean getInfoById(String id);
    public void updateInfo(CtKeiyaku001Bean bean);
    public void insertInfo(CtKeiyaku001Bean bean);
    public void deleteInfo(String id);
    //__存__程的方法
    public void callProcedure(Map map);
    //__函数的方法:
    public void getNextSequence(Map map);
}
