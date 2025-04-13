/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUy
 */
public enum euy_2 {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6);

    private final byte h;

    private euy_2(int n2) {
        this.h = Hw.b((long)n2);
    }

    public byte a() {
        return this.h;
    }

    public static euy_2 a(byte by) {
        for (euy_2 euy_22 : euy_2.values()) {
            if (euy_22.h != by) continue;
            return euy_22;
        }
        return a;
    }
}

