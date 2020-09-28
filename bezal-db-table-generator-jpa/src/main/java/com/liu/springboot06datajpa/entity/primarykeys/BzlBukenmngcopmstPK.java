package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_006 【物件管理会社】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlBukenmngcopmstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659203L;
    @Column
    private String sysId;
    @Column
    private String bukenMngCopNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlBukenmngcopmstPK modelKey = (BzlBukenmngcopmstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(bukenMngCopNo, modelKey.bukenMngCopNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, bukenMngCopNo);
    }
}

