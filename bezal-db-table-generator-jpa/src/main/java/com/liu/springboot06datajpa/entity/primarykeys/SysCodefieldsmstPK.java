package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

/* 機能番号：SYS_CODE_002 【コード一覧項目】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysCodefieldsmstPK implements Serializable {
    private static final long serialVersionUID = -2397232644712659002L;
    @Column
    private String sysId;
    @Column
    private String tableMngNo;
    @Column
    private String tableFieldNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysCodefieldsmstPK modelKey = (SysCodefieldsmstPK) o;
        return Objects.equals(sysId, modelKey.sysId) &&
                Objects.equals(tableMngNo, modelKey.tableMngNo) &&
                Objects.equals(tableFieldNo, modelKey.tableFieldNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysId, tableFieldNo);
    }
}

