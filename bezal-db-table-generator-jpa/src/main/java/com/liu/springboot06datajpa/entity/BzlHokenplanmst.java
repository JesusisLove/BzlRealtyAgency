package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BzlHokenplanmstPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：CT_KEIYAKU_013 【保証会社プラン情報】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "bzl_hokenplanmst")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = BzlHokenplanmstPK.class)
public class BzlHokenplanmst {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "hoken_plan_code", length = 32, nullable = false)
    protected String hokenPlanCode;
    @Column(name = "hosho_cop_mng_no", length = 32)
    protected String hoshoCopMngNo;
    @Column(name = "plan_name", length = 60)
    protected String planName;
    @Column(name = "plan_price")
    protected float planPrice;
    @Column(name = "first_hosho_fee")
    protected float firstHoshoFee;
    @Column(name = "year_hosho_fee")
    protected float yearHoshoFee;
    @Column(name = "month_hosho_fee")
    protected float monthHoshoFee;
    @Column(name = "hoshou_hoken_fee")
    protected float hoshouHokenFee;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "tantosha_code", length = 32)
    protected String tantoshaCode;
    @Column(name = "del_flg", columnDefinition = "integer default 0")
    protected Integer delFlg;
}
