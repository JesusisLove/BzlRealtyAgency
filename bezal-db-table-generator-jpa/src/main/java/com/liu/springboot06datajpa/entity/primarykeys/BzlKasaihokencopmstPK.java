package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 機能番号：CT_KEIYAKU_014 【家財保険会社情報】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlKasaihokencopmstPK  implements Serializable {
    private static final long serialVersionUID = -2397232644712659211L;
    @Column
    private String sysId;
    @Column
    private String kazaihokenMngNo;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlKasaihokencopmstPK modelKey = (BzlKasaihokencopmstPK) o;
        return Objects.equals(sysId , modelKey.sysId) &&
                Objects.equals(kazaihokenMngNo, modelKey.kazaihokenMngNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sysId, kazaihokenMngNo);
    }
}

