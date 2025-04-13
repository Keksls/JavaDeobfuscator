/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bNY
 */
public enum bny_0 {
    a(1),
    b(2),
    c(3),
    d(4),
    e(5),
    f(6),
    g(7);

    private final short h;

    private bny_0(short s2) {
        this.h = s2;
    }

    public static bny_0 a(short s2) {
        for (bny_0 bny_02 : bny_0.values()) {
            if (bny_02.a() != s2) continue;
            return bny_02;
        }
        return b;
    }

    public short a() {
        return this.h;
    }
}

