package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：SYS_CODE_001 【コード一覧テーブル】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysCodetablemstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659001L;
    @Column
    private String sysId;
    @Column
    private String tableMngNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysCodetablemstPK modelKey = (SysCodetablemstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(tableMngNo, modelKey.tableMngNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, tableMngNo);
    }
}


