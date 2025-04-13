/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fng
 */
public class fng_0
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected byte d;
    protected fni_0[] e;
    protected fmf_0 f;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public byte f() {
        return this.d;
    }

    public fni_0[] g() {
        return this.e;
    }

    public fmf_0 h() {
        return this.f;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.b();
        int n = asc_22.f();
        this.e = new fni_0[n];
        for (int k = 0; k < n; ++k) {
            this.e[k] = new fni_0();
            this.e[k].a(asc_22);
        }
        if (asc_22.b() != 0) {
            this.f = new fmf_0();
            this.f.a(asc_22);
        } else {
            this.f = null;
        }
    }

    @Override
    public final int a() {
        return enK.aC.a();
    }
}

