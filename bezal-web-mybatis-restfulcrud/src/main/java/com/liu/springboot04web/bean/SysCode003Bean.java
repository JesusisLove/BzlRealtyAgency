package com.liu.springboot04web.bean;

import java.util.Date;

public class SysCode003Bean implements BzlFudousanBean {
    protected String sysId;
    protected String tableCodeId;
    protected String tableMngNo;
    protected String tableFieldNo;
    protected String tableName;
    protected String tableFieldName;
    protected String codeValue;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected Integer delFlg;

    public SysCode003Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getTableCodeId() {
        return tableCodeId;
    }

    public void setTableCodeId(String tableCodeId) {
        this.tableCodeId = tableCodeId;
    }

    public String getTableFieldNo() {
        return tableFieldNo;
    }

    public void setTableFieldNo(String tableFieldNo) {
        this.tableFieldNo = tableFieldNo;
    }

    public String getTableMngNo() {
        return tableMngNo;
    }

    public void setTableMngNo(String tableMngNo) {
        this.tableMngNo = tableMngNo;
    }
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableFieldName() {
        return tableFieldName;
    }

    public void setTableFieldName(String tableFieldName) {
        this.tableFieldName = tableFieldName;
    }
    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public Date getTimeStampNew() {
        return timeStampNew;
    }

    public void setTimeStampNew(Date timeStampNew) {
        this.timeStampNew = timeStampNew;
    }

    public Date getTimeStampUpdate() {
        return timeStampUpdate;
    }

    public void setTimeStampUpdate(Date timeStampUpdate) {
        this.timeStampUpdate = timeStampUpdate;
    }

    public Integer getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
    }

    @Override
    public String toString() {
        return "SysCode003Bean{" +
                "sysId='" + sysId + '\'' +
                ", tableCodeId='" + tableCodeId + '\'' +
                ", tableMngNo='" + tableMngNo + '\'' +
                ", tableFieldNo='" + tableFieldNo + '\'' +
                ", codeValue='" + codeValue + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", delFlg=" + delFlg +
                '}';
    }
}

