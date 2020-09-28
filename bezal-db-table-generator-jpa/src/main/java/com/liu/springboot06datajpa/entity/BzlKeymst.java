package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BzlKeymstPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：CT_KEIYAKU_002 【鍵情報】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "bzl_keymst")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = BzlKeymstPK.class)
public class BzlKeymst {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "jisya_key_no", length = 32, nullable = false)
    protected String jisyaKeyNo;
    @Column(name = "oya_key_no", length = 32)
    protected String oyaKeyNo;
    @Column(name = "buken_mng_no", length = 32)
    protected String bukenMngNo;
    @Column(name = "master_key_flg")
    protected Integer masterKeyFlg;
    @Column(name = "key_storage_near_apart", length = 255)
    protected String keyStorageNearApart;
    @Column(name = "key_password", length = 16)
    protected String keyPassword;
    @Column(name = "key_storage_in_cop", length = 255)
    protected String keyStorageInCop;
    @Column(name = "key_maker", length = 32)
    protected String keyMaker;
    @Column(name = "key_maker_code", length = 32)
    protected String keyMakerCode;
    @Column(name = "key_use_flg")
    protected Integer keyUseFlg;
    @Column(name = "key_status")
    protected Integer keyStatus;
    @Column(name = "key_owner", length = 50)
    protected String keyOwner;
    @Column(name = "key_type", length = 32)
    protected String keyType;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "tantosha_code", length = 32)
    protected String tantoshaCode;
    @Column(name = "del_flg")
    protected Integer delFlg;


}

