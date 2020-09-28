package com.liu.springboot04web.bean;

import java.util.Date;

public class CtKeiyaku011Bean implements BzlFudousanBean {
    protected String sysId;
    protected String ownKeiyakuMngNo;
    protected Date keiyakuSignDate;
    protected String keiyakuTantosha;
    protected String keiyakuMngNo;
    protected String bukenMngCopNo;
    protected String bukenMngNo;
    protected Date keiyakuStartDate;
    protected Date keiyakuEndDate;
    protected Integer kojinHojinFlg;
    protected String furikomiJiki;
    protected Date furikomiDate;
    protected float chukaiFee;
    protected String keiyakuUpdateFeeTarget;
    protected String tantoshaCode;
    protected float kanriItakuFee;
    protected float gyomuItakuFee;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected Integer delFlg;
    public CtKeiyaku011Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getOwnKeiyakuMngNo() {
        return ownKeiyakuMngNo;
    }

    public void setOwnKeiyakuMngNo(String ownKeiyakuMngNo) {
        this.ownKeiyakuMngNo = ownKeiyakuMngNo;
    }

    public Date getKeiyakuSignDate() {
        return keiyakuSignDate;
    }

    public void setKeiyakuSignDate(Date keiyakuSignDate) {
        this.keiyakuSignDate = keiyakuSignDate;
    }

    public String getKeiyakuTantosha() {
        return keiyakuTantosha;
    }

    public void setKeiyakuTantosha(String keiyakuTantosha) {
        this.keiyakuTantosha = keiyakuTantosha;
    }

    public String getKeiyakuMngNo() {
        return keiyakuMngNo;
    }

    public void setKeiyakuMngNo(String keiyakuMngNo) {
        this.keiyakuMngNo = keiyakuMngNo;
    }

    public String getBukenMngCopNo() {
        return bukenMngCopNo;
    }

    public void setBukenMngCopNo(String bukenMngCopNo) {
        this.bukenMngCopNo = bukenMngCopNo;
    }

    public String getBukenMngNo() {
        return bukenMngNo;
    }

    public void setBukenMngNo(String bukenMngNo) {
        this.bukenMngNo = bukenMngNo;
    }

    public Date getKeiyakuStartDate() {
        return keiyakuStartDate;
    }

    public void setKeiyakuStartDate(Date keiyakuStartDate) {
        this.keiyakuStartDate = keiyakuStartDate;
    }

    public Date getKeiyakuEndDate() {
        return keiyakuEndDate;
    }

    public void setKeiyakuEndDate(Date keiyakuEndDate) {
        this.keiyakuEndDate = keiyakuEndDate;
    }

    public Integer getKojinHojinFlg() {
        return kojinHojinFlg;
    }

    public void setKojinHojinFlg(Integer kojinHojinFlg) {
        this.kojinHojinFlg = kojinHojinFlg;
    }

    public String getFurikomiJiki() {
        return furikomiJiki;
    }

    public void setFurikomiJiki(String furikomiJiki) {
        this.furikomiJiki = furikomiJiki;
    }

    public Date getFurikomiDate() {
        return furikomiDate;
    }

    public void setFurikomiDate(Date furikomiDate) {
        this.furikomiDate = furikomiDate;
    }

    public float getChukaiFee() {
        return chukaiFee;
    }

    public void setChukaiFee(float chukaiFee) {
        this.chukaiFee = chukaiFee;
    }

    public String getKeiyakuUpdateFeeTarget() {
        return keiyakuUpdateFeeTarget;
    }

    public void setKeiyakuUpdateFeeTarget(String keiyakuUpdateFeeTarget) {
        this.keiyakuUpdateFeeTarget = keiyakuUpdateFeeTarget;
    }

    public String getTantoshaCode() {
        return tantoshaCode;
    }

    public void setTantoshaCode(String tantoshaCode) {
        this.tantoshaCode = tantoshaCode;
    }

    public float getKanriItakuFee() {
        return kanriItakuFee;
    }

    public void setKanriItakuFee(float kanriItakuFee) {
        this.kanriItakuFee = kanriItakuFee;
    }

    public float getGyomuItakuFee() {
        return gyomuItakuFee;
    }

    public void setGyomuItakuFee(float gyomuItakuFee) {
        this.gyomuItakuFee = gyomuItakuFee;
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

    public Integer getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
    }

    @Override
    public String toString() {
        return "CtKeiyaku011Bean{" +
                "sysId='" + sysId + '\'' +
                ", ownKeiyakuMngNo='" + ownKeiyakuMngNo + '\'' +
                ", keiyakuSignDate=" + keiyakuSignDate +
                ", keiyakuTantosha='" + keiyakuTantosha + '\'' +
                ", keiyakuMngNo='" + keiyakuMngNo + '\'' +
                ", bukenMngCopNo='" + bukenMngCopNo + '\'' +
                ", bukenMngNo='" + bukenMngNo + '\'' +
                ", keiyakuStartDate=" + keiyakuStartDate +
                ", keiyakuEndDate=" + keiyakuEndDate +
                ", kojinHojinFlg=" + kojinHojinFlg +
                ", furikomiJiki='" + furikomiJiki + '\'' +
                ", furikomiDate=" + furikomiDate +
                ", chukaiFee=" + chukaiFee +
                ", keiyakuUpdateFeeTarget='" + keiyakuUpdateFeeTarget + '\'' +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", kanriItakuFee=" + kanriItakuFee +
                ", gyomuItakuFee=" + gyomuItakuFee +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", delFlg=" + delFlg +
                '}';
    }
}

