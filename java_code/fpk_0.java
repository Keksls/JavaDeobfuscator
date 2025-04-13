/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fpK
 */
public class fpk_0
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected boolean f;
    protected String g;
    protected fpE h;

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

    public boolean h() {
        return this.f;
    }

    public String i() {
        return this.g;
    }

    public fpE j() {
        return this.h;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = false;
        this.g = null;
        this.h = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.f();
        this.f = asc_22.c();
        this.g = asc_22.i().intern();
        if (asc_22.b() != 0) {
            this.h = new fpE();
            this.h.a(asc_22);
        } else {
            this.h = null;
        }
    }

    @Override
    public final int a() {
        return enK.aw.a();
    }
}

