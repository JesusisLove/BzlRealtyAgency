package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_011 【大家さん契約】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlOyakeiyakumstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659208L;
    @Column
    private String sysId;
    @Column
    private String ownKeiyakuMngNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlOyakeiyakumstPK modelKey = (BzlOyakeiyakumstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(ownKeiyakuMngNo, modelKey.ownKeiyakuMngNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, ownKeiyakuMngNo);
    }
}

