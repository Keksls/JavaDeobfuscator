/*
 * Decompiled with CFR 0.152.
 */
public class aRa {
    protected int a;
    protected short b;
    protected String c;
    protected aqz_0[] d;

    public int a() {
        return this.a;
    }

    public short b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public aqz_0[] d() {
        return this.d;
    }

    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.d();
        this.c = asc_22.i().intern();
        int n = asc_22.f();
        this.d = new aqz_0[n];
        for (int k = 0; k < n; ++k) {
            this.d[k] = new aqz_0();
            this.d[k].a(asc_22);
        }
    }
}

