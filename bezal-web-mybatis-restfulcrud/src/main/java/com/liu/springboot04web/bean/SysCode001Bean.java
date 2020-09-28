package com.liu.springboot04web.bean;

import java.util.Date;

public class SysCode001Bean implements BzlFudousanBean {
    protected String sysId;
    protected String tableMngNo;
    protected String tableName;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected Integer delFlg;
    public SysCode001Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
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
        return "SysCode001Bean{" +
                "sysId='" + sysId + '\'' +
                ", tableMngNo='" + tableMngNo + '\'' +
                ", tableName='" + tableName + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", delFlg=" + delFlg +
                '}';
    }
}
