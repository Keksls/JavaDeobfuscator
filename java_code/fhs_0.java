/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fhS
 */
public class fhs_0 {
    private static final int a = 75;
    private static final int b = 3;
    private static final int c = 1;

    public static boolean a(short s2, short s3, short s4, int n) {
        if (n == 75) {
            return true;
        }
        return Math.abs(s3 - s4) <= s2;
    }

    public static boolean a(int n, int n2) {
        if (n2 == 75) {
            return n <= 3;
        }
        return n == 1;
    }

    public static int a(int n) {
        if (n == 75) {
            return 3;
        }
        return 1;
    }
}

