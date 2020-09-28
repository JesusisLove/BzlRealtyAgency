package com.liu.springboot04web.bean;

import java.security.Timestamp;
import java.util.Date;

public class CtKeiyaku005Bean implements BzlFudousanBean {
    protected String sysId;
    protected String bukenOwnNo;
    protected String fullname;
    protected String fullnameKana;
    protected String gender;
    protected Date birthDay;
    protected String kaisyaTel;
    protected String email;
    protected String fax;
    protected String postCode;
    protected String loaction1;
    protected String loaction2;
    protected String apartName;
    protected String apartCode;
    protected String bankAccountMngNo;
    protected Integer kojinHojinFlg;
    protected String kaisyaName;
    protected String copDaihyosha;
    protected String copTantosha;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected String tantoshaCode;
    protected Integer delFlg;
    public CtKeiyaku005Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getBukenOwnNo() {
        return bukenOwnNo;
    }

    public void setBukenOwnNo(String bukenOwnNo) {
        this.bukenOwnNo = bukenOwnNo;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullnameKana() {
        return fullnameKana;
    }

    public void setFullnameKana(String fullnameKana) {
        this.fullnameKana = fullnameKana;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getKaisyaTel() {
        return kaisyaTel;
    }

    public void setKaisyaTel(String kaisyaTel) {
        this.kaisyaTel = kaisyaTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public String getBankAccountMngNo() {
        return bankAccountMngNo;
    }

    public void setBankAccountMngNo(String bankAccountMngNo) {
        this.bankAccountMngNo = bankAccountMngNo;
    }

    public Integer getKojinHojinFlg() {
        return kojinHojinFlg;
    }

    public void setKojinHojinFlg(Integer kojinHojinFlg) {
        this.kojinHojinFlg = kojinHojinFlg;
    }

    public String getKaisyaName() {
        return kaisyaName;
    }

    public void setKaisyaName(String kaisyaName) {
        this.kaisyaName = kaisyaName;
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
        return "CtKeiyaku005Bean{" +
                "sysId='" + sysId + '\'' +
                ", bukenOwnNo='" + bukenOwnNo + '\'' +
                ", fullname='" + fullname + '\'' +
                ", fullnameKana='" + fullnameKana + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay=" + birthDay +
                ", kaisyaTel='" + kaisyaTel + '\'' +
                ", email='" + email + '\'' +
                ", fax='" + fax + '\'' +
                ", postCode='" + postCode + '\'' +
                ", loaction1='" + loaction1 + '\'' +
                ", loaction2='" + loaction2 + '\'' +
                ", apartName='" + apartName + '\'' +
                ", apartCode='" + apartCode + '\'' +
                ", bankAccountMngNo='" + bankAccountMngNo + '\'' +
                ", kojinHojinFlg=" + kojinHojinFlg +
                ", kaisyaName='" + kaisyaName + '\'' +
                ", copDaihyosha='" + copDaihyosha + '\'' +
                ", copTantosha='" + copTantosha + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}