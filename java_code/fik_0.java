/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Range
 */
import com.google.common.collect.Range;

/*
 * Renamed from fik
 */
public final class fik_0 {
    private static final int a = 3000;
    private static final int b = 1500;
    private static final int c = 50;
    private static final float d = 0.2f;

    private fik_0() {
    }

    public static long a(int n, int n2, float f2, fhf_0<?> fhf_02, Ye ye) {
        if (n < n2) {
            return 3000L;
        }
        long l = 3000L - (long)((n - n2) * 50);
        long l2 = Math.max(1500L, l);
        float f3 = 1.0f / (1.0f + f2);
        float f4 = ye == null ? 1.0f : 1.0f + 0.2f * (float)fik_0.a(fhf_02, ye);
        return Math.round((float)l2 * f3 * f4);
    }

    public static int a(fhf_0<?> fhf_02, Ye ye) {
        float f2 = ye.g();
        Range range = Range.closed((Comparable)Float.valueOf(fhf_02.n()), (Comparable)Float.valueOf(fhf_02.o()));
        float f3 = range.contains((Comparable)Float.valueOf(f2)) ? 0.0f : (f2 < ((Float)range.lowerEndpoint()).floatValue() ? ((Float)range.lowerEndpoint()).floatValue() - f2 : f2 - ((Float)range.upperEndpoint()).floatValue());
        return Math.round(f3);
    }
}

