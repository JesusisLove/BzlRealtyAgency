package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku013Bean;
import com.liu.springboot04web.dao.CtKeiyaku013Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class CtKeiyaku013Controller {
    @Autowired
    CtKeiyaku013Dao ctKeiyaku013Dao;

    // 【保証会社プラン情報】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_013_all")
    public String list(Model model) {
        Collection<CtKeiyaku013Bean> collection = ctKeiyaku013Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_013/ctkeiyaku013_list";
    }

    // 【保証会社プラン情報】新規ボタンを押下して、【保証会社プラン情報】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_013")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_013/ctkeiyaku013_add_update";
    }

    // 【保証会社プラン情報】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_013")
    public String excuteInfoAdd(CtKeiyaku013Bean ctKeiyaku013Bean) {
        System.out.println("" + ctKeiyaku013Bean);
        ctKeiyaku013Dao.save(ctKeiyaku013Bean);
        return "redirect:/ct_keiyaku_013_all";
    }

    // 【保証会社プラン情報】編集ボタンを押下して、【保証会社プラン情報】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_013/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku013Bean ctKeiyaku013Bean = ctKeiyaku013Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku013Bean);
        return "ct_keiyaku_013/ctkeiyaku013_add_update";
    }

    // 【保証会社プラン情報】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_013")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku013Bean ctKeiyaku013Bean) {
        ctKeiyaku013Dao.save(ctKeiyaku013Bean);
        return "redirect:/ct_keiyaku_013_all";
    }

    // 【保証会社プラン情報】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_013/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku013Dao.delete(id);
        return "redirect:/ct_keiyaku_013_all";
    }
}

