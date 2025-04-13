/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from OE
 */
public final class oe_0 {
    private static final double a = 100.0;
    private static final double b = 1.5;
    private static final double c = 2.2;
    private static final double d = 630.0;
    private static final double e = 20.0;
    private static final double f = 4.0;
    private static final double g = 2.0;
    private static final double h = 21.0;
    private static final double i = 1.0;
    private static final double j = 8860.0;

    private oe_0() {
    }

    public static long a(short s2) {
        double d2 = 100.0 * (double)s2 + 1.5 * StrictMath.pow(s2, 2.2);
        if (s2 < 57) {
            return Math.round(d2 + 630.0 * StrictMath.pow((double)s2 / 20.0, 4.0));
        }
        return Math.round(8860.0 * StrictMath.pow(2.0, (double)s2 / 21.0));
    }
}

