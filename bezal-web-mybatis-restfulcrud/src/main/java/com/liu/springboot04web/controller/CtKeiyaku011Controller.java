package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku011Bean;
import com.liu.springboot04web.bean.SysCode003Bean;
import com.liu.springboot04web.constant.BzlCodeIdConstant;
import com.liu.springboot04web.dao.CtKeiyaku011Dao;
import com.liu.springboot04web.dao.SysCode003Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CtKeiyaku011Controller {
    @Autowired
    CtKeiyaku011Dao ctKeiyaku011Dao;
    @Autowired
    SysCode003Dao sysCode003Dao;

    // 【大家さん契約】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_011_all")
    public String list(Model model) {
        Collection<CtKeiyaku011Bean> collection = ctKeiyaku011Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_011/ctkeiyaku011_list";
    }

    // 【大家さん契約】新規ボタンを押下して、【大家さん契約】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_011")
    public String toInfoAdd(Model model) {
        //　個人法人区分
        model.addAttribute("map_01", getCodeValueMap("01"));
        //　契約更新手数料対象
        model.addAttribute("map_02", getCodeValueMap("02"));

        return "ct_keiyaku_011/ctkeiyaku011_add_update";
    }

    // 【大家さん契約】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_011")
    public String excuteInfoAdd(CtKeiyaku011Bean ctKeiyaku011Bean) {
        System.out.println("" + ctKeiyaku011Bean);
        ctKeiyaku011Dao.save(ctKeiyaku011Bean);
        return "redirect:/ct_keiyaku_011_all";
    }

    // 【大家さん契約】編集ボタンを押下して、【大家さん契約】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_011/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        //　個人法人区分
        model.addAttribute("map_01", getCodeValueMap("01"));
        //　契約更新手数料対象
        model.addAttribute("map_02", getCodeValueMap("02"));

        CtKeiyaku011Bean ctKeiyaku011Bean = ctKeiyaku011Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku011Bean);
        return "ct_keiyaku_011/ctkeiyaku011_add_update";
    }

    // 【大家さん契約】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_011")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku011Bean ctKeiyaku011Bean) {
        ctKeiyaku011Dao.save(ctKeiyaku011Bean);
        return "redirect:/ct_keiyaku_011_all";
    }

    // 【大家さん契約】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_011/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku011Dao.delete(id);
        return "redirect:/ct_keiyaku_011_all";
    }

    private Map<String, String> getCodeValueMap(String itemindex) {
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(BzlCodeIdConstant.CT_KEIYAKU_011, itemindex);

        Map<String, String> map = new HashMap<>();
        for (SysCode003Bean bean : collection) {
            map.put(bean.getTableCodeId(), bean.getCodeValue());
        }
        return map;
    }
}

