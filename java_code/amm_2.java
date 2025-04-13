/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aMM
 */
public abstract class amm_2 {
    private static final Logger a = Logger.getLogger(amm_2.class);
    private final int c;
    private final int d;

    protected amm_2(int n, int n2) {
        assert (n > 0 && n2 > 0);
        this.c = n;
        this.d = n2;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }

    public abstract int a();

    public abstract byte b();

    public final int a(amj_2 amj_22) {
        return this.a(amj_22.a(), amj_22.b());
    }

    public abstract int a(int var1, int var2);

    public final amj_2 c(int n) {
        return new amj_2(this.a(n), this.b(n));
    }

    public abstract int a(int var1);

    public abstract int b(int var1);

    public final amj_2 b(amj_2 amj_22) {
        return this.b(amj_22.a(), amj_22.b());
    }

    public amj_2 b(int n, int n2) {
        int n3 = this.c(n, n2);
        int n4 = this.d(n, n2);
        return new amj_2(n3, n4);
    }

    public abstract int c(int var1, int var2);

    public abstract int d(int var1, int var2);

    public final amj_2 c(amj_2 amj_22) {
        return this.e(amj_22.a(), amj_22.b());
    }

    public abstract amj_2 e(int var1, int var2);

    public abstract int f(int var1, int var2);

    public abstract int g(int var1, int var2);

    public final amj_2 a(int n, int n2, int n3) {
        return new amj_2(this.b(n, n2, n3), this.c(n, n2, n3));
    }

    public final int b(int n, int n2, int n3) {
        return this.f(n, n2) + this.a(n3);
    }

    public int c(int n, int n2, int n3) {
        return this.g(n, n2) + this.b(n3);
    }

    public static long d(int n, int n2, int n3) {
        int n4 = 0x100000;
        int n5 = 0x100000;
        assert (Math.abs(n2) <= 0x100000 || Math.abs(n3) <= 0x100000 || n <= 0x100000 || n >= 0) : "L'id de la map (" + n2 + "," + n3 + ") - monde " + n + " n'est pas bon.";
        long l = n & 0xFFFFF;
        long l2 = Math.abs(n2) & 0xFFFFF;
        if (Integer.signum(n2) == -1) {
            l2 |= 0x100000L;
        }
        long l3 = Math.abs(n3) & 0xFFFFF;
        if (Integer.signum(n3) == -1) {
            l3 |= 0x100000L;
        }
        return l << 42 | l2 << 21 | l3;
    }

    public static int[] a(long l) {
        int[] nArray = new int[]{amm_2.b(l), amm_2.c(l), amm_2.d(l)};
        return nArray;
    }

    public static int b(long l) {
        return (int)(l >>> 42 & 0xFFFFFL);
    }

    public static int c(long l) {
        long l2 = l >>> 21 & 0x1FFFFFL;
        if ((l2 & 0x100000L) == 0x100000L) {
            l2 = -(l2 & 0xFFFFFL);
        }
        return (int)l2;
    }

    public static int d(long l) {
        long l2 = l & 0x1FFFFFL;
        if ((l2 & 0x100000L) == 0x100000L) {
            l2 = -(l2 & 0xFFFFFL);
        }
        return (int)l2;
    }
}

