package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BzlBankkouzamstPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：CT_KEIYAKU_007 【口座管理】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "bzl_bankkouzamst")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = BzlBankkouzamstPK.class)
public class BzlBankkouzamst {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "bank_account_mng_no", length = 32, nullable = false)
    protected String bankAccountMngNo;
    @Column(name = "bank_name", length = 60)
    protected String bankName;
    @Column(name = "branch_no", length = 12)
    protected String branchNo;
    @Column(name = "branch_name", length = 60)
    protected String branchName;
    @Column(name = "yokin_type")
    protected Integer yokinType;
    @Column(name = "bank_account_no", length = 32)
    protected String bankAccountNo;
    @Column(name = "bank_account_own_name", length = 60)
    protected String bankAccountOwnName;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "tantosha_code", length = 32)
    protected String tantoshaCode;
    @Column(name = "del_flg", columnDefinition = "integer default 0")
    protected Integer delFlg;
}

