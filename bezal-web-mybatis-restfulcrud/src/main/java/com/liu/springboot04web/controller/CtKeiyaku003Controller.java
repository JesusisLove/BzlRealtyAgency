package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku003Bean;
import com.liu.springboot04web.dao.CtKeiyaku003Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class CtKeiyaku003Controller {

    @Autowired
    CtKeiyaku003Dao ctKeiyaku003Dao;

    // 【日勤管理会社】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_003_all")
    public String list(Model model) {
        Collection<CtKeiyaku003Bean> collection = ctKeiyaku003Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_003/ctkeiyaku003_list";
    }

    // 【日勤管理会社】新規ボタンを押下して、【日勤管理会社】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_003")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_003/ctkeiyaku003_add_update";
    }

    // 【日勤管理会社】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_003")
    public String excuteInfoAdd(CtKeiyaku003Bean ctKeiyaku003Bean) {
        System.out.println("" + ctKeiyaku003Bean);
        ctKeiyaku003Dao.save(ctKeiyaku003Bean);
        return "redirect:/ct_keiyaku_003_all";
    }

    // 【日勤管理会社】編集ボタンを押下して、【日勤管理会社】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_003/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku003Bean ctKeiyaku003Bean = ctKeiyaku003Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku003Bean);
        return "ct_keiyaku_003/ctkeiyaku003_add_update";
    }

    // 【日勤管理会社】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_003")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku003Bean ctKeiyaku003Bean) {
        ctKeiyaku003Dao.save(ctKeiyaku003Bean);
        return "redirect:/ct_keiyaku_003_all";
    }

    // 【日勤管理会社】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_003/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku003Dao.delete(id);
        return "redirect:/ct_keiyaku_003_all";
    }
}

