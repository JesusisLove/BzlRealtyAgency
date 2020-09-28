package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BzlRenrakusakimstPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：CT_KEIYAKU_021 【緊急連絡先】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "bzl_renrakusakimst")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = BzlRenrakusakimstPK.class)
public class BzlRenrakusakimst {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "emrgcy_cntct_mng_no", length = 32, nullable = false)
    protected String emrgcyCntctMngNo;
    @Column(name = "fullname", length = 60)
    protected String fullname;
    @Column(name = "fullname_kana", length = 60)
    protected String fullnameKana;
    @Column(name = "gender", length = 2)
    protected String gender;
    @Column(name = "birth_day")
    protected Date birthDay;
    @Column(name = "post_code", length = 10)
    protected String postCode;
    @Column(name = "loaction1", length = 255)
    protected String loaction1;
    @Column(name = "loaction2", length = 255)
    protected String loaction2;
    @Column(name = "apart_name", length = 60)
    protected String apartName;
    @Column(name = "apart_code", length = 10)
    protected String apartCode;
    @Column(name = "cop_name", length = 60)
    protected String copName;
    @Column(name = "tel_number", length = 20)
    protected String telNumber;
    @Column(name = "email", length = 255)
    protected String email;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "tantosha_code", length = 32)
    protected String tantoshaCode;
    @Column(name = "del_flg", columnDefinition = "integer default 0")
    protected Integer delFlg;
}

