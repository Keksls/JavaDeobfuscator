/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ahI
 */
public final class ahi_0
extends Enum<ahi_0> {
    public static final /* enum */ ahi_0 a = new ahi_0();
    public static final /* enum */ ahi_0 b = new ahi_0();
    public static final /* enum */ ahi_0 c = new ahi_0();
    public static final /* enum */ ahi_0 d = new ahi_0();
    public static final /* enum */ ahi_0 e = new ahi_0();
    public static final /* enum */ ahi_0 f = new ahi_0();
    public static final /* enum */ ahi_0 g = new ahi_0();
    public static final /* enum */ ahi_0 h = new ahi_0();
    public static final /* enum */ ahi_0 i = new ahi_0();
    public static final /* enum */ ahi_0 j = new ahi_0();
    public static final /* enum */ ahi_0 k = new ahi_0();
    public static final /* enum */ ahi_0 l = new ahi_0();
    public static final /* enum */ ahi_0 m = new ahi_0();
    private final byte s = (byte)this.ordinal();
    public static final int n;
    public static final int o = 15;
    public static final int p = Short.MAX_VALUE;
    public static final int q = 32766;
    private static final int t = 5;
    private static final int u = 13;
    private static final long v = 8191L;
    private static final int w = 6;
    private static final int x = 14;
    private static final long y = 16383L;
    private static final long z = 8192L;
    private static final int A = 19;
    private static final int B = 34;
    private static final /* synthetic */ ahi_0[] C;

    public static ahi_0[] values() {
        return (ahi_0[])C.clone();
    }

    public static ahi_0 valueOf(String string) {
        return Enum.valueOf(ahi_0.class, string);
    }

    public final byte a() {
        return this.s;
    }

    public static int a(int n) {
        return n;
    }

    public static boolean a(long l) {
        long l2 = 0x1000000000000L;
        return l >= 0L && l < 0x1000000000000L;
    }

    public static long a(long l, long l2, int n, int n2) {
        assert (Math.abs(l) < 16383L);
        assert (Math.abs(l2) < 16383L);
        assert (n >= 0 && (long)n < 8191L);
        assert (n2 >= 0 && n2 < 31);
        return (l2 + 8192L & 0x3FFFL) << 34 | (l + 8192L & 0x3FFFL) << 19 | ((long)n & 0x1FFFL) << 6 | (long)n2;
    }

    static {
        C = new ahi_0[]{a, b, c, d, e, f, g, h, i, j, k, l, m};
        n = ahi_0.values().length;
        assert (n < 8191);
    }
}

