/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aiS
 */
public class ais_0
extends aiv_0 {
    private afr_2 c = new afr_2();
    private afr_2 d = new afr_2();
    private afr_2 e = new afr_2();
    private afr_2 f = new afr_2();
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private boolean s = true;
    private long t;
    private long u;

    public ais_0(ahh_0 ahh_02) {
        super(ahh_02);
    }

    public void a(long l) {
        this.t = l;
    }

    public afr_2 a() {
        return this.c;
    }

    public void a(afr_2 afr_22) {
        this.c = afr_22;
        this.s = true;
    }

    public afr_2 b() {
        return this.d;
    }

    public void b(afr_2 afr_22) {
        this.d = afr_22;
        this.s = true;
    }

    public afr_2 c() {
        return this.e;
    }

    public void c(afr_2 afr_22) {
        this.e = afr_22;
        this.s = true;
    }

    public afr_2 d() {
        return this.f;
    }

    public void d(afr_2 afr_22) {
        this.f = afr_22;
        this.s = true;
    }

    private void i() {
        float f2 = 1.0f;
        float f3 = this.c.a();
        float f4 = this.c.b();
        float f5 = this.c.c();
        float f6 = f3 + this.d.a() * 1.0f;
        float f7 = f4 + this.d.b() * 1.0f;
        float f8 = f5 + this.d.c() * 1.0f;
        float f9 = this.e.a();
        float f10 = this.e.b();
        float f11 = this.e.c();
        float f12 = f9 - this.f.a() * 1.0f;
        float f13 = f10 - this.f.b() * 1.0f;
        float f14 = f11 - this.f.c() * 1.0f;
        this.g = f9 - 3.0f * f12 + 3.0f * f6 - f3;
        this.h = 3.0f * f12 - 6.0f * f6 + 3.0f * f3;
        this.i = 3.0f * f6 - 3.0f * f3;
        this.j = f3;
        this.k = f10 - 3.0f * f13 + 3.0f * f7 - f4;
        this.l = 3.0f * f13 - 6.0f * f7 + 3.0f * f4;
        this.m = 3.0f * f7 - 3.0f * f4;
        this.n = f4;
        this.o = f11 - 3.0f * f14 + 3.0f * f8 - f5;
        this.p = 3.0f * f14 - 6.0f * f8 + 3.0f * f5;
        this.q = 3.0f * f8 - 3.0f * f5;
        this.r = f5;
        this.s = false;
    }

    public afr_2 b(long l) {
        if (this.s) {
            this.i();
        }
        assert (l >= 0L) : "Le temps ne doit pas etre inferieur a 0";
        if (l > this.t) {
            l = this.t;
        }
        float f2 = (float)l / (float)this.t;
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        return new afr_2(this.g * f4 + this.h * f3 + this.i * f2 + this.j, this.k * f4 + this.l * f3 + this.m * f2 + this.n, this.o * f4 + this.p * f3 + this.q * f2 + this.r);
    }

    public long e() {
        return this.t;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " (duration:" + this.t + ") > from=" + this.c + ", to=" + this.e + ", initVel=" + this.d + ", finalVel=" + this.f + ".";
    }

    @Override
    public float f() {
        return this.t;
    }

    @Override
    public void a(int n) {
        this.u += (long)n;
        if (this.u > this.t) {
            this.h();
        }
        if (this.b == null) {
            return;
        }
        afr_2 afr_22 = this.b(this.u);
        this.b.b(afr_22.a(), afr_22.b(), afr_22.c());
    }
}

