/*
 * Decompiled with CFR 0.152.
 */
public class aRd
implements asu_2 {
    protected int a;
    protected int b;
    protected short c;
    protected boolean d;
    protected int e;
    protected arf_0[] f;
    protected are_0[] g;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public short e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public arf_0[] h() {
        return this.f;
    }

    public are_0[] i() {
        return this.g;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = false;
        this.e = 0;
        this.f = null;
        this.g = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.d();
        this.d = asc_22.c();
        this.e = asc_22.f();
        int n2 = asc_22.f();
        this.f = new arf_0[n2];
        for (n = 0; n < n2; ++n) {
            this.f[n] = new arf_0();
            this.f[n].a(asc_22);
        }
        n = asc_22.f();
        this.g = new are_0[n];
        for (int k = 0; k < n; ++k) {
            this.g[k] = new are_0();
            this.g[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.v.a();
    }
}

