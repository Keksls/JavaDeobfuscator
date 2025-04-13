/*
 * Decompiled with CFR 0.152.
 */
public class XZ {
    public static final int a = 18;
    public static final int b = 18;
    private static final double c = 0.5;

    private XZ() {
    }

    public static int a(int n) {
        return XY.a(n);
    }

    public static int b(int n) {
        return XY.b(n);
    }

    public static int c(int n) {
        return (int)(((double)n + 0.5) * 18.0);
    }

    public static int d(int n) {
        return (int)(((double)n + 0.5) * 18.0);
    }

    public static boolean a(int n, int n2) {
        boolean bl = n % 18 == 0 || n % 18 == 17 || n % 18 == -1;
        boolean bl2 = n2 % 18 == 0 || n2 % 18 == 17 || n2 % 18 == -1;
        return bl || bl2;
    }
}

