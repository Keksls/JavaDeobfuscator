/*
 * Decompiled with CFR 0.152.
 */
public enum eKg {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6);

    private final byte h;

    private eKg(byte by) {
        this.h = by;
    }

    public static eKg a(byte by) {
        for (eKg eKg2 : eKg.values()) {
            if (eKg2.h != by) continue;
            return eKg2;
        }
        return a;
    }

    public byte a() {
        return this.h;
    }
}

