/*
 * Decompiled with CFR 0.152.
 */
public class aQr
implements asu_2 {
    protected int a;
    protected short b;
    protected aQs[] c;
    protected aqv_0[] d;
    protected aqt_0[] e;
    protected int f;
    protected int g;

    public int c() {
        return this.a;
    }

    public short d() {
        return this.b;
    }

    public aQs[] e() {
        return this.c;
    }

    public aqv_0[] f() {
        return this.d;
    }

    public aqt_0[] g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        this.a = asc_22.f();
        this.b = asc_22.d();
        int n3 = asc_22.f();
        this.c = new aQs[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.c[n2] = new aQs();
            this.c[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.d = new aqv_0[n2];
        for (n = 0; n < n2; ++n) {
            this.d[n] = new aqv_0();
            this.d[n].a(asc_22);
        }
        n = asc_22.f();
        this.e = new aqt_0[n];
        for (int k = 0; k < n; ++k) {
            this.e[k] = new aqt_0();
            this.e[k].a(asc_22);
        }
        this.f = asc_22.f();
        this.g = asc_22.f();
    }

    @Override
    public final int a() {
        return enK.aH.a();
    }
}

