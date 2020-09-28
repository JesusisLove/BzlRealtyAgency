package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_013 【保証会社プラン情報】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlHokenplanmstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659210L;
    @Column
    private String sysId;
    @Column
    private String hokenPlanCode;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlHokenplanmstPK modelKey = (BzlHokenplanmstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(hokenPlanCode, modelKey.hokenPlanCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, hokenPlanCode);
    }
}

