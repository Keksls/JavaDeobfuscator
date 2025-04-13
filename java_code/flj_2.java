/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLJ
 */
class flj_2 {
    int a;
    int b;
    int[] c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int[] i;
    static final int j = 10;
    static final int k = 21;
    static final int l = 768;

    flj_2() {
    }

    int a(fks_2 fks_22) {
        int n;
        int n2;
        boolean bl = false;
        fks_22.a(5653314, 24);
        fks_22.a(this.a, 16);
        fks_22.a(this.b, 24);
        for (n2 = 1; n2 < this.b && this.c[n2] >= this.c[n2 - 1]; ++n2) {
        }
        if (n2 == this.b) {
            bl = true;
        }
        if (bl) {
            n = 0;
            fks_22.a(1, 1);
            fks_22.a(this.c[0] - 1, 5);
            for (n2 = 1; n2 < this.b; ++n2) {
                int n3 = this.c[n2];
                int n4 = this.c[n2 - 1];
                if (n3 <= n4) continue;
                for (int k = n4; k < n3; ++k) {
                    fks_22.a(n2 - n, fll_2.a(this.b - n));
                    n = n2;
                }
            }
            fks_22.a(n2 - n, fll_2.a(this.b - n));
        } else {
            fks_22.a(0, 1);
            for (n2 = 0; n2 < this.b && this.c[n2] != 0; ++n2) {
            }
            if (n2 == this.b) {
                fks_22.a(0, 1);
                for (n2 = 0; n2 < this.b; ++n2) {
                    fks_22.a(this.c[n2] - 1, 5);
                }
            } else {
                fks_22.a(1, 1);
                for (n2 = 0; n2 < this.b; ++n2) {
                    if (this.c[n2] == 0) {
                        fks_22.a(0, 1);
                        continue;
                    }
                    fks_22.a(1, 1);
                    fks_22.a(this.c[n2] - 1, 5);
                }
            }
        }
        fks_22.a(this.d, 4);
        switch (this.d) {
            case 0: {
                break;
            }
            case 1: 
            case 2: {
                if (this.i == null) {
                    return -1;
                }
                fks_22.a(this.e, 32);
                fks_22.a(this.f, 32);
                fks_22.a(this.g - 1, 4);
                fks_22.a(this.h, 1);
                n = 0;
                switch (this.d) {
                    case 1: {
                        n = this.c();
                        break;
                    }
                    case 2: {
                        n = this.b * this.a;
                    }
                }
                for (n2 = 0; n2 < n; ++n2) {
                    fks_22.a(Math.abs(this.i[n2]), this.g);
                }
                break;
            }
            default: {
                return -1;
            }
        }
        return 0;
    }

    int b(fks_2 fks_22) {
        int n;
        int n2;
        if (fks_22.c(24) != 5653314) {
            this.a();
            return -1;
        }
        this.a = fks_22.c(16);
        this.b = fks_22.c(24);
        if (this.b == -1) {
            this.a();
            return -1;
        }
        switch (fks_22.c(1)) {
            case 0: {
                this.c = new int[this.b];
                if (fks_22.c(1) != 0) {
                    for (n2 = 0; n2 < this.b; ++n2) {
                        if (fks_22.c(1) != 0) {
                            n = fks_22.c(5);
                            if (n == -1) {
                                this.a();
                                return -1;
                            }
                            this.c[n2] = n + 1;
                            continue;
                        }
                        this.c[n2] = 0;
                    }
                } else {
                    for (n2 = 0; n2 < this.b; ++n2) {
                        n = fks_22.c(5);
                        if (n == -1) {
                            this.a();
                            return -1;
                        }
                        this.c[n2] = n + 1;
                    }
                }
                break;
            }
            case 1: {
                n = fks_22.c(5) + 1;
                this.c = new int[this.b];
                n2 = 0;
                while (n2 < this.b) {
                    int n3 = fks_22.c(fll_2.a(this.b - n2));
                    if (n3 == -1) {
                        this.a();
                        return -1;
                    }
                    int n4 = 0;
                    while (n4 < n3) {
                        this.c[n2] = n;
                        ++n4;
                        ++n2;
                    }
                    ++n;
                }
                break;
            }
            default: {
                return -1;
            }
        }
        this.d = fks_22.c(4);
        switch (this.d) {
            case 0: {
                break;
            }
            case 1: 
            case 2: {
                this.e = fks_22.c(32);
                this.f = fks_22.c(32);
                this.g = fks_22.c(4) + 1;
                this.h = fks_22.c(1);
                n = 0;
                switch (this.d) {
                    case 1: {
                        n = this.c();
                        break;
                    }
                    case 2: {
                        n = this.b * this.a;
                    }
                }
                this.i = new int[n];
                for (n2 = 0; n2 < n; ++n2) {
                    this.i[n2] = fks_22.c(this.g);
                }
                if (this.i[n - 1] != -1) break;
                this.a();
                return -1;
            }
            default: {
                this.a();
                return -1;
            }
        }
        return 0;
    }

    private int c() {
        int n = (int)Math.floor(Math.pow(this.b, 1.0 / (double)this.a));
        while (true) {
            int n2 = 1;
            int n3 = 1;
            for (int k = 0; k < this.a; ++k) {
                n2 *= n;
                n3 *= n + 1;
            }
            if (n2 <= this.b && n3 > this.b) {
                return n;
            }
            if (n2 > this.b) {
                --n;
                continue;
            }
            ++n;
        }
    }

    void a() {
    }

    float[] b() {
        if (this.d == 1 || this.d == 2) {
            float f2 = flj_2.a(this.e);
            float f3 = flj_2.a(this.f);
            float[] fArray = new float[this.b * this.a];
            switch (this.d) {
                case 1: {
                    int n = this.c();
                    for (int k = 0; k < this.b; ++k) {
                        float f4 = 0.0f;
                        int n2 = 1;
                        for (int i2 = 0; i2 < this.a; ++i2) {
                            int n3 = k / n2 % n;
                            float f5 = this.i[n3];
                            f5 = Math.abs(f5) * f3 + f2 + f4;
                            if (this.h != 0) {
                                f4 = f5;
                            }
                            fArray[k * this.a + i2] = f5;
                            n2 *= n;
                        }
                    }
                    break;
                }
                case 2: {
                    for (int k = 0; k < this.b; ++k) {
                        float f6 = 0.0f;
                        for (int i3 = 0; i3 < this.a; ++i3) {
                            float f7 = this.i[k * this.a + i3];
                            f7 = Math.abs(f7) * f3 + f2 + f6;
                            if (this.h != 0) {
                                f6 = f7;
                            }
                            fArray[k * this.a + i3] = f7;
                        }
                    }
                    break;
                }
            }
            return fArray;
        }
        return null;
    }

    static long a(float f2) {
        int n = 0;
        if (f2 < 0.0f) {
            n = Integer.MIN_VALUE;
            f2 = -f2;
        }
        int n2 = (int)Math.floor(Math.log(f2) / Math.log(2.0));
        int n3 = (int)Math.rint(Math.pow(f2, 20 - n2));
        n2 = n2 + 768 << 21;
        return n | n2 | n3;
    }

    static float a(int n) {
        float f2 = n & 0x1FFFFF;
        float f3 = (n & 0x7FE00000) >>> 21;
        if ((n & Integer.MIN_VALUE) != 0) {
            f2 = -f2;
        }
        return flj_2.a(f2, (int)f3 - 20 - 768);
    }

    static float a(float f2, int n) {
        return (float)((double)f2 * Math.pow(2.0, n));
    }
}

