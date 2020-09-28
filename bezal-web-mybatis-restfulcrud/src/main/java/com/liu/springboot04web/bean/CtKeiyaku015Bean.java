package com.liu.springboot04web.bean;

import java.util.Date;

public class CtKeiyaku015Bean implements BzlFudousanBean {
    protected String sysId;
    protected String kasaiPlanCode;
    protected String kazaihokenMngNo;
    protected String planName;
    protected float planPrice;
    protected float kaizaiHokenFee;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected String tantoshaCode;
    protected Integer delFlg;
    public CtKeiyaku015Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getKasaiPlanCode() {
        return kasaiPlanCode;
    }

    public void setKasaiPlanCode(String kasaiPlanCode) {
        this.kasaiPlanCode = kasaiPlanCode;
    }

    public String getKazaihokenMngNo() {
        return kazaihokenMngNo;
    }

    public void setKazaihokenMngNo(String kazaihokenMngNo) {
        this.kazaihokenMngNo = kazaihokenMngNo;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public float getPlanPrice() {
        return planPrice;
    }

    public void setPlanPrice(float planPrice) {
        this.planPrice = planPrice;
    }

    public float getKaizaiHokenFee() {
        return kaizaiHokenFee;
    }

    public void setKaizaiHokenFee(float kaizaiHokenFee) {
        this.kaizaiHokenFee = kaizaiHokenFee;
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
        return "CtKeiyaku015Bean{" +
                "sysId='" + sysId + '\'' +
                ", kasaiPlanCode='" + kasaiPlanCode + '\'' +
                ", kazaihokenMngNo='" + kazaihokenMngNo + '\'' +
                ", planName='" + planName + '\'' +
                ", planPrice=" + planPrice +
                ", kaizaiHokenFee=" + kaizaiHokenFee +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}

