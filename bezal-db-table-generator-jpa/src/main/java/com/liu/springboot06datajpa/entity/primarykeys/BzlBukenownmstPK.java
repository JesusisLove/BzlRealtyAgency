package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_005 【物件所有者】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlBukenownmstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659202L;
    @Column
    private String sysId;
    @Column
    private String bukenOwnNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlBukenownmstPK modelKey = (BzlBukenownmstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(bukenOwnNo, modelKey.bukenOwnNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, bukenOwnNo);
    }
}

