package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku020Bean;
import com.liu.springboot04web.dao.CtKeiyaku020Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class CtKeiyaku020Controller {
    @Autowired
    CtKeiyaku020Dao ctKeiyaku020Dao;

    // 【勤務先】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_020_all")
    public String list(Model model) {
        Collection<CtKeiyaku020Bean> collection = ctKeiyaku020Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_020/ctkeiyaku020_list";
    }

    // 【勤務先】新規ボタンを押下して、【勤務先】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_020")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_020/ctkeiyaku020_add_update";
    }

    // 【勤務先】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_020")
    public String excuteInfoAdd(CtKeiyaku020Bean ctKeiyaku020Bean) {
        System.out.println("" + ctKeiyaku020Bean);
        ctKeiyaku020Dao.save(ctKeiyaku020Bean);
        return "redirect:/ct_keiyaku_020_all";
    }

    // 【勤務先】編集ボタンを押下して、【勤務先】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_020/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku020Bean ctKeiyaku020Bean = ctKeiyaku020Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku020Bean);
        return "ct_keiyaku_020/ctkeiyaku020_add_update";
    }

    // 【勤務先】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_020")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku020Bean ctKeiyaku020Bean) {
        ctKeiyaku020Dao.save(ctKeiyaku020Bean);
        return "redirect:/ct_keiyaku_020_all";
    }

    // 【勤務先】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_020/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku020Dao.delete(id);
        return "redirect:/ct_keiyaku_020_all";
    }
}

