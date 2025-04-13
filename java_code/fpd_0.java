/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fpd
 */
public class fpd_0
implements asu_2 {
    public static byte a;
    protected int b;
    protected int c;
    protected int d;
    protected short e;
    protected short f;
    protected boolean g;
    protected boolean h;
    protected boolean i;
    protected short j;
    protected int[] k;
    protected int[] l;
    protected byte m;
    protected fpe_0[] n;

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public short f() {
        return this.e;
    }

    public short g() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    public boolean i() {
        return this.h;
    }

    public boolean j() {
        return this.i;
    }

    public short k() {
        return this.j;
    }

    public int[] l() {
        return this.k;
    }

    public int[] m() {
        return this.l;
    }

    public byte n() {
        return this.m;
    }

    public fpe_0[] o() {
        return this.n;
    }

    @Override
    public void b() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.l = null;
        this.m = 0;
        this.n = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.d();
        this.f = asc_22.d();
        this.g = asc_22.c();
        this.h = asc_22.c();
        this.i = asc_22.c();
        this.j = asc_22.d();
        this.k = asc_22.k();
        this.l = asc_22.k();
        this.m = asc_22.b();
        int n = asc_22.f();
        this.n = new fpe_0[n];
        for (int k = 0; k < n; ++k) {
            this.n[k] = new fpe_0();
            this.n[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.ah.a();
    }
}

