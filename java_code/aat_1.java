/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aAt
 */
public class aat_1 {
    protected static final Logger a = Logger.getLogger(aat_1.class);

    public static aaq_1 a(int n) {
        aaq_1 aaq_12 = new aaq_1(n);
        for (int k = -n; k <= n; ++k) {
            int n2 = n - Math.abs(k);
            for (int i2 = -n2; i2 <= n2; ++i2) {
                aaq_12.b[k + n][i2 + n] = true;
            }
        }
        return aaq_12;
    }

    public static aaq_1 b(int n) {
        aaq_1 aaq_12 = new aaq_1(n);
        int n2 = aaq_12.c;
        int n3 = (int)(((float)n + 0.5f) * ((float)n + 0.5f));
        for (int k = 0; k < n2; ++k) {
            int n4 = k - n;
            n4 *= n4;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n5 = i2 - n;
                aaq_12.b[k][i2] = n4 + n5 * n5 < n3;
            }
        }
        return aaq_12;
    }

    public static aaq_1 a(int n, int n2) {
        aaq_1 aaq_12 = aat_1.a(n);
        aaq_12.e(aat_1.a(n2));
        return aaq_12;
    }

    public static aaq_1 a(int n, int n2, int n3) {
        if (n3 > n) {
            n3 = n;
        }
        if (n3 > n2) {
            n3 = n2;
        }
        aaq_1 aaq_12 = new aaq_1(n, n2);
        for (int k = 0; k < n3; ++k) {
            int n4;
            for (n4 = k; n4 < aaq_12.c; ++n4) {
                aaq_12.b[n4][k] = true;
            }
            for (n4 = k; n4 < aaq_12.d; ++n4) {
                aaq_12.b[k][n4] = true;
            }
        }
        return aaq_12;
    }

    public static aaq_1 b(int n, int n2) {
        int n3;
        int n4;
        aaq_1 aaq_12 = new aaq_1();
        aaq_12.c = n;
        aaq_12.d = n2;
        aaq_12.b = new boolean[n][];
        for (n4 = 0; n4 < n; ++n4) {
            aaq_12.b[n4] = new boolean[n2];
        }
        n4 = n2 / 2;
        for (n3 = 0; n3 < aaq_12.c - 1; ++n3) {
            aaq_12.b[n3][n4] = true;
        }
        for (n3 = 0; n3 < aaq_12.d; ++n3) {
            aaq_12.b[aaq_12.c - 1][n3] = true;
        }
        aaq_12.f = n4;
        return aaq_12;
    }

    public static aaq_1 c(int n, int n2) {
        aaq_1 aaq_12 = new aaq_1(n, n2);
        double d2 = 1.0 / ((double)n + 0.5);
        double d3 = 1.0 / ((double)n2 + 0.5);
        for (int k = 0; k < aaq_12.c; ++k) {
            double d4 = (double)(k - n) * d2;
            d4 *= d4;
            for (int i2 = 0; i2 < aaq_12.d; ++i2) {
                double d5 = (double)(i2 - n2) * d3;
                aaq_12.b[k][i2] = d4 + d5 * d5 < 1.0;
            }
        }
        return aaq_12;
    }

    public static aaq_1 d(int n, int n2) {
        aaq_1 aaq_12 = new aaq_1(n, n2);
        for (int k = 0; k < aaq_12.c; ++k) {
            for (int i2 = 0; i2 < aaq_12.d; ++i2) {
                aaq_12.b[k][i2] = true;
            }
        }
        return aaq_12;
    }

    public static aaq_1 c(int n) {
        aaq_1 aaq_12 = new aaq_1(n);
        for (int k = 0; k < aaq_12.c; ++k) {
            for (int i2 = 0; i2 < aaq_12.d; ++i2) {
                aaq_12.b[k][i2] = true;
            }
        }
        return aaq_12;
    }

    public static aaq_1 d(int n) {
        aaq_1 aaq_12 = new aaq_1(n);
        int n2 = aaq_12.c - 1;
        for (int k = 0; k < aaq_12.c; ++k) {
            aaq_12.b[k][k] = true;
            aaq_12.b[n2 - k][k] = true;
        }
        return aaq_12;
    }

    public static aaq_1 e(int n) {
        aaq_1 aaq_12 = new aaq_1(n);
        for (int k = 0; k < aaq_12.c; ++k) {
            aaq_12.b[k][n] = true;
            aaq_12.b[n][k] = true;
        }
        return aaq_12;
    }

    public static aaq_1 e(int n, int n2) {
        int n3;
        aaq_1 aaq_12 = new aaq_1(n, n2);
        for (n3 = 0; n3 < aaq_12.c; ++n3) {
            aaq_12.b[n3][n2] = true;
        }
        for (n3 = 0; n3 < aaq_12.d; ++n3) {
            aaq_12.b[n][n3] = true;
        }
        return aaq_12;
    }

    public static aaq_1 f(int n, int n2) {
        aaq_1 aaq_12 = new aaq_1();
        aaq_12.c = n;
        aaq_12.d = n2;
        aaq_12.b = new boolean[n][];
        for (int k = 0; k < n; ++k) {
            aaq_12.b[k] = new boolean[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                aaq_12.b[k][i2] = (k + i2) % 2 == 0;
            }
        }
        return aaq_12;
    }

    public static aaq_1 a(String string) {
        aaq_1 aaq_12 = new aaq_1();
        try {
            throw new Exception("Not yet implemented!!!!");
        }
        catch (Exception exception) {
            a.error((Object)exception);
            return aaq_12;
        }
    }

    public static aaq_1 a(boolean[] blArray) {
        int n = blArray.length - 1;
        return aat_1.a(blArray, n, n);
    }

    public static aaq_1 a(boolean[] blArray, int n, int n2) {
        aaq_1 aaq_12 = new aaq_1(n, n2);
        int n3 = aaq_12.a();
        int n4 = aaq_12.b();
        for (int k = 0; k < aaq_12.c; ++k) {
            for (int i2 = 0; i2 < aaq_12.d; ++i2) {
                int n5 = Math.max(Math.abs(k - n3), Math.abs(i2 - n4));
                aaq_12.b[k][i2] = n5 > blArray.length ? false : blArray[n5];
            }
        }
        return aaq_12;
    }
}

