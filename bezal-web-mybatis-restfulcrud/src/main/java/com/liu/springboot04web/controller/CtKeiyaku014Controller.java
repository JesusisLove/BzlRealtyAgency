package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku014Bean;
import com.liu.springboot04web.dao.CtKeiyaku014Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class CtKeiyaku014Controller {
    @Autowired
    CtKeiyaku014Dao ctKeiyaku014Dao;

    // 【家財保険会社情報】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_014_all")
    public String list(Model model) {
        Collection<CtKeiyaku014Bean> collection = ctKeiyaku014Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_014/ctkeiyaku014_list";
    }

    // 【家財保険会社情報】新規ボタンを押下して、【家財保険会社情報】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_014")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_014/ctkeiyaku014_add_update";
    }

    // 【家財保険会社情報】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_014")
    public String excuteInfoAdd(CtKeiyaku014Bean ctKeiyaku014Bean) {
        System.out.println("" + ctKeiyaku014Bean);
        ctKeiyaku014Dao.save(ctKeiyaku014Bean);
        return "redirect:/ct_keiyaku_014_all";
    }

    // 【家財保険会社情報】編集ボタンを押下して、【家財保険会社情報】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_014/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku014Bean ctKeiyaku014Bean = ctKeiyaku014Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku014Bean);
        return "ct_keiyaku_014/ctkeiyaku014_add_update";
    }

    // 【家財保険会社情報】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_014")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku014Bean ctKeiyaku014Bean) {
        ctKeiyaku014Dao.save(ctKeiyaku014Bean);
        return "redirect:/ct_keiyaku_014_all";
    }

    // 【家財保険会社情報】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_014/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku014Dao.delete(id);
        return "redirect:/ct_keiyaku_014_all";
    }
}

