package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku012Bean;
import com.liu.springboot04web.dao.CtKeiyaku012Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Controller
public class CtKeiyaku012Controller{
    @Autowired
    CtKeiyaku012Dao ctKeiyaku012Dao;
    // 【保証会社情報】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_012_all")
    public String list(Model model) {
        Collection<CtKeiyaku012Bean> collection = ctKeiyaku012Dao.getInfoList();
        model.addAttribute("infoList",collection);
        return "ct_keiyaku_012/ctkeiyaku012_list";
    }
    // 【保証会社情報】新規ボタンを押下して、【保証会社情報】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_012")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_012/ctkeiyaku012_add_update";
    }
    // 【保証会社情報】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_012")
    public String excuteInfoAdd(CtKeiyaku012Bean ctKeiyaku012Bean) {
        System.out.println("" + ctKeiyaku012Bean);
        ctKeiyaku012Dao.save(ctKeiyaku012Bean);
        return "redirect:/ct_keiyaku_012_all";
    }
    // 【保証会社情報】編集ボタンを押下して、【保証会社情報】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_012/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku012Bean ctKeiyaku012Bean = ctKeiyaku012Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku012Bean);
        return "ct_keiyaku_012/ctkeiyaku012_add_update";
    }
    // 【保証会社情報】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_012")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku012Bean ctKeiyaku012Bean) {
        ctKeiyaku012Dao.save(ctKeiyaku012Bean);
        return "redirect:/ct_keiyaku_012_all";
    }
    // 【保証会社情報】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_012/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku012Dao.delete(id);
        return "redirect:/ct_keiyaku_012_all";
    }
}

