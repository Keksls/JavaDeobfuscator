/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fmU
 */
public class fmu_0 {
    protected int a;
    protected String b;
    protected int c;
    protected boolean d;
    protected int e;
    protected fmV[] f;

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public fmV[] f() {
        return this.f;
    }

    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.i().intern();
        this.c = asc_22.f();
        this.d = asc_22.c();
        this.e = asc_22.f();
        int n = asc_22.f();
        this.f = new fmV[n];
        for (int k = 0; k < n; ++k) {
            this.f[k] = new fmV();
            this.f[k].a(asc_22);
        }
    }
}

