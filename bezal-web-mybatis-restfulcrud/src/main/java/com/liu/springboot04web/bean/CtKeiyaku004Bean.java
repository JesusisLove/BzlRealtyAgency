package com.liu.springboot04web.bean;

import java.util.Date;

public class CtKeiyaku004Bean implements BzlFudousanBean {

    protected String sysId;
    protected String repairMngNo;
    protected String bukenMngNo;
    protected Date repairDateStart;
    protected Date repairDateEnd;
    protected String repairMemo;
    protected float repairedFee;
    protected String genjyouReturnMngNo;
    protected Date timeStampNew;
    protected Date timeStampUpdate;
    protected String tantoshaCode;
    protected Integer delFlg;
    public CtKeiyaku004Bean() {}

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getRepairMngNo() {
        return repairMngNo;
    }

    public void setRepairMngNo(String repairMngNo) {
        this.repairMngNo = repairMngNo;
    }

    public String getBukenMngNo() {
        return bukenMngNo;
    }

    public void setBukenMngNo(String bukenMngNo) {
        this.bukenMngNo = bukenMngNo;
    }

    public Date getRepairDateStart() {
        return repairDateStart;
    }

    public void setRepairDateStart(Date repairDateStart) {
        this.repairDateStart = repairDateStart;
    }

    public Date getRepairDateEnd() {
        return repairDateEnd;
    }

    public void setRepairDateEnd(Date repairDateEnd) {
        this.repairDateEnd = repairDateEnd;
    }

    public String getRepairMemo() {
        return repairMemo;
    }

    public void setRepairMemo(String repairMemo) {
        this.repairMemo = repairMemo;
    }

    public float getRepairedFee() {
        return repairedFee;
    }

    public void setRepairedFee(float repairedFee) {
        this.repairedFee = repairedFee;
    }

    public String getGenjyouReturnMngNo() {
        return genjyouReturnMngNo;
    }

    public void setGenjyouReturnMngNo(String genjyouReturnMngNo) {
        this.genjyouReturnMngNo = genjyouReturnMngNo;
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
        return "CtKeiyaku004Bean{" +
                "sysId='" + sysId + '\'' +
                ", repairMngNo='" + repairMngNo + '\'' +
                ", bukenMngNo='" + bukenMngNo + '\'' +
                ", repairDateStart=" + repairDateStart +
                ", repairDateEnd=" + repairDateEnd +
                ", repairMemo='" + repairMemo + '\'' +
                ", repairedFee=" + repairedFee +
                ", genjyouReturnMngNo='" + genjyouReturnMngNo + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}

