package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku015Bean;
import com.liu.springboot04web.dao.CtKeiyaku015Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class CtKeiyaku015Controller {
    @Autowired
    CtKeiyaku015Dao ctKeiyaku015Dao;

    // 【家財保険プラン情報】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_015_all")
    public String list(Model model) {
        Collection<CtKeiyaku015Bean> collection = ctKeiyaku015Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_015/ctkeiyaku015_list";
    }

    // 【家財保険プラン情報】新規ボタンを押下して、【家財保険プラン情報】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_015")
    public String toInfoAdd(Model model) {
        return "ct_keiyaku_015/ctkeiyaku015_add_update";
    }

    // 【家財保険プラン情報】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_015")
    public String excuteInfoAdd(CtKeiyaku015Bean ctKeiyaku015Bean) {
        System.out.println("" + ctKeiyaku015Bean);
        ctKeiyaku015Dao.save(ctKeiyaku015Bean);
        return "redirect:/ct_keiyaku_015_all";
    }

    // 【家財保険プラン情報】編集ボタンを押下して、【家財保険プラン情報】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_015/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        CtKeiyaku015Bean ctKeiyaku015Bean = ctKeiyaku015Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku015Bean);
        return "ct_keiyaku_015/ctkeiyaku015_add_update";
    }

    // 【家財保険プラン情報】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_015")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku015Bean ctKeiyaku015Bean) {
        ctKeiyaku015Dao.save(ctKeiyaku015Bean);
        return "redirect:/ct_keiyaku_015_all";
    }

    // 【家財保険プラン情報】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_015/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku015Dao.delete(id);
        return "redirect:/ct_keiyaku_015_all";
    }
}

