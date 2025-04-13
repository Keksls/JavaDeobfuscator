/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLf
 */
class flf_2
extends flo_1 {
    float[] a = null;

    flf_2() {
    }

    @Override
    void a(Object object, fks_2 fks_22) {
        flh_2 flh_22 = (flh_2)object;
        fks_22.a(flh_22.a, 8);
        fks_22.a(flh_22.b, 16);
        fks_22.a(flh_22.c, 16);
        fks_22.a(flh_22.d, 6);
        fks_22.a(flh_22.e, 8);
        fks_22.a(flh_22.f - 1, 4);
        for (int k = 0; k < flh_22.f; ++k) {
            fks_22.a(flh_22.g[k], 8);
        }
    }

    @Override
    Object a(fls_1 fls_12, fks_2 fks_22) {
        flh_2 flh_22 = new flh_2(this);
        flh_22.a = fks_22.c(8);
        flh_22.b = fks_22.c(16);
        flh_22.c = fks_22.c(16);
        flh_22.d = fks_22.c(6);
        flh_22.e = fks_22.c(8);
        flh_22.f = fks_22.c(4) + 1;
        if (flh_22.a < 1 || flh_22.b < 1 || flh_22.c < 1 || flh_22.f < 1) {
            return null;
        }
        for (int k = 0; k < flh_22.f; ++k) {
            flh_22.g[k] = fks_22.c(8);
            if (flh_22.g[k] >= 0 && flh_22.g[k] < fls_12.m) continue;
            return null;
        }
        return flh_22;
    }

    @Override
    Object a(fle_1 fle_12, flt_1 flt_12, Object object) {
        fls_1 fls_12 = fle_12.e;
        flh_2 flh_22 = (flh_2)object;
        fli_1 fli_12 = new fli_1(this);
        fli_12.c = flh_22.a;
        fli_12.a = fls_12.g[flt_12.a] / 2;
        fli_12.b = flh_22.c;
        fli_12.e = flh_22;
        fli_12.f.a(fli_12.b, fli_12.c);
        float f2 = (float)fli_12.b / flf_2.a((float)((double)flh_22.b / 2.0));
        fli_12.d = new int[fli_12.a];
        for (int k = 0; k < fli_12.a; ++k) {
            int n = (int)Math.floor(flf_2.a((float)((double)flh_22.b / 2.0 / (double)fli_12.a * (double)k)) * f2);
            if (n >= fli_12.b) {
                n = fli_12.b;
            }
            fli_12.d[k] = n;
        }
        return fli_12;
    }

    static float a(float f2) {
        return (float)(13.1 * Math.atan(7.4E-4 * (double)f2) + 2.24 * Math.atan((double)(f2 * f2) * 1.85E-8) + 1.0E-4 * (double)f2);
    }

    Object a(Object object) {
        flg_2 flg_22 = new flg_2(this);
        flh_2 flh_22 = (flh_2)object;
        flg_22.a = new int[flh_22.a];
        flg_22.b = new float[flh_22.c];
        flg_22.c = -1L;
        return flg_22;
    }

    @Override
    void b(Object object) {
    }

    @Override
    void c(Object object) {
    }

    @Override
    void d(Object object) {
    }

    @Override
    int a(fkx_2 fkx_22, Object object, float[] fArray, float[] fArray2, Object object2) {
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    int a(fkx_2 fkx_22, Object object, float[] fArray) {
        fli_1 fli_12 = (fli_1)object;
        flh_2 flh_22 = fli_12.e;
        int n = fkx_22.b.c(flh_22.d);
        if (n > 0) {
            int n2 = (1 << flh_22.d) - 1;
            float f2 = (float)n / (float)n2 * (float)flh_22.e;
            int n3 = fkx_22.b.c(fll_2.a(flh_22.f));
            if (n3 != -1 && n3 < flh_22.f) {
                flf_2 flf_22 = this;
                synchronized (flf_22) {
                    int n4;
                    if (this.a == null || this.a.length < fli_12.c) {
                        this.a = new float[fli_12.c];
                    } else {
                        for (int k = 0; k < fli_12.c; ++k) {
                            this.a[k] = 0.0f;
                        }
                    }
                    fkz_2 fkz_22 = fkx_22.k.A[flh_22.g[n3]];
                    float f3 = 0.0f;
                    for (n4 = 0; n4 < fli_12.c; ++n4) {
                        fArray[n4] = 0.0f;
                    }
                    for (n4 = 0; n4 < fli_12.c; n4 += fkz_22.a) {
                        if (fkz_22.a(this.a, n4, fkx_22.b, 1, -1) != -1) continue;
                        for (int k = 0; k < fli_12.a; ++k) {
                            fArray[k] = 0.0f;
                        }
                        return 0;
                    }
                    n4 = 0;
                    while (n4 < fli_12.c) {
                        for (int k = 0; k < fkz_22.a; ++k) {
                            int n5 = n4++;
                            this.a[n5] = this.a[n5] + f3;
                        }
                        f3 = this.a[n4 - 1];
                    }
                    flx_1.a(fArray, fli_12.d, fli_12.a, fli_12.b, this.a, fli_12.c, f2, flh_22.e);
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override
    Object a(fkx_2 fkx_22, Object object, Object object2) {
        int n;
        fli_1 fli_12 = (fli_1)object;
        flh_2 flh_22 = fli_12.e;
        float[] fArray = null;
        if (object2 instanceof float[]) {
            fArray = (float[])object2;
        }
        if ((n = fkx_22.b.c(flh_22.d)) > 0) {
            int n2 = (1 << flh_22.d) - 1;
            float f2 = (float)n / (float)n2 * (float)flh_22.e;
            int n3 = fkx_22.b.c(fll_2.a(flh_22.f));
            if (n3 != -1 && n3 < flh_22.f) {
                int n4;
                fkz_2 fkz_22 = fkx_22.k.A[flh_22.g[n3]];
                float f3 = 0.0f;
                if (fArray == null || fArray.length < fli_12.c + 1) {
                    fArray = new float[fli_12.c + 1];
                } else {
                    for (n4 = 0; n4 < fArray.length; ++n4) {
                        fArray[n4] = 0.0f;
                    }
                }
                for (n4 = 0; n4 < fli_12.c; n4 += fkz_22.a) {
                    if (fkz_22.c(fArray, n4, fkx_22.b, fkz_22.a) != -1) continue;
                    return null;
                }
                n4 = 0;
                while (n4 < fli_12.c) {
                    for (int k = 0; k < fkz_22.a; ++k) {
                        int n5 = n4++;
                        fArray[n5] = fArray[n5] + f3;
                    }
                    f3 = fArray[n4 - 1];
                }
                fArray[fli_12.c] = f2;
                return fArray;
            }
        }
        return null;
    }

    @Override
    int a(fkx_2 fkx_22, Object object, Object object2, float[] fArray) {
        fli_1 fli_12 = (fli_1)object;
        flh_2 flh_22 = fli_12.e;
        if (object2 != null) {
            float[] fArray2 = (float[])object2;
            float f2 = fArray2[fli_12.c];
            flx_1.a(fArray, fli_12.d, fli_12.a, fli_12.b, fArray2, fli_12.c, f2, flh_22.e);
            return 1;
        }
        for (int k = 0; k < fli_12.a; ++k) {
            fArray[k] = 0.0f;
        }
        return 0;
    }

    static float b(float f2) {
        return (float)Math.exp((double)f2 * 0.11512925);
    }

    static void a(float[] fArray, float[] fArray2, int n) {
        int n2;
        int n3;
        int n4 = n / 2;
        float[] fArray3 = new float[n4];
        float[] fArray4 = new float[n4];
        float[] fArray5 = new float[n4 + 1];
        float[] fArray6 = new float[n4 + 1];
        float[] fArray7 = new float[n4];
        float[] fArray8 = new float[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            fArray3[n3] = (float)(-2.0 * Math.cos(fArray[n3 * 2]));
            fArray4[n3] = (float)(-2.0 * Math.cos(fArray[n3 * 2 + 1]));
        }
        for (n2 = 0; n2 < n4; ++n2) {
            fArray5[n2] = 0.0f;
            fArray6[n2] = 1.0f;
            fArray7[n2] = 0.0f;
            fArray8[n2] = 1.0f;
        }
        fArray6[n2] = 1.0f;
        fArray5[n2] = 1.0f;
        for (n3 = 1; n3 < n + 1; ++n3) {
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (n2 = 0; n2 < n4; ++n2) {
                float f4 = fArray3[n2] * fArray6[n2] + fArray5[n2];
                fArray5[n2] = fArray6[n2];
                fArray6[n2] = f3;
                f3 += f4;
                f4 = fArray4[n2] * fArray8[n2] + fArray7[n2];
                fArray7[n2] = fArray8[n2];
                fArray8[n2] = f2;
                f2 += f4;
            }
            fArray2[n3 - 1] = (f3 + fArray6[n2] + f2 - fArray5[n2]) / 2.0f;
            fArray6[n2] = f3;
            fArray5[n2] = f2;
        }
    }

    static void a(float[] fArray, float[] fArray2, float f2, fli_1 fli_12, String string, int n) {
        float[] fArray3 = new float[Math.max(fli_12.b * 2, fli_12.c * 2 + 2)];
        if (f2 == 0.0f) {
            for (int k = 0; k < fli_12.a; ++k) {
                fArray[k] = 0.0f;
            }
            return;
        }
        fli_12.f.a(fArray3, fArray2, f2);
        for (int k = 0; k < fli_12.a; ++k) {
            fArray[k] = fArray3[fli_12.d[k]];
        }
    }
}

