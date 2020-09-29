package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.SysCode001Bean;
import com.liu.springboot04web.bean.SysCode002Bean;
import com.liu.springboot04web.bean.SysCode003Bean;
import com.liu.springboot04web.dao.SysCode001Dao;
import com.liu.springboot04web.dao.SysCode003Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class SysCode003Controller {
    @Autowired
    SysCode003Dao sysCode003Dao;
    @Autowired
    SysCode001Dao sysCode001Dao;

    // 【コード値一覧】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/sys_code_003_all")
    public String list(Model model) {
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "sys_code_003/syscode003_list";
    }

    // 【コード値一覧新規】ボタンを押下して、【コード値一覧】新規画面へ遷移すること
    @GetMapping("/sys_code_003/{tableMngNo}/{tableFieldNo}")
    public String toInfoAdd(@PathVariable(value = "tableMngNo") String tableMngNo,
                            @PathVariable(value = "tableFieldNo") String tableFieldNo,
                            Model model) {
        // テーブル採番リストを設定する
        //Collection<SysCode001Bean> collection = sysCode001Dao.getInfoList();
        //model.addAttribute("tableidlist", collection);

        SysCode003Bean sysCode003Bean = sysCode003Dao.getMaxCodeById(tableMngNo, tableFieldNo);
        model.addAttribute("targetinfo", sysCode003Bean);

        return "sys_code_003/syscode003_add_update";
    }

    // 【コード値一覧】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/sys_code_003")
    public String excuteInfoAdd(SysCode003Bean sysCode003Bean,Model model) {
        System.out.println("" + sysCode003Bean);
        sysCode003Dao.save(sysCode003Bean);
        // 重定向
        // return "redirect:/sys_code_003_all";

        // テーブル採番リストを設定する
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(sysCode003Bean.getTableMngNo(),
                                                                                sysCode003Bean.getTableFieldNo());
        model.addAttribute("infoList", collection);
        return "sys_code_003/syscode003_list";
    }

    // 【コード値一覧】編集ボタンを押下して、【コード値一覧】編集画面へ遷移すること
    @GetMapping("/sys_code_003/{id}/{tableMngNo}/{tableFieldNo}")
    public String toInfoEdit(@PathVariable("id") String id,
                             @PathVariable(value = "tableMngNo") String tableMngNo,
                             @PathVariable(value = "tableFieldNo") String tableFieldNo,
                             Model model) {
        // テーブル採番リストを設定する
        Collection<SysCode001Bean> collection = sysCode001Dao.getInfoList();
        model.addAttribute("tableidlist", collection);

        SysCode003Bean sysCode003Bean = sysCode003Dao.getInfoById(id,tableMngNo,tableFieldNo);
        model.addAttribute("targetinfo", sysCode003Bean);

        return "sys_code_003/syscode003_add_update";
    }

    // 【コード値一覧】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/sys_code_003")
    public String excuteInfoEdit(@ModelAttribute SysCode003Bean sysCode003Bean,Model model) {
        sysCode003Dao.save(sysCode003Bean);
        // 重定向
        // return "redirect:/sys_code_003_all";

        // テーブル採番リストを設定する
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(sysCode003Bean.getTableMngNo(),
                                                                                sysCode003Bean.getTableFieldNo());
        model.addAttribute("infoList", collection);
        return "sys_code_003/syscode003_list";
    }

    // 【コード値一覧】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/sys_code_003/{tableCodeId}/{tableMngNo}/{tableFieldNo}")
    public String excuteInfoDelete(@PathVariable("tableCodeId") String tableCodeId,
                                   @PathVariable(value = "tableMngNo") String tableMngNo,
                                   @PathVariable(value = "tableFieldNo") String tableFieldNo
            ,Model model) {
        sysCode003Dao.delete(tableCodeId, tableMngNo, tableFieldNo);
        // 重定向
        // return "redirect:/sys_code_003_all";

        // テーブル採番リストを設定する
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(tableMngNo,tableFieldNo);
        model.addAttribute("infoList", collection);
        return "sys_code_003/syscode003_list";
    }
}

