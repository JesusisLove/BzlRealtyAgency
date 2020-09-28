package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku018Bean;
import com.liu.springboot04web.dao.CtKeiyaku018Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class CtKeiyaku018Controller {
    @Autowired
    CtKeiyaku018Dao ctKeiyaku018Dao;

    // 【保証人情報】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_018_all")
    public String list(Model model) {
        Collection<CtKeiyaku018Bean> collection = ctKeiyaku018Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_018/ctkeiyaku018_list";
    }

    // 【保証人情報】新規ボタンを押下して、【保証人情報】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_018")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_018/ctkeiyaku018_add_update";
    }

    // 【保証人情報】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_018")
    public String excuteInfoAdd(CtKeiyaku018Bean ctKeiyaku018Bean) {
        System.out.println("" + ctKeiyaku018Bean);
        ctKeiyaku018Dao.save(ctKeiyaku018Bean);
        return "redirect:/ct_keiyaku_018_all";
    }

    // 【保証人情報】編集ボタンを押下して、【保証人情報】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_018/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku018Bean ctKeiyaku018Bean = ctKeiyaku018Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku018Bean);
        return "ct_keiyaku_018/ctkeiyaku018_add_update";
    }

    // 【保証人情報】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_018")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku018Bean ctKeiyaku018Bean) {
        ctKeiyaku018Dao.save(ctKeiyaku018Bean);
        return "redirect:/ct_keiyaku_018_all";
    }

    // 【保証人情報】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_018/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku018Dao.delete(id);
        return "redirect:/ct_keiyaku_018_all";
    }
}

