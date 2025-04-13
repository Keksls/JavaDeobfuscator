/*
 * Decompiled with CFR 0.152.
 */
public class XY {
    private static final int r = 18;
    private static final int s = 10;
    public static final int a = 18;
    public static final int b = 18;
    public static final int c = 324;
    public static final int d = 64;
    public static final int e = 131071;
    public static final int f = 131071;
    public static final int g = 511;
    public static final int h = -131072;
    public static final int i = -131072;
    public static final int j = -512;
    public static final int k = 7281;
    public static final int l = 7281;
    public static final int m = 511;
    public static final int n = -7281;
    public static final int o = -7281;
    public static final int p = -512;
    public static final int q = 4;

    public static int a(int n) {
        return Hw.c((float)n / 18.0f);
    }

    public static int b(int n) {
        return Hw.c((float)n / 18.0f);
    }

    public static afk_2 a(int n, int n2, int n3, int n4) {
        int n5 = XY.a(n);
        int n6 = XY.b(n2);
        int n7 = XY.a(n + n3) + 1;
        int n8 = XY.b(n2 + n4) + 1;
        return new afk_2(n5, n7, n6, n8);
    }
}

