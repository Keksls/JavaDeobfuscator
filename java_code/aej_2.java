/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aEJ
 */
public final class aej_2
extends Enum<aej_2> {
    public static final /* enum */ aej_2 a = new aej_2(0, 1, -1);
    public static final /* enum */ aej_2 b = new aej_2(1, 1, 0);
    public static final /* enum */ aej_2 c = new aej_2(2, 1, 1);
    public static final /* enum */ aej_2 d = new aej_2(3, 0, 1);
    public static final /* enum */ aej_2 e = new aej_2(4, -1, 1);
    public static final /* enum */ aej_2 f = new aej_2(5, -1, 0);
    public static final /* enum */ aej_2 g = new aej_2(6, -1, -1);
    public static final /* enum */ aej_2 h = new aej_2(7, 0, -1);
    public static final /* enum */ aej_2 i = new aej_2(8, 0, 0);
    public static final /* enum */ aej_2 j = new aej_2(9, 0, 0);
    public static final /* enum */ aej_2 k = new aej_2(-1, 0, 0);
    private static final aej_2[] p;
    private static final aej_2[] q;
    private static final aej_2[] r;
    private static final aej_2[] s;
    public final int l;
    public final int m;
    public final int n;
    private static final /* synthetic */ aej_2[] t;

    public static aej_2[] values() {
        return (aej_2[])t.clone();
    }

    public static aej_2 valueOf(String string) {
        return Enum.valueOf(aej_2.class, string);
    }

    private aej_2(int n2, int n3, int n4) {
        this.l = n2;
        this.m = n3;
        this.n = n4;
    }

    public int a() {
        return this.l;
    }

    public aej_2 b() {
        switch (this) {
            case a: {
                return e;
            }
            case h: {
                return d;
            }
            case g: {
                return c;
            }
            case f: {
                return b;
            }
            case e: {
                return a;
            }
            case d: {
                return h;
            }
            case c: {
                return g;
            }
            case b: {
                return f;
            }
        }
        return k;
    }

    public static aej_2 a(int n) {
        for (int k = 0; k < s.length; ++k) {
            aej_2 aej_22 = s[k];
            if (aej_22.l != n) continue;
            return aej_22;
        }
        return k;
    }

    @Nullable
    public static aej_2 a(int n, int n2) {
        assert (-1 <= n && n <= 1);
        assert (-1 <= n2 && n2 <= 1);
        if (n == 0 && n2 == 0) {
            return null;
        }
        for (int k = 0; k < p.length; ++k) {
            aej_2 aej_22 = p[k];
            if (aej_22.m != n || aej_22.n != n2) continue;
            return aej_22;
        }
        return null;
    }

    @NotNull
    public static aej_2 a(aff_1 aff_12, aff_1 aff_13) {
        int n = aff_13.d() - aff_12.d();
        int n2 = aff_13.e() - aff_12.e();
        if (n > 0 && n >= Math.abs(n2) && n != -n2) {
            return b;
        }
        if (n < 0 && -n >= Math.abs(n2) && n != -n2) {
            return f;
        }
        if (n2 > 0) {
            return d;
        }
        if (n2 < 0) {
            return h;
        }
        return k;
    }

    public boolean c() {
        return this.m == 0 || this.n == 0;
    }

    public static aej_2[] d() {
        return p;
    }

    public static aej_2[] e() {
        return q;
    }

    public static aej_2[] f() {
        return r;
    }

    public aej_2 g() {
        switch (this) {
            case a: {
                return e;
            }
            case b: {
                return f;
            }
            case c: {
                return g;
            }
            case d: {
                return h;
            }
            case e: {
                return a;
            }
            case f: {
                return b;
            }
            case g: {
                return c;
            }
            case h: {
                return d;
            }
            case i: {
                return j;
            }
            case j: {
                return i;
            }
        }
        return k;
    }

    public aej_2 b(int n) {
        int n2 = this.l;
        n2 += n;
        if ((n2 %= p.length) < 0) {
            n2 += p.length;
        }
        return aej_2.a(n2);
    }

    public static aej_2 h() {
        aej_2[] aej_2Array = aej_2.values();
        return aej_2Array[Hw.a(aej_2Array.length)];
    }

    public static aej_2 i() {
        return q[Hw.a(q.length)];
    }

    public aej_2 c(int n) {
        int n2 = this.l;
        if (n2 % 2 == 0) {
            --n2;
        }
        n2 += 2 * n;
        if ((n2 %= p.length) < 0) {
            n2 += p.length;
        }
        return aej_2.a(n2);
    }

    public String toString() {
        return this.name();
    }

    static {
        t = new aej_2[]{a, b, c, d, e, f, g, h, i, j, k};
        p = new aej_2[]{b, d, f, h, a, e, g, c};
        q = new aej_2[]{b, d, f, h};
        r = new aej_2[]{a, e, g, c};
        s = aej_2.values();
    }
}

