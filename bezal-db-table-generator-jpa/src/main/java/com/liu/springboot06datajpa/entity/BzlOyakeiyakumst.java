package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BzlOyakeiyakumstPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：CT_KEIYAKU_011 【大家さん契約】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "bzl_oyakeiyakumst")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = BzlOyakeiyakumstPK.class)
public class BzlOyakeiyakumst {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "own_keiyaku_mng_no", length = 32, nullable = false)
    protected String ownKeiyakuMngNo;
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
    @Column(name = "kojin_hojin_flg")
    protected Integer kojinHojinFlg;
    @Column(name = "furikomi_jiki", length = 20)
    protected String furikomiJiki;
    @Column(name = "furikomi_date")
    protected Date furikomiDate;
    @Column(name = "chukai_fee")
    protected float chukaiFee;
    @Column(name = "keiyaku_update_fee_target", length = 255)
    protected String keiyakuUpdateFeeTarget;
    @Column(name = "tantosha_code", length = 32)
    protected String tantoshaCode;
    @Column(name = "kanri_itaku_fee")
    protected float kanriItakuFee;
    @Column(name = "gyomu_itaku_fee")
    protected float gyomuItakuFee;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "del_flg", columnDefinition = "integer default 0")
    protected Integer delFlg;
}

