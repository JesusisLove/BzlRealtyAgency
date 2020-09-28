package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.SysCode001Bean;
import com.liu.springboot04web.bean.SysCode002Bean;
import com.liu.springboot04web.bean.SysCode003Bean;
import com.liu.springboot04web.dao.SysCode001Dao;
import com.liu.springboot04web.dao.SysCode002Dao;
import com.liu.springboot04web.dao.SysCode003Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collection;

@Controller
public class SysCode002Controller {
    @Autowired
    SysCode001Dao sysCode001Dao;
    @Autowired
    SysCode002Dao sysCode002Dao;
    @Autowired
    SysCode003Dao sysCode003Dao;


    // 【コード一覧項目】ボタンをクリックして，全ての情報を表示すること
    @GetMapping("/sys_code_002_all")
    public String list(Model model) {
        Collection<SysCode002Bean> collection = sysCode002Dao.getInfoList();
        model.addAttribute("infoList", collection);
        return "sys_code_002/syscode002_list";
    }

    // 【コード一覧項目】新規ボタンを押下して、【コード一覧項目】新規画面へ遷移すること
    @GetMapping("/sys_code_002")
    public String toInfoAdd(Model model) {
        // テーブル採番リストを設定する
        Collection<SysCode001Bean> collection = sysCode001Dao.getInfoList();
        model.addAttribute("tableidlist", collection);

        return "sys_code_002/syscode002_add_update";
    }

    // 【コード一覧項目】新規画面にて、【保存】ボタンを押下して、新規情報を保存すること
    @PostMapping("/sys_code_002")
    public String excuteInfoAdd(SysCode002Bean sysCode002Bean, Model model) {
        System.out.println("" + sysCode002Bean);
        sysCode002Dao.save(sysCode002Bean);
//        return "redirect:/sys_code_002_all";
        Collection<SysCode002Bean> collection = sysCode002Dao.getInfoListById(sysCode002Bean.getTableMngNo());
        model.addAttribute("infoList", collection);

        return "sys_code_002/syscode002_list";

    }

    /* 【コード一覧テーブル】一覧画面にて、項目追加ボタンを押下して、対象テーブルの【コード一覧】編集画面へ遷移すること
     *   String id：コードテーブルの項目ID
     *   String no：コードテーブルのテーブル管理ID
    * */
    @GetMapping("/sys_code_002_additem/{tblid}/{itmid}")
    public String toAddTableItem(@PathVariable("tblid") String id,
                                 @PathVariable("itmid") String no,
                                 Model model) {
        // テーブル採番リストを設定する
        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(id,no);
        model.addAttribute("infoList", collection);

        return "sys_code_003/syscode003_list";
    }

    /* 【コード一覧項目】編集ボタンを押下して、【コード一覧項目】編集画面へ遷移すること
    *   String id：コードテーブルの項目ID
    *   String no：コードテーブルのテーブル管理ID
    * */
    @GetMapping("/sys_code_002/{id}/{no}")
    public String toInfoEdit(@PathVariable("id") String id,
                             @PathVariable("no") String no,
                             Model model) {
        // テーブル採番リストを設定する
        Collection<SysCode001Bean> collection = sysCode001Dao.getInfoList();
        model.addAttribute("tableidlist", collection);

        // 対象データを抽出して、画面に渡す
        SysCode002Bean sysCode002Bean = sysCode002Dao.getInfoById(id,no);
        model.addAttribute("selectedinfo", sysCode002Bean);
        return "sys_code_002/syscode002_add_update";
    }

    // 【コード一覧項目】編集画面にて、【保存】ボタンを押下して、変更した情報を保存すること
    @PutMapping("/sys_code_002")
    public String excuteInfoEditByPram(@ModelAttribute SysCode002Bean sysCode002Bean, Model model) {
        sysCode002Dao.save(sysCode002Bean);
//
//        Collection<SysCode003Bean> collection = sysCode003Dao.getInfoListByParm(sysCode002Bean.getTableMngNo(),sysCode002Bean.getTableFieldNo());
//        model.addAttribute("infoList", collection);
//        return "sys_code_003/syscode003_list";

        Collection<SysCode002Bean> collection = sysCode002Dao.getInfoListById(sysCode002Bean.getTableMngNo());
        model.addAttribute("infoList", collection);

        return "sys_code_002/syscode002_list";

    }

//    @PutMapping("/sys_code_002")
//    public String excuteInfoEdit(@ModelAttribute SysCode002Bean sysCode002Bean) {
//        sysCode002Dao.save(sysCode002Bean);
//        return "redirect:/sys_code_002_all";
//
//    }

    // 【コード一覧項目】削除ボタンを押下して、当該情報を削除すること
    @DeleteMapping("/sys_code_002/{id}/{no}")
    public String excuteInfoDelete(@PathVariable("id") String id,
                                   @PathVariable("no") String no
                                   ,Model model) {
        sysCode002Dao.delete(id,no);
//        return "redirect:/sys_code_002_all";
        Collection<SysCode002Bean> collection = sysCode002Dao.getInfoListById(no);
        model.addAttribute("infoList", collection);

        return "sys_code_002/syscode002_list";

    }
}

