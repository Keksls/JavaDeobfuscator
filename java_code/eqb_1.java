/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eqb
 */
public enum eqb_1 {
    a(-1),
    b(0),
    c(1),
    d(2),
    e(3),
    f(4),
    g(5),
    h(6),
    i(7),
    j(8);

    private final short k;

    private eqb_1(int n2) {
        this.k = (short)n2;
    }

    public static eqb_1 a(int n) {
        for (eqb_1 eqb_12 : eqb_1.values()) {
            if (eqb_12.a() != n) continue;
            return eqb_12;
        }
        return null;
    }

    public short a() {
        return this.k;
    }
}

