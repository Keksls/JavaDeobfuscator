/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccH
 */
class cch_2 {
    private static final acz_2 a = new acz_2();
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 4;
    private static final int e = 8;
    private static final int f = 16;
    private static final int g = 32;
    private static final int h = 64;
    private static final int i = 128;

    cch_2() {
    }

    public static short a(int n) {
        if (!a.d(n)) {
            return fkk_0.f(1, 0);
        }
        return a.g(n);
    }

    public static short a(short[][] sArray, int n, int n2) {
        int n3 = 0;
        n3 |= cch_2.b(sArray, n - 1, n2 - 1) ? 0 : 1;
        n3 |= cch_2.b(sArray, n + 0, n2 - 1) ? 0 : 2;
        n3 |= cch_2.b(sArray, n + 1, n2 - 1) ? 0 : 4;
        n3 |= cch_2.b(sArray, n - 1, n2 + 0) ? 0 : 8;
        n3 |= cch_2.b(sArray, n + 1, n2 + 0) ? 0 : 16;
        n3 |= cch_2.b(sArray, n - 1, n2 + 1) ? 0 : 32;
        n3 |= cch_2.b(sArray, n + 0, n2 + 1) ? 0 : 64;
        return cch_2.a(n3 |= cch_2.b(sArray, n + 1, n2 + 1) ? 0 : 128);
    }

    public static boolean b(short[][] sArray, int n, int n2) {
        if (n < 0 || n >= sArray.length) {
            return true;
        }
        if (n2 < 0 || n2 >= sArray[n].length) {
            return true;
        }
        return sArray[n][n2] == fkk_0.c;
    }

    private static boolean c(short[][] sArray, int n, int n2) {
        return cch_2.b(sArray, n, n2) || fkk_0.a((int)sArray[n][n2]).a() == 2;
    }

    private static void a(int n, int n2, int ... nArray) {
        short s2 = fkk_0.f(1, n);
        a.a(n2, s2);
        for (int n3 : nArray) {
            cch_2.a(n, n2 | n3, new int[0]);
            cch_2.a(n, n2 | n3, cch_2.a(nArray, n3));
        }
    }

    private static int[] a(int[] nArray, int n) {
        int[] nArray2 = new int[nArray.length - 1];
        int n2 = 0;
        for (int k = 0; k < nArray.length; ++k) {
            if (nArray[k] == n) continue;
            nArray2[n2++] = nArray[k];
        }
        return nArray2;
    }

    static {
        int[] nArray = new int[]{1, 32, 4, 128};
        int[] nArray2 = new int[]{32, 4, 128};
        cch_2.a(1, 0, nArray);
        cch_2.a(2, 16, nArray);
        cch_2.a(3, 64, nArray);
        cch_2.a(4, 9, nArray);
        cch_2.a(5, 8, nArray2);
        cch_2.a(6, 3, nArray);
        cch_2.a(7, 2, nArray2);
        cch_2.a(8, 19, nArray);
        cch_2.a(9, 18, nArray2);
        cch_2.a(10, 10, nArray);
        cch_2.a(11, 73, nArray);
        cch_2.a(12, 72, nArray2);
        cch_2.a(13, 80, nArray);
        cch_2.a(14, 74, nArray);
        cch_2.a(15, 26, nArray);
        cch_2.a(16, 83, nArray);
        cch_2.a(17, 82, nArray2);
        cch_2.a(18, 89, nArray);
        cch_2.a(19, 88, nArray2);
        cch_2.a(20, 25, nArray);
        cch_2.a(21, 24, nArray2);
        cch_2.a(22, 67, nArray);
        cch_2.a(23, 66, nArray2);
        cch_2.a(24, 90, nArray);
        cch_2.a(25, 17, nArray2);
        cch_2.a(26, 65, nArray2);
        cch_2.a(27, 1, nArray2);
    }
}

