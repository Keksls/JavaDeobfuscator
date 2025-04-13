/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLy
 */
class fly_1
extends flp_1 {
    static int b = 0;
    float[][] c = null;
    int[] d = null;
    int[] e = null;
    Object[] f = null;

    fly_1() {
    }

    @Override
    void a(Object object) {
    }

    @Override
    void b(Object object) {
    }

    @Override
    Object a(fle_1 fle_12, flt_1 flt_12, Object object) {
        fls_1 fls_12 = fle_12.e;
        fla_1 fla_12 = new fla_1(this);
        flz_1 flz_12 = fla_12.b = (flz_1)object;
        fla_12.a = flt_12;
        fla_12.c = new Object[flz_12.a];
        fla_12.d = new Object[flz_12.a];
        fla_12.f = new Object[flz_12.a];
        fla_12.h = new flr_1[flz_12.a];
        fla_12.i = new flo_1[flz_12.a];
        fla_12.j = new flq_1[flz_12.a];
        for (int k = 0; k < flz_12.a; ++k) {
            int n = flz_12.c[k];
            int n2 = flz_12.d[k];
            int n3 = flz_12.e[k];
            fla_12.h[k] = flr_1.a[fls_12.r[n]];
            fla_12.c[k] = fla_12.h[k].a(fle_12, flt_12, fls_12.s[n]);
            fla_12.i[k] = flo_1.c[fls_12.t[n2]];
            fla_12.d[k] = fla_12.i[k].a(fle_12, flt_12, fls_12.u[n2]);
            fla_12.j[k] = flq_1.a[fls_12.v[n3]];
            fla_12.f[k] = fla_12.j[k].a(fle_12, flt_12, fls_12.w[n3]);
        }
        if (fls_12.n == 0 || fle_12.d != 0) {
            // empty if block
        }
        fla_12.k = fls_12.b;
        return fla_12;
    }

    @Override
    void a(fls_1 fls_12, Object object, fks_2 fks_22) {
        int n;
        flz_1 flz_12 = (flz_1)object;
        if (flz_12.a > 1) {
            fks_22.a(1, 1);
            fks_22.a(flz_12.a - 1, 4);
        } else {
            fks_22.a(0, 1);
        }
        if (flz_12.g > 0) {
            fks_22.a(1, 1);
            fks_22.a(flz_12.g - 1, 8);
            for (n = 0; n < flz_12.g; ++n) {
                fks_22.a(flz_12.h[n], fll_2.b(fls_12.b));
                fks_22.a(flz_12.i[n], fll_2.b(fls_12.b));
            }
        } else {
            fks_22.a(0, 1);
        }
        fks_22.a(0, 2);
        if (flz_12.a > 1) {
            for (n = 0; n < fls_12.b; ++n) {
                fks_22.a(flz_12.b[n], 4);
            }
        }
        for (n = 0; n < flz_12.a; ++n) {
            fks_22.a(flz_12.c[n], 8);
            fks_22.a(flz_12.d[n], 8);
            fks_22.a(flz_12.e[n], 8);
        }
    }

    @Override
    Object a(fls_1 fls_12, fks_2 fks_22) {
        int n;
        flz_1 flz_12 = new flz_1(this);
        flz_12.a = fks_22.c(1) != 0 ? fks_22.c(4) + 1 : 1;
        if (fks_22.c(1) != 0) {
            flz_12.g = fks_22.c(8) + 1;
            for (n = 0; n < flz_12.g; ++n) {
                int n2 = flz_12.h[n] = fks_22.c(fll_2.b(fls_12.b));
                int n3 = flz_12.i[n] = fks_22.c(fll_2.b(fls_12.b));
                if (n2 >= 0 && n3 >= 0 && n2 != n3 && n2 < fls_12.b && n3 < fls_12.b) continue;
                flz_12.a();
                return null;
            }
        }
        if (fks_22.c(2) > 0) {
            flz_12.a();
            return null;
        }
        if (flz_12.a > 1) {
            for (n = 0; n < fls_12.b; ++n) {
                flz_12.b[n] = fks_22.c(4);
                if (flz_12.b[n] < flz_12.a) continue;
                flz_12.a();
                return null;
            }
        }
        for (n = 0; n < flz_12.a; ++n) {
            flz_12.c[n] = fks_22.c(8);
            if (flz_12.c[n] >= fls_12.j) {
                flz_12.a();
                return null;
            }
            flz_12.d[n] = fks_22.c(8);
            if (flz_12.d[n] >= fls_12.k) {
                flz_12.a();
                return null;
            }
            flz_12.e[n] = fks_22.c(8);
            if (flz_12.e[n] < fls_12.l) continue;
            flz_12.a();
            return null;
        }
        return flz_12;
    }

    @Override
    synchronized int a(fkx_2 fkx_22, Object object) {
        int n;
        int n2;
        int n3;
        fle_1 fle_12 = fkx_22.k;
        fls_1 fls_12 = fle_12.e;
        fla_1 fla_12 = (fla_1)object;
        flz_1 flz_12 = fla_12.b;
        flt_1 flt_12 = fla_12.a;
        int n4 = fkx_22.f = fls_12.g[fkx_22.d];
        float[] fArray = fle_12.y[fkx_22.d][fkx_22.c][fkx_22.e][flt_12.b];
        if (this.c == null || this.c.length < fls_12.b) {
            this.c = new float[fls_12.b][];
            this.e = new int[fls_12.b];
            this.d = new int[fls_12.b];
            this.f = new Object[fls_12.b];
        }
        for (n3 = 0; n3 < fls_12.b; ++n3) {
            float[] fArray2 = fkx_22.a[n3];
            n2 = flz_12.b[n3];
            this.f[n3] = fla_12.i[n2].a(fkx_22, fla_12.d[n2], this.f[n3]);
            this.e[n3] = this.f[n3] != null ? 1 : 0;
            for (n = 0; n < n4 / 2; ++n) {
                fArray2[n] = 0.0f;
            }
        }
        for (n3 = 0; n3 < flz_12.g; ++n3) {
            if (this.e[flz_12.h[n3]] == 0 && this.e[flz_12.i[n3]] == 0) continue;
            this.e[flz_12.h[n3]] = 1;
            this.e[flz_12.i[n3]] = 1;
        }
        for (n3 = 0; n3 < flz_12.a; ++n3) {
            int n5 = 0;
            for (n2 = 0; n2 < fls_12.b; ++n2) {
                if (flz_12.b[n2] != n3) continue;
                this.d[n5] = this.e[n2] != 0 ? 1 : 0;
                this.c[n5++] = fkx_22.a[n2];
            }
            fla_12.j[n3].a(fkx_22, fla_12.f[n3], this.c, this.d, n5);
        }
        for (n3 = flz_12.g - 1; n3 >= 0; --n3) {
            float[] fArray3 = fkx_22.a[flz_12.h[n3]];
            float[] fArray4 = fkx_22.a[flz_12.i[n3]];
            for (n = 0; n < n4 / 2; ++n) {
                float f2 = fArray3[n];
                float f3 = fArray4[n];
                if (f2 > 0.0f) {
                    if (f3 > 0.0f) {
                        fArray3[n] = f2;
                        fArray4[n] = f2 - f3;
                        continue;
                    }
                    fArray4[n] = f2;
                    fArray3[n] = f2 + f3;
                    continue;
                }
                if (f3 > 0.0f) {
                    fArray3[n] = f2;
                    fArray4[n] = f2 + f3;
                    continue;
                }
                fArray4[n] = f2;
                fArray3[n] = f2 - f3;
            }
        }
        for (n3 = 0; n3 < fls_12.b; ++n3) {
            float[] fArray5 = fkx_22.a[n3];
            int n6 = flz_12.b[n3];
            fla_12.i[n6].a(fkx_22, fla_12.d[n6], this.f[n3], fArray5);
        }
        for (n3 = 0; n3 < fls_12.b; ++n3) {
            float[] fArray6 = fkx_22.a[n3];
            ((flb_2)fle_12.z[fkx_22.d][0]).b(fArray6, fArray6);
        }
        for (n3 = 0; n3 < fls_12.b; ++n3) {
            int n7;
            float[] fArray7 = fkx_22.a[n3];
            if (this.e[n3] != 0) {
                for (n7 = 0; n7 < n4; ++n7) {
                    int n8 = n7;
                    fArray7[n8] = fArray7[n8] * fArray[n7];
                }
                continue;
            }
            for (n7 = 0; n7 < n4; ++n7) {
                fArray7[n7] = 0.0f;
            }
        }
        return 0;
    }
}

