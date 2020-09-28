package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BzlKazaihokenplanmstPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：CT_KEIYAKU_015 【家財保険プラン情報】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "bzl_kazaihokenplanmst")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = BzlKazaihokenplanmstPK.class)
public class BzlKazaihokenplanmst {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "kasai_plan_code", length = 32, nullable = false)
    protected String kasaiPlanCode;
    @Column(name = "kazaihoken_mng_no", length = 32)
    protected String kazaihokenMngNo;
    @Column(name = "plan_name", length = 60)
    protected String planName;
    @Column(name = "plan_price")
    protected float planPrice;
    @Column(name = "kaizai_hoken_fee")
    protected float kaizaiHokenFee;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "tantosha_code", length = 32)
    protected String tantoshaCode;
    @Column(name = "del_flg", columnDefinition = "integer default 0")
    protected Integer delFlg;
}

