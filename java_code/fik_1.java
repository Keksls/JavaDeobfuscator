/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Point;
import org.apache.log4j.Logger;

/*
 * Renamed from fIK
 */
public class fik_1 {
    private static final Logger a = Logger.getLogger(fik_1.class);
    private double b;
    private double c;
    private double d = -1.0;
    private double e = -1.0;
    private double f;
    private double g;
    private double h;
    private double i;
    private short j = (short)-1;
    private short k = (short)-1;
    private boolean l = false;
    private boolean m = false;
    private final Point n = new Point(0, 0);
    private ayo_2 o;
    private boolean p = false;

    public void a(ayo_2 ayo_22) {
        if (ayo_22 != null) {
            this.o = ayo_22;
        }
    }

    public ayo_2 a() {
        return this.o;
    }

    public double b() {
        return this.b;
    }

    public void a(double d2) {
        this.b = d2;
        this.p = true;
    }

    public double c() {
        return this.c;
    }

    public void b(double d2) {
        this.c = d2;
        this.p = true;
    }

    public short d() {
        return this.j;
    }

    public void a(short s2) {
        this.j = s2;
    }

    public short e() {
        return this.k;
    }

    public void b(short s2) {
        this.k = s2;
    }

    public int f() {
        return fik_1.a(this.j, this.k);
    }

    public static int a(short s2, short s3) {
        return (s2 << 16) + s3;
    }

    public Point g() {
        return this.n;
    }

    public boolean h() {
        return this.l;
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public boolean i() {
        return this.m;
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    public double j() {
        return this.d;
    }

    public void c(double d2) {
        this.d = d2;
        this.p = true;
    }

    public double k() {
        return this.e;
    }

    public void d(double d2) {
        this.e = d2;
        this.p = true;
    }

    public double l() {
        return this.f;
    }

    public void e(double d2) {
        this.f = d2;
        this.p = true;
    }

    public double m() {
        return this.g;
    }

    public void f(double d2) {
        this.g = d2;
        this.p = true;
    }

    public double n() {
        return this.h;
    }

    public void g(double d2) {
        this.h = d2;
        this.p = true;
    }

    public double o() {
        return this.i;
    }

    public void h(double d2) {
        this.i = d2;
        this.p = true;
    }

    public static boolean a(double d2, double d3, double d4, double d5, fik_1 fik_12, fik_1 fik_13, fik_1 fik_14, fik_1 fik_15) {
        if (fik_12.l || fik_13.l || fik_14.l || fik_15.l) {
            return true;
        }
        double d6 = fik_12.j() + fik_13.j();
        double d7 = fik_12.k() + fik_14.o();
        return d2 >= fik_12.b && d3 >= fik_12.c && d2 + d4 < fik_12.b + d6 && d3 + d5 < fik_12.c + d7;
    }

    public boolean a(double d2, double d3, double d4, double d5) {
        return d2 >= this.b && d3 >= this.c && d2 + d4 < this.b + this.d && d3 + d5 < this.c + this.e;
    }

    public boolean i(double d2) {
        return d2 >= this.b;
    }

    public boolean a(double d2, double d3) {
        return d2 + d3 < this.b + this.d;
    }

    public boolean j(double d2) {
        return d2 >= this.c;
    }

    public boolean b(double d2, double d3) {
        return d2 + d3 < this.c + this.e;
    }

    public Point b(double d2, double d3, double d4, double d5) {
        double d6 = 0.0;
        double d7 = 0.0;
        if (this.l) {
            this.f = this.b;
            this.g = this.c;
            this.h = d4;
            this.i = d5;
        } else {
            this.h = d4;
            this.i = d5;
            if (d2 < this.b) {
                d6 = this.b - d2 - d4;
            } else if (d2 >= this.d + this.b) {
                d6 = d4;
            } else if (d2 + d4 >= this.d + this.b) {
                d6 = this.d + this.b - d4 - d2;
            }
            if (d3 < this.c) {
                d7 = this.c - d3 - d5;
            } else if (d3 >= this.e + this.c) {
                d7 = d5;
            } else if (d3 + d5 >= this.e + this.c) {
                d7 = this.e + this.c - d5 - d3;
            }
            this.f = Math.max(Math.min(d2, this.b + this.d - this.h), this.b);
            this.g = Math.max(Math.min(d3, this.c + this.e - this.i), this.c);
        }
        this.n.setLocation(d6, d7);
        this.p = true;
        return this.n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void p() {
        if (this.o == null || this.o.a() == null) {
            return;
        }
        try {
            float f2 = (float)((this.f - this.b) / this.d);
            float f3 = (float)((this.g - this.c) / this.e);
            afe_1 afe_12 = this.o.a().w();
            int n = (int)((float)afe_12.a() * f2);
            int n2 = (int)((float)afe_12.b() * f3);
            float f4 = (float)(this.h / this.d);
            float f5 = (float)(this.i / this.e);
            int n3 = (int)((float)afe_12.a() * f4);
            int n4 = (int)((float)afe_12.b() * f5);
            this.o.a(n);
            this.o.b(n2);
            this.o.d(n4);
            this.o.c(n3);
            this.o.c(false);
            this.o.q();
        }
        catch (NullPointerException nullPointerException) {
            a.error((Object)"La pixmap ou sa texture interne est nulle.", (Throwable)nullPointerException);
        }
        finally {
            this.p = false;
        }
    }

    public boolean q() {
        return this.p;
    }
}

