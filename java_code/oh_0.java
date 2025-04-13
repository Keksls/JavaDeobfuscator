/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.DoubleMath
 */
import com.google.common.math.DoubleMath;
import java.math.RoundingMode;

/*
 * Renamed from OH
 */
public final class oh_0 {
    public static final oj_0 a = ok_0.a(ok_0.a(oh_0.b()).a(0).b(245));
    static final long b = 10L;
    static final double c = 0.8;
    static final long d = 2L;

    private oh_0() {
    }

    private static long[] b() {
        long[] lArray = new long[246];
        for (int k = 0; k < 246; ++k) {
            double d2 = (double)(10L * (long)k) * StrictMath.pow(1.6, -StrictMath.log(k) / StrictMath.log(0.8));
            lArray[k] = DoubleMath.roundToLong((double)d2, (RoundingMode)RoundingMode.FLOOR);
        }
        return lArray;
    }

    public static oj_0 a() {
        return a;
    }
}

