/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVf
 */
public class evf_1 {
    private final int a;
    private final short b;
    private final eyh_1 c;
    private final boolean d;

    public evf_1(int n, short s2, eyh_1 eyh_12, boolean bl) {
        this.a = n;
        this.b = s2;
        this.c = eyh_12;
        this.d = bl;
    }

    public int a() {
        return this.a;
    }

    public short b() {
        return this.b;
    }

    public eyh_1 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "Resulting{m_itemId=" + this.a + ", m_quantity=" + this.b + ", m_forcedType=" + this.c + ", m_forceFourWhiteSlots=" + this.d + "}";
    }
}

