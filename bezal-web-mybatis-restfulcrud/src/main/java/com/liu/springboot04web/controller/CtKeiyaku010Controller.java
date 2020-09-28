package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.CtKeiyaku010Bean;
import com.liu.springboot04web.bean.SysCode003Bean;
import com.liu.springboot04web.constant.BzlCodeIdConstant;
import com.liu.springboot04web.dao.CtKeiyaku010Dao;
import com.liu.springboot04web.dao.SysCode003Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CtKeiyaku010Controller {
    @Autowired
    CtKeiyaku010Dao ctKeiyaku010Dao;
    @Autowired
    SysCode003Dao sysCode003Dao;

    // 【賃貸契約】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/ct_keiyaku_010_all")
    public String list(Model model) {
        Collection<CtKeiyaku010Bean> collection = ctKeiyaku010Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "ct_keiyaku_010/ctkeiyaku010_list";
    }

    // 【賃貸契約】新規ボタンを押下して、【賃貸契約】新規画面へ遷移すること
    @GetMapping("/ct_keiyaku_010")
    public String toInfoAdd(Model model) {
        // 個人法人区分
        model.addAttribute("map_01", getCodeValueMap("01"));

        return "ct_keiyaku_010/ctkeiyaku010_add_update";
    }

    // 【賃貸契約】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/ct_keiyaku_010")
    public String excuteInfoAdd(CtKeiyaku010Bean ctKeiyaku010Bean) {
        System.out.println("" + ctKeiyaku010Bean);
        ctKeiyaku010Dao.save(ctKeiyaku010Bean);
        return "redirect:/ct_keiyaku_010_all";
    }

    // 【賃貸契約】編集ボタンを押下して、【賃貸契約】編集画面へ遷移すること
    @GetMapping("/ct_keiyaku_010/{id}")
    public String toInfoEdit(@PathVariable("id") String id, Model model) {
        //　個人法人区分
        model.addAttribute("map_01", getCodeValueMap("01"));

        CtKeiyaku010Bean ctKeiyaku010Bean = ctKeiyaku010Dao.getInfoById(id);
        model.addAttribute("selectedinfo", ctKeiyaku010Bean);
        return "ct_keiyaku_010/ctkeiyaku010_add_update";
    }

    // 【賃貸契約】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/ct_keiyaku_010")
    public String excuteInfoEdit(@ModelAttribute CtKeiyaku010Bean ctKeiyaku010Bean) {
        ctKeiyaku010Dao.save(ctKeiyaku010Bean);
        return "redirect:/ct_keiyaku_010_all";
    }

    // 【賃貸契約】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/ct_keiyaku_010/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        ctKeiyaku010Dao.delete(id);
        return "redirect:/ct_keiyaku_010_all";
    }

    private Map<String, String> getCodeValueMap(String itemindex) {
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(BzlCodeIdConstant.CT_KEIYAKU_010, itemindex);

        Map<String, String> map = new HashMap<>();
        for (SysCode003Bean bean : collection) {
            map.put(bean.getTableCodeId(), bean.getCodeValue());
        }
        return map;
    }
}

