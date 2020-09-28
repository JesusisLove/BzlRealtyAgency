package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.SysCode001Bean;
import com.liu.springboot04web.bean.SysCode002Bean;
import com.liu.springboot04web.dao.SysCode001Dao;
import com.liu.springboot04web.dao.SysCode002Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class SysCode001Controller {
    @Autowired
    SysCode001Dao sysCode001Dao;
    @Autowired
    SysCode002Dao sysCode002Dao;

    // 【コード一覧テーブル】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/sys_code_001_all")
    public String list(Model model) {
        Collection<SysCode001Bean> collection = sysCode001Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "sys_code_001/syscode001_list";
    }

    // 【コード一覧テーブル】新規ボタンを押下して、【コード一覧テーブル】新規画面へ遷移すること
    @GetMapping("/sys_code_001")
    public String toInfoAdd(Model model) {

        // テーブル採番リストを設定する
        Collection<SysCode001Bean> collection = sysCode001Dao.getInfoList();
        model.addAttribute("tableidlist", collection);
        return "sys_code_001/syscode001_add_update";
    }

    // 【コード一覧テーブル】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/sys_code_001")
    public String excuteInfoAdd(SysCode001Bean sysCode001Bean) {
        System.out.println("" + sysCode001Bean);
        sysCode001Dao.save(sysCode001Bean);
        return "redirect:/sys_code_001_all";
    }

    // 【コード一覧テーブル】一覧画面にて、項目管理ボタンを押下して、対象テーブルの【コード一覧】編集画面へ遷移すること
    @GetMapping("/sys_code_001_additem/{id}")
    public String toAddTableItem(@PathVariable("id") String id, Model model) {
        // テーブル採番リストを設定する
        Collection<SysCode002Bean> collection = sysCode002Dao.getInfoListById(id);
        model.addAttribute("infoList", collection);

        return "sys_code_002/syscode002_list";
    }

    // 【コード一覧テーブル】編集ボタンを押下して、【コード一覧テーブル】編集画面へ遷移すること
    @GetMapping("/sys_code_001/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        // テーブル採番リストを設定する
        Collection<SysCode001Bean> collection = sysCode001Dao.getInfoList();
        model.addAttribute("tableidlist", collection);
        SysCode001Bean sysCode001Bean = sysCode001Dao.getInfoById(id);
        model.addAttribute("selectedinfo", sysCode001Bean);
        return "sys_code_001/syscode001_add_update";
    }

    // 【コード一覧テーブル】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/sys_code_001")
    public String excuteInfoEdit(@ModelAttribute SysCode001Bean sysCode001Bean) {
        sysCode001Dao.save(sysCode001Bean);
        return "redirect:/sys_code_001_all";
    }

    // 【コード一覧テーブル】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/sys_code_001/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        sysCode001Dao.delete(id);
        return "redirect:/sys_code_001_all";
    }
}
