/*
 * Decompiled with CFR 0.152.
 */
public class aQY
implements asu_2 {
    protected int a;
    protected int b;
    protected short c;
    protected short d;
    protected String e;
    protected String[] f;
    protected boolean g;
    protected aRa[] h;

    public int c() {
        return this.a;
    }

    public int d() {
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

    public String[] h() {
        return this.f;
    }

    public boolean i() {
        return this.g;
    }

    public aRa[] j() {
        return this.h;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.d();
        this.d = asc_22.d();
        this.e = asc_22.i().intern();
        this.f = asc_22.n();
        this.g = asc_22.c();
        int n = asc_22.f();
        this.h = new aRa[n];
        for (int k = 0; k < n; ++k) {
            this.h[k] = new aRa();
            this.h[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.r.a();
    }
}

