/*
 * Decompiled with CFR 0.152.
 */
public class fmZ
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected String e;
    protected fpE f;

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

    public String g() {
        return this.e;
    }

    public fpE h() {
        return this.f;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.i().intern();
        if (asc_22.b() != 0) {
            this.f = new fpE();
            this.f.a(asc_22);
        } else {
            this.f = null;
        }
    }

    @Override
    public final int a() {
        return enK.B.a();
    }
}

