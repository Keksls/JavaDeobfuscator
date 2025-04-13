/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fwD
 */
public class fwd_0 {
    private static final Logger c = Logger.getLogger(fwd_0.class);
    public static final int a = 20;
    private float d = Float.NaN;
    private float e = Float.NaN;
    private float f = Float.NaN;
    private float g = Float.NaN;
    private float h = Float.NaN;
    private float i = Float.NaN;
    private int j = 1000;
    private float k;

    public void a(int n) {
        this.j = n;
    }

    public void a(float f2) {
        this.k = f2;
    }

    public float a() {
        return this.d;
    }

    public float b() {
        return this.e;
    }

    public float c() {
        return this.f;
    }

    public void b(float f2) {
        if (Float.isNaN(this.g)) {
            this.d = f2;
            this.g = f2;
        } else {
            this.g = f2;
        }
        assert (!Float.isNaN(this.d));
    }

    public void c(float f2) {
        if (Float.isNaN(this.h)) {
            this.e = f2;
            this.h = f2;
        } else {
            this.h = f2;
        }
        assert (!Float.isNaN(this.e));
    }

    public void d(float f2) {
        if (Float.isNaN(this.i)) {
            this.f = f2;
            this.i = f2;
        } else {
            this.i = f2;
        }
        assert (!Float.isNaN(this.f));
    }

    public void d() {
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
    }

    public float a(ahg_0 ahg_02) {
        return ahg_02.c(this.d, this.e);
    }

    public float b(ahg_0 ahg_02) {
        return ahg_02.a(this.d, this.e, this.f);
    }

    public int c(ahg_0 ahg_02) {
        return (int)ahg_02.c(this.g, this.h);
    }

    public int d(ahg_0 ahg_02) {
        return (int)ahg_02.d(this.g, this.h);
    }

    public afd_1 a(ahg_0 ahg_02, int n, int n2) {
        float f2 = ahg_02.e(n, n2) + this.d;
        float f3 = ahg_02.f(n, n2) + this.e;
        return new afd_1(f2, f3);
    }

    public afd_1 a(ahg_0 ahg_02, int n, int n2, boolean bl) {
        float f2 = (float)n - (bl ? this.g : this.d);
        float f3 = (float)n2 - (bl ? this.h : this.e);
        float f4 = ahg_02.c(f2, f3);
        float f5 = ahg_02.d(f2, f3);
        return new afd_1(f4, f5);
    }

    public afd_1 e(ahg_0 ahg_02) {
        float f2 = this.d;
        float f3 = this.e;
        float f4 = this.f;
        this.a(true);
        float f5 = this.d - f2;
        float f6 = this.e - f3;
        float f7 = ahg_02.c(f5, f6);
        float f8 = ahg_02.a(f5, f6, this.f - f4);
        return new afd_1(f7, f8);
    }

    public afd_1 a(ahg_0 ahg_02, boolean bl) {
        this.a(bl);
        float f2 = this.a(ahg_02);
        float f3 = this.b(ahg_02);
        return new afd_1(f2, f3);
    }

    public float a(float f2, float f3, boolean bl) {
        return bl ? f3 : this.a(f2, f3);
    }

    private void a(boolean bl) {
        this.d = this.a(this.d, this.g, bl);
        this.e = this.a(this.e, this.h, bl);
        this.f = this.a(this.f, this.i, bl);
    }

    private float a(float f2, float f3) {
        assert (!Float.isNaN(f2)) : "position is NaN";
        assert (!Float.isNaN(f3)) : "BadMoFo !!!";
        if (f2 == f3) {
            return f2;
        }
        float f4 = f3 - f2;
        float f5 = Math.abs(f4);
        if (f5 > (float)this.j) {
            return f3;
        }
        if (f5 > this.k) {
            return f2 + f4 / 20.0f;
        }
        return f2;
    }

    public boolean e() {
        return !Float.isNaN(this.d) && !Float.isNaN(this.e) && !Float.isNaN(this.f) && !Float.isNaN(this.g) && !Float.isNaN(this.h) && !Float.isNaN(this.i);
    }
}

