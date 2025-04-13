/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fpe
 */
public class fpe_0 {
    protected int a;
    protected fpf[] b;
    protected int c;
    protected fpg[] d;

    public int a() {
        return this.a;
    }

    public fpf[] b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public fpg[] d() {
        return this.d;
    }

    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        int n2 = asc_22.f();
        this.b = new fpf[n2];
        for (n = 0; n < n2; ++n) {
            this.b[n] = new fpf();
            this.b[n].a(asc_22);
        }
        this.c = asc_22.f();
        n = asc_22.f();
        this.d = new fpg[n];
        for (int k = 0; k < n; ++k) {
            this.d[k] = new fpg();
            this.d[k].a(asc_22);
        }
    }
}

