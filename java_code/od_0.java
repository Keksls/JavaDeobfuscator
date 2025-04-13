/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from OD
 */
final class od_0 {
    private static final int a = 98;
    private static final double b = 0.8;
    private static final int c = 170;
    private static final int d = 79;
    private static final double e = 1.25;
    private static final int f = 200;
    private static final double g = 1.35;
    private static final int h = 105;
    private static final int i = 119;
    private static final double j = 1.4;

    private od_0() {
    }

    public static double a(int n) {
        if (n < 98) {
            return StrictMath.pow(n, 0.8);
        }
        if (n < 170) {
            return StrictMath.pow(n - 79, 1.25);
        }
        if (n < 200) {
            return StrictMath.pow(n - 105, 1.35);
        }
        return StrictMath.pow(n - 119, 1.4);
    }
}

