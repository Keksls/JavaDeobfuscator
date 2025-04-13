/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTN
 */
public class etn_2
extends etl_2 {
    private final short a;
    private final int b;

    public etn_2(short s2, short s3, int n, int n2, short s4) {
        super(s2, n2, s4);
        this.a = s3;
        this.b = n;
    }

    public short b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof etn_2)) {
            return false;
        }
        etn_2 etn_22 = (etn_2)object;
        return this.a == etn_22.a;
    }

    public int hashCode() {
        return this.a;
    }

    @Override
    public String toString() {
        return super.toString() + "m_patchId=" + this.a;
    }

    @Override
    public int a() {
        return this.b;
    }
}

