package com.liu.springboot04web.bean;

import java.util.Date;

public class SysCode002Bean implements BzlFudousanBean {
    protected String sysId;
    protected String tableFieldNo;
    protected String tableMngNo;
    private String tableName;
    protected String tableFieldName;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected Integer delFlg;

    public SysCode002Bean() {
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setTableMngNo(String tableMngNo) {
        this.tableMngNo = tableMngNo;
    }

    public String getTableFieldName() {
        return tableFieldName;
    }

    public void setTableFieldName(String tableFieldName) {
        this.tableFieldName = tableFieldName;
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
        return "SysCode002Bean{" +
                "sysId='" + sysId + '\'' +
                ", tableFieldNo='" + tableFieldNo + '\'' +
                ", tableMngNo='" + tableMngNo + '\'' +
                ", tableName='" + tableName + '\'' +
                ", tableFieldName='" + tableFieldName + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", delFlg=" + delFlg +
                '}';
    }
}

