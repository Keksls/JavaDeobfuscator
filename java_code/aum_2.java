/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aum
 */
public class aum_2 {
    protected static final Logger a = Logger.getLogger(aum_2.class);
    private int b;
    private double c;
    private double d;
    private double e;
    private double f;

    public int a() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public double b() {
        return this.c;
    }

    public void a(double d2) {
        this.c = d2;
    }

    public double c() {
        return this.d;
    }

    public void b(double d2) {
        this.d = d2;
    }

    public double d() {
        return this.e;
    }

    public void c(double d2) {
        this.e = d2;
    }

    public double e() {
        return this.f;
    }

    public void d(double d2) {
        this.f = d2;
    }

    public void f() {
        a.info((Object)"Benchmark result :");
        a.info((Object)("\t* best texture format : " + (this.b == 6408 ? "RGBA" : "BGRA")));
        a.info((Object)("\t* rgba bandwidth index : " + this.c));
        a.info((Object)("\t* bgra bandwidth index : " + this.d));
        a.info((Object)("\t* pixel fillrate index : " + this.e));
        a.info((Object)("\t* texture fillrate index : " + this.f));
    }
}

