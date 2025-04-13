/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from afD
 */
public enum afd_0 {
    a(-1.0f, true, 0.0f),
    b(400.0f, false, 0.0f),
    c(1760.0f, false, 0.0f),
    d(600.0f, false, 700.0f),
    e(afc_0.f, false, 0.0f),
    f(1300.0f, false, 0.0f),
    g(afc_0.a, false, 0.0f);

    private final float h;
    private final boolean i;
    private final float j;

    private afd_0(float f2, boolean bl, float f3) {
        this.h = f2;
        this.i = bl;
        this.j = f3;
    }

    public float a() {
        return this.h;
    }

    public boolean b() {
        return this.i;
    }

    public float c() {
        return this.j;
    }
}

