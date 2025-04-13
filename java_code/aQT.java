/*
 * Decompiled with CFR 0.152.
 */
public class aQT
implements asu_2 {
    protected int a;
    protected aqu_0[] b;

    public int c() {
        return this.a;
    }

    public aqu_0[] d() {
        return this.b;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        int n = asc_22.f();
        this.b = new aqu_0[n];
        for (int k = 0; k < n; ++k) {
            this.b[k] = new aqu_0();
            this.b[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.aA.a();
    }
}

