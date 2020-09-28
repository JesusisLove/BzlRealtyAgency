package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BzlIkoukininfoPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：CT_KEIYAKU_022 【意向金情報】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "bzl_ikoukininfo")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = BzlIkoukininfoPK.class)
public class BzlIkoukininfo {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "ikoukin_mng_no", length = 32, nullable = false)
    protected String ikoukinMngNo;
    @Column(name = "kingaku")
    protected float kingaku;
    @Column(name = "pay_type")
    protected Integer payType;
    @Column(name = "refund_zumi_flg")
    protected Integer refundZumiFlg;
    @Column(name = "currency_type")
    protected Integer currencyType;
    @Column(name = "gyomu_tantosha", length = 60)
    protected String gyomuTantosha;
    @Column(name = "buken_mng_no", length = 32)
    protected String bukenMngNo;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "tantosha_code", length = 32)
    protected String tantoshaCode;
    @Column(name = "del_flg", columnDefinition = "integer default 0")
    protected Integer delFlg;
}

