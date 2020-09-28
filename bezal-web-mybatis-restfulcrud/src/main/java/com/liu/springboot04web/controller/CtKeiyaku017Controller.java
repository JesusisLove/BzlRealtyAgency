package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku017Bean;
import com.liu.springboot04web.dao.CtKeiyaku017Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class CtKeiyaku017Controller {
    @Autowired
    CtKeiyaku017Dao ctKeiyaku017Dao;

    // 【紹介人】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_017_all")
    public String list(Model model) {
        Collection<CtKeiyaku017Bean> collection = ctKeiyaku017Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_017/ctkeiyaku017_list";
    }

    // 【紹介人】新規ボタンを押下して、【紹介人】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_017")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_017/ctkeiyaku017_add_update";
    }

    // 【紹介人】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_017")
    public String excuteInfoAdd(CtKeiyaku017Bean ctKeiyaku017Bean) {
        System.out.println("" + ctKeiyaku017Bean);
        ctKeiyaku017Dao.save(ctKeiyaku017Bean);
        return "redirect:/ct_keiyaku_017_all";
    }

    // 【紹介人】編集ボタンを押下して、【紹介人】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_017/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku017Bean ctKeiyaku017Bean = ctKeiyaku017Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku017Bean);
        return "ct_keiyaku_017/ctkeiyaku017_add_update";
    }

    // 【紹介人】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_017")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku017Bean ctKeiyaku017Bean) {
        ctKeiyaku017Dao.save(ctKeiyaku017Bean);
        return "redirect:/ct_keiyaku_017_all";
    }

    // 【紹介人】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_017/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku017Dao.delete(id);
        return "redirect:/ct_keiyaku_017_all";
    }
}

