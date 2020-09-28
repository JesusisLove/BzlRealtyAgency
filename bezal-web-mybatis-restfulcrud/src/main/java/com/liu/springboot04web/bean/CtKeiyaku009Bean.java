package com.liu.springboot04web.bean;

import java.util.Date;

public class CtKeiyaku009Bean implements BzlFudousanBean {
    protected String sysId;
    protected String hojinMngNo;
    protected String kaisyaName;
    protected String postCode;
    protected String loaction1;
    protected String loaction2;
    protected String apartName;
    protected String apartCode;
    protected String houjinDaihyousya;
    protected String tantosha;
    protected String tantoshaTel;
    protected String bankAccountMngNo;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected String tantoshaCode;
    protected Integer delFlg;
    public CtKeiyaku009Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getHojinMngNo() {
        return hojinMngNo;
    }

    public void setHojinMngNo(String hojinMngNo) {
        this.hojinMngNo = hojinMngNo;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getLoaction1() {
        return loaction1;
    }

    public void setLoaction1(String loaction1) {
        this.loaction1 = loaction1;
    }

    public String getLoaction2() {
        return loaction2;
    }

    public void setLoaction2(String loaction2) {
        this.loaction2 = loaction2;
    }

    public String getApartName() {
        return apartName;
    }

    public void setApartName(String apartName) {
        this.apartName = apartName;
    }

    public String getApartCode() {
        return apartCode;
    }

    public void setApartCode(String apartCode) {
        this.apartCode = apartCode;
    }

    public String getTantosha() {
        return tantosha;
    }

    public void setTantosha(String tantosha) {
        this.tantosha = tantosha;
    }

    public String getTantoshaTel() {
        return tantoshaTel;
    }

    public void setTantoshaTel(String tantoshaTel) {
        this.tantoshaTel = tantoshaTel;
    }

    public String getBankAccountMngNo() {
        return bankAccountMngNo;
    }

    public void setBankAccountMngNo(String bankAccountMngNo) {
        this.bankAccountMngNo = bankAccountMngNo;
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

    public String getKaisyaName() {
        return kaisyaName;
    }

    public void setKaisyaName(String kaisyaName) {
        this.kaisyaName = kaisyaName;
    }

    public String getHoujinDaihyousya() {
        return houjinDaihyousya;
    }

    public void setHoujinDaihyousya(String houjinDaihyousya) {
        this.houjinDaihyousya = houjinDaihyousya;
    }

    @Override
    public String toString() {
        return "CtKeiyaku009Bean{" +
                "sysId='" + sysId + '\'' +
                ", hojinMngNo='" + hojinMngNo + '\'' +
                ", kaisyaName='" + kaisyaName + '\'' +
                ", postCode='" + postCode + '\'' +
                ", loaction1='" + loaction1 + '\'' +
                ", loaction2='" + loaction2 + '\'' +
                ", apartName='" + apartName + '\'' +
                ", apartCode='" + apartCode + '\'' +
                ", houjinDaihyousya='" + houjinDaihyousya + '\'' +
                ", tantosha='" + tantosha + '\'' +
                ", tantoshaTel='" + tantoshaTel + '\'' +
                ", bankAccountMngNo='" + bankAccountMngNo + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}

