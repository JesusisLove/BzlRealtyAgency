package com.liu.springboot04web.bean;

import java.util.Date;

public class CtKeiyaku021Bean implements BzlFudousanBean {
    protected String sysId;
    protected String emrgcyCntctMngNo;
    protected String fullname;
    protected String fullnameKana;
    protected String gender;
    protected Date birthDay;
    protected String postCode;
    protected String loaction1;
    protected String loaction2;
    protected String apartName;
    protected String apartCode;
    protected String copName;
    protected String telNumber;
    protected String email;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected String tantoshaCode;
    protected Integer delFlg;
    public CtKeiyaku021Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getEmrgcyCntctMngNo() {
        return emrgcyCntctMngNo;
    }

    public void setEmrgcyCntctMngNo(String emrgcyCntctMngNo) {
        this.emrgcyCntctMngNo = emrgcyCntctMngNo;
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

    public String getCopName() {
        return copName;
    }

    public void setCopName(String copName) {
        this.copName = copName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "CtKeiyaku021Bean{" +
                "sysId='" + sysId + '\'' +
                ", emrgcyCntctMngNo='" + emrgcyCntctMngNo + '\'' +
                ", fullname='" + fullname + '\'' +
                ", fullnameKana='" + fullnameKana + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay=" + birthDay +
                ", postCode='" + postCode + '\'' +
                ", loaction1='" + loaction1 + '\'' +
                ", loaction2='" + loaction2 + '\'' +
                ", apartName='" + apartName + '\'' +
                ", apartCode='" + apartCode + '\'' +
                ", copName='" + copName + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", email='" + email + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}

