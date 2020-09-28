package com.liu.springboot04web.bean;

import java.util.Date;

public class CtKeiyaku006Bean implements BzlFudousanBean {
    protected String sysId;
    protected String bukenMngCopNo;
    protected String kaisyaName;
    protected String postCode;
    protected String loaction1;
    protected String loaction2;
    protected String apartName;
    protected String apartCode;
    protected String kaisyaTel;
    protected String houjinDaihyousya;
    protected String bankAccountMngNo;
    protected String gyomuTantosha;
    protected Integer companyFlg;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected String tantoshaCode;
    protected Integer delFlg;
    public CtKeiyaku006Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getBukenMngCopNo() {
        return bukenMngCopNo;
    }

    public void setBukenMngCopNo(String bukenMngCopNo) {
        this.bukenMngCopNo = bukenMngCopNo;
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

    public String getKaisyaTel() {
        return kaisyaTel;
    }

    public void setKaisyaTel(String kaisyaTel) {
        this.kaisyaTel = kaisyaTel;
    }

    public String getHoujinDaihyousya() {
        return houjinDaihyousya;
    }

    public void setHoujinDaihyousya(String houjinDaihyousya) {
        this.houjinDaihyousya = houjinDaihyousya;
    }

    public String getBankAccountMngNo() {
        return bankAccountMngNo;
    }

    public void setBankAccountMngNo(String bankAccountMngNo) {
        this.bankAccountMngNo = bankAccountMngNo;
    }

    public String getGyomuTantosha() {
        return gyomuTantosha;
    }

    public void setGyomuTantosha(String gyomuTantosha) {
        this.gyomuTantosha = gyomuTantosha;
    }

    public Integer getCompanyFlg() {
        return companyFlg;
    }

    public void setCompanyFlg(Integer companyFlg) {
        this.companyFlg = companyFlg;
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
        return "CtKeiyaku006Bean{" +
                "sysId='" + sysId + '\'' +
                ", bukenMngCopNo='" + bukenMngCopNo + '\'' +
                ", kaisyaName='" + kaisyaName + '\'' +
                ", postCode='" + postCode + '\'' +
                ", loaction1='" + loaction1 + '\'' +
                ", loaction2='" + loaction2 + '\'' +
                ", apartName='" + apartName + '\'' +
                ", apartCode='" + apartCode + '\'' +
                ", kaisyaTel='" + kaisyaTel + '\'' +
                ", houjinDaihyousya='" + houjinDaihyousya + '\'' +
                ", bankAccountMngNo='" + bankAccountMngNo + '\'' +
                ", gyomuTantosha='" + gyomuTantosha + '\'' +
                ", companyFlg=" + companyFlg +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}
