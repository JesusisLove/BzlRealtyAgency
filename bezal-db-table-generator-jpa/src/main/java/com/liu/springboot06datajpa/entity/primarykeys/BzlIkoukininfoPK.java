package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

/* 機能番号：CT_KEIYAKU_022 【意向金情報】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlIkoukininfoPK implements Serializable {
    private static final long serialVersionUID = -2397232644712659219L;
    @Column
    private String sysId;
    @Column
    private String ikoukinMngNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlIkoukininfoPK modelKey = (BzlIkoukininfoPK) o;
        return Objects.equals(sysId, modelKey.sysId) &&
                Objects.equals(ikoukinMngNo, modelKey.ikoukinMngNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysId, ikoukinMngNo);
    }
}

