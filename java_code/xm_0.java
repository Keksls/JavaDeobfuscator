/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from XM
 */
public class xm_0
extends amm_2 {
    private static final Logger a = Logger.getLogger(xm_0.class);

    public xm_0(int n, int n2) {
        super(n, n2);
    }

    @Override
    public final int a() {
        return this.d() * this.c();
    }

    @Override
    public final int a(int n, int n2) {
        if (n < 0 || n >= this.d() || n2 < 0 || n2 >= this.c()) {
            return -1;
        }
        return n + n2 * this.d();
    }

    @Override
    public int a(int n) {
        return n % this.d();
    }

    @Override
    public int b(int n) {
        return n / this.d();
    }

    @Override
    public final amj_2 b(int n, int n2) {
        int n3 = Hw.c((float)n / (float)this.d());
        int n4 = Hw.c((float)n2 / (float)this.c());
        return new amj_2(n3, n4);
    }

    @Override
    public int c(int n, int n2) {
        return Hw.c((float)n / (float)this.d());
    }

    @Override
    public int d(int n, int n2) {
        return Hw.c((float)n2 / (float)this.c());
    }

    @Override
    public final amj_2 e(int n, int n2) {
        return new amj_2(n * this.d(), n2 * this.c());
    }

    @Override
    public int f(int n, int n2) {
        return n * this.d();
    }

    @Override
    public int g(int n, int n2) {
        return n2 * this.c();
    }

    @Override
    public byte b() {
        return 105;
    }
}

