/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.DoubleMath
 */
import com.google.common.math.DoubleMath;
import java.math.RoundingMode;

public final class Oz {
    static final short a = 1;
    static final long[] b = new long[246];
    public static final oj_0 c;

    private static double a(int n) {
        int n2 = n;
        if (n2 < 1) {
            n2 = 1;
        }
        return oe_0.a((short)n2);
    }

    private static double b(int n) {
        return od_0.a(n);
    }

    private Oz() {
    }

    static {
        Oz.b[0] = 0L;
        double d2 = 0.0;
        int n = b.length;
        for (int k = 1; k < n; ++k) {
            double d3 = Oz.a(k);
            double d4 = Math.max(1.0, Oz.b(k));
            double d5 = d3 * d4;
            Oz.b[k] = DoubleMath.roundToLong((double)(d2 += d5), (RoundingMode)RoundingMode.FLOOR);
        }
        c = ok_0.a(ok_0.a(b).a(1).b(246));
    }
}

