package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_017 【紹介人】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlChoukaisyamstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659214L;
    @Column
    private String sysId;
    @Column
    private String shokaishaMngNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlChoukaisyamstPK modelKey = (BzlChoukaisyamstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(shokaishaMngNo, modelKey.shokaishaMngNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, shokaishaMngNo);
    }
}

