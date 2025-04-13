/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBa
 */
public final class aba_1 {
    public static short a(byte by) {
        if (by < 0) {
            return (short)(256 + by);
        }
        return by;
    }

    public static byte a(byte[] byArray, int n) {
        return byArray[n];
    }

    public static short b(byte[] byArray, int n) {
        return (short)(aba_1.a(byArray[n]) | aba_1.a(byArray[n + 1]) << 8);
    }

    public static int c(byte[] byArray, int n) {
        return aba_1.a(byArray[n]) | aba_1.a(byArray[n + 1]) << 8 | aba_1.a(byArray[n + 2]) << 16 | aba_1.a(byArray[n + 3]) << 24;
    }

    public static byte a(byte[] byArray, abt_1<Integer> abt_12) {
        int n = abt_12.a();
        abt_12.a(n + 1);
        return aba_1.a(byArray, n);
    }

    public static short b(byte[] byArray, abt_1<Integer> abt_12) {
        int n = abt_12.a();
        abt_12.a(n + 2);
        return aba_1.b(byArray, n);
    }

    public static int c(byte[] byArray, abt_1<Integer> abt_12) {
        int n = abt_12.a();
        abt_12.a(n + 4);
        return aba_1.c(byArray, n);
    }
}

