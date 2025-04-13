/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFt
 */
public final class aft_2
extends aeg_2 {
    public aft_2() {
    }

    public aft_2(aft_2 aft_22) {
        super(aft_22);
    }

    public aft_2(float f2, float f3, float f4) {
        this.a(f2, f3, f4);
    }

    public aft_2(float f2, float f3, float f4, float f5) {
        super(f2, f3, f4, f5);
    }

    public void a(float f2, float f3, float f4) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
    }

    public float e() {
        return this.a() * this.a() + this.b() * this.b() + this.c() * this.c();
    }

    public float f() {
        return this.e() + this.d() * this.d();
    }

    public float g() {
        return (float)Math.sqrt(this.e());
    }

    public float h() {
        return (float)Math.sqrt(this.f());
    }

    public float i() {
        float f2 = this.g();
        if (f2 != 0.0f) {
            float f3 = 1.0f / f2;
            this.a *= f3;
            this.b *= f3;
            this.c *= f3;
            this.d *= f3;
        }
        return f2;
    }

    public float a(aft_2 aft_22) {
        return this.a() * aft_22.a() + this.b() * aft_22.b() + this.c() * aft_22.c();
    }

    public void a(aft_2 aft_22, aft_2 aft_23) {
        this.a(aft_22.b() * aft_23.c() - aft_22.c() * aft_23.b(), aft_22.c() * aft_23.a() - aft_22.a() * aft_23.c(), aft_22.a() * aft_23.b() - aft_22.b() * aft_23.a(), 0.0f);
    }

    public aft_2 e(float f2) {
        return new aft_2(this.a() * f2, this.b() * f2, this.c() * f2, this.d() * f2);
    }

    public aft_2 f(float f2) {
        assert (f2 != 0.0f);
        return new aft_2(this.a() / f2, this.b() / f2, this.c() / f2, this.d() / f2);
    }

    public aft_2 b(aft_2 aft_22) {
        return new aft_2(this.a() + aft_22.a(), this.b() + aft_22.b(), this.c() + aft_22.c(), this.d() + aft_22.d());
    }

    public aft_2 c(aft_2 aft_22) {
        return new aft_2(this.a() - aft_22.a(), this.b() - aft_22.b(), this.c() - aft_22.c(), this.d() - aft_22.d());
    }

    public aft_2 j() {
        return new aft_2(-this.a(), -this.b(), -this.c(), -this.d());
    }

    public void g(float f2) {
        this.a(this.a() * f2, this.b() * f2, this.c() * f2, this.d() * f2);
    }

    public void h(float f2) {
        assert (f2 != 0.0f);
        this.a(this.a() / f2, this.b() / f2, this.c() / f2, this.d() / f2);
    }

    public void d(aft_2 aft_22) {
        this.a(aft_22.a(), aft_22.b(), aft_22.c(), aft_22.d());
    }

    public void b(float f2, float f3, float f4, float f5) {
        this.a(this.a() + f2, this.b() + f3, this.c() + f4, this.d() + f5);
    }

    public void e(aft_2 aft_22) {
        this.a(this.a() - aft_22.a(), this.b() - aft_22.b(), this.c() - aft_22.c(), this.d() - aft_22.d());
    }

    public void a(float f2, aft_2 aft_22) {
        this.a(this.a() + f2 * aft_22.a(), this.b() + f2 * aft_22.b(), this.c() + f2 * aft_22.c(), this.d() + f2 * aft_22.d());
    }

    public String toString() {
        return "V4{x=" + this.a + ", y=" + this.b + ", z=" + this.c + ", w=" + this.d + "}";
    }
}

