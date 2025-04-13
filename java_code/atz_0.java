/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aTZ
 */
public class atz_0
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected byte g;
    protected boolean h;
    protected String i;
    protected int j;
    protected int k;
    protected aTT l;

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

    public int g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public byte i() {
        return this.g;
    }

    public boolean j() {
        return this.h;
    }

    public String k() {
        return this.i;
    }

    public int l() {
        return this.j;
    }

    public int m() {
        return this.k;
    }

    public aTT n() {
        return this.l;
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
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.l = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.f();
        this.f = asc_22.f();
        this.g = asc_22.b();
        this.h = asc_22.c();
        this.i = asc_22.i().intern();
        this.j = asc_22.f();
        this.k = asc_22.f();
        if (asc_22.b() != 0) {
            this.l = new aTT();
            this.l.a(asc_22);
        } else {
            this.l = null;
        }
    }

    @Override
    public final int a() {
        return enK.aw.a();
    }
}

