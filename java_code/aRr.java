/*
 * Decompiled with CFR 0.152.
 */
public class aRr
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected String f;
    protected byte g;
    protected aTT h;

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

    public String h() {
        return this.f;
    }

    public byte i() {
        return this.g;
    }

    public aTT j() {
        return this.h;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = null;
        this.g = 0;
        this.h = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.f();
        this.f = asc_22.i().intern();
        this.g = asc_22.b();
        if (asc_22.b() != 0) {
            this.h = new aTT();
            this.h.a(asc_22);
        } else {
            this.h = null;
        }
    }

    @Override
    public final int a() {
        return enK.B.a();
    }
}

