/*
 * Decompiled with CFR 0.152.
 */
public class fpv {
    protected int a;
    protected int b;
    protected int c;
    protected short d;
    protected fpu[] e;
    protected fpu[] f;

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public short d() {
        return this.d;
    }

    public fpu[] e() {
        return this.e;
    }

    public fpu[] f() {
        return this.f;
    }

    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.d();
        int n2 = asc_22.f();
        this.e = new fpu[n2];
        for (n = 0; n < n2; ++n) {
            this.e[n] = new fpu();
            this.e[n].a(asc_22);
        }
        n = asc_22.f();
        this.f = new fpu[n];
        for (int k = 0; k < n; ++k) {
            this.f[k] = new fpu();
            this.f[k].a(asc_22);
        }
    }
}

