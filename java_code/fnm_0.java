/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fnM
 */
public class fnm_0
implements asu_2 {
    protected int a;
    protected short b;
    protected short c;
    protected int d;
    protected int e;
    protected short f;
    protected short g;
    protected boolean h;
    protected boolean i;
    protected boolean j;
    protected boolean k;
    protected byte l;
    protected short m;
    protected String n;
    protected int o;
    protected int[] p;
    protected fnn_0[] q;

    public int c() {
        return this.a;
    }

    public short d() {
        return this.b;
    }

    public short e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public short h() {
        return this.f;
    }

    public short i() {
        return this.g;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.i;
    }

    public boolean l() {
        return this.j;
    }

    public boolean m() {
        return this.k;
    }

    public byte n() {
        return this.l;
    }

    public short o() {
        return this.m;
    }

    public String p() {
        return this.n;
    }

    public int q() {
        return this.o;
    }

    public int[] r() {
        return this.p;
    }

    public fnn_0[] s() {
        return this.q;
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
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.n = null;
        this.o = 0;
        this.p = null;
        this.q = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.d();
        this.c = asc_22.d();
        this.d = asc_22.f();
        this.e = asc_22.f();
        this.f = asc_22.d();
        this.g = asc_22.d();
        this.h = asc_22.c();
        this.i = asc_22.c();
        this.j = asc_22.c();
        this.k = asc_22.c();
        this.l = asc_22.b();
        this.m = asc_22.d();
        this.n = asc_22.i().intern();
        this.o = asc_22.f();
        this.p = asc_22.k();
        int n = asc_22.f();
        this.q = new fnn_0[n];
        for (int k = 0; k < n; ++k) {
            this.q[k] = new fnn_0();
            this.q[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.bu.a();
    }
}

