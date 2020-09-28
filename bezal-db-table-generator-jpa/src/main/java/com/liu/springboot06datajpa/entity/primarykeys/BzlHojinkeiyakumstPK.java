package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_009 【法人契約者】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlHojinkeiyakumstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659206L;
    @Column
    private String sysId;
    @Column
    private String hojinMngNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlHojinkeiyakumstPK modelKey = (BzlHojinkeiyakumstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(hojinMngNo, modelKey.hojinMngNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, hojinMngNo);
    }
}

