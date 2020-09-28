package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_003 【日勤管理会社】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlNichincopmstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659227L;
    @Column
    private String sysId;
    @Column
    private String daytimeMngCopMngNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlNichincopmstPK modelKey = (BzlNichincopmstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(daytimeMngCopMngNo, modelKey.daytimeMngCopMngNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, daytimeMngCopMngNo);
    }
}

