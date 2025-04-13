/*
 * Decompiled with CFR 0.152.
 */
enum dkM {
    a(true, false, false),
    b(true, true, false),
    c(false, true, false),
    d(false, false, true);

    private final boolean e;
    private final boolean f;
    private final boolean g;

    private dkM(boolean bl, boolean bl2, boolean bl3) {
        this.e = bl;
        this.f = bl2;
        this.g = bl3;
    }

    public boolean a() {
        return this.e;
    }

    public boolean b() {
        return this.f;
    }

    public boolean c() {
        return this.g;
    }
}

