/*
 * Decompiled with CFR 0.152.
 */
public class flL {
    protected int a;
    protected String b;
    protected flM[] c;
    protected flO[] d;
    protected flK[] e;

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public flM[] c() {
        return this.c;
    }

    public flO[] d() {
        return this.d;
    }

    public flK[] e() {
        return this.e;
    }

    public void a(asc_2 asc_22) {
        int n;
        int n2;
        this.a = asc_22.f();
        this.b = asc_22.i().intern();
        int n3 = asc_22.f();
        this.c = new flM[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.c[n2] = new flM();
            this.c[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.d = new flO[n2];
        for (n = 0; n < n2; ++n) {
            this.d[n] = new flO();
            this.d[n].a(asc_22);
        }
        n = asc_22.f();
        this.e = new flK[n];
        for (int k = 0; k < n; ++k) {
            this.e[k] = new flK();
            this.e[k].a(asc_22);
        }
    }
}

