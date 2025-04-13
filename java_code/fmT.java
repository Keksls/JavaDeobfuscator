/*
 * Decompiled with CFR 0.152.
 */
public class fmT
implements asu_2 {
    protected int a;
    protected String b;
    protected fmu_0[] c;

    public int c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public fmu_0[] e() {
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
        this.a = asc_22.f();
        this.b = asc_22.i().intern();
        int n = asc_22.f();
        this.c = new fmu_0[n];
        for (int k = 0; k < n; ++k) {
            this.c[k] = new fmu_0();
            this.c[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.A.a();
    }
}

