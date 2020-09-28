package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku016Bean;
import com.liu.springboot04web.dao.CtKeiyaku016Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Controller
public class CtKeiyaku016Controller{
    @Autowired
    CtKeiyaku016Dao ctKeiyaku016Dao;
    // 【仲介会社】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_016_all")
    public String list(Model model) {
        Collection<CtKeiyaku016Bean> collection = ctKeiyaku016Dao.getInfoList();
        model.addAttribute("infoList",collection);
        return "ct_keiyaku_016/ctkeiyaku016_list";
    }
    // 【仲介会社】新規ボタンを押下して、【仲介会社】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_016")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_016/ctkeiyaku016_add_update";
    }
    // 【仲介会社】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_016")
    public String excuteInfoAdd(CtKeiyaku016Bean ctKeiyaku016Bean) {
        System.out.println("" + ctKeiyaku016Bean);
        ctKeiyaku016Dao.save(ctKeiyaku016Bean);
        return "redirect:/ct_keiyaku_016_all";
    }
    // 【仲介会社】編集ボタンを押下して、【仲介会社】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_016/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku016Bean ctKeiyaku016Bean = ctKeiyaku016Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku016Bean);
        return "ct_keiyaku_016/ctkeiyaku016_add_update";
    }
    // 【仲介会社】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_016")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku016Bean ctKeiyaku016Bean) {
        ctKeiyaku016Dao.save(ctKeiyaku016Bean);
        return "redirect:/ct_keiyaku_016_all";
    }
    // 【仲介会社】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_016/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku016Dao.delete(id);
        return "redirect:/ct_keiyaku_016_all";
    }
}

