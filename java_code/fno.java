/*
 * Decompiled with CFR 0.152.
 */
public class fno
implements asu_2 {
    protected int a;
    protected fnr[] b;
    protected fmf_0 c;

    public int c() {
        return this.a;
    }

    public fnr[] d() {
        return this.b;
    }

    public fmf_0 e() {
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
        int n = asc_22.f();
        this.b = new fnr[n];
        for (int k = 0; k < n; ++k) {
            this.b[k] = new fnr();
            this.b[k].a(asc_22);
        }
        if (asc_22.b() != 0) {
            this.c = new fmf_0();
            this.c.a(asc_22);
        } else {
            this.c = null;
        }
    }

    @Override
    public final int a() {
        return enK.E.a();
    }
}

