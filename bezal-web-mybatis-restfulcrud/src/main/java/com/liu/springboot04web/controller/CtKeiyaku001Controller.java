package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku001Bean;
import com.liu.springboot04web.bean.SysCode003Bean;
import com.liu.springboot04web.constant.BzlCodeIdConstant;
import com.liu.springboot04web.constant.BzlCommon;
import com.liu.springboot04web.dao.CtKeiyaku001Dao;
import com.liu.springboot04web.dao.SysCode003Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class CtKeiyaku001Controller {

    @Autowired
    CtKeiyaku001Dao ctKeiyaku001Dao;
    @Autowired
    SysCode003Dao sysCode003Dao;

    // 【物件情報】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_001_all")
    public String list(Model model) {
        Collection<CtKeiyaku001Bean> collection = ctKeiyaku001Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_001/ctkeiyaku001_list";
    }

    // 【物件情報】新規ボタンを押下して、【物件情報】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_001")
    public String toInfoAdd(Model model) {
        // 用途
        model.addAttribute("map_01", getCodeValueMap("01"));
        // ステータス
        model.addAttribute("map_02", getCodeValueMap("02"));
        // 物件所有者区分
        model.addAttribute("map_03", getCodeValueMap("03"));

        return "ct_keiyaku_001/ctkeiyaku001_add_update";
    }

    // 【物件情報】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_001")
    public String excuteInfoAdd(CtKeiyaku001Bean ctKeiyaku001Bean) {
        System.out.println("" + ctKeiyaku001Bean);
        ctKeiyaku001Dao.save(ctKeiyaku001Bean);
        return "redirect:/ct_keiyaku_001_all";
    }

    // 【物件情報】編集ボタンを押下して、【物件情報】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_001/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {

        // 用途
        model.addAttribute("map_01", getCodeValueMap("01"));
        // ステータス
        model.addAttribute("map_02", getCodeValueMap("02"));
        // 物件所有者区分
        model.addAttribute("map_03", getCodeValueMap("03"));

        CtKeiyaku001Bean ctKeiyaku001Bean = ctKeiyaku001Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku001Bean);
        return "ct_keiyaku_001/ctkeiyaku001_add_update";
    }

    // 【物件情報】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_001")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku001Bean ctKeiyaku001Bean) {
        ctKeiyaku001Dao.save(ctKeiyaku001Bean);
        return "redirect:/ct_keiyaku_001_all";
    }

    // 【物件情報】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_001/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku001Dao.delete(id);
        return "redirect:/ct_keiyaku_001_all";
    }

    private Map<String, String> getCodeValueMap(String itemindex) {
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(BzlCodeIdConstant.CT_KEIYAKU_001, itemindex);

        Map<String, String> map = new HashMap<>();
        for (SysCode003Bean bean : collection) {
            map.put(bean.getTableCodeId(), bean.getCodeValue());
        }
        return map;
    }
}