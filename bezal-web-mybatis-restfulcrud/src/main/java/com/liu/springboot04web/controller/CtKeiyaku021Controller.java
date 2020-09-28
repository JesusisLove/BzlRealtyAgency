package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku021Bean;
import com.liu.springboot04web.dao.CtKeiyaku021Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class CtKeiyaku021Controller {
    @Autowired
    CtKeiyaku021Dao ctKeiyaku021Dao;

    // 【緊急連絡先】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_021_all")
    public String list(Model model) {
        Collection<CtKeiyaku021Bean> collection = ctKeiyaku021Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_021/ctkeiyaku021_list";
    }

    // 【緊急連絡先】新規ボタンを押下して、【緊急連絡先】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_021")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_021/ctkeiyaku021_add_update";
    }

    // 【緊急連絡先】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_021")
    public String excuteInfoAdd(CtKeiyaku021Bean ctKeiyaku021Bean) {
        System.out.println("" + ctKeiyaku021Bean);
        ctKeiyaku021Dao.save(ctKeiyaku021Bean);
        return "redirect:/ct_keiyaku_021_all";
    }

    // 【緊急連絡先】編集ボタンを押下して、【緊急連絡先】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_021/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku021Bean ctKeiyaku021Bean = ctKeiyaku021Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku021Bean);
        return "ct_keiyaku_021/ctkeiyaku021_add_update";
    }

    // 【緊急連絡先】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_021")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku021Bean ctKeiyaku021Bean) {
        ctKeiyaku021Dao.save(ctKeiyaku021Bean);
        return "redirect:/ct_keiyaku_021_all";
    }

    // 【緊急連絡先】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_021/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku021Dao.delete(id);
        return "redirect:/ct_keiyaku_021_all";
    }
}

