package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

/* 機能番号：CT_KEIYAKU_002 【鍵情報】テーブルPKクラス */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BzlKeymstPK implements Serializable {
    private static final long serialVersionUID = -2397232644712659226L;
    @Column
    private String sysId;
    @Column
    private String jisyaKeyNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzlKeymstPK modelKey = (BzlKeymstPK) o;
        return Objects.equals(sysId, modelKey.sysId) &&
                Objects.equals(jisyaKeyNo, modelKey.jisyaKeyNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysId, jisyaKeyNo);
    }
}

