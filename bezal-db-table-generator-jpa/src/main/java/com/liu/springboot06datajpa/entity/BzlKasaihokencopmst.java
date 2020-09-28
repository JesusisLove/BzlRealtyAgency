package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BzlKasaihokencopmstPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：CT_KEIYAKU_014 【家財保険会社情報】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "bzl_kazaihokencopmst")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = BzlKasaihokencopmstPK.class)
public class BzlKasaihokencopmst {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "kazaihoken_mng_no", length = 32, nullable = false)
    protected String kazaihokenMngNo;
    @Column(name = "kazai_hoken_no", length = 32)
    protected String kazaiHokenNo;
    @Column(name = "kazai_hoken_period")
    protected float kazaiHokenPeriod;
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
    @Column(name = "gyomu_tantosha", length = 60)
    protected String gyomuTantosha;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "tantosha_code", length = 32)
    protected String tantoshaCode;
    @Column(name = "del_flg", columnDefinition = "integer default 0")
    protected Integer delFlg;
}

