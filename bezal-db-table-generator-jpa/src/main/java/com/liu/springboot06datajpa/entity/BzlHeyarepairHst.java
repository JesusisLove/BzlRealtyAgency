package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BzlHeyarepairhstPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：CT_KEIYAKU_004 【修繕履歴】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "bzl_heyarepairhst")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = BzlHeyarepairhstPK.class)
public class BzlHeyarepairHst {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "repair_mng_no", length = 32, nullable = false)
    protected String repairMngNo;
    @Column(name = "buken_mng_no", length = 32)
    protected String bukenMngNo;
    @Column(name = "repair_date_start")
    protected Date repairDateStart;
    @Column(name = "repair_date_end")
    protected Date repairDateEnd;
    @Column(name = "repair_memo", length = 255)
    protected String repairMemo;
    @Column(name = "repaired_fee")
    protected float repairedFee;
    @Column(name = "genjyou_return_mng_no", length = 32)
    protected String genjyouReturnMngNo;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "tantosha_code", length = 32)
    protected String tantoshaCode;
    @Column(name = "del_flg", columnDefinition = "integer default 0")
    protected Integer delFlg;
}

