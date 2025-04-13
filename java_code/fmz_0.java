/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fmz
 */
public class fmz_0
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected fma_0[] e;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public fma_0[] g() {
        return this.e;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        int n = asc_22.f();
        this.e = new fma_0[n];
        for (int k = 0; k < n; ++k) {
            this.e[k] = new fma_0();
            this.e[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.l.a();
    }
}

