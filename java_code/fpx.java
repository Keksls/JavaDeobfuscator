/*
 * Decompiled with CFR 0.152.
 */
public class fpx
implements asu_2 {
    protected int a;
    protected int b;
    protected fmf_0 c;
    protected fpy[] d;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public fmf_0 e() {
        return this.c;
    }

    public fpy[] f() {
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
        this.a = asc_22.f();
        this.b = asc_22.f();
        if (asc_22.b() != 0) {
            this.c = new fmf_0();
            this.c.a(asc_22);
        } else {
            this.c = null;
        }
        int n = asc_22.f();
        this.d = new fpy[n];
        for (int k = 0; k < n; ++k) {
            this.d[k] = new fpy();
            this.d[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.aq.a();
    }
}

