/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fqQ
 */
public enum fqq_0 {
    a,
    b,
    c;


    public boolean a(int n, int n2, int n3, int n4) {
        switch (this) {
            case a: {
                return n >= 0 && n2 >= 0 && n < n3 && n2 < n4;
            }
            case b: {
                float f2 = (float)n4 / 2.0f;
                float f3 = f2 / ((float)n3 / 2.0f) * (float)n;
                return (float)n2 >= -f3 + f2 && (float)n2 >= f3 - f2 && (float)n2 < f3 + f2 && (float)n2 < -f3 + 3.0f * f2;
            }
            case c: {
                int n5 = Math.min(n3, n4) / 2;
                return (n -= n3 / 2) * n + (n2 -= n4 / 2) * n2 <= n5 * n5;
            }
        }
        return true;
    }

    public int b(int n, int n2, int n3, int n4) {
        switch (this) {
            case a: {
                if (n < 0) {
                    return 0;
                }
                if (n > n3) {
                    return n3;
                }
                return n;
            }
            case c: {
                int n5;
                int n6 = (int)((float)Math.min(n3 / 2, n4 / 2) * 0.8f);
                int n7 = n5 = n < n3 / 2 ? -1 : 1;
                if (n * n + n2 * n2 < n6 * n6) {
                    return n;
                }
                return n5 * (int)Math.sqrt(n6 * n6 * (1 / (n2 * n2 / (n * n) + 1)));
            }
            case b: {
                float f2;
                float f3;
                float f4 = (float)n3 / 2.0f;
                float f5 = (float)n4 / 2.0f;
                float f6 = ((float)n2 - f5) / ((float)n - f4);
                float f7 = (float)n2 - f6 * (float)n;
                if ((float)n < f4) {
                    if ((float)n2 < f5) {
                        f3 = -f5 / f4;
                        f2 = f5;
                    } else {
                        f3 = f5 / f4;
                        f2 = f5;
                    }
                } else if ((float)n2 < f5) {
                    f3 = f5 / f4;
                    f2 = -f5;
                } else {
                    f3 = -f5 / f4;
                    f2 = 3.0f * f5;
                }
                return (int)((f2 - f7) / (f6 - f3));
            }
        }
        return n;
    }

    public int c(int n, int n2, int n3, int n4) {
        switch (this) {
            case a: {
                if (n2 < 0) {
                    return 0;
                }
                if (n2 > n4) {
                    return n4;
                }
                return n2;
            }
            case c: {
                int n5;
                int n6 = (int)((float)Math.min(n3 / 2, n4 / 2) * 0.8f);
                int n7 = n5 = n2 < n4 / 2 ? -1 : 1;
                if (n * n + n2 * n2 < n6 * n6) {
                    return n2;
                }
                return n5 * (int)Math.sqrt(n6 * n6 * (1 / (n * n / (n2 * n2) + 1)));
            }
            case b: {
                float f2;
                float f3;
                float f4 = (float)n3 / 2.0f;
                float f5 = (float)n4 / 2.0f;
                float f6 = ((float)n2 - f5) / ((float)n - f4);
                float f7 = (float)n2 - f6 * (float)n;
                if ((float)n < f4) {
                    if ((float)n2 < f5) {
                        f3 = -f5 / f4;
                        f2 = f5;
                    } else {
                        f3 = f5 / f4;
                        f2 = f5;
                    }
                } else if ((float)n2 < f5) {
                    f3 = f5 / f4;
                    f2 = -f5;
                } else {
                    f3 = -f5 / f4;
                    f2 = 3.0f * f5;
                }
                float f8 = (f2 - f7) / (f6 - f3);
                return (int)(f6 * f8 + f7);
            }
        }
        return n2;
    }

    public static fqq_0 a(String string) {
        fqq_0[] fqq_0Array;
        for (fqq_0 fqq_02 : fqq_0Array = fqq_0.values()) {
            if (!fqq_02.name().equals(string.toUpperCase())) continue;
            return fqq_02;
        }
        return fqq_0Array[0];
    }
}

