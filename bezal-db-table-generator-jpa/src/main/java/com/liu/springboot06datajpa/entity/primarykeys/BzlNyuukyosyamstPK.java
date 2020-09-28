package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_019 【入居者管理】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlNyuukyosyamstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659216L;
    @Column
    private String sysId;
    @Column
    private String residentMngNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlNyuukyosyamstPK modelKey = (BzlNyuukyosyamstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(residentMngNo, modelKey.residentMngNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, residentMngNo);
    }
}

