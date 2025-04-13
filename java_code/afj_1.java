/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFj
 */
public final class afj_1
extends aeg_2 {
    public afj_1() {
    }

    public afj_1(afj_1 afj_12) {
        super(afj_12);
    }

    public afj_1(float f2, float f3, float f4, float f5) {
        super(f2, f3, f4, f5);
    }

    public afj_1(afr_2 afr_22, float f2) {
        this.a(afr_22, f2);
    }

    public float e() {
        return (float)Math.sqrt(this.a() * this.a() + this.b() * this.b() + this.c() * this.c() + this.d() * this.d());
    }

    public void f() {
        assert (this.e() > 0.0f) : "Unable to normalize the quaternion since the norme is null";
        float f2 = this.e();
        this.a /= f2;
        this.b /= f2;
        this.c /= f2;
        this.d /= f2;
    }

    public void g() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public void a(afr_2 afr_22, float f2) {
        float f3 = f2 * 0.5f;
        float f4 = Hw.f(f3);
        this.a(afr_22.a() * f4, afr_22.b() * f4, afr_22.c() * f4, Hw.g(f3));
        this.f();
    }

    public void a(float f2, float f3, float f4) {
        afj_1 afj_12 = new afj_1(new afr_2(Hw.f(f2 * 0.5f), 0.0f, 0.0f), Hw.g(f2 * 0.5f));
        afj_1 afj_13 = new afj_1(new afr_2(0.0f, Hw.f(f3 * 0.5f), 0.0f), Hw.g(f3 * 0.5f));
        afj_1 afj_14 = new afj_1(new afr_2(0.0f, 0.0f, Hw.f(f4 * 0.5f)), Hw.g(f4 * 0.5f));
        this.a((aeg_2)afj_12.a(afj_13).a(afj_14));
    }

    public afj_1 h() {
        return new afj_1(-this.a(), -this.b(), -this.c(), this.d());
    }

    public afj_1 i() {
        afj_1 afj_12 = this.h();
        float f2 = afj_12.a() * afj_12.a() + afj_12.b() * afj_12.b() + afj_12.c() * afj_12.c() + afj_12.d() * afj_12.d();
        afj_12.a /= f2;
        afj_12.b /= f2;
        afj_12.c /= f2;
        afj_12.d /= f2;
        return afj_12;
    }

    public afj_1 a(afj_1 afj_12) {
        return new afj_1(this.d() * afj_12.a() + this.a() * afj_12.d() + this.b() * afj_12.c() - this.c() * afj_12.b(), this.d() * afj_12.b() + this.b() * afj_12.d() + this.c() * afj_12.a() - this.a() * afj_12.c(), this.d() * afj_12.c() + this.c() * afj_12.d() + this.a() * afj_12.b() - this.b() * afj_12.a(), this.d() * afj_12.d() - this.a() * afj_12.a() - this.b() * afj_12.b() - this.c() * afj_12.c());
    }

    public afj_1 b(afj_1 afj_12) {
        return this.a(afj_12.i());
    }

    public void c(afj_1 afj_12) {
        this.a((aeg_2)this.a(afj_12));
    }

    public void d(afj_1 afj_12) {
        this.a((aeg_2)this.b(afj_12));
    }

    public void a(afj_1 afj_12, afj_1 afj_13, float f2) {
        float f3 = afj_12.a() * afj_13.a() + afj_12.b() * afj_13.b() + afj_12.c() * afj_13.c() + afj_12.d() * afj_13.d();
        if (1.0f + f3 > 1.0E-5f) {
            float f4;
            float f5;
            if (1.0f - f3 > 1.0E-5f) {
                float f6 = Hw.j(f3);
                float f7 = Hw.f(f6);
                f5 = Hw.f((1.0f - f2) * f6) / f7;
                f4 = Hw.f(f2 * f6) / f7;
            } else {
                f5 = 1.0f - f2;
                f4 = f2;
            }
            this.a(f5 * afj_12.a() + f4 * afj_13.a(), f5 * afj_12.b() + f4 * afj_13.b(), f5 * afj_12.c() + f4 * afj_13.c(), f5 * afj_12.d() + f4 * afj_13.d());
        } else {
            float f8 = Hw.f((1.0f - f2) * 1.5707964f);
            float f9 = Hw.f(f2 * 1.5707964f);
            this.a(f8 * afj_12.a() - f9 * afj_13.b(), f8 * afj_12.b() + f9 * afj_13.a(), f8 * afj_12.c() - f9 * afj_13.d(), f8 * afj_12.d() + f9 * afj_13.c());
        }
    }
}

