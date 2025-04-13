/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKV
 */
public class fkv_2 {
    byte[] a;
    int b;
    int c;
    private int r;
    int[] d;
    long[] e;
    int f;
    int g;
    int h;
    int i;
    final byte[] j = new byte[282];
    int k;
    public int l;
    int m;
    int n;
    int o;
    long p;
    long q;

    public fkv_2() {
        this.a();
    }

    fkv_2(int n) {
        this();
        this.a(n);
    }

    void a() {
        this.b = 16384;
        this.a = new byte[this.b];
        this.f = 1024;
        this.d = new int[this.f];
        this.e = new long[this.f];
    }

    public void b() {
        this.f();
    }

    public void a(int n) {
        if (this.a == null) {
            this.a();
        } else {
            int n2;
            for (n2 = 0; n2 < this.a.length; ++n2) {
                this.a[n2] = 0;
            }
            for (n2 = 0; n2 < this.d.length; ++n2) {
                this.d[n2] = 0;
            }
            for (n2 = 0; n2 < this.e.length; ++n2) {
                this.e[n2] = 0L;
            }
        }
        this.n = n;
    }

    public void c() {
        this.a = null;
        this.d = null;
        this.e = null;
    }

    void d() {
        this.c();
    }

    void b(int n) {
        if (this.b <= this.c + n) {
            this.b += n + 1024;
            byte[] byArray = new byte[this.b];
            System.arraycopy(this.a, 0, byArray, 0, this.a.length);
            this.a = byArray;
        }
    }

    void c(int n) {
        if (this.f <= this.g + n) {
            this.f += n + 32;
            int[] nArray = new int[this.f];
            System.arraycopy(this.d, 0, nArray, 0, this.d.length);
            this.d = nArray;
            long[] lArray = new long[this.f];
            System.arraycopy(this.e, 0, lArray, 0, this.e.length);
            this.e = lArray;
        }
    }

    public int a(fkt_2 fkt_22) {
        int n = fkt_22.c / 255 + 1;
        if (this.r != 0) {
            this.c -= this.r;
            if (this.c != 0) {
                System.arraycopy(this.a, this.r, this.a, 0, this.c);
            }
            this.r = 0;
        }
        this.b(fkt_22.c);
        this.c(n);
        System.arraycopy(fkt_22.a, fkt_22.b, this.a, this.c, fkt_22.c);
        this.c += fkt_22.c;
        for (int k = 0; k < n - 1; ++k) {
            this.d[this.g + k] = 255;
            this.e[this.g + k] = this.q;
        }
        this.d[this.g + k] = fkt_22.c % 255;
        long l = fkt_22.f;
        this.e[this.g + k] = l;
        this.q = l;
        int n2 = this.g;
        this.d[n2] = this.d[n2] | 0x100;
        this.g += n;
        ++this.p;
        if (fkt_22.e != 0) {
            this.l = 1;
        }
        return 0;
    }

    public int b(fkt_2 fkt_22) {
        int n;
        if (this.h <= (n = this.i++)) {
            return 0;
        }
        if ((this.d[n] & 0x400) != 0) {
            ++this.p;
            return -1;
        }
        int n2 = this.d[n] & 0xFF;
        int n3 = 0;
        fkt_22.a = this.a;
        fkt_22.b = this.r;
        fkt_22.e = this.d[n] & 0x200;
        fkt_22.d = this.d[n] & 0x100;
        n3 += n2;
        while (n2 == 255) {
            int n4 = this.d[++n];
            n2 = n4 & 0xFF;
            if ((n4 & 0x200) != 0) {
                fkt_22.e = 512;
            }
            n3 += n2;
        }
        fkt_22.g = this.p++;
        fkt_22.f = this.e[n];
        fkt_22.c = n3;
        this.r += n3;
        this.i = n + 1;
        return 1;
    }

    public int a(fku_2 fku_22) {
        byte[] byArray = fku_22.a;
        int n = fku_22.b;
        byte[] byArray2 = fku_22.d;
        int n2 = fku_22.e;
        int n3 = fku_22.f;
        int n4 = 0;
        int n5 = fku_22.b();
        int n6 = fku_22.c();
        int n7 = fku_22.d();
        int n8 = fku_22.e();
        long l = fku_22.f();
        int n9 = fku_22.g();
        int n10 = fku_22.h();
        int n11 = byArray[n + 26] & 0xFF;
        int n12 = this.i;
        int n13 = this.r;
        if (n13 != 0) {
            this.c -= n13;
            if (this.c != 0) {
                System.arraycopy(this.a, n13, this.a, 0, this.c);
            }
            this.r = 0;
        }
        if (n12 != 0) {
            if (this.g - n12 != 0) {
                System.arraycopy(this.d, n12, this.d, 0, this.g - n12);
                System.arraycopy(this.e, n12, this.e, 0, this.g - n12);
            }
            this.g -= n12;
            this.h -= n12;
            this.i = 0;
        }
        if (n9 != this.n) {
            return -1;
        }
        if (n5 > 0) {
            return -1;
        }
        this.c(n11 + 1);
        if (n10 != this.o) {
            for (n12 = this.h; n12 < this.g; ++n12) {
                this.c -= this.d[n12] & 0xFF;
            }
            this.g = this.h++;
            if (this.o != -1) {
                this.d[this.g++] = 1024;
            }
            if (n6 != 0) {
                n7 = 0;
                while (n4 < n11) {
                    n13 = byArray[n + 27 + n4] & 0xFF;
                    n2 += n13;
                    n3 -= n13;
                    if (n13 < 255) {
                        ++n4;
                        break;
                    }
                    ++n4;
                }
            }
        }
        if (n3 != 0) {
            this.b(n3);
            System.arraycopy(byArray2, n2, this.a, this.c, n3);
            this.c += n3;
        }
        n12 = -1;
        while (n4 < n11) {
            this.d[this.g] = n13 = byArray[n + 27 + n4] & 0xFF;
            this.e[this.g] = -1L;
            if (n7 != 0) {
                int n14 = this.g;
                this.d[n14] = this.d[n14] | 0x100;
                n7 = 0;
            }
            if (n13 < 255) {
                n12 = this.g;
            }
            ++this.g;
            ++n4;
            if (n13 >= 255) continue;
            this.h = this.g;
        }
        if (n12 != -1) {
            this.e[n12] = l;
        }
        if (n8 != 0) {
            this.l = 1;
            if (this.g > 0) {
                int n15 = this.g - 1;
                this.d[n15] = this.d[n15] | 0x200;
            }
        }
        this.o = n10 + 1;
        return 0;
    }

    public int b(fku_2 fku_22) {
        int n;
        int n2 = 0;
        int n3 = this.g > 255 ? 255 : this.g;
        int n4 = 0;
        int n5 = 0;
        long l = this.e[0];
        if (n3 == 0) {
            return 0;
        }
        if (this.m == 0) {
            l = 0L;
            for (n2 = 0; n2 < n3; ++n2) {
                if ((this.d[n2] & 0xFF) >= 255) continue;
                ++n2;
                break;
            }
        } else {
            for (n2 = 0; n2 < n3 && n5 <= 4096; n5 += this.d[n2] & 0xFF, ++n2) {
                l = this.e[n2];
            }
        }
        System.arraycopy("OggS".getBytes(), 0, this.j, 0, 4);
        this.j[4] = 0;
        this.j[5] = 0;
        if ((this.d[0] & 0x100) == 0) {
            this.j[5] = (byte)(this.j[5] | 1);
        }
        if (this.m == 0) {
            this.j[5] = (byte)(this.j[5] | 2);
        }
        if (this.l != 0 && this.g == n2) {
            this.j[5] = (byte)(this.j[5] | 4);
        }
        this.m = 1;
        for (n = 6; n < 14; ++n) {
            this.j[n] = (byte)l;
            l >>>= 8;
        }
        int n6 = this.n;
        for (n = 14; n < 18; ++n) {
            this.j[n] = (byte)n6;
            n6 >>>= 8;
        }
        if (this.o == -1) {
            this.o = 0;
        }
        n6 = this.o++;
        for (n = 18; n < 22; ++n) {
            this.j[n] = (byte)n6;
            n6 >>>= 8;
        }
        this.j[22] = 0;
        this.j[23] = 0;
        this.j[24] = 0;
        this.j[25] = 0;
        this.j[26] = (byte)n2;
        for (n = 0; n < n2; ++n) {
            this.j[n + 27] = (byte)this.d[n];
            n4 += this.j[n + 27] & 0xFF;
        }
        fku_22.a = this.j;
        fku_22.b = 0;
        fku_22.c = this.k = n2 + 27;
        fku_22.d = this.a;
        fku_22.e = this.r;
        fku_22.f = n4;
        this.g -= n2;
        System.arraycopy(this.d, n2, this.d, 0, this.g * 4);
        System.arraycopy(this.e, n2, this.e, 0, this.g * 8);
        this.r += n4;
        fku_22.i();
        return 1;
    }

    public int c(fku_2 fku_22) {
        if (this.l != 0 && this.g != 0 || this.c - this.r > 4096 || this.g >= 255 || this.g != 0 && this.m == 0) {
            return this.b(fku_22);
        }
        return 0;
    }

    public int e() {
        return this.l;
    }

    public int f() {
        this.c = 0;
        this.r = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.o = -1;
        this.p = 0L;
        this.q = 0L;
        return 0;
    }
}

