/*
 * Decompiled with CFR 0.152.
 */
public class fnr {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected boolean e;
    protected int f;
    protected int g;
    protected fnq[] h;

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public fnq[] h() {
        return this.h;
    }

    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.c();
        this.f = asc_22.f();
        this.g = asc_22.f();
        int n = asc_22.f();
        this.h = new fnq[n];
        for (int k = 0; k < n; ++k) {
            this.h[k] = new fnq();
            this.h[k].a(asc_22);
        }
    }
}

