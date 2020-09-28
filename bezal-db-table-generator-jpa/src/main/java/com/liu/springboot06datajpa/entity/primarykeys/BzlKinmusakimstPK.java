package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_020 【勤務先】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlKinmusakimstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659217L;
    @Column
    private String sysId;
    @Column
    private String kinmuMngNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlKinmusakimstPK modelKey = (BzlKinmusakimstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(kinmuMngNo, modelKey.kinmuMngNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, kinmuMngNo);
    }
}

