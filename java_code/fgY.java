/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum fgY implements Vi
{
    a(0, 0, -1),
    b(1, 2000, -1),
    c(2, 4000, -1),
    d(3, 6000, -1),
    e(4, 8000, -1),
    f(5, 10000, -1),
    g(6, 12000, -1),
    h(7, 14000, 42),
    i(8, 16000, 7),
    j(9, 18000, 1);

    private final byte k;
    private final int l;
    private final int m;
    private int n;
    private static final fgY[] o;

    private fgY(int n2, int n3, int n4) {
        this.k = Hw.b((long)n2);
        this.l = n3;
        this.m = n4;
    }

    public byte c() {
        return this.k;
    }

    @NotNull
    public static fgY a(int n, int n2) {
        fgY fgY2;
        if (fgY2.m <= 0) {
            return fgY2;
        }
        for (fgY2 = fgY.a(n); fgY2 != null && fgY2.n > 0 && fgY2.n < n2 + 1; fgY2 = fgY2.d()) {
        }
        return fgY2 != null ? fgY2 : a;
    }

    @NotNull
    private static fgY a(int n) {
        int n2 = 0;
        int n3 = o.length - 1;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            fgY fgY2 = fgY.b(n4);
            fgY fgY3 = fgY.b(n4 + 1);
            if (fgY3 != null && fgY3.l <= n) {
                n2 = n4 + 1;
                continue;
            }
            if (fgY2 != null && fgY2.l > n) {
                n3 = n4 - 1;
                continue;
            }
            return fgY2 != null ? fgY2 : a;
        }
        return a;
    }

    @Nullable
    private static fgY b(int n) {
        if (n < 0 || n >= o.length) {
            return null;
        }
        return o[n];
    }

    @Nullable
    public static fgY a(byte by) {
        for (fgY fgY2 : fgY.values()) {
            if (by != fgY2.k) continue;
            return fgY2;
        }
        return null;
    }

    @Override
    public int a() {
        return this.l;
    }

    @Override
    public int b() {
        return this.m;
    }

    @Nullable
    private fgY d() {
        return fgY.b(this.ordinal() - 1);
    }

    public boolean a(fgY fgY2) {
        return this.l < fgY2.l;
    }

    public boolean b(fgY fgY2) {
        return this.l > fgY2.l;
    }

    public static void a(String ... stringArray) {
        fgY.b(-1, -1);
        fgY.b(-1, 15);
        fgY.b(15, -1);
        fgY.b(5999, 454);
        fgY.b(6000, 54542);
        fgY.b(6001, 54543);
        fgY.b(15500, 43);
        fgY.b(1550, 43);
        fgY.b(15500, 1);
        fgY.b(22554, 48);
    }

    private static void b(int n, int n2) {
        System.out.println("Score:" + n + ", Ranking:" + n2 + " => " + fgY.a(n, n2));
    }

    static {
        o = fgY.values();
        int n = 0;
        for (int k = o.length - 1; k >= 0; --k) {
            fgY fgY2 = o[k];
            if (fgY2.m < 0) continue;
            fgY2.n = fgY2.m + n;
            n += fgY2.m;
        }
    }
}

