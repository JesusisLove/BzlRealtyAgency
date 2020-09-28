package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

/* 機能番号：SYS_CODE_003 【コード値一覧】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysCodevaluemstPK implements Serializable {
    private static final long serialVersionUID = -2397232644712659003L;
    @Column
    private String sysId;
    @Column
    private String tableMngNo;
    @Column
    private String tableFieldNo;
    @Column
    private String tableCodeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysCodevaluemstPK modelKey = (SysCodevaluemstPK) o;
        return Objects.equals(sysId, modelKey.sysId) &&
                Objects.equals(tableMngNo, modelKey.tableMngNo) &&
                Objects.equals(tableFieldNo, modelKey.tableFieldNo) &&
                Objects.equals(tableCodeId, modelKey.tableCodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysId, tableFieldNo);
    }
}

