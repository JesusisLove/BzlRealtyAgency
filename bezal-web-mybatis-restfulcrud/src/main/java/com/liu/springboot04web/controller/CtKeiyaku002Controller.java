package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku002Bean;
import com.liu.springboot04web.bean.SysCode003Bean;
import com.liu.springboot04web.constant.BzlCodeIdConstant;
import com.liu.springboot04web.dao.CtKeiyaku002Dao;
import com.liu.springboot04web.dao.SysCode003Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CtKeiyaku002Controller {

    @Autowired
    CtKeiyaku002Dao ctKeiyaku002Dao;
    @Autowired
    SysCode003Dao sysCode003Dao;

    // 【鍵情報】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_002_all")
    public String list(Model model) {
        Collection<CtKeiyaku002Bean> collection = ctKeiyaku002Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_002/ctkeiyaku002_list";
    }

    // 【鍵情報】新規ボタンを押下して、【鍵情報】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_002")
    public String toInfoAdd(Model model) {

        // マスタキー有無
        model.addAttribute("map_01", getCodeValueMap("01"));
        // 用途区分
        model.addAttribute("map_02", getCodeValueMap("02"));
        // 鍵状態
        model.addAttribute("map_03", getCodeValueMap("03"));
        // 鍵タイプ
        model.addAttribute("map_04", getCodeValueMap("04"));

        return "ct_keiyaku_002/ctkeiyaku002_add_update";
    }

    // 【鍵情報】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_002")
    public String excuteInfoAdd(CtKeiyaku002Bean ctKeiyaku002Bean) {
        System.out.println("" + ctKeiyaku002Bean);
        ctKeiyaku002Dao.save(ctKeiyaku002Bean);
        return "redirect:/ct_keiyaku_002_all";
    }

    // 【鍵情報】編集ボタンを押下して、【鍵情報】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_002/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        // マスタキー有無
        model.addAttribute("map_01", getCodeValueMap("01"));
        // 用途区分
        model.addAttribute("map_02", getCodeValueMap("02"));
        // 鍵状態
        model.addAttribute("map_03", getCodeValueMap("03"));
        // 鍵タイプ
        model.addAttribute("map_04", getCodeValueMap("04"));

        CtKeiyaku002Bean ctKeiyaku002Bean = ctKeiyaku002Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku002Bean);
        return "ct_keiyaku_002/ctkeiyaku002_add_update";
    }

    // 【鍵情報】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_002")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku002Bean ctKeiyaku002Bean) {
        ctKeiyaku002Dao.save(ctKeiyaku002Bean);
        return "redirect:/ct_keiyaku_002_all";
    }

    // 【鍵情報】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_002/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku002Dao.delete(id);
        return "redirect:/ct_keiyaku_002_all";
    }

    private Map<String, String> getCodeValueMap(String itemindex) {
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(BzlCodeIdConstant.CT_KEIYAKU_002, itemindex);

        Map<String, String> map = new HashMap<>();
        for (SysCode003Bean bean : collection) {
            map.put(bean.getTableCodeId(), bean.getCodeValue());
        }
        return map;
    }
}

