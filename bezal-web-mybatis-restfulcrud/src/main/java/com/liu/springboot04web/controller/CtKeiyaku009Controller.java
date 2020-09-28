package com.liu.springboot04web.controller;
import com.liu.springboot04web.bean.CtKeiyaku009Bean;
import com.liu.springboot04web.dao.CtKeiyaku009Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Controller
public class CtKeiyaku009Controller{
    @Autowired
    CtKeiyaku009Dao ctKeiyaku009Dao;
    // 【法人契約者】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_009_all")
    public String list(Model model) {
        Collection<CtKeiyaku009Bean> collection = ctKeiyaku009Dao.getInfoList();
        model.addAttribute("infoList",collection);
        return "ct_keiyaku_009/ctkeiyaku009_list";
    }
    // 【法人契約者】新規ボタンを押下して、【法人契約者】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_009")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_009/ctkeiyaku009_add_update";
    }
    // 【法人契約者】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_009")
    public String excuteInfoAdd(CtKeiyaku009Bean ctKeiyaku009Bean) {
        System.out.println("" + ctKeiyaku009Bean);
        ctKeiyaku009Dao.save(ctKeiyaku009Bean);
        return "redirect:/ct_keiyaku_009_all";
    }
    // 【法人契約者】編集ボタンを押下して、【法人契約者】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_009/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku009Bean ctKeiyaku009Bean = ctKeiyaku009Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku009Bean);
        return "ct_keiyaku_009/ctkeiyaku009_add_update";
    }
    // 【法人契約者】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_009")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku009Bean ctKeiyaku009Bean) {
        ctKeiyaku009Dao.save(ctKeiyaku009Bean);
        return "redirect:/ct_keiyaku_009_all";
    }
    // 【法人契約者】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_009/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku009Dao.delete(id);
        return "redirect:/ct_keiyaku_009_all";
    }
}
