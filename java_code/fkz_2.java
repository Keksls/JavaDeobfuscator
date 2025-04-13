/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKZ
 */
class fkz_2 {
    int a;
    int b;
    flj_2 c = new flj_2();
    float[] d;
    int[] e;
    fla_2 f;
    private int[] g = new int[15];

    fkz_2() {
    }

    int a(int n, fks_2 fks_22) {
        fks_22.a(this.e[n], this.c.c[n]);
        return this.c.c[n];
    }

    int a(float[] fArray) {
        int n = this.a(fArray, 1);
        for (int k = 0; k < this.a; ++k) {
            fArray[k] = this.d[n * this.a + k];
        }
        return n;
    }

    int a(int n, float[] fArray, fks_2 fks_22) {
        for (int k = 0; k < this.a; ++k) {
            fArray[k] = this.d[n * this.a + k];
        }
        return this.a(n, fks_22);
    }

    int a(float[] fArray, fks_2 fks_22, int n, int n2) {
        int n3 = this.a(fArray, n, n2);
        return this.a(n3, fks_22);
    }

    synchronized int a(float[] fArray, int n, fks_2 fks_22, int n2) {
        int n3;
        int n4 = n2 / this.a;
        if (this.g.length < n4) {
            this.g = new int[n4];
        }
        for (n3 = 0; n3 < n4; ++n3) {
            int n5 = this.a(fks_22);
            if (n5 == -1) {
                return -1;
            }
            this.g[n3] = n5 * this.a;
        }
        n3 = 0;
        int n6 = 0;
        while (n3 < this.a) {
            for (int k = 0; k < n4; ++k) {
                int n7 = n + n6 + k;
                fArray[n7] = fArray[n7] + this.d[this.g[k] + n3];
            }
            ++n3;
            n6 += n4;
        }
        return 0;
    }

    int b(float[] fArray, int n, fks_2 fks_22, int n2) {
        if (this.a > 8) {
            int n3 = 0;
            while (n3 < n2) {
                int n4 = this.a(fks_22);
                if (n4 == -1) {
                    return -1;
                }
                int n5 = n4 * this.a;
                int n6 = 0;
                while (n6 < this.a) {
                    int n7 = n + n3++;
                    fArray[n7] = fArray[n7] + this.d[n5 + n6++];
                }
            }
        } else {
            int n8 = 0;
            while (n8 < n2) {
                int n9 = this.a(fks_22);
                if (n9 == -1) {
                    return -1;
                }
                int n10 = n9 * this.a;
                int n11 = 0;
                switch (this.a) {
                    case 8: {
                        int n12 = n + n8++;
                        fArray[n12] = fArray[n12] + this.d[n10 + n11++];
                    }
                    case 7: {
                        int n13 = n + n8++;
                        fArray[n13] = fArray[n13] + this.d[n10 + n11++];
                    }
                    case 6: {
                        int n14 = n + n8++;
                        fArray[n14] = fArray[n14] + this.d[n10 + n11++];
                    }
                    case 5: {
                        int n15 = n + n8++;
                        fArray[n15] = fArray[n15] + this.d[n10 + n11++];
                    }
                    case 4: {
                        int n16 = n + n8++;
                        fArray[n16] = fArray[n16] + this.d[n10 + n11++];
                    }
                    case 3: {
                        int n17 = n + n8++;
                        fArray[n17] = fArray[n17] + this.d[n10 + n11++];
                    }
                    case 2: {
                        int n18 = n + n8++;
                        fArray[n18] = fArray[n18] + this.d[n10 + n11++];
                    }
                    case 1: {
                        int n19 = n + n8++;
                        fArray[n19] = fArray[n19] + this.d[n10 + n11++];
                    }
                }
            }
        }
        return 0;
    }

    int c(float[] fArray, int n, fks_2 fks_22, int n2) {
        int n3 = 0;
        while (n3 < n2) {
            int n4 = this.a(fks_22);
            if (n4 == -1) {
                return -1;
            }
            int n5 = n4 * this.a;
            int n6 = 0;
            while (n6 < this.a) {
                fArray[n + n3++] = this.d[n5 + n6++];
            }
        }
        return 0;
    }

    int a(float[][] fArray, int n, int n2, fks_2 fks_22, int n3) {
        int n4 = 0;
        int n5 = n / n2;
        while (n5 < (n + n3) / n2) {
            int n6 = this.a(fks_22);
            if (n6 == -1) {
                return -1;
            }
            int n7 = n6 * this.a;
            for (int k = 0; k < this.a; ++k) {
                float[] fArray2 = fArray[n4++];
                int n8 = n5++;
                fArray2[n8] = fArray2[n8] + this.d[n7 + k];
                if (n4 != n2) continue;
                n4 = 0;
            }
        }
        return 0;
    }

    int a(fks_2 fks_22) {
        int n = 0;
        fla_2 fla_22 = this.f;
        int n2 = fks_22.a(fla_22.c);
        if (n2 >= 0) {
            n = fla_22.a[n2];
            fks_22.b(fla_22.b[n2]);
            if (n <= 0) {
                return -n;
            }
        }
        do {
            switch (fks_22.f()) {
                case 0: {
                    n = fla_22.d[n];
                    break;
                }
                case 1: {
                    n = fla_22.e[n];
                    break;
                }
                default: {
                    return -1;
                }
            }
        } while (n > 0);
        return -n;
    }

    int a(float[] fArray, int n, fks_2 fks_22, int n2, int n3) {
        int n4 = this.a(fks_22);
        if (n4 == -1) {
            return -1;
        }
        switch (n3) {
            case -1: {
                int n5 = 0;
                int n6 = 0;
                while (n5 < this.a) {
                    fArray[n + n6] = this.d[n4 * this.a + n5];
                    ++n5;
                    n6 += n2;
                }
                break;
            }
            case 0: {
                int n7 = 0;
                int n8 = 0;
                while (n7 < this.a) {
                    int n9 = n + n8;
                    fArray[n9] = fArray[n9] + this.d[n4 * this.a + n7];
                    ++n7;
                    n8 += n2;
                }
                break;
            }
            case 1: {
                int n10 = 0;
                int n11 = 0;
                while (n10 < this.a) {
                    int n12 = n + n11;
                    fArray[n12] = fArray[n12] * this.d[n4 * this.a + n10];
                    ++n10;
                    n11 += n2;
                }
                break;
            }
        }
        return n4;
    }

    int a(float[] fArray, int n) {
        int n2 = -1;
        float f2 = 0.0f;
        int n3 = 0;
        for (int k = 0; k < this.b; ++k) {
            if (this.c.c[k] > 0) {
                float f3 = fkz_2.a(this.a, this.d, n3, fArray, n);
                if (n2 == -1 || f3 < f2) {
                    f2 = f3;
                    n2 = k;
                }
            }
            n3 += this.a;
        }
        return n2;
    }

    int a(float[] fArray, int n, int n2) {
        int n3 = this.a(fArray, n);
        switch (n2) {
            case 0: {
                int n4 = 0;
                int n5 = 0;
                while (n4 < this.a) {
                    int n6 = n5;
                    fArray[n6] = fArray[n6] - this.d[n3 * this.a + n4];
                    ++n4;
                    n5 += n;
                }
                break;
            }
            case 1: {
                int n7 = 0;
                int n8 = 0;
                while (n7 < this.a) {
                    float f2 = this.d[n3 * this.a + n7];
                    if (f2 == 0.0f) {
                        fArray[n8] = 0.0f;
                    } else {
                        int n9 = n8;
                        fArray[n9] = fArray[n9] / f2;
                    }
                    ++n7;
                    n8 += n;
                }
                break;
            }
        }
        return n3;
    }

    void a() {
    }

    private static float a(int n, float[] fArray, int n2, float[] fArray2, int n3) {
        float f2 = 0.0f;
        for (int k = 0; k < n; ++k) {
            float f3 = fArray[n2 + k] - fArray2[k * n3];
            f2 += f3 * f3;
        }
        return f2;
    }

    int a(flj_2 flj_22) {
        this.c = flj_22;
        this.b = flj_22.b;
        this.a = flj_22.a;
        this.d = flj_22.b();
        this.f = this.b();
        if (this.f == null) {
            this.a();
            return -1;
        }
        return 0;
    }

    static int[] a(int[] nArray, int n) {
        int n2;
        int n3;
        int n4;
        int[] nArray2 = new int[33];
        int[] nArray3 = new int[n];
        for (n4 = 0; n4 < n; ++n4) {
            n3 = nArray[n4];
            if (n3 <= 0) continue;
            n2 = nArray2[n3];
            if (n3 < 32 && n2 >>> n3 != 0) {
                return null;
            }
            nArray3[n4] = n2;
            int n5 = n3;
            while (n5 > 0) {
                if ((nArray2[n5] & 1) != 0) {
                    if (n5 == 1) {
                        nArray2[1] = nArray2[1] + 1;
                        break;
                    }
                    nArray2[n5] = nArray2[n5 - 1] << 1;
                    break;
                }
                int n6 = n5--;
                nArray2[n6] = nArray2[n6] + 1;
            }
            for (n5 = n3 + 1; n5 < 33 && nArray2[n5] >>> 1 == n2; ++n5) {
                n2 = nArray2[n5];
                nArray2[n5] = nArray2[n5 - 1] << 1;
            }
        }
        for (n4 = 0; n4 < n; ++n4) {
            n3 = 0;
            for (n2 = 0; n2 < nArray[n4]; ++n2) {
                n3 <<= 1;
                n3 |= nArray3[n4] >>> n2 & 1;
            }
            nArray3[n4] = n3;
        }
        return nArray3;
    }

    fla_2 b() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = 0;
        fla_2 fla_22 = new fla_2(this);
        fla_22.d = new int[this.b * 2];
        int[] nArray = fla_22.d;
        fla_22.e = new int[this.b * 2];
        int[] nArray2 = fla_22.e;
        int[] nArray3 = fkz_2.a(this.c.c, this.c.b);
        if (nArray3 == null) {
            return null;
        }
        fla_22.f = this.b * 2;
        for (n4 = 0; n4 < this.b; ++n4) {
            if (this.c.c[n4] <= 0) continue;
            n3 = 0;
            for (n2 = 0; n2 < this.c.c[n4] - 1; ++n2) {
                n = nArray3[n4] >>> n2 & 1;
                if (n == 0) {
                    if (nArray[n3] == 0) {
                        nArray[n3] = ++n5;
                    }
                    n3 = nArray[n3];
                    continue;
                }
                if (nArray2[n3] == 0) {
                    nArray2[n3] = ++n5;
                }
                n3 = nArray2[n3];
            }
            if ((nArray3[n4] >>> n2 & 1) == 0) {
                nArray[n3] = -n4;
                continue;
            }
            nArray2[n3] = -n4;
        }
        fla_22.c = fll_2.a(this.b) - 4;
        if (fla_22.c < 5) {
            fla_22.c = 5;
        }
        n4 = 1 << fla_22.c;
        fla_22.a = new int[n4];
        fla_22.b = new int[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = 0;
            n = 0;
            for (n = 0; n < fla_22.c && (n2 > 0 || n == 0); ++n) {
                n2 = (n3 & 1 << n) != 0 ? nArray2[n2] : nArray[n2];
            }
            fla_22.a[n3] = n2;
            fla_22.b[n3] = n;
        }
        return fla_22;
    }
}

