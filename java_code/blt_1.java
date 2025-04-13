/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from blT
 */
public abstract class blt_1 {
    private static final Logger a = Logger.getLogger(blt_1.class);
    private final ArrayList<bnp_1> b = new ArrayList(2);
    private long c;
    private final double d;
    private int e;
    private long f;
    private int g;
    private int h;

    protected blt_1(double d2) {
        this.d = d2;
    }

    public void a(long l) {
        this.c = l;
        this.f = System.currentTimeMillis();
        this.g = this.a();
        this.h = 0;
    }

    public void a(int n, int n2) {
        this.b(n);
        this.e = n2;
        this.f = System.currentTimeMillis();
        this.g = n;
        this.h = 0;
    }

    public void a(bnp_1 bnp_12) {
        if (!this.b.contains(bnp_12)) {
            this.b.add(bnp_12);
        }
    }

    public void b(bnp_1 bnp_12) {
        this.b.remove(bnp_12);
    }

    public void a(int n) {
        this.e = n;
    }

    public void b(long l) {
        double d2 = l - this.f;
        int n = (int)Math.round((double)this.e * d2 / this.d);
        if (n > this.h) {
            int n2 = n - this.h;
            this.c(n2);
            this.h = n;
        }
    }

    protected abstract void b(int var1);

    protected void c(int n) {
        for (int k = this.b.size() - 1; k >= 0; --k) {
            this.b.get(k).a(this.c, n);
        }
    }

    protected abstract int a();
}

