package com.liu.springboot04web.bean;

import java.util.Date;

public class CtKeiyaku002Bean implements BzlFudousanBean {

    protected String sysId;
    protected String jisyaKeyNo;
    protected String oyaKeyNo;
    protected String bukenMngNo;
    protected Integer masterKeyFlg;
    protected String keyStorageNearApart;
    protected String keyPassword;
    protected String keyStorageInCop;
    protected String keyMaker;
    protected String keyMakerCode;
    protected Integer keyUseFlg;
    protected Integer keyStatus;
    protected String keyOwner;
    protected String keyType;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected String tantoshaCode;
    protected Integer delFlg;

    public CtKeiyaku002Bean() {
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getJisyaKeyNo() {
        return jisyaKeyNo;
    }

    public void setJisyaKeyNo(String jisyaKeyNo) {
        this.jisyaKeyNo = jisyaKeyNo;
    }

    public String getOyaKeyNo() {
        return oyaKeyNo;
    }

    public void setOyaKeyNo(String oyaKeyNo) {
        this.oyaKeyNo = oyaKeyNo;
    }

    public String getBukenMngNo() {
        return bukenMngNo;
    }

    public void setBukenMngNo(String bukenMngNo) {
        this.bukenMngNo = bukenMngNo;
    }

    public Integer getMasterKeyFlg() {
        return masterKeyFlg;
    }

    public void setMasterKeyFlg(Integer masterKeyFlg) {
        this.masterKeyFlg = masterKeyFlg;
    }

    public String getKeyStorageNearApart() {
        return keyStorageNearApart;
    }

    public void setKeyStorageNearApart(String keyStorageNearApart) {
        this.keyStorageNearApart = keyStorageNearApart;
    }

    public String getKeyPassword() {
        return keyPassword;
    }

    public void setKeyPassword(String keyPassword) {
        this.keyPassword = keyPassword;
    }

    public String getKeyStorageInCop() {
        return keyStorageInCop;
    }

    public void setKeyStorageInCop(String keyStorageInCop) {
        this.keyStorageInCop = keyStorageInCop;
    }

    public String getKeyMaker() {
        return keyMaker;
    }

    public void setKeyMaker(String keyMaker) {
        this.keyMaker = keyMaker;
    }

    public String getKeyMakerCode() {
        return keyMakerCode;
    }

    public void setKeyMakerCode(String keyMakerCode) {
        this.keyMakerCode = keyMakerCode;
    }

    public Integer getKeyUseFlg() {
        return keyUseFlg;
    }

    public void setKeyUseFlg(Integer keyUseFlg) {
        this.keyUseFlg = keyUseFlg;
    }

    public Integer getKeyStatus() {
        return keyStatus;
    }

    public void setKeyStatus(Integer keyStatus) {
        this.keyStatus = keyStatus;
    }

    public String getKeyOwner() {
        return keyOwner;
    }

    public void setKeyOwner(String keyOwner) {
        this.keyOwner = keyOwner;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
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
        return "CtKeiyaku002Bean{" +
                "sysId='" + sysId + '\'' +
                ", jisyaKeyNo='" + jisyaKeyNo + '\'' +
                ", oyaKeyNo='" + oyaKeyNo + '\'' +
                ", bukenMngNo='" + bukenMngNo + '\'' +
                ", masterKeyFlg=" + masterKeyFlg +
                ", keyStorageNearApart='" + keyStorageNearApart + '\'' +
                ", keyPassword='" + keyPassword + '\'' +
                ", keyStorageInCop='" + keyStorageInCop + '\'' +
                ", keyMaker='" + keyMaker + '\'' +
                ", keyMakerCode='" + keyMakerCode + '\'' +
                ", keyUseFlg=" + keyUseFlg +
                ", keyStatus=" + keyStatus +
                ", keyOwner='" + keyOwner + '\'' +
                ", keyType='" + keyType + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}

