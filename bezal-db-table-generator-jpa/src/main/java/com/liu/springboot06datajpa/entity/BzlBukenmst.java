package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BzlBukenmstPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：CT_KEIYAKU_001 【物件情報】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "bzl_bukenmst")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = BzlBukenmstPK.class)
public class BzlBukenmst {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "buken_mng_no", length = 32, nullable = false)
    protected String bukenMngNo;
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
    @Column(name = "apart_structor", length = 60)
    protected String apartStructor;
    @Column(name = "apart_wood", length = 60)
    protected String apartWood;
    @Column(name = "apart_area", length = 16)
    protected String apartArea;
    @Column(name = "apart_for_use", length = 60)
    protected String apartForUse;
    @Column(name = "apart_mng_fee")
    protected float apartMngFee;
    @Column(name = "daytime_mng_cop_mng_no", length = 32)
    protected String daytimeMngCopMngNo;
    @Column(name = "key_switch_fee")
    protected float keySwitchFee;
    @Column(name = "anti_bctril_construc_fee")
    protected float antiBctrilConstrucFee;
    @Column(name = "peace_support_fee")
    protected float peaceSupportFee;
    @Column(name = "rent_fee")
    protected float rentFee;
    @Column(name = "allow_live_num")
    protected Integer allowLiveNum;
    @Column(name = "buken_own_no", length = 32)
    protected String bukenOwnNo;
    @Column(name = "reikin")
    protected float reikin;
    @Column(name = "shikikin")
    protected float shikikin;
    @Column(name = "buken_status")
    protected Integer bukenStatus;
    @Column(name = "koukoku_fee")
    protected float koukokuFee;
    @Column(name = "buken_mng_flg")
    protected Integer bukenMngFlg;
    @Column(name = "chukai_fee")
    protected float chukaiFee;
    @Column(name = "mntnace_hst", length = 255)
    protected String mntnaceHst;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "tantosha_code", length = 32)
    protected String tantoshaCode;
    @Column(name = "del_flg", columnDefinition = "integer default 0")
    protected Integer delFlg;


}
