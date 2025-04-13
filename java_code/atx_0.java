/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aTX
 */
public class atx_0
implements asu_2 {
    protected int a;
    protected double b;
    protected short c;
    protected short d;
    protected String e;
    protected short f;
    protected aTY[] g;

    public int c() {
        return this.a;
    }

    public double d() {
        return this.b;
    }

    public short e() {
        return this.c;
    }

    public short f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public short h() {
        return this.f;
    }

    public aTY[] i() {
        return this.g;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0.0;
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = 0;
        this.g = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.g();
        this.c = asc_22.d();
        this.d = asc_22.d();
        this.e = asc_22.i().intern();
        this.f = asc_22.d();
        int n = asc_22.f();
        this.g = new aTY[n];
        for (int k = 0; k < n; ++k) {
            this.g[k] = new aTY();
            this.g[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.av.a();
    }
}

