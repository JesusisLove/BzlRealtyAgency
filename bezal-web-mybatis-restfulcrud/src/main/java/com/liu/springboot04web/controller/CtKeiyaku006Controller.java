package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku006Bean;
import com.liu.springboot04web.bean.SysCode003Bean;
import com.liu.springboot04web.constant.BzlCodeIdConstant;
import com.liu.springboot04web.dao.CtKeiyaku006Dao;
import com.liu.springboot04web.dao.SysCode003Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CtKeiyaku006Controller{

    @Autowired
    CtKeiyaku006Dao ctKeiyaku006Dao;
    @Autowired
    SysCode003Dao sysCode003Dao;

    // 【口座管理】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_006_all")
    public String list(Model model) {
        Collection<CtKeiyaku006Bean> collection =   ctKeiyaku006Dao.getInfoList();
        model.addAttribute("infoList",collection);
        return "ct_keiyaku_006/ctkeiyaku006_list";
    }

    // 【口座管理】新規ボタンを押下して、【口座管理】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_006")
    public String toInfoAdd(Model model) {
        // 自社他社区分
        model.addAttribute("map_01", getCodeValueMap("01"));

        return "ct_keiyaku_006/ctkeiyaku006_add_update";
    }

    // 【口座管理】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_006")
    public String excuteInfoAdd(CtKeiyaku006Bean ctKeiyaku006Bean) {
        System.out.println("" + ctKeiyaku006Bean);
        ctKeiyaku006Dao.save(ctKeiyaku006Bean);
        return "redirect:/ct_keiyaku_006_all";
    }

    // 【口座管理】編集ボタンを押下して、【口座管理】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_006/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        // 自社他社区分
        model.addAttribute("map_01", getCodeValueMap("01"));

        CtKeiyaku006Bean ctKeiyaku006Bean = ctKeiyaku006Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku006Bean);
        return "ct_keiyaku_006/ctkeiyaku006_add_update";
    }

    // 【口座管理】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_006")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku006Bean ctKeiyaku006Bean) {
        ctKeiyaku006Dao.save( ctKeiyaku006Bean);
        return "redirect:/ct_keiyaku_006_all";
    }

    // 【口座管理】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_006/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku006Dao.delete(id);
        return "redirect:/ct_keiyaku_006_all";
    }

    private Map<String, String> getCodeValueMap(String itemindex) {
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(BzlCodeIdConstant.CT_KEIYAKU_006, itemindex);

        Map<String, String> map = new HashMap<>();
        for (SysCode003Bean bean : collection) {
            map.put(bean.getTableCodeId(), bean.getCodeValue());
        }
        return map;
    }
}
