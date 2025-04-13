/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from emX
 */
public enum emx_0 {
    a(-1),
    b(0),
    c(1);

    public final int d;

    private emx_0(int n2) {
        this.d = n2;
    }

    public static emx_0 a(int n) {
        for (emx_0 emx_02 : emx_0.values()) {
            if (emx_02.d != n) continue;
            return emx_02;
        }
        return a;
    }
}

