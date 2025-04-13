/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from VF
 */
public enum vf_0 {
    a(true, true),
    b(false, true),
    c(true, false);

    private final boolean d;
    private final boolean e;

    private vf_0(boolean bl, boolean bl2) {
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

