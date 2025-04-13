/*
 * Decompiled with CFR 0.152.
 */
public class aTk
implements asu_2 {
    protected int a;
    protected atl_0[] b;
    protected atm_0[] c;

    public int c() {
        return this.a;
    }

    public atl_0[] d() {
        return this.b;
    }

    public atm_0[] e() {
        return this.c;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = null;
        this.c = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        int n2 = asc_22.f();
        this.b = new atl_0[n2];
        for (n = 0; n < n2; ++n) {
            this.b[n] = new atl_0();
            this.b[n].a(asc_22);
        }
        n = asc_22.f();
        this.c = new atm_0[n];
        for (int k = 0; k < n; ++k) {
            this.c[k] = new atm_0();
            this.c[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.ae.a();
    }
}

