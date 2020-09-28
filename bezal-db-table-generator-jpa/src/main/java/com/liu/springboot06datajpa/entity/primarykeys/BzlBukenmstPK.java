package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

/* 機能番号：CT_KEIYAKU_001 【物件情報】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlBukenmstPK implements Serializable {
    private static final long serialVersionUID = -2397232644712659226L;
    @Column
    private String sysId;
    @Column
    private String bukenMngNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlBukenmstPK modelKey = (BzlBukenmstPK) o;
        return Objects.equals(sysId, modelKey.sysId) &&
                Objects.equals(bukenMngNo, modelKey.bukenMngNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysId, bukenMngNo);
    }
}
