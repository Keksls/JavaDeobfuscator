/*
 * Decompiled with CFR 0.152.
 */
public class aTG
implements asu_2 {
    protected int a;
    protected int b;
    protected boolean c;
    protected String d;
    protected ati_0[] e;
    protected ati_0[] f;
    protected ath_0[] g;
    protected aTJ[] h;
    protected atk_0[] i;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public ati_0[] g() {
        return this.e;
    }

    public ati_0[] h() {
        return this.f;
    }

    public ath_0[] i() {
        return this.g;
    }

    public aTJ[] j() {
        return this.h;
    }

    public atk_0[] k() {
        return this.i;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        int n3;
        int n4;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.c();
        this.d = asc_22.i().intern();
        int n5 = asc_22.f();
        this.e = new ati_0[n5];
        for (n4 = 0; n4 < n5; ++n4) {
            this.e[n4] = new ati_0();
            this.e[n4].a(asc_22);
        }
        n4 = asc_22.f();
        this.f = new ati_0[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            this.f[n3] = new ati_0();
            this.f[n3].a(asc_22);
        }
        n3 = asc_22.f();
        this.g = new ath_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.g[n2] = new ath_0();
            this.g[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.h = new aTJ[n2];
        for (n = 0; n < n2; ++n) {
            this.h[n] = new aTJ();
            this.h[n].a(asc_22);
        }
        n = asc_22.f();
        this.i = new atk_0[n];
        for (int k = 0; k < n; ++k) {
            this.i[k] = new atk_0();
            this.i[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.bR.a();
    }
}

