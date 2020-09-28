package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BzlBukenmngcopmstPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：CT_KEIYAKU_006 【物件管理会社】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "bzl_bukenmngcopmst")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = BzlBukenmngcopmstPK.class)
public class BzlBukenmngcopmst {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "buken_mng_cop_no", length = 32, nullable = false)
    protected String bukenMngCopNo;
    @Column(name = "kaisya_name", length = 60)
    protected String kaisyaName;
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
    @Column(name = "kaisya_tel", length = 20)
    protected String kaisyaTel;
    @Column(name = "houjin_daihyousya", length = 32)
    protected String houjinDaihyousya;
    @Column(name = "bank_account_mng_no", length = 32)
    protected String bankAccountMngNo;
    @Column(name = "gyomu_tantosha", length = 60)
    protected String gyomuTantosha;
    @Column(name = "company_flg")
    protected Integer companyFlg;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "tantosha_code", length = 32)
    protected String tantoshaCode;
    @Column(name = "del_flg", columnDefinition = "integer default 0")
    protected Integer delFlg;
}
