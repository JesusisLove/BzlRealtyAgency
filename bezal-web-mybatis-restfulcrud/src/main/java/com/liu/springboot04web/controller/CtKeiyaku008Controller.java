package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku008Bean;
import com.liu.springboot04web.bean.SysCode003Bean;
import com.liu.springboot04web.constant.BzlCodeIdConstant;
import com.liu.springboot04web.dao.CtKeiyaku008Dao;
import com.liu.springboot04web.dao.SysCode003Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CtKeiyaku008Controller{
    @Autowired
    CtKeiyaku008Dao ctKeiyaku008Dao;
    @Autowired
    SysCode003Dao sysCode003Dao;

    // 【個人契約者】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_008_all")
    public String list(Model model) {
        Collection<CtKeiyaku008Bean> collection = ctKeiyaku008Dao.getInfoList();
        model.addAttribute("infoList",collection);
        return "ct_keiyaku_008/ctkeiyaku008_list";
    }
    // 【個人契約者】新規ボタンを押下して、【個人契約者】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_008")
    public String toInfoAdd(Model model) {
        // 職種
        model.addAttribute("map_01", getCodeValueMap("01"));

        return "ct_keiyaku_008/ctkeiyaku008_add_update";
    }
    // 【個人契約者】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_008")
    public String excuteInfoAdd(CtKeiyaku008Bean ctKeiyaku008Bean) {
        System.out.println("" + ctKeiyaku008Bean);
        ctKeiyaku008Dao.save(ctKeiyaku008Bean);
        return "redirect:/ct_keiyaku_008_all";
    }
    // 【個人契約者】編集ボタンを押下して、【個人契約者】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_008/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        // 職種
        model.addAttribute("map_01", getCodeValueMap("01"));

        CtKeiyaku008Bean ctKeiyaku008Bean = ctKeiyaku008Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku008Bean);
        return "ct_keiyaku_008/ctkeiyaku008_add_update";
    }
    // 【個人契約者】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_008")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku008Bean ctKeiyaku008Bean) {
        ctKeiyaku008Dao.save(ctKeiyaku008Bean);
        return "redirect:/ct_keiyaku_008_all";
    }
    // 【個人契約者】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_008/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku008Dao.delete(id);
        return "redirect:/ct_keiyaku_008_all";
    }

    private Map<String, String> getCodeValueMap(String itemindex) {
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(BzlCodeIdConstant.CT_KEIYAKU_008, itemindex);

        Map<String, String> map = new HashMap<>();
        for (SysCode003Bean bean : collection) {
            map.put(bean.getTableCodeId(), bean.getCodeValue());
        }
        return map;
    }
}
