package com.liu.springboot04web.bean;

import java.util.Date;

public class CtKeiyaku013Bean implements BzlFudousanBean {
    protected String sysId;
    protected String hokenPlanCode;
    protected String hoshoCopMngNo;
    protected String planName;
    protected float planPrice;
    protected float firstHoshoFee;
    protected float yearHoshoFee;
    protected float monthHoshoFee;
    protected float hoshouHokenFee;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected String tantoshaCode;
    protected Integer delFlg;
    public CtKeiyaku013Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getHokenPlanCode() {
        return hokenPlanCode;
    }

    public void setHokenPlanCode(String hokenPlanCode) {
        this.hokenPlanCode = hokenPlanCode;
    }

    public String getHoshoCopMngNo() {
        return hoshoCopMngNo;
    }

    public void setHoshoCopMngNo(String hoshoCopMngNo) {
        this.hoshoCopMngNo = hoshoCopMngNo;
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

    public float getFirstHoshoFee() {
        return firstHoshoFee;
    }

    public void setFirstHoshoFee(float firstHoshoFee) {
        this.firstHoshoFee = firstHoshoFee;
    }

    public float getYearHoshoFee() {
        return yearHoshoFee;
    }

    public void setYearHoshoFee(float yearHoshoFee) {
        this.yearHoshoFee = yearHoshoFee;
    }

    public float getMonthHoshoFee() {
        return monthHoshoFee;
    }

    public void setMonthHoshoFee(float monthHoshoFee) {
        this.monthHoshoFee = monthHoshoFee;
    }

    public float getHoshouHokenFee() {
        return hoshouHokenFee;
    }

    public void setHoshouHokenFee(float hoshouHokenFee) {
        this.hoshouHokenFee = hoshouHokenFee;
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
        return "CtKeiyaku013Bean{" +
                "sysId='" + sysId + '\'' +
                ", hokenPlanCode='" + hokenPlanCode + '\'' +
                ", hoshoCopMngNo='" + hoshoCopMngNo + '\'' +
                ", planName='" + planName + '\'' +
                ", planPrice=" + planPrice +
                ", firstHoshoFee=" + firstHoshoFee +
                ", yearHoshoFee=" + yearHoshoFee +
                ", monthHoshoFee=" + monthHoshoFee +
                ", hoshouHokenFee=" + hoshouHokenFee +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}
