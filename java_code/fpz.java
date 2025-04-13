/*
 * Decompiled with CFR 0.152.
 */
public class fpz
implements asu_2 {
    protected int a;
    protected int b;
    protected float c;
    protected int d;
    protected boolean e;
    protected int f;
    protected boolean g;
    protected int h;
    protected int i;
    protected boolean j;
    protected int k;
    protected fmf_0 l;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public float e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public boolean i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public int k() {
        return this.i;
    }

    public boolean l() {
        return this.j;
    }

    public int m() {
        return this.k;
    }

    public fmf_0 n() {
        return this.l;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0.0f;
        this.d = 0;
        this.e = false;
        this.f = 0;
        this.g = false;
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.k = 0;
        this.l = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.e();
        this.d = asc_22.f();
        this.e = asc_22.c();
        this.f = asc_22.f();
        this.g = asc_22.c();
        this.h = asc_22.f();
        this.i = asc_22.f();
        this.j = asc_22.c();
        this.k = asc_22.f();
        if (asc_22.b() != 0) {
            this.l = new fmf_0();
            this.l.a(asc_22);
        } else {
            this.l = null;
        }
    }

    @Override
    public final int a() {
        return enK.ar.a();
    }
}

