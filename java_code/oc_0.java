/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.DoubleMath
 */
import com.google.common.math.DoubleMath;
import java.math.RoundingMode;

/*
 * Renamed from OC
 */
public final class oc_0 {
    private static final short b = 0;
    private static final short c = 200;
    private static final int d = 100;
    private static final double e = 1.5;
    private static final double f = 2.2;
    private static final long[] g = oc_0.a();
    public static final oj_0 a = ok_0.a(ok_0.a(g).a(0).b(200).b(g[200]));

    private static long[] a() {
        long[] lArray = new long[201];
        for (int k = 0; k < lArray.length; ++k) {
            double d2 = (double)(100 * k) + 1.5 * StrictMath.pow(k, 2.2);
            lArray[k] = DoubleMath.roundToLong((double)d2, (RoundingMode)RoundingMode.FLOOR);
        }
        lArray[0] = lArray[1] - 1L;
        return lArray;
    }

    private oc_0() {
    }
}

