/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eMD
 */
public enum emd_2 {
    a(false, false),
    b(true, true),
    c(true, false);

    private final boolean d;
    private final boolean e;

    private emd_2(boolean bl, boolean bl2) {
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

