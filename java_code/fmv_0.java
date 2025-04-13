/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fmv
 */
public class fmv_0
implements asu_2 {
    protected int a;
    protected int b;
    protected afe_1[] c;
    protected afe_1[] d;
    protected int[] e;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public afe_1[] e() {
        return this.c;
    }

    public afe_1[] f() {
        return this.d;
    }

    public int[] g() {
        return this.e;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        this.b = asc_22.f();
        int n2 = asc_22.f();
        this.c = new afe_1[n2];
        for (n = 0; n < n2; ++n) {
            this.c[n] = new afe_1(asc_22.f(), asc_22.f());
        }
        n = asc_22.f();
        this.d = new afe_1[n];
        for (int k = 0; k < n; ++k) {
            this.d[k] = new afe_1(asc_22.f(), asc_22.f());
        }
        this.e = asc_22.k();
    }

    @Override
    public final int a() {
        return enK.j.a();
    }
}

