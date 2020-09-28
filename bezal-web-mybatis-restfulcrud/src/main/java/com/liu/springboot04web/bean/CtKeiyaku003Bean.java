package com.liu.springboot04web.bean;

import java.util.Date;

public class CtKeiyaku003Bean implements BzlFudousanBean {

    protected String sysId;
    protected String daytimeMngCopMngNo;
    protected String kaisyaName;
    protected String postCode;
    protected String loaction1;
    protected String loaction2;
    protected String apartName;
    protected String apartCode;
    protected String copDaihyosha;
    protected String copTantosha;
    protected String kaisyaTel;
    protected String fax;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected String tantoshaCode;
    protected Integer delFlg;
    public CtKeiyaku003Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getDaytimeMngCopMngNo() {
        return daytimeMngCopMngNo;
    }

    public void setDaytimeMngCopMngNo(String daytimeMngCopMngNo) {
        this.daytimeMngCopMngNo = daytimeMngCopMngNo;
    }

    public String getKaisyaName() {
        return kaisyaName;
    }

    public void setKaisyaName(String kaisyaName) {
        this.kaisyaName = kaisyaName;
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

    public String getCopDaihyosha() {
        return copDaihyosha;
    }

    public void setCopDaihyosha(String copDaihyosha) {
        this.copDaihyosha = copDaihyosha;
    }

    public String getCopTantosha() {
        return copTantosha;
    }

    public void setCopTantosha(String copTantosha) {
        this.copTantosha = copTantosha;
    }

    public String getKaisyaTel() {
        return kaisyaTel;
    }

    public void setKaisyaTel(String kaisyaTel) {
        this.kaisyaTel = kaisyaTel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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
        return "CtKeiyaku003Bean{" +
                "sysId='" + sysId + '\'' +
                ", daytimeMngCopMngNo='" + daytimeMngCopMngNo + '\'' +
                ", kaisyaName='" + kaisyaName + '\'' +
                ", postCode='" + postCode + '\'' +
                ", loaction1='" + loaction1 + '\'' +
                ", loaction2='" + loaction2 + '\'' +
                ", apartName='" + apartName + '\'' +
                ", apartCode='" + apartCode + '\'' +
                ", copDaihyosha='" + copDaihyosha + '\'' +
                ", copTantosha='" + copTantosha + '\'' +
                ", kaisyaTel='" + kaisyaTel + '\'' +
                ", fax='" + fax + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}

