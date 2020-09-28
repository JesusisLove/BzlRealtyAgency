package com.liu.springboot04web.constant;

import com.liu.springboot04web.bean.SysCode003Bean;
import com.liu.springboot04web.dao.SysCode003Dao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BzlCommon {
    @Autowired
    private static final SysCode003Dao sysCode003Dao = new SysCode003Dao();
    // 固定値リストを抽出して、画面に連携する
    public static Map<String, String> getCodeValueMap(String tableindex, String itemindex) {
        Collection<SysCode003Bean> collection;
        collection = sysCode003Dao.getInfoListByParm(tableindex, itemindex);

        Map<String, String> map = new HashMap<>();
        for (SysCode003Bean bean : collection) {
            map.put(bean.getTableCodeId(), bean.getCodeValue());
        }
        return map;
    }
}
