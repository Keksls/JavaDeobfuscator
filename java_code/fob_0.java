/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from foB
 */
public class fob_0
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected short e;
    protected short f;
    protected byte g;
    protected long h;
    protected long i;
    protected int j;
    protected foD[] k;
    protected foc_0[] l;
    protected foe_0[] m;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public short g() {
        return this.e;
    }

    public short h() {
        return this.f;
    }

    public byte i() {
        return this.g;
    }

    public long j() {
        return this.h;
    }

    public long k() {
        return this.i;
    }

    public int l() {
        return this.j;
    }

    public foD[] m() {
        return this.k;
    }

    public foc_0[] n() {
        return this.l;
    }

    public foe_0[] o() {
        return this.m;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0L;
        this.i = 0L;
        this.j = 0;
        this.k = null;
        this.l = null;
        this.m = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.d();
        this.f = asc_22.d();
        this.g = asc_22.b();
        this.h = asc_22.h();
        this.i = asc_22.h();
        this.j = asc_22.f();
        int n3 = asc_22.f();
        this.k = new foD[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.k[n2] = new foD();
            this.k[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.l = new foc_0[n2];
        for (n = 0; n < n2; ++n) {
            this.l[n] = new foc_0();
            this.l[n].a(asc_22);
        }
        n = asc_22.f();
        this.m = new foe_0[n];
        for (int k = 0; k < n; ++k) {
            this.m[k] = new foe_0();
            this.m[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.bK.a();
    }
}

