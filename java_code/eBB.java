/*
 * Decompiled with CFR 0.152.
 */
public final class eBB {
    public static ww_0 a = new ww_0(wx_0.b);
    public static final short[] b = new short[]{2828, 2830, 2831, 2829, 3577, 3065, 3075, 3071, 2832, 2833};

    public static short a(short s2) {
        int n = 0;
        for (int k = 0; k < b.length; ++k) {
            short s3 = b[k];
            if (s3 != s2) continue;
            n = k == b.length - 1 ? 0 : k + 1;
            break;
        }
        return b[n];
    }
}

