package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku007Bean;
import com.liu.springboot04web.dao.CtKeiyaku007Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Controller
public class CtKeiyaku007Controller{
    @Autowired
    CtKeiyaku007Dao ctKeiyaku007Dao;
    // 【口座管理】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_007_all")
    public String list(Model model) {
        Collection<CtKeiyaku007Bean> collection = ctKeiyaku007Dao.getInfoList();
        model.addAttribute("infoList",collection);
        return "ct_keiyaku_007/ctkeiyaku007_list";
    }
    // 【口座管理】新規ボタンを押下して、【口座管理】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_007")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_007/ctkeiyaku007_add_update";
    }
    // 【口座管理】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_007")
    public String excuteInfoAdd(CtKeiyaku007Bean ctKeiyaku007Bean) {
        System.out.println("" + ctKeiyaku007Bean);
        ctKeiyaku007Dao.save(ctKeiyaku007Bean);
        return "redirect:/ct_keiyaku_007_all";
    }
    // 【口座管理】編集ボタンを押下して、【口座管理】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_007/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku007Bean ctKeiyaku007Bean = ctKeiyaku007Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku007Bean);
        return "ct_keiyaku_007/ctkeiyaku007_add_update";
    }
    // 【口座管理】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_007")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku007Bean ctKeiyaku007Bean) {
        ctKeiyaku007Dao.save(ctKeiyaku007Bean);
        return "redirect:/ct_keiyaku_007_all";
    }
    // 【口座管理】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_007/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku007Dao.delete(id);
        return "redirect:/ct_keiyaku_007_all";
    }
}

