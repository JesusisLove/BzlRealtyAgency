package com.liu.springboot04web.bean;

import java.util.Date;

public class KojinKeiyakuMst {

    protected String sysId;
    protected String keiyakuMngNo;
    protected String name;
    protected String gender;
    protected Date birthDay;
    protected String kinmusakiMngNo;
    protected String telNumber;
    protected String email;
    protected String postCode;
    protected String loaction1;
    protected String loaction2;
    protected String apartName;
    protected String apartCode;
    protected String occupation;
    protected String bankAccountMngNo;
    protected String emrgcyCntctMngNo;
    protected String tantoshaCode;
    protected Integer delFlg;
    protected Date timeStampNew;
    protected Date timeStampUpdate;

    public KojinKeiyakuMst() {
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getKeiyakuMngNo() {
        return keiyakuMngNo;
    }

    public void setKeiyakuMngNo(String keiyakuMngNo) {
        this.keiyakuMngNo = keiyakuMngNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getKinmusakiMngNo() {
        return kinmusakiMngNo;
    }

    public void setKinmusakiMngNo(String kinmusakiMngNo) {
        this.kinmusakiMngNo = kinmusakiMngNo;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getBankAccountMngNo() {
        return bankAccountMngNo;
    }

    public void setBankAccountMngNo(String bankAccountMngNo) {
        this.bankAccountMngNo = bankAccountMngNo;
    }

    public String getEmrgcyCntctMngNo() {
        return emrgcyCntctMngNo;
    }

    public void setEmrgcyCntctMngNo(String emrgcyCntctMngNo) {
        this.emrgcyCntctMngNo = emrgcyCntctMngNo;
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

    @Override
    public String toString() {
        return "KojinKeiyakuMst{" +
                "sysId='" + sysId + '\'' +
                ", keiyakuMngNo='" + keiyakuMngNo + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay=" + birthDay +
                ", kinmusakiMngNo='" + kinmusakiMngNo + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", email='" + email + '\'' +
                ", postCode='" + postCode + '\'' +
                ", loaction1='" + loaction1 + '\'' +
                ", loaction2='" + loaction2 + '\'' +
                ", apartName='" + apartName + '\'' +
                ", apartCode='" + apartCode + '\'' +
                ", occupation='" + occupation + '\'' +
                ", bankAccountMngNo='" + bankAccountMngNo + '\'' +
                ", emrgcyCntctMngNo='" + emrgcyCntctMngNo + '\'' +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                '}';
    }
}
