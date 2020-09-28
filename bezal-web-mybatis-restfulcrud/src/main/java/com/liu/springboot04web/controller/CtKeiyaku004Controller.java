package com.liu.springboot04web.controller;
import com.liu.springboot04web.bean.CtKeiyaku004Bean;
import com.liu.springboot04web.dao.CtKeiyaku004Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Controller
public class CtKeiyaku004Controller{
    @Autowired
    CtKeiyaku004Dao ctKeiyaku004Dao;
    // 【修繕履歴】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_004_all")
    public String list(Model model) {
        Collection<CtKeiyaku004Bean> collection = ctKeiyaku004Dao.getInfoList();
        model.addAttribute("infoList",collection);
        return "ct_keiyaku_004/ctkeiyaku004_list";
    }
    // 【修繕履歴】新規ボタンを押下して、【修繕履歴】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_004")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_004/ctkeiyaku004_add_update";
    }
    // 【修繕履歴】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_004")
    public String excuteInfoAdd(CtKeiyaku004Bean ctKeiyaku004Bean) {
        System.out.println("" + ctKeiyaku004Bean);
        ctKeiyaku004Dao.save(ctKeiyaku004Bean);
        return "redirect:/ct_keiyaku_004_all";
    }
    // 【修繕履歴】編集ボタンを押下して、【修繕履歴】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_004/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku004Bean ctKeiyaku004Bean = ctKeiyaku004Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku004Bean);
        return "ct_keiyaku_004/ctkeiyaku004_add_update";
    }
    // 【修繕履歴】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_004")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku004Bean ctKeiyaku004Bean) {
        ctKeiyaku004Dao.save(ctKeiyaku004Bean);
        return "redirect:/ct_keiyaku_004_all";
    }
    // 【修繕履歴】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_004/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku004Dao.delete(id);
        return "redirect:/ct_keiyaku_004_all";
    }
}
