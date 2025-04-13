/*
 * Decompiled with CFR 0.152.
 */
public class aQi
implements asu_2 {
    protected int a;
    protected aQj[] b;

    public int c() {
        return this.a;
    }

    public aQj[] d() {
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
        this.b = new aQj[n];
        for (int k = 0; k < n; ++k) {
            this.b[k] = new aQj();
            this.b[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.bi.a();
    }
}

