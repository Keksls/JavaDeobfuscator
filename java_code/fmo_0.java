/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fmo
 */
public class fmo_0
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected fmf_0 d;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public fmf_0 f() {
        return this.d;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        if (asc_22.b() != 0) {
            this.d = new fmf_0();
            this.d.a(asc_22);
        } else {
            this.d = null;
        }
    }

    @Override
    public final int a() {
        return enK.g.a();
    }
}

