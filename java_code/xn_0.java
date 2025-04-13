/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from XN
 */
public class xn_0
extends amm_2 {
    private static final Logger c = Logger.getLogger(xm_0.class);

    public xn_0(int n, int n2) {
        super(n, n2);
    }

    @Override
    public final int a() {
        return this.d() * this.c() * 2;
    }

    @Override
    public final amj_2 b(int n, int n2) {
        int n3 = (int)Math.floor((double)(n - n2) / (2.0 * (double)this.d()));
        int n4 = (int)Math.floor((double)(n + n2) / (2.0 * (double)this.c()));
        return new amj_2(n3, n4);
    }

    @Override
    public int c(int n, int n2) {
        return (int)Math.floor((double)(n - n2) / (2.0 * (double)this.d()));
    }

    @Override
    public int d(int n, int n2) {
        return (int)Math.floor((double)(n + n2) / (2.0 * (double)this.c()));
    }

    @Override
    public final amj_2 e(int n, int n2) {
        int n3 = n2 * this.c() - n * this.d();
        int n4 = 2 * n * this.d() + n3;
        return new amj_2(n4, n3);
    }

    @Override
    public final int f(int n, int n2) {
        return 2 * n * this.d() + this.g(n, n2);
    }

    @Override
    public final int g(int n, int n2) {
        return n2 * this.c() - n * this.d();
    }

    @Override
    public final int a(int n, int n2) {
        int n3 = n + n2;
        int n4 = (n3 + 1) / 2;
        int n5 = n3 * this.d() + (n - n4);
        assert (n5 < this.a()) : "x et y doivent \u00eatre les coordon\u00e9es d'une cellule dans la map et pas dans le monde";
        return n5;
    }

    @Override
    public int a(int n) {
        assert (n < this.a() && n >= 0) : "tentative de r\u00e9cup\u00e9ration de cellule avec un indice incorrect";
        int n2 = n / this.d();
        int n3 = (n2 + 1) / 2;
        int n4 = n - n2 * this.d();
        return n3 + n4;
    }

    @Override
    public int b(int n) {
        assert (n < this.a() && n >= 0) : "tentative de r\u00e9cup\u00e9ration de cellule avec un indice incorrect";
        int n2 = n / this.d();
        int n3 = (n2 + 1) / 2;
        int n4 = n2 - n3;
        int n5 = n - n2 * this.d();
        return n4 - n5;
    }

    @Override
    public byte b() {
        return 111;
    }

    public static void a(String[] stringArray) {
        xn_0 xn_02 = new xn_0(3, 4);
        System.out.println("" + xn_02.c(6));
        System.out.println("" + xn_02.a(new amj_2(4, 2)));
    }
}

