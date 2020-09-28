package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_004 【修繕履歴】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlHeyarepairhstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659201L;
    @Column
    private String sysId;
    @Column
    private String repairMngNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlHeyarepairhstPK modelKey = (BzlHeyarepairhstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(repairMngNo, modelKey.repairMngNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, repairMngNo);
    }
}

