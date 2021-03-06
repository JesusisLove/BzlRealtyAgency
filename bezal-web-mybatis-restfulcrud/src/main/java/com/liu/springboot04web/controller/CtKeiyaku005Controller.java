package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku005Bean;
import com.liu.springboot04web.dao.CtKeiyaku005Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class CtKeiyaku005Controller {

    @Autowired
    CtKeiyaku005Dao ctKeiyaku005Dao;

    // 【物件管理会社】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_005_all")
    public String list(Model model) {
        Collection<CtKeiyaku005Bean> collection = ctKeiyaku005Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_005/ctkeiyaku005_list";
    }

    // 【物件管理会社】新規ボタンを押下して、【物件管理会社】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_005")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_005/ctkeiyaku005_add_update";
    }

    // 【物件管理会社】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_005")
    public String excuteInfoAdd(CtKeiyaku005Bean ctKeiyaku005Bean) {
        System.out.println("" + ctKeiyaku005Bean);
        ctKeiyaku005Dao.save(ctKeiyaku005Bean);
        return "redirect:/ct_keiyaku_005_all";
    }


    // 【物件管理会社】編集ボタンを押下して、【物件管理会社】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_005/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku005Bean ctKeiyaku005Bean = ctKeiyaku005Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku005Bean);
        return "ct_keiyaku_005/ctkeiyaku005_add_update";
    }


    // 【物件管理会社】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_005")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku005Bean ctKeiyaku005Bean) {
        ctKeiyaku005Dao.save(ctKeiyaku005Bean);
        return "redirect:/ct_keiyaku_005_all";
    }


    // 【物件管理会社】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_005/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku005Dao.delete(id);
        return "redirect:/ct_keiyaku_005_all";
    }
}
