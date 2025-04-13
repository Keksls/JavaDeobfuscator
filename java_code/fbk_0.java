/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fbK
 */
public final class fbk_0 {
    public static final int a = 6003720;
    public static final int b = 6005892;
    public static final int c = 0x5D22D5;
    public static final int d = 10006703;
    private static final int f = 600;
    public static final int e = 20;

    public static long a(int n) {
        return (int)((double)((long)(-n) * 3600000L) / 600.0);
    }

    public static long a(long l, int n) {
        return (int)((double)l - (double)l * ((double)n / 100.0));
    }

    public static int a(int n, long l) {
        double d2 = (double)(600L * l) / 3600000.0;
        return (int)Math.round((double)n + d2);
    }
}

