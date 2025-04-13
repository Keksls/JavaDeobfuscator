/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from YC
 */
public class yc_0 {
    public static int a(int n) {
        return 64 / n;
    }

    public static int b(int n) {
        return 32 / n;
    }

    public static int c(int n) {
        return (1 << n) - 1;
    }

    public static int a(long[] lArray, int n, int n2) {
        int n3 = Hw.f(n2);
        int n4 = yc_0.a(n3);
        long l = yc_0.c(n3);
        long l2 = lArray[n / n4];
        return (int)((l2 >>= n3 * (n % n4)) & l);
    }

    public static int a(int[] nArray, int n, int n2) {
        int n3 = Hw.f(n2);
        int n4 = yc_0.b(n3);
        int n5 = yc_0.c(n3);
        int n6 = nArray[n / n4];
        return (n6 >>= n3 * (n % n4)) & n5;
    }

    public static int[] a(int[] nArray, int n, arf_1 arf_12) {
        return arf_12.c(n);
    }

    public static long[] a(long[] lArray, int n, arf_1 arf_12) {
        long[] lArray2 = new long[n];
        for (int k = 0; k < n; ++k) {
            lArray2[k] = arf_12.j();
        }
        return lArray2;
    }

    public static void a(int[] nArray, gk_0 gk_02) {
        for (int k = 0; k < nArray.length; ++k) {
            gk_02.a(nArray[k]);
        }
    }

    public static void a(long[] lArray, gk_0 gk_02) {
        for (int k = 0; k < lArray.length; ++k) {
            gk_02.c(lArray[k]);
        }
    }

    public static int[] a(int[] nArray, int n) {
        int n2 = Hw.f(n);
        int n3 = yc_0.b(n2);
        int n4 = yc_0.c(n2);
        int n5 = (int)Math.ceil((double)nArray.length / (double)n3);
        int[] nArray2 = new int[n5];
        for (int k = 0; k < nArray.length; ++k) {
            int n6;
            int n7 = n6 = k / n3;
            nArray2[n7] = nArray2[n7] | (nArray[k] & n4) << n2 * (k % n3);
        }
        return nArray2;
    }

    public static long[] b(int[] nArray, int n) {
        int n2 = Hw.f(n);
        int n3 = yc_0.a(n2);
        long l = yc_0.c(n2);
        int n4 = (int)Math.ceil((double)nArray.length / (double)n3);
        long[] lArray = new long[n4];
        for (int k = 0; k < nArray.length; ++k) {
            int n5;
            int n6 = n5 = k / n3;
            lArray[n6] = lArray[n6] | ((long)nArray[k] & l) << n2 * (k % n3);
        }
        return lArray;
    }

    public static void a(String[] stringArray) {
    }
}

