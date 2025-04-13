/*
 * Decompiled with CFR 0.152.
 */
public class fmC
implements asu_2 {
    protected int a;
    protected fmd_0[] b;
    protected byte c;

    public int c() {
        return this.a;
    }

    public fmd_0[] d() {
        return this.b;
    }

    public byte e() {
        return this.c;
    }

    public eof_0 f() {
        return eof_0.a(this.c);
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = null;
        this.c = 0;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        int n = asc_22.f();
        this.b = new fmd_0[n];
        for (int k = 0; k < n; ++k) {
            this.b[k] = new fmd_0();
            this.b[k].a(asc_22);
        }
        this.c = asc_22.b();
    }

    @Override
    public final int a() {
        return enK.aA.a();
    }
}

