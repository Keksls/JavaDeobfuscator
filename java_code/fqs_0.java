/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fqS
 */
public enum fqs_0 {
    a(true, true, true),
    b(false, false, false),
    c(true, false, true);

    private final boolean d;
    private final boolean e;
    private final boolean f;

    private fqs_0(boolean bl, boolean bl2, boolean bl3) {
        this.d = bl;
        this.e = bl2;
        this.f = bl3;
    }

    public boolean a() {
        return this.d;
    }

    public boolean b() {
        return this.e;
    }

    public boolean c() {
        return this.f;
    }
}

