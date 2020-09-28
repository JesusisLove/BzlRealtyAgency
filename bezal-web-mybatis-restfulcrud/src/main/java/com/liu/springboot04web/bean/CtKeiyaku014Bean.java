package com.liu.springboot04web.bean;

import java.util.Date;

public class CtKeiyaku014Bean implements BzlFudousanBean {
    protected String sysId;
    protected String kazaihokenMngNo;
    protected String kazaiHokenNo;
    protected float kazaiHokenPeriod;
    protected String postCode;
    protected String loaction1;
    protected String loaction2;
    protected String apartName;
    protected String apartCode;
    protected String gyomuTantosha;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected String tantoshaCode;
    protected Integer delFlg;
    public CtKeiyaku014Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getKazaihokenMngNo() {
        return kazaihokenMngNo;
    }

    public void setKazaihokenMngNo(String kazaihokenMngNo) {
        this.kazaihokenMngNo = kazaihokenMngNo;
    }

    public String getKazaiHokenNo() {
        return kazaiHokenNo;
    }

    public void setKazaiHokenNo(String kazaiHokenNo) {
        this.kazaiHokenNo = kazaiHokenNo;
    }

    public float getKazaiHokenPeriod() {
        return kazaiHokenPeriod;
    }

    public void setKazaiHokenPeriod(float kazaiHokenPeriod) {
        this.kazaiHokenPeriod = kazaiHokenPeriod;
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

    public String getGyomuTantosha() {
        return gyomuTantosha;
    }

    public void setGyomuTantosha(String gyomuTantosha) {
        this.gyomuTantosha = gyomuTantosha;
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
        return "CtKeiyaku014Bean{" +
                "sysId='" + sysId + '\'' +
                ", kazaihokenMngNo='" + kazaihokenMngNo + '\'' +
                ", kazaiHokenNo='" + kazaiHokenNo + '\'' +
                ", kazaiHokenPeriod=" + kazaiHokenPeriod +
                ", postCode='" + postCode + '\'' +
                ", loaction1='" + loaction1 + '\'' +
                ", loaction2='" + loaction2 + '\'' +
                ", apartName='" + apartName + '\'' +
                ", apartCode='" + apartCode + '\'' +
                ", gyomuTantosha='" + gyomuTantosha + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}

