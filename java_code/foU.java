/*
 * Decompiled with CFR 0.152.
 */
public class foU
implements asu_2 {
    protected int a;
    protected foV[] b;
    protected foW[] c;

    public int c() {
        return this.a;
    }

    public foV[] d() {
        return this.b;
    }

    public foW[] e() {
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
        this.b = new foV[n2];
        for (n = 0; n < n2; ++n) {
            this.b[n] = new foV();
            this.b[n].a(asc_22);
        }
        n = asc_22.f();
        this.c = new foW[n];
        for (int k = 0; k < n; ++k) {
            this.c[k] = new foW();
            this.c[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.ae.a();
    }
}

