/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQR
 */
public class aqr_0 {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected String f;
    protected aTT g;

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public aTT g() {
        return this.g;
    }

    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.f();
        this.f = asc_22.i().intern();
        if (asc_22.b() != 0) {
            this.g = new aTT();
            this.g.a(asc_22);
        } else {
            this.g = null;
        }
    }
}

