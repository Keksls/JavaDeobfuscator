/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fhZ
 */
public enum fhz_0 {
    a(true, false, false, true, false),
    b(false, true, false, true, false),
    c(true, false, true, false, false),
    d(false, true, true, false, false),
    e(false, true, false, false, true),
    f(false, false, false, false, false);

    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;

    private fhz_0(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.g = bl;
        this.h = bl2;
        this.i = bl3;
        this.j = bl4;
        this.k = bl5;
    }

    public boolean a() {
        return this.g;
    }

    public boolean b() {
        return this.h;
    }

    public boolean c() {
        return this.i || this.j;
    }

    public boolean d() {
        return this.i;
    }

    public boolean e() {
        return this.j;
    }

    public boolean f() {
        return this.k;
    }
}

