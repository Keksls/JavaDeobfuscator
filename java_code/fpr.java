/*
 * Decompiled with CFR 0.152.
 */
public class fpr
implements asu_2 {
    protected int a;
    protected int b;
    protected boolean c;
    protected String d;
    protected fpt[] e;
    protected fpt[] f;
    protected fps[] g;
    protected fpu[] h;
    protected fpv[] i;

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

    public fpt[] g() {
        return this.e;
    }

    public fpt[] h() {
        return this.f;
    }

    public fps[] i() {
        return this.g;
    }

    public fpu[] j() {
        return this.h;
    }

    public fpv[] k() {
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
        this.e = new fpt[n5];
        for (n4 = 0; n4 < n5; ++n4) {
            this.e[n4] = new fpt();
            this.e[n4].a(asc_22);
        }
        n4 = asc_22.f();
        this.f = new fpt[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            this.f[n3] = new fpt();
            this.f[n3].a(asc_22);
        }
        n3 = asc_22.f();
        this.g = new fps[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.g[n2] = new fps();
            this.g[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.h = new fpu[n2];
        for (n = 0; n < n2; ++n) {
            this.h[n] = new fpu();
            this.h[n].a(asc_22);
        }
        n = asc_22.f();
        this.i = new fpv[n];
        for (int k = 0; k < n; ++k) {
            this.i[k] = new fpv();
            this.i[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.bR.a();
    }
}

