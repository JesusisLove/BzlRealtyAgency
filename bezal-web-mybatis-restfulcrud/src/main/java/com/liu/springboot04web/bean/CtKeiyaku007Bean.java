package com.liu.springboot04web.bean;

import java.util.Date;

public class CtKeiyaku007Bean implements BzlFudousanBean {
    protected String sysId;
    protected String bankAccountMngNo;
    protected String bankName;
    protected String branchNo;
    protected String branchName;
    protected Integer yokinType;
    protected String bankAccountNo;
    protected String bankAccountOwnName;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected String tantoshaCode;
    protected Integer delFlg;
    public CtKeiyaku007Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getBankAccountMngNo() {
        return bankAccountMngNo;
    }

    public void setBankAccountMngNo(String bankAccountMngNo) {
        this.bankAccountMngNo = bankAccountMngNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Integer getYokinType() {
        return yokinType;
    }

    public void setYokinType(Integer yokinType) {
        this.yokinType = yokinType;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankAccountOwnName() {
        return bankAccountOwnName;
    }

    public void setBankAccountOwnName(String bankAccountOwnName) {
        this.bankAccountOwnName = bankAccountOwnName;
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

    public String getTantoshaCode() {
        return tantoshaCode;
    }

    public void setTantoshaCode(String tantoshaCode) {
        this.tantoshaCode = tantoshaCode;
    }

    public Integer getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
    }

    @Override
    public String toString() {
        return "CtKeiyaku007Bean{" +
                "sysId='" + sysId + '\'' +
                ", bankAccountMngNo='" + bankAccountMngNo + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branchNo='" + branchNo + '\'' +
                ", branchName='" + branchName + '\'' +
                ", yokinType=" + yokinType +
                ", bankAccountNo='" + bankAccountNo + '\'' +
                ", bankAccountOwnName='" + bankAccountOwnName + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}
