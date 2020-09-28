package com.liu.springboot04web.bean;

import java.util.Date;

public class CtKeiyaku022Bean implements BzlFudousanBean {
    protected String sysId;
    protected String ikoukinMngNo;
    protected float kingaku;
    protected Integer payType;
    protected Integer refundZumiFlg;
    protected Integer currencyType;
    protected String gyomuTantosha;
    protected String bukenMngNo;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected String tantoshaCode;
    protected Integer delFlg;
    public CtKeiyaku022Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getIkoukinMngNo() {
        return ikoukinMngNo;
    }

    public void setIkoukinMngNo(String ikoukinMngNo) {
        this.ikoukinMngNo = ikoukinMngNo;
    }

    public float getKingaku() {
        return kingaku;
    }

    public void setKingaku(float kingaku) {
        this.kingaku = kingaku;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getRefundZumiFlg() {
        return refundZumiFlg;
    }

    public void setRefundZumiFlg(Integer refundZumiFlg) {
        this.refundZumiFlg = refundZumiFlg;
    }

    public Integer getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(Integer currencyType) {
        this.currencyType = currencyType;
    }

    public String getGyomuTantosha() {
        return gyomuTantosha;
    }

    public void setGyomuTantosha(String gyomuTantosha) {
        this.gyomuTantosha = gyomuTantosha;
    }

    public String getBukenMngNo() {
        return bukenMngNo;
    }

    public void setBukenMngNo(String bukenMngNo) {
        this.bukenMngNo = bukenMngNo;
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
        return "CtKeiyaku022Bean{" +
                "sysId='" + sysId + '\'' +
                ", ikoukinMngNo='" + ikoukinMngNo + '\'' +
                ", kingaku=" + kingaku +
                ", payType=" + payType +
                ", refundZumiFlg=" + refundZumiFlg +
                ", currencyType=" + currencyType +
                ", gyomuTantosha='" + gyomuTantosha + '\'' +
                ", bukenMngNo='" + bukenMngNo + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}

