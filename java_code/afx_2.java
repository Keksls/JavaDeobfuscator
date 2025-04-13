/*
 * Decompiled with CFR 0.152.
 */
import java.awt.geom.AffineTransform;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.PathIterator;
import java.util.ArrayList;
import java.util.Comparator;

/*
 * Renamed from aFx
 */
public class afx_2
implements afw_2 {
    public static final double a = Double.POSITIVE_INFINITY;
    private static final AffineTransform b = new AffineTransform();
    private static final Comparator<afu_2> c = new afy_2();
    private final ArrayList<afu_2> d = new ArrayList();
    private final CubicCurve2D e = new CubicCurve2D.Double();
    private final double[] f = new double[6];
    private String g;
    private double h;
    private double i;
    private double j;
    private double k;
    private double l;
    private double m;

    public afx_2(String string, double d2, double d3, double d4, double d5) {
        this.g = string;
        this.a(d2, d3, d4, d5);
        this.h();
    }

    public afx_2(String string) {
        this(string, 0.0, 1.0, 0.0, 1.0);
    }

    public double a() {
        return this.l;
    }

    public double b() {
        return this.m;
    }

    public void a(double d2, double d3) {
        this.l = d2;
        this.m = d3;
    }

    public void a(String string) {
        this.g = string;
    }

    public String c() {
        return this.g;
    }

    public void a(afu_2 afu_22) {
        this.d.add(afu_22);
    }

    public void a(double d2, double d3, double d4, double d5) {
        this.h = d2;
        this.j = d3;
        this.i = d4;
        this.k = d5;
    }

    public double d() {
        return this.h;
    }

    public double e() {
        return this.i;
    }

    public double f() {
        return this.j;
    }

    public double g() {
        return this.k;
    }

    public boolean b(double d2, double d3) {
        return this.h <= d2 && d2 <= this.j && this.i <= d3 && d3 <= this.k;
    }

    void h() {
        this.d.clear();
        afu_2 afu_22 = new afu_2(this.h, this.k);
        this.d.add(afu_22);
        afu_22 = new afu_2(this.j, this.k);
        this.d.add(afu_22);
        this.i();
    }

    @Override
    public float a(float f2) {
        return (float)this.b(f2);
    }

    public double a(double d2) {
        if (d2 < this.d.get(0).a()) {
            return this.d.get(0).b();
        }
        for (int k = 1; k < this.d.size(); ++k) {
            if (!(d2 < this.d.get(k).a())) continue;
            return this.a(this.d.get(k - 1), this.d.get(k), d2);
        }
        return this.d.get(this.d.size() - 1).b();
    }

    public double b(double d2) {
        double d3 = this.a(d2);
        if (d3 < this.i) {
            return this.i;
        }
        if (d3 > this.k) {
            return this.k;
        }
        return d3;
    }

    public PathIterator a(afu_2 afu_22, afu_2 afu_23) {
        this.e.setCurve(afu_22.a(), afu_22.b(), afu_22.e(), afu_22.f(), afu_23.c(), afu_23.d(), afu_23.a(), afu_23.b());
        return this.e.getPathIterator(b, 0.01);
    }

    private double a(afu_2 afu_22, afu_2 afu_23, double d2) {
        PathIterator pathIterator = this.a(afu_22, afu_23);
        double d3 = afu_22.a();
        double d4 = afu_22.b();
        while (!pathIterator.isDone()) {
            pathIterator.currentSegment(this.f);
            pathIterator.next();
            if (d2 < this.f[0]) {
                double d5 = (d2 - d3) / (this.f[0] - d3);
                return Hw.a(d4, this.f[1], d5);
            }
            d3 = this.f[0];
            d4 = this.f[1];
        }
        double d6 = (d2 - d3) / (afu_23.a() - d3);
        return Hw.a(d4, afu_23.b(), d6);
    }

    public boolean b(afu_2 afu_22) {
        if (this.d.size() == 2) {
            return false;
        }
        for (int k = this.d.size() - 1; k >= 0; --k) {
            if (this.d.get(k) != afu_22) continue;
            if (k == this.d.size() - 1) {
                this.d.get(k - 1).c(1.0);
            }
            if (k == 0) {
                this.d.get(1).c(0.0);
            }
            this.d.remove(k);
            break;
        }
        return true;
    }

    public int c(afu_2 afu_22) {
        for (int k = 0; k < this.d.size(); ++k) {
            if (this.d.get(k) != afu_22) continue;
            return k;
        }
        return -1;
    }

    public void i() {
        this.d.sort(c);
    }

    public afu_2 a(int n) {
        return this.d.get(n);
    }

    public int j() {
        return this.d.size();
    }

    public void k() {
        this.d.clear();
    }

    public afx_2 l() {
        afx_2 afx_22 = new afx_2("");
        afx_22.a(this);
        return afx_22;
    }

    public void a(afx_2 afx_22) {
        this.g = afx_22.g;
        this.k();
        this.h = afx_22.h;
        this.j = afx_22.j;
        this.i = afx_22.i;
        this.k = afx_22.k;
        for (int k = 0; k < afx_22.j(); ++k) {
            this.a(afx_22.a(k).k());
        }
    }

    public void a(float f2, float f3) {
        if ((double)f2 == this.h && (double)f3 == this.j) {
            return;
        }
        double d2 = (double)(f3 - f2) / (this.j - this.h);
        double d3 = (double)f2 - this.h * d2;
        for (int k = 0; k < this.j(); ++k) {
            afu_2 afu_22 = this.a(k);
            afu_22.a(afu_22.a() * d2 + d3, afu_22.b());
            if (afu_22.h()) {
                afu_22.b(afu_22.c() * d2 + d3, afu_22.d());
            }
            if (!afu_22.i()) continue;
            afu_22.c(afu_22.e() * d2 + d3, afu_22.f());
        }
        this.h = f2;
        this.j = f3;
    }

    public void b(afx_2 afx_22) {
        if (afx_22 == this) {
            return;
        }
        this.k();
        double d2 = this.k == Double.POSITIVE_INFINITY ? 1.0 : this.k;
        double d3 = this.i == Double.POSITIVE_INFINITY ? 1.0 : this.i;
        double d4 = afx_22.j - afx_22.h;
        double d5 = (this.j - this.h) / d4;
        double d6 = afx_22.k - afx_22.i;
        double d7 = (d2 - this.i) / d6;
        double d8 = this.h - afx_22.h * d5;
        double d9 = this.i - afx_22.i * d7;
        for (int k = 0; k < afx_22.j(); ++k) {
            afu_2 afu_22 = afx_22.a(k).k();
            afu_22.a(afu_22.a() * d5 + d8, afu_22.b() * d7 + d9);
            if (afu_22.h()) {
                afu_22.b(afu_22.c() * d5 + d8, afu_22.d() * d7 + d9);
            }
            if (afu_22.i()) {
                afu_22.c(afu_22.e() * d5 + d8, afu_22.f() * d7 + d9);
            }
            this.a(afu_22);
        }
    }

    public boolean c(afx_2 afx_22) {
        if (afx_22.j() != this.j()) {
            return false;
        }
        if (this.h != afx_22.h || this.j != afx_22.j) {
            return false;
        }
        if (this.i != afx_22.i || this.k != afx_22.k) {
            return false;
        }
        for (int k = 0; k < this.j(); ++k) {
            if (this.a(k).a(afx_22.a(k))) continue;
            return false;
        }
        return true;
    }

    public boolean m() {
        for (int k = 0; k < this.d.size() - 1; ++k) {
            afu_2 afu_22 = this.d.get(k);
            double d2 = afu_22.b();
            if (d2 != this.d.get(k + 1).b()) {
                return false;
            }
            if (afu_22.h() && afu_22.d() != d2) {
                return false;
            }
            if (!afu_22.i() || afu_22.f() == d2) continue;
            return false;
        }
        return true;
    }

    public boolean n() {
        for (int k = 0; k < this.d.size(); ++k) {
            afu_2 afu_22 = this.d.get(k);
            if (afu_22.a() != afu_22.b()) {
                return false;
            }
            if (afu_22.h()) {
                return false;
            }
            if (!afu_22.i()) continue;
            return false;
        }
        return true;
    }

    public double[] o() {
        double[] dArray = new double[]{Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
        for (int k = 0; k < this.d.size() - 1; ++k) {
            afu_2 afu_22 = this.d.get(k);
            afu_2 afu_23 = this.d.get(k + 1);
            PathIterator pathIterator = this.a(afu_22, afu_23);
            while (!pathIterator.isDone()) {
                pathIterator.currentSegment(this.f);
                pathIterator.next();
                if (this.f[1] < dArray[0]) {
                    dArray[0] = this.f[1];
                }
                if (!(this.f[1] > dArray[1])) continue;
                dArray[1] = this.f[1];
            }
        }
        return dArray;
    }

    public String toString() {
        return afz_2.a(this);
    }

    public /* synthetic */ Object clone() {
        return this.l();
    }
}

