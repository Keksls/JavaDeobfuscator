/*
 * Decompiled with CFR 0.152.
 */
public class aQM
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected String d;
    protected String e;
    protected boolean f;
    protected aTT g;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public boolean h() {
        return this.f;
    }

    public aTT i() {
        return this.g;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.i().intern();
        this.e = asc_22.i().intern();
        this.f = asc_22.c();
        this.g = new aTT();
        this.g.a(asc_22);
    }

    @Override
    public final int a() {
        return enK.i.a();
    }
}

