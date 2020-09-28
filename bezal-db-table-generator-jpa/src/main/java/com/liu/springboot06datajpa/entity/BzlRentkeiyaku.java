package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BzlRentkeiyakuPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：CT_KEIYAKU_010 【賃貸契約】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "bzl_rentkeiyaku")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = BzlRentkeiyakuPK.class)
public class BzlRentkeiyaku {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "anken_mng_no", length = 32, nullable = false)
    protected String ankenMngNo;
    @Column(name = "keiyaku_sign_date")
    protected Date keiyakuSignDate;
    @Column(name = "keiyaku_tantosha", length = 60)
    protected String keiyakuTantosha;
    @Column(name = "keiyaku_mng_no", length = 32)
    protected String keiyakuMngNo;
    @Column(name = "buken_mng_cop_no", length = 32)
    protected String bukenMngCopNo;
    @Column(name = "buken_mng_no", length = 32)
    protected String bukenMngNo;
    @Column(name = "keiyaku_start_date")
    protected Date keiyakuStartDate;
    @Column(name = "keiyaku_end_date")
    protected Date keiyakuEndDate;
    @Column(name = "update_fee")
    protected float updateFee;
    @Column(name = "update_tesu_fee")
    protected float updateTesuFee;
    @Column(name = "terminate_notice", length = 255)
    protected String terminateNotice;
    @Column(name = "kojin_hojin_flg")
    protected Integer kojinHojinFlg;
    @Column(name = "hosho_cop_mng_no", length = 32)
    protected String hoshoCopMngNo;
    @Column(name = "hoken_plan_code", length = 32)
    protected String hokenPlanCode;
    @Column(name = "hoshosha_mng_no", length = 32)
    protected String hoshoshaMngNo;
    @Column(name = "furikomi_jiki", length = 20)
    protected String furikomiJiki;
    @Column(name = "furikomi_date")
    protected Date furikomiDate;
    @Column(name = "hoken_update_flg")
    protected Integer hokenUpdateFlg;
    @Column(name = "chukai_cop_mng_no", length = 32)
    protected String chukaiCopMngNo;
    @Column(name = "kazaihoken_mng_no", length = 32)
    protected String kazaihokenMngNo;
    @Column(name = "kasai_plan_code", length = 32)
    protected String kasaiPlanCode;
    @Column(name = "gas_cop", length = 60)
    protected String gasCop;
    @Column(name = "denki_cop", length = 60)
    protected String denkiCop;
    @Column(name = "suido_cop", length = 60)
    protected String suidoCop;
    @Column(name = "shokaisha_mng_no", length = 32)
    protected String shokaishaMngNo;
    @Column(name = "koushin_kaisu")
    protected Integer koushinKaisu;
    @Column(name = "resident1", length = 60)
    protected String resident1;
    @Column(name = "resident2", length = 60)
    protected String resident2;
    @Column(name = "resident3", length = 60)
    protected String resident3;
    @Column(name = "resident4", length = 60)
    protected String resident4;
    @Column(name = "resident5", length = 60)
    protected String resident5;
    @Column(name = "resident6", length = 60)
    protected String resident6;
    @Column(name = "resident7", length = 60)
    protected String resident7;
    @Column(name = "resident8", length = 60)
    protected String resident8;
    @Column(name = "resident9", length = 60)
    protected String resident9;
    @Column(name = "resident10", length = 60)
    protected String resident10;
    @Column(name = "tantosha_code", length = 32)
    protected String tantoshaCode;
    @Column(name = "rent_fee")
    protected float rentFee;
    @Column(name = "reikin")
    protected float reikin;
    @Column(name = "shikikin")
    protected float shikikin;
    @Column(name = "koukoku_fee")
    protected float koukokuFee;
    @Column(name = "chukai_fee")
    protected float chukaiFee;
    @Column(name = "keiyaku_fee")
    protected float keiyakuFee;
    @Column(name = "kagi_change_fee")
    protected float kagiChangeFee;
    @Column(name = "house_cleaning_fee")
    protected float houseCleaningFee;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP",updatable = false)
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "del_flg", columnDefinition = "integer default 0")
    protected Integer delFlg;
}
