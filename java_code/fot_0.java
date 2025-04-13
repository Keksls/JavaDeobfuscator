/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fot
 */
public class fot_0
implements asu_2 {
    protected int a;
    protected boolean b;
    protected afe_1[] c;
    protected afe_1[] d;
    protected afe_1[] e;

    public int c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public afe_1[] e() {
        return this.c;
    }

    public afe_1[] f() {
        return this.d;
    }

    public afe_1[] g() {
        return this.e;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        this.a = asc_22.f();
        this.b = asc_22.c();
        int n3 = asc_22.f();
        this.c = new afe_1[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.c[n2] = new afe_1(asc_22.f(), asc_22.f());
        }
        n2 = asc_22.f();
        this.d = new afe_1[n2];
        for (n = 0; n < n2; ++n) {
            this.d[n] = new afe_1(asc_22.f(), asc_22.f());
        }
        n = asc_22.f();
        this.e = new afe_1[n];
        for (int k = 0; k < n; ++k) {
            this.e[k] = new afe_1(asc_22.f(), asc_22.f());
        }
    }

    @Override
    public final int a() {
        return enK.R.a();
    }
}

