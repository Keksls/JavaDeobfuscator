/*
 * Decompiled with CFR 0.152.
 */
public class bOH {
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;

    public static int a(short s2, byte by, short s3) {
        return bOH.a(s2, by, s3, 1);
    }

    public static int b(short s2, byte by, short s3) {
        return bOH.a(s2, by, s3, 2);
    }

    public static int c(short s2, byte by, short s3) {
        return bOH.a(s2, by, s3, 3);
    }

    private static int a(short s2, byte by, short s3, int n) {
        int n2 = 1000;
        n2 += s2 * 10 + by;
        n2 *= 100;
        return n2 += n;
    }

    public static boolean a(int n) {
        return cse_1.a(String.valueOf(n));
    }
}

