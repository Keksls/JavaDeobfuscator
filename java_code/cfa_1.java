/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfa
 */
public enum cfa_1 {
    a(true, false),
    b(false, true),
    c(true, false);

    private final boolean d;
    private final boolean e;

    private cfa_1(boolean bl, boolean bl2) {
        this.d = bl;
        this.e = bl2;
    }

    public boolean a() {
        return this.d;
    }

    public boolean b() {
        return this.e;
    }
}

