package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku019Bean;
import com.liu.springboot04web.bean.SysCode003Bean;
import com.liu.springboot04web.constant.BzlCodeIdConstant;
import com.liu.springboot04web.dao.CtKeiyaku019Dao;
import com.liu.springboot04web.dao.SysCode003Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CtKeiyaku019Controller {
    @Autowired
    CtKeiyaku019Dao ctKeiyaku019Dao;
    @Autowired
    SysCode003Dao sysCode003Dao;

    // 【入居者管理】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_019_all")
    public String list(Model model) {
        Collection<CtKeiyaku019Bean> collection = ctKeiyaku019Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_019/ctkeiyaku019_list";
    }

    // 【入居者管理】新規ボタンを押下して、【入居者管理】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_019")
    public String toInfoAdd(Model model) {
        //　入居者区分
        model.addAttribute("map_01", getCodeValueMap("01"));

        return "ct_keiyaku_019/ctkeiyaku019_add_update";
    }

    // 【入居者管理】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_019")
    public String excuteInfoAdd(CtKeiyaku019Bean ctKeiyaku019Bean) {
        System.out.println("" + ctKeiyaku019Bean);
        ctKeiyaku019Dao.save(ctKeiyaku019Bean);
        return "redirect:/ct_keiyaku_019_all";
    }

    // 【入居者管理】編集ボタンを押下して、【入居者管理】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_019/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        //　入居者区分
        model.addAttribute("map_01", getCodeValueMap("01"));

        CtKeiyaku019Bean ctKeiyaku019Bean = ctKeiyaku019Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku019Bean);
        return "ct_keiyaku_019/ctkeiyaku019_add_update";
    }

    // 【入居者管理】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_019")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku019Bean ctKeiyaku019Bean) {
        ctKeiyaku019Dao.save(ctKeiyaku019Bean);
        return "redirect:/ct_keiyaku_019_all";
    }

    // 【入居者管理】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_019/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku019Dao.delete(id);
        return "redirect:/ct_keiyaku_019_all";
    }

    private Map<String, String> getCodeValueMap(String itemindex) {
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(BzlCodeIdConstant.CT_KEIYAKU_019, itemindex);

        Map<String, String> map = new HashMap<>();
        for (SysCode003Bean bean : collection) {
            map.put(bean.getTableCodeId(), bean.getCodeValue());
        }
        return map;
    }
}

