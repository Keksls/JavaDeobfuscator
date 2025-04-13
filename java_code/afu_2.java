/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFu
 */
public class afu_2 {
    private static double a = 4.0;
    private static double b = 4.0;
    private final afv_2 c = new afv_2(0.0, 0.0);
    private afv_2 d;
    private afv_2 e;

    public afu_2() {
    }

    public afu_2(double d2, double d3) {
        this.c.a = d2;
        this.c.b = d3;
    }

    public static void a(double d2) {
        a = d2;
    }

    public static void b(double d2) {
        b = d2;
    }

    public void c(double d2) {
        this.c.a = d2;
    }

    public void d(double d2) {
        this.c.b = d2;
    }

    public afu_2 a(double d2, double d3) {
        this.c.a = d2;
        this.c.b = d3;
        return this;
    }

    public double a() {
        return this.c.a;
    }

    public double b() {
        return this.c.b;
    }

    public double c() {
        return this.d == null ? this.c.a : this.d.a;
    }

    public double d() {
        return this.d == null ? this.c.b : this.d.b;
    }

    public double e() {
        return this.e == null ? this.c.a : this.e.a;
    }

    public double f() {
        return this.e == null ? this.c.b : this.e.b;
    }

    public void g() {
        this.d = null;
    }

    public afu_2 b(double d2, double d3) {
        this.d = Math.abs(this.a() - d2) < a && Math.abs(this.b() - d3) < b ? null : new afv_2(d2, d3);
        return this;
    }

    public boolean h() {
        return this.d != null;
    }

    public boolean i() {
        return this.e != null;
    }

    public void j() {
        this.e = null;
    }

    public afu_2 c(double d2, double d3) {
        this.e = Math.abs(this.a() - d2) < a && Math.abs(this.b() - d3) < b ? null : new afv_2(d2, d3);
        return this;
    }

    public void d(double d2, double d3) {
        if (this.h()) {
            this.d.a += d2;
            this.d.b += d3;
        }
    }

    public void e(double d2, double d3) {
        if (this.i()) {
            this.e.a += d2;
            this.e.b += d3;
        }
    }

    public afu_2 k() {
        afu_2 afu_22 = new afu_2(this.a(), this.b());
        if (this.h()) {
            afu_22.b(this.c(), this.d());
        }
        if (this.i()) {
            afu_22.c(this.e(), this.f());
        }
        return afu_22;
    }

    public boolean a(afu_2 afu_22) {
        if (this.a() != afu_22.a() || this.b() != afu_22.b()) {
            return false;
        }
        if (this.c() != afu_22.c() || this.d() != afu_22.d()) {
            return false;
        }
        return this.e() == afu_22.e() && this.f() == afu_22.f();
    }

    public /* synthetic */ Object clone() {
        return this.k();
    }
}

