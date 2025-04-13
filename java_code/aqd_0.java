/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQd
 */
public class aqd_0 {
    protected int a;
    protected boolean b;
    protected String c;
    protected aqe_0[] d;
    protected String e;
    protected aQg[] f;

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public aqe_0[] d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public aQg[] f() {
        return this.f;
    }

    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        this.b = asc_22.c();
        this.c = asc_22.i().intern();
        int n2 = asc_22.f();
        this.d = new aqe_0[n2];
        for (n = 0; n < n2; ++n) {
            this.d[n] = new aqe_0();
            this.d[n].a(asc_22);
        }
        this.e = asc_22.i().intern();
        n = asc_22.f();
        this.f = new aQg[n];
        for (int k = 0; k < n; ++k) {
            this.f[k] = new aQg();
            this.f[k].a(asc_22);
        }
    }
}

