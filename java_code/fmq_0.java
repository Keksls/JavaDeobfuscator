/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fmq
 */
public class fmq_0
implements asu_2 {
    protected int a;
    protected int b;
    protected fmr_0[] c;
    protected fms_0[] d;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public fmr_0[] e() {
        return this.c;
    }

    public fms_0[] f() {
        return this.d;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        this.b = asc_22.f();
        int n2 = asc_22.f();
        this.c = new fmr_0[n2];
        for (n = 0; n < n2; ++n) {
            this.c[n] = new fmr_0();
            this.c[n].a(asc_22);
        }
        n = asc_22.f();
        this.d = new fms_0[n];
        for (int k = 0; k < n; ++k) {
            this.d[k] = new fms_0();
            this.d[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.bG.a();
    }
}

