/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKS
 */
public class fks_2 {
    private static final int f = 256;
    private static final int[] g = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, Short.MAX_VALUE, 65535, 131071, 262143, 524287, 1048575, 0x1FFFFF, 0x3FFFFF, 0x7FFFFF, 0xFFFFFF, 0x1FFFFFF, 0x3FFFFFF, 0x7FFFFFF, 0xFFFFFFF, 0x1FFFFFFF, 0x3FFFFFFF, Integer.MAX_VALUE, -1};
    int a = 0;
    byte[] b = null;
    int c = 0;
    int d = 0;
    int e = 0;

    public void a() {
        this.b = new byte[256];
        this.a = 0;
        this.b[0] = 0;
        this.e = 256;
    }

    public void a(byte[] byArray) {
        for (byte by : byArray) {
            if (by == 0) break;
            this.a(by, 8);
        }
    }

    public void a(byte[] byArray, int n) {
        int n2 = 0;
        while (n-- != 0) {
            byArray[n2++] = (byte)this.c(8);
        }
    }

    void b() {
        this.a = 0;
        this.b[0] = 0;
        this.d = 0;
        this.c = 0;
    }

    public void c() {
        this.b = null;
    }

    public void b(byte[] byArray, int n) {
        this.a(byArray, 0, n);
    }

    public void a(byte[] byArray, int n, int n2) {
        this.a = n;
        this.b = byArray;
        this.d = 0;
        this.c = 0;
        this.e = n2;
    }

    public void a(int n, int n2) {
        if (this.d + 4 >= this.e) {
            byte[] byArray = new byte[this.e + 256];
            System.arraycopy(this.b, 0, byArray, 0, this.e);
            this.b = byArray;
            this.e += 256;
        }
        n &= g[n2];
        int n3 = this.a;
        this.b[n3] = (byte)(this.b[n3] | (byte)(n << this.c));
        if ((n2 += this.c) >= 8) {
            this.b[this.a + 1] = (byte)(n >>> 8 - this.c);
            if (n2 >= 16) {
                this.b[this.a + 2] = (byte)(n >>> 16 - this.c);
                if (n2 >= 24) {
                    this.b[this.a + 3] = (byte)(n >>> 24 - this.c);
                    if (n2 >= 32) {
                        this.b[this.a + 4] = this.c > 0 ? (byte)(n >>> 32 - this.c) : (byte)0;
                    }
                }
            }
        }
        this.d += n2 / 8;
        this.a += n2 / 8;
        this.c = n2 & 7;
    }

    public int a(int n) {
        int n2 = g[n];
        if (this.d + 4 >= this.e && this.d + ((n += this.c) - 1) / 8 >= this.e) {
            return -1;
        }
        int n3 = (this.b[this.a] & 0xFF) >>> this.c;
        if (n > 8) {
            n3 |= (this.b[this.a + 1] & 0xFF) << 8 - this.c;
            if (n > 16) {
                n3 |= (this.b[this.a + 2] & 0xFF) << 16 - this.c;
                if (n > 24) {
                    n3 |= (this.b[this.a + 3] & 0xFF) << 24 - this.c;
                    if (n > 32 && this.c != 0) {
                        n3 |= (this.b[this.a + 4] & 0xFF) << 32 - this.c;
                    }
                }
            }
        }
        return n2 & n3;
    }

    public int d() {
        if (this.d >= this.e) {
            return -1;
        }
        return this.b[this.a] >> this.c & 1;
    }

    public void b(int n) {
        this.a += (n += this.c) / 8;
        this.d += n / 8;
        this.c = n & 7;
    }

    public void e() {
        ++this.c;
        if (this.c > 7) {
            this.c = 0;
            ++this.a;
            ++this.d;
        }
    }

    public int c(int n) {
        int n2;
        int n3 = g[n];
        n += this.c;
        if (this.d + 4 >= this.e) {
            n2 = -1;
            if (this.d + (n - 1) / 8 >= this.e) {
                this.a += n / 8;
                this.d += n / 8;
                this.c = n & 7;
                return n2;
            }
        }
        n2 = (this.b[this.a] & 0xFF) >>> this.c;
        if (n > 8) {
            n2 |= (this.b[this.a + 1] & 0xFF) << 8 - this.c;
            if (n > 16) {
                n2 |= (this.b[this.a + 2] & 0xFF) << 16 - this.c;
                if (n > 24) {
                    n2 |= (this.b[this.a + 3] & 0xFF) << 24 - this.c;
                    if (n > 32 && this.c != 0) {
                        n2 |= (this.b[this.a + 4] & 0xFF) << 32 - this.c;
                    }
                }
            }
        }
        this.a += n / 8;
        this.d += n / 8;
        this.c = n & 7;
        return n2 &= n3;
    }

    public int d(int n) {
        int n2;
        int n3 = 32 - n;
        n += this.c;
        if (this.d + 4 >= this.e) {
            n2 = -1;
            if (this.d * 8 + n > this.e * 8) {
                this.a += n / 8;
                this.d += n / 8;
                this.c = n & 7;
                return n2;
            }
        }
        n2 = (this.b[this.a] & 0xFF) << 24 + this.c;
        if (n > 8) {
            n2 |= (this.b[this.a + 1] & 0xFF) << 16 + this.c;
            if (n > 16) {
                n2 |= (this.b[this.a + 2] & 0xFF) << 8 + this.c;
                if (n > 24) {
                    n2 |= (this.b[this.a + 3] & 0xFF) << this.c;
                    if (n > 32 && this.c != 0) {
                        n2 |= (this.b[this.a + 4] & 0xFF) >> 8 - this.c;
                    }
                }
            }
        }
        n2 = n2 >>> (n3 >> 1) >>> (n3 + 1 >> 1);
        this.a += n / 8;
        this.d += n / 8;
        this.c = n & 7;
        return n2;
    }

    public int f() {
        if (this.d >= this.e) {
            int n = -1;
            ++this.c;
            if (this.c > 7) {
                this.c = 0;
                ++this.a;
                ++this.d;
            }
            return n;
        }
        int n = this.b[this.a] >> this.c & 1;
        ++this.c;
        if (this.c > 7) {
            this.c = 0;
            ++this.a;
            ++this.d;
        }
        return n;
    }

    public int g() {
        return this.d + (this.c + 7) / 8;
    }

    public int h() {
        return this.d * 8 + this.c;
    }

    public byte[] i() {
        return this.b;
    }

    public static int e(int n) {
        int n2 = 0;
        while (n > 0) {
            ++n2;
            n >>>= 1;
        }
        return n2;
    }

    public static void a(String string) {
        System.err.println(string);
        System.exit(1);
    }
}

