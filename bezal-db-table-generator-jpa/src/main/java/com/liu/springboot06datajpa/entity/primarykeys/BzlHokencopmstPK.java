package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_012 【保証会社情報】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlHokencopmstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659209L;
    @Column
    private String sysId;
    @Column
    private String hoshoCopMngNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlHokencopmstPK modelKey = (BzlHokencopmstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(hoshoCopMngNo, modelKey.hoshoCopMngNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, hoshoCopMngNo);
    }
}

