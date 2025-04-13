/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aEH
 */
public class aeh_2 {
    float a = Float.MIN_VALUE;
    float b = Float.MAX_VALUE;
    float c = Float.MIN_VALUE;
    float d = Float.MAX_VALUE;
    float e = Float.MIN_VALUE;
    float f = Float.MAX_VALUE;

    public aeh_2(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7);
    }

    public aeh_2() {
    }

    public static aeh_2 a() {
        return new aeh_2();
    }

    public final void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.b(f2);
        this.a(f3);
        this.d(f4);
        this.c(f5);
        this.f(f6);
        this.e(f7);
    }

    public final float b() {
        return this.b;
    }

    public final void a(float f2) {
        if (this.a > f2) {
            this.b = this.a;
            this.a = f2;
        } else {
            this.b = f2;
        }
    }

    public final float c() {
        return this.a;
    }

    public final void b(float f2) {
        if (this.b < f2) {
            this.a = this.b;
            this.b = f2;
        } else {
            this.a = f2;
        }
    }

    public final float d() {
        return this.d;
    }

    public final void c(float f2) {
        if (this.c > f2) {
            this.d = this.c;
            this.c = f2;
        } else {
            this.d = f2;
        }
    }

    public final float e() {
        return this.c;
    }

    public final void d(float f2) {
        if (this.d < f2) {
            this.c = this.d;
            this.d = f2;
        } else {
            this.c = f2;
        }
    }

    public final float f() {
        return this.f;
    }

    public final void e(float f2) {
        if (this.e > f2) {
            this.f = this.e;
            this.e = f2;
        } else {
            this.f = f2;
        }
    }

    public final float g() {
        return this.e;
    }

    public final void f(float f2) {
        if (this.f < f2) {
            this.e = this.f;
            this.f = f2;
        } else {
            this.e = f2;
        }
    }

    public final boolean a(float f2, float f3, float f4) {
        return this.a <= f2 && f2 <= this.b && this.c <= f3 && f3 <= this.d && this.e <= f4 && f4 <= this.f;
    }

    public final boolean a(aeh_2 aeh_22) {
        if (aeh_22 == null) {
            return false;
        }
        return this.a <= aeh_22.b() && aeh_22.c() <= this.b && this.c <= aeh_22.d() && aeh_22.e() <= this.d && this.e <= aeh_22.f() && aeh_22.g() <= this.f;
    }

    public final boolean b(aeh_2 aeh_22) {
        return this.a <= aeh_22.c() && aeh_22.b() <= this.b && this.c <= aeh_22.e() && aeh_22.d() <= this.d && this.e <= aeh_22.g() && aeh_22.f() <= this.f;
    }

    public final float h() {
        return this.b - this.a;
    }

    public final float i() {
        return this.d - this.a;
    }
}

