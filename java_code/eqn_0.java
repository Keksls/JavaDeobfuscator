/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQn
 */
public enum eqn_0 {
    a(0, true),
    b(1, false),
    c(2, true),
    d(3, false),
    e(4, true),
    f(5, false);

    private final byte g;
    private final boolean h;

    private eqn_0(byte by, boolean bl) {
        this.g = by;
        this.h = bl;
    }

    public boolean a() {
        return this.h;
    }

    public byte b() {
        return this.g;
    }

    public static eqn_0 a(byte by) {
        for (eqn_0 eqn_02 : eqn_0.values()) {
            if (eqn_02.g != by) continue;
            return eqn_02;
        }
        return d;
    }
}

