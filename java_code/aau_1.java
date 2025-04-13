/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAu
 */
public class aau_1 {
    public static aaq_1 a(aaq_1 aaq_12, aaq_1 aaq_13) {
        aaq_1 aaq_14 = new aaq_1();
        aaq_14.a(aaq_12);
        aaq_14.b(aaq_13);
        return aaq_14;
    }

    public static aaq_1 b(aaq_1 aaq_12, aaq_1 aaq_13) {
        aaq_1 aaq_14 = new aaq_1();
        aaq_14.a(aaq_12);
        aaq_14.d(aaq_13);
        return aaq_14;
    }

    public static aaq_1 c(aaq_1 aaq_12, aaq_1 aaq_13) {
        aaq_1 aaq_14 = new aaq_1();
        aaq_14.a(aaq_12);
        aaq_14.e(aaq_13);
        return aaq_14;
    }

    public static aaq_1 a(aaq_1 aaq_12) {
        aaq_1 aaq_13 = new aaq_1();
        int n = aaq_12.c;
        int n2 = aaq_12.d;
        aaq_13.c = n;
        aaq_13.d = n2;
        aaq_13.e = aaq_12.e;
        aaq_13.f = aaq_12.f;
        aaq_13.b = new boolean[n][];
        for (int k = 0; k < n; ++k) {
            aaq_13.b[k] = new boolean[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                aaq_13.b[k][i2] = !aaq_12.b[k][i2];
            }
        }
        return aaq_13;
    }

    public static aaq_1 b(aaq_1 aaq_12) {
        aaq_1 aaq_13 = new aaq_1();
        int n = aaq_12.c;
        int n2 = aaq_12.d;
        int n3 = n - 1;
        aaq_13.c = n;
        aaq_13.d = n2;
        aaq_13.e = n - aaq_12.e - 1;
        aaq_13.f = aaq_12.f;
        aaq_13.b = new boolean[n][];
        for (int k = 0; k < n; ++k) {
            aaq_13.b[k] = (boolean[])aaq_12.b[n3 - k].clone();
        }
        return aaq_13;
    }

    public static aaq_1 c(aaq_1 aaq_12) {
        aaq_1 aaq_13 = new aaq_1();
        int n = aaq_12.c;
        int n2 = aaq_12.d;
        int n3 = n2 - 1;
        aaq_13.c = n;
        aaq_13.d = n2;
        aaq_13.e = aaq_12.e;
        aaq_13.f = n2 - aaq_12.f - 1;
        aaq_13.b = new boolean[n][];
        for (int k = 0; k < n; ++k) {
            aaq_13.b[k] = new boolean[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                aaq_13.b[k][i2] = aaq_12.b[k][n3 - i2];
            }
        }
        return aaq_13;
    }

    public static aaq_1 d(aaq_1 aaq_12) {
        aaq_1 aaq_13 = new aaq_1();
        int n = aaq_12.c;
        int n2 = aaq_12.d;
        int n3 = n - 1;
        int n4 = n2 - 1;
        aaq_13.c = n;
        aaq_13.d = n2;
        aaq_13.e = n - aaq_12.e - 1;
        aaq_13.f = n2 - aaq_12.f - 1;
        aaq_13.b = new boolean[n][];
        for (int k = 0; k < n; ++k) {
            aaq_13.b[k] = new boolean[n2];
            int n5 = n3 - k;
            for (int i2 = 0; i2 < n2; ++i2) {
                aaq_13.b[k][i2] = aaq_12.b[n5][n4 - i2];
            }
        }
        return aaq_13;
    }

    public static aaq_1 e(aaq_1 aaq_12) {
        aaq_1 aaq_13 = new aaq_1();
        int n = aaq_12.d;
        int n2 = aaq_12.c;
        int n3 = n2 - 1;
        aaq_13.c = n;
        aaq_13.d = n2;
        aaq_13.e = aaq_12.f;
        aaq_13.f = n3 - aaq_12.e;
        aaq_13.b = new boolean[n][];
        for (int k = 0; k < n; ++k) {
            aaq_13.b[k] = new boolean[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                aaq_13.b[k][i2] = aaq_12.b[n3 - i2][k];
            }
        }
        return aaq_13;
    }

    public static aaq_1 f(aaq_1 aaq_12) {
        return aau_1.d(aaq_12);
    }

    public static aaq_1 g(aaq_1 aaq_12) {
        aaq_1 aaq_13 = new aaq_1();
        int n = aaq_12.d;
        int n2 = aaq_12.c;
        int n3 = n - 1;
        aaq_13.c = n;
        aaq_13.d = n2;
        aaq_13.e = n3 - aaq_12.f;
        aaq_13.f = aaq_12.e;
        aaq_13.b = new boolean[n][];
        for (int k = 0; k < n; ++k) {
            aaq_13.b[k] = new boolean[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                aaq_13.b[k][i2] = aaq_12.b[i2][n3 - k];
            }
        }
        return aaq_13;
    }
}

