/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aTK
 */
public class atk_0 {
    protected int a;
    protected int b;
    protected int c;
    protected short d;
    protected aTJ[] e;
    protected aTJ[] f;

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

    public aTJ[] e() {
        return this.e;
    }

    public aTJ[] f() {
        return this.f;
    }

    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.d();
        int n2 = asc_22.f();
        this.e = new aTJ[n2];
        for (n = 0; n < n2; ++n) {
            this.e[n] = new aTJ();
            this.e[n].a(asc_22);
        }
        n = asc_22.f();
        this.f = new aTJ[n];
        for (int k = 0; k < n; ++k) {
            this.f[k] = new aTJ();
            this.f[k].a(asc_22);
        }
    }
}

