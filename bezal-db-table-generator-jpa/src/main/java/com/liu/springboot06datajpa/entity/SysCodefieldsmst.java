package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.SysCodefieldsmstPK;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/* 機能番号：SYS_CODE_002 【コード一覧項目】テーブルを生成する */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
// _テーブル名称はあってるかどうかを確認注意
@Table(name = "sys_codefieldsmst")
// _PKのクラス名称はあってるかどうかを確認注意
@IdClass(value = SysCodefieldsmstPK.class)
public class SysCodefieldsmst {
    @Id
    @Column(name = "sys_id", length = 6, nullable = false)
    protected String sysId;
    @Id
    @Column(name = "table_field_no", length = 32, nullable = false)
    protected String tableFieldNo;
    @Column(name = "table_mng_no", length = 32)
    protected String tableMngNo;
    @Column(name = "table_field_name", length = 32)
    protected String tableFieldName;
    @Column(name = "time_stamp_new", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampNew;
    @Column(name = "time_stamp_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp timeStampUpdate;
    @Column(name = "del_flg", columnDefinition = "integer default 0")
    protected Integer delFlg;
}