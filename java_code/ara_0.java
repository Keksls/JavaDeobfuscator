/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRA
 */
public class ara_0 {
    protected int a;
    protected String b;
    protected arz_0[] c;
    protected int d;
    protected int e;
    protected arb_0[] f;
    protected int g;

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public arz_0[] c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public arb_0[] f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        this.b = asc_22.i().intern();
        int n2 = asc_22.f();
        this.c = new arz_0[n2];
        for (n = 0; n < n2; ++n) {
            this.c[n] = new arz_0();
            this.c[n].a(asc_22);
        }
        this.d = asc_22.f();
        this.e = asc_22.f();
        n = asc_22.f();
        this.f = new arb_0[n];
        for (int k = 0; k < n; ++k) {
            this.f[k] = new arb_0();
            this.f[k].a(asc_22);
        }
        this.g = asc_22.f();
    }
}

