/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLE
 */
class fle_2
extends flq_1 {
    private static int[][][] c = new int[2][][];
    static int[][] b = null;

    fle_2() {
    }

    @Override
    void a(Object object, fks_2 fks_22) {
        int n;
        flf_1 flf_12 = (flf_1)object;
        int n2 = 0;
        fks_22.a(flf_12.a, 24);
        fks_22.a(flf_12.b, 24);
        fks_22.a(flf_12.c - 1, 24);
        fks_22.a(flf_12.d - 1, 6);
        fks_22.a(flf_12.e, 8);
        for (n = 0; n < flf_12.d; ++n) {
            int n3 = flf_12.f[n];
            if (fll_2.a(n3) > 3) {
                fks_22.a(n3, 3);
                fks_22.a(1, 1);
                fks_22.a(n3 >>> 3, 5);
            } else {
                fks_22.a(n3, 4);
            }
            n2 += fll_2.c(n3);
        }
        for (n = 0; n < n2; ++n) {
            fks_22.a(flf_12.g[n], 8);
        }
    }

    @Override
    Object a(fls_1 fls_12, fks_2 fks_22) {
        int n;
        int n2 = 0;
        flf_1 flf_12 = new flf_1(this);
        flf_12.a = fks_22.c(24);
        flf_12.b = fks_22.c(24);
        flf_12.c = fks_22.c(24) + 1;
        flf_12.d = fks_22.c(6) + 1;
        flf_12.e = fks_22.c(8);
        for (n = 0; n < flf_12.d; ++n) {
            int n3 = fks_22.c(3);
            if (fks_22.c(1) != 0) {
                n3 |= fks_22.c(5) << 3;
            }
            flf_12.f[n] = n3;
            n2 += fll_2.c(n3);
        }
        for (n = 0; n < n2; ++n) {
            flf_12.g[n] = fks_22.c(8);
        }
        if (flf_12.e >= fls_12.m) {
            this.a(flf_12);
            return null;
        }
        for (n = 0; n < n2; ++n) {
            if (flf_12.g[n] < fls_12.m) continue;
            this.a(flf_12);
            return null;
        }
        return flf_12;
    }

    @Override
    Object a(fle_1 fle_12, flt_1 flt_12, Object object) {
        int n;
        int n2;
        int n3;
        int n4;
        flf_1 flf_12 = (flf_1)object;
        flg_1 flg_12 = new flg_1(this);
        int n5 = 0;
        int n6 = 0;
        flg_12.a = flf_12;
        flg_12.b = flt_12.d;
        flg_12.c = flf_12.d;
        flg_12.e = fle_12.A;
        flg_12.f = fle_12.A[flf_12.e];
        int n7 = flg_12.f.a;
        flg_12.g = new int[flg_12.c][];
        for (n4 = 0; n4 < flg_12.c; ++n4) {
            n3 = flf_12.f[n4];
            n2 = fll_2.a(n3);
            if (n2 == 0) continue;
            if (n2 > n6) {
                n6 = n2;
            }
            flg_12.g[n4] = new int[n2];
            for (n = 0; n < n2; ++n) {
                if ((n3 & 1 << n) == 0) continue;
                flg_12.g[n4][n] = flf_12.g[n5++];
            }
        }
        flg_12.h = (int)Math.rint(Math.pow(flg_12.c, n7));
        flg_12.d = n6;
        flg_12.i = new int[flg_12.h][];
        for (n4 = 0; n4 < flg_12.h; ++n4) {
            n3 = n4;
            n2 = flg_12.h / flg_12.c;
            flg_12.i[n4] = new int[n7];
            for (n = 0; n < n7; ++n) {
                int n8 = n3 / n2;
                n3 -= n8 * n2;
                n2 /= flg_12.c;
                flg_12.i[n4][n] = n8;
            }
        }
        return flg_12;
    }

    @Override
    void a(Object object) {
    }

    @Override
    void b(Object object) {
    }

    static synchronized int a(fkx_2 fkx_22, Object object, float[][] fArray, int n, int n2) {
        int n3;
        flg_1 flg_12 = (flg_1)object;
        flf_1 flf_12 = flg_12.a;
        int n4 = flf_12.c;
        int n5 = flg_12.f.a;
        int n6 = flf_12.b - flf_12.a;
        int n7 = n6 / n4;
        int n8 = (n7 + n5 - 1) / n5;
        if (c.length < n) {
            c = new int[n][][];
        }
        for (n3 = 0; n3 < n; ++n3) {
            if (c[n3] != null && c[n3].length >= n8) continue;
            fle_2.c[n3] = new int[n8][];
        }
        for (int k = 0; k < flg_12.d; ++k) {
            int n9 = 0;
            int n10 = 0;
            while (n9 < n7) {
                int n11;
                if (k == 0) {
                    for (n3 = 0; n3 < n; ++n3) {
                        n11 = flg_12.f.a(fkx_22.b);
                        if (n11 == -1) {
                            return 0;
                        }
                        fle_2.c[n3][n10] = flg_12.i[n11];
                        if (c[n3][n10] != null) continue;
                        return 0;
                    }
                }
                for (int i2 = 0; i2 < n5 && n9 < n7; ++i2, ++n9) {
                    for (n3 = 0; n3 < n; ++n3) {
                        fkz_2 fkz_22;
                        n11 = flf_12.a + n9 * n4;
                        int n12 = c[n3][n10][i2];
                        if ((flf_12.f[n12] & 1 << k) == 0 || (fkz_22 = flg_12.e[flg_12.g[n12][k]]) == null || !(n2 == 0 ? fkz_22.a(fArray[n3], n11, fkx_22.b, n4) == -1 : n2 == 1 && fkz_22.b(fArray[n3], n11, fkx_22.b, n4) == -1)) continue;
                        return 0;
                    }
                }
                ++n10;
            }
        }
        return 0;
    }

    static synchronized int a(fkx_2 fkx_22, Object object, float[][] fArray, int n) {
        flg_1 flg_12 = (flg_1)object;
        flf_1 flf_12 = flg_12.a;
        int n2 = flf_12.c;
        int n3 = flg_12.f.a;
        int n4 = flf_12.b - flf_12.a;
        int n5 = n4 / n2;
        int n6 = (n5 + n3 - 1) / n3;
        if (b == null || b.length < n6) {
            b = new int[n6][];
        }
        for (int k = 0; k < flg_12.d; ++k) {
            int n7 = 0;
            int n8 = 0;
            while (n7 < n5) {
                int n9;
                if (k == 0) {
                    n9 = flg_12.f.a(fkx_22.b);
                    if (n9 == -1) {
                        return 0;
                    }
                    fle_2.b[n8] = flg_12.i[n9];
                    if (b[n8] == null) {
                        return 0;
                    }
                }
                for (int i2 = 0; i2 < n3 && n7 < n5; ++i2, ++n7) {
                    fkz_2 fkz_22;
                    n9 = flf_12.a + n7 * n2;
                    int n10 = b[n8][i2];
                    if ((flf_12.f[n10] & 1 << k) == 0 || (fkz_22 = flg_12.e[flg_12.g[n10][k]]) == null || fkz_22.a(fArray, n9, n, fkx_22.b, n2) != -1) continue;
                    return 0;
                }
                ++n8;
            }
        }
        return 0;
    }

    @Override
    int a(fkx_2 fkx_22, Object object, float[][] fArray, int[] nArray, int n) {
        int n2 = 0;
        for (int k = 0; k < n; ++k) {
            if (nArray[k] == 0) continue;
            fArray[n2++] = fArray[k];
        }
        if (n2 != 0) {
            return fle_2.a(fkx_22, object, fArray, n2, 0);
        }
        return 0;
    }
}

