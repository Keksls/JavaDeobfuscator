/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from OF
 */
public final class of_0 {
    private static final short b = 0;
    private static final short c = 32000;
    public static final oj_0 a = ok_0.a(ok_0.a(of_0.a()).a(0).b(32000));

    private static long[] a() {
        long[] lArray = new long[32000];
        lArray[0] = 0L;
        for (int k = 1; k < lArray.length; ++k) {
            lArray[k] = lArray[k - 1] + 1L;
        }
        return lArray;
    }

    private of_0() {
    }
}

