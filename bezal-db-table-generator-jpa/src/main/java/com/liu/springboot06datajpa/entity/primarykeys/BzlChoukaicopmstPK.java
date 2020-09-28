package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_016 【仲介会社】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlChoukaicopmstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659213L;
    @Column
    private String sysId;
    @Column
    private String chukaiCopMngNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlChoukaicopmstPK modelKey = (BzlChoukaicopmstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(chukaiCopMngNo, modelKey.chukaiCopMngNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, chukaiCopMngNo);
    }
}

