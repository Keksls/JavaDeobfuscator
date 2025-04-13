/*
 * Decompiled with CFR 0.152.
 */
public class aQQ
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected byte d;
    protected int e;
    protected int f;
    protected aqr_0[] g;

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

    public int g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public aqr_0[] i() {
        return this.g;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.b();
        this.e = asc_22.f();
        this.f = asc_22.f();
        int n = asc_22.f();
        this.g = new aqr_0[n];
        for (int k = 0; k < n; ++k) {
            this.g[k] = new aqr_0();
            this.g[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.l.a();
    }
}

