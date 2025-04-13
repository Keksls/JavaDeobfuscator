/*
 * Decompiled with CFR 0.152.
 */
public class aRC
implements asu_2 {
    protected int a;
    protected int b;
    protected String c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected boolean h;
    protected int[] i;
    protected int[] j;
    protected ard_0[] k;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public boolean j() {
        return this.h;
    }

    public int[] k() {
        return this.i;
    }

    public int[] l() {
        return this.j;
    }

    public ard_0[] m() {
        return this.k;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = null;
        this.j = null;
        this.k = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.i().intern();
        this.d = asc_22.f();
        this.e = asc_22.f();
        this.f = asc_22.f();
        this.g = asc_22.f();
        this.h = asc_22.c();
        this.i = asc_22.k();
        this.j = asc_22.k();
        int n = asc_22.f();
        this.k = new ard_0[n];
        for (int k = 0; k < n; ++k) {
            this.k[k] = new ard_0();
            this.k[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.bw.a();
    }
}

