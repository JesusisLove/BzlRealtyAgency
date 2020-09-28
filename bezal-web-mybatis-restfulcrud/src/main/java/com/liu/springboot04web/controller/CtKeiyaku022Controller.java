package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku022Bean;
import com.liu.springboot04web.bean.SysCode003Bean;
import com.liu.springboot04web.constant.BzlCodeIdConstant;
import com.liu.springboot04web.dao.CtKeiyaku022Dao;
import com.liu.springboot04web.dao.SysCode003Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CtKeiyaku022Controller {
    @Autowired
    CtKeiyaku022Dao ctKeiyaku022Dao;
    @Autowired
    SysCode003Dao sysCode003Dao;

    // 【意向金情報】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_022_all")
    public String list(Model model) {
        Collection<CtKeiyaku022Bean> collection = ctKeiyaku022Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_022/ctkeiyaku022_list";
    }

    // 【意向金情報】新規ボタンを押下して、【意向金情報】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_022")
    public String toInfoAdd(Model model) {
        //　支払種類
        model.addAttribute("map_01", getCodeValueMap("01"));
        //　返金済フラグ
        model.addAttribute("map_02", getCodeValueMap("02"));
        //　通貨種類
        model.addAttribute("map_03", getCodeValueMap("03"));

        return "ct_keiyaku_022/ctkeiyaku022_add_update";
    }

    // 【意向金情報】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_022")
    public String excuteInfoAdd(CtKeiyaku022Bean ctKeiyaku022Bean) {
        System.out.println("" + ctKeiyaku022Bean);
        ctKeiyaku022Dao.save(ctKeiyaku022Bean);
        return "redirect:/ct_keiyaku_022_all";
    }

    // 【意向金情報】編集ボタンを押下して、【意向金情報】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_022/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        //　支払種類
        model.addAttribute("map_01", getCodeValueMap("01"));
        //　返金済フラグ
        model.addAttribute("map_02", getCodeValueMap("02"));
        //　通貨種類
        model.addAttribute("map_03", getCodeValueMap("03"));

        CtKeiyaku022Bean ctKeiyaku022Bean = ctKeiyaku022Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku022Bean);
        return "ct_keiyaku_022/ctkeiyaku022_add_update";
    }

    // 【意向金情報】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_022")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku022Bean ctKeiyaku022Bean) {
        ctKeiyaku022Dao.save(ctKeiyaku022Bean);
        return "redirect:/ct_keiyaku_022_all";
    }

    // 【意向金情報】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_022/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku022Dao.delete(id);
        return "redirect:/ct_keiyaku_022_all";
    }

    private Map<String, String> getCodeValueMap(String itemindex) {
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(BzlCodeIdConstant.CT_KEIYAKU_022, itemindex);

        Map<String, String> map = new HashMap<>();
        for (SysCode003Bean bean : collection) {
            map.put(bean.getTableCodeId(), bean.getCodeValue());
        }
        return map;
    }
}

