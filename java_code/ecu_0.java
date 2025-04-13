/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eCu
 */
public class ecu_0 {
    private static final double d = 10.0;
    private static final double e = 10.0;
    public static final short a = 200;
    private static final float f = 100.0f;
    public static final int b = 150;
    public static final int c = 10;
    private static final int g = 75;

    public static long a() {
        return 100L;
    }

    public static long a(short s2, short s3, ect_0 ect_02, emh_0 emh_02) {
        return ecu_0.a(s2, s3, ect_02, 100, emh_02);
    }

    public static long a(short s2, short s3, ect_0 ect_02, int n, emh_0 emh_02) {
        if (!emj_0.a.a(emh_02) && s2 >= 10) {
            return 0L;
        }
        double d2 = (double)s2 - ((double)s3 + 10.0);
        if (d2 > 10.0) {
            return 0L;
        }
        if (d2 < 0.0) {
            return Math.round(100.0 * (double)ect_02.c() * (double)n / 100.0);
        }
        double d3 = (double)s3 + 10.0 - (double)s2;
        float f2 = ect_02.c() * (float)n / 100.0f;
        return Math.round((double)ecu_0.a() / 2.0 * (1.0 + Math.cos(d3 * Math.PI / 10.0)) * (double)f2);
    }

    public static long a(short s2) {
        return 75L * (long)s2 * (long)s2;
    }

    public static long b(short s2) {
        return ecu_0.a(s2) - ecu_0.a((short)(s2 - 1));
    }

    public static long a(long l) {
        return ecu_0.a((short)(ecu_0.c(l) + 1)) - l;
    }

    public static double b(long l) {
        return Math.sqrt((double)l / 75.0);
    }

    public static short c(long l) {
        return (short)Math.floor(ecu_0.b(l));
    }

    public static double d(long l) {
        double d2 = ecu_0.b(l);
        return d2 - Math.floor(d2);
    }

    public static abo_2<Short, Double> e(long l) {
        double d2 = ecu_0.b(l);
        short s2 = (short)Math.floor(d2);
        return new abo_2<Short, Double>(s2, d2 - (double)s2);
    }
}

