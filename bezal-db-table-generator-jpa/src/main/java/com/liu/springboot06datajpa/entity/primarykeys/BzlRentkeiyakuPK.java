package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_010 【賃貸契約】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlRentkeiyakuPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659207L;
    @Column
    private String sysId;
    @Column
    private String ankenMngNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlRentkeiyakuPK modelKey = (BzlRentkeiyakuPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(ankenMngNo, modelKey.ankenMngNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, ankenMngNo);
    }
}