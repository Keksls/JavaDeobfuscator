/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;

/*
 * Renamed from fLM
 */
public class flm_1 {
    static final int a = 8500;
    static final int b = 0;
    static final int c = 1;
    static final int d = 2;
    static final int e = -1;
    static final int f = -2;
    static final int g = -3;
    static final int h = -128;
    static final int i = -129;
    static final int j = -130;
    static final int k = -131;
    static final int l = -132;
    static final int m = -133;
    static final int n = -134;
    static final int o = -135;
    static final int p = -136;
    static final int q = -137;
    static final int r = -138;
    InputStream s;
    boolean t = false;
    long u;
    long v;
    final fkw_2 w = new fkw_2();
    int x;
    long[] y;
    long[] z;
    int[] A;
    long[] B;
    fls_1[] C;
    flb_1[] D;
    long E;
    boolean F = false;
    int G;
    int H;
    float I;
    float J;
    final fkv_2 K = new fkv_2();
    final fle_1 L = new fle_1();
    final fkx_2 M = new fkx_2(this.L);

    public flm_1(String string) {
        fln_2 fln_22 = null;
        try {
            fln_22 = new fln_2(this, string);
            int n = this.a(fln_22, null, 0);
            if (n == -1) {
                throw new flu_1("VorbisFile: open return -1");
            }
        }
        catch (Exception exception) {
            throw new flu_1("VorbisFile: " + exception.toString());
        }
        finally {
            if (fln_22 != null) {
                try {
                    ((InputStream)fln_22).close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }

    public flm_1(InputStream inputStream, byte[] byArray, int n) {
        int n2 = this.a(inputStream, byArray, n);
        if (n2 == -1) {
            // empty if block
        }
    }

    private int o() {
        int n = this.w.a(8500);
        byte[] byArray = this.w.a;
        int n2 = 0;
        try {
            n2 = this.s.read(byArray, n, 8500);
        }
        catch (Exception exception) {
            return -128;
        }
        this.w.b(n2);
        if (n2 == -1) {
            n2 = 0;
        }
        return n2;
    }

    private void b(long l) {
        flm_1.a(this.s, l, 0);
        this.u = l;
        this.w.c();
    }

    private int a(fku_2 fku_22, long l) {
        int n;
        int n2;
        block6: {
            if (l > 0L) {
                l += this.u;
            }
            while (true) {
                if (l > 0L && this.u >= l) {
                    return -1;
                }
                n2 = this.w.a(fku_22);
                if (n2 < 0) {
                    this.u -= (long)n2;
                    continue;
                }
                if (n2 != 0) break block6;
                if (l == 0L) {
                    return -1;
                }
                n = this.o();
                if (n == 0) {
                    return -2;
                }
                if (n < 0) break;
            }
            return -128;
        }
        n = (int)this.u;
        this.u += (long)n2;
        return n;
    }

    private int a(fku_2 fku_22) {
        int n;
        long l = this.u;
        int n2 = -1;
        block0: while (n2 == -1) {
            if ((l -= 8500L) < 0L) {
                l = 0L;
            }
            this.b(l);
            while (this.u < l + 8500L) {
                n = this.a(fku_22, l + 8500L - this.u);
                if (n == -128) {
                    return -128;
                }
                if (n < 0) {
                    if (n2 != -1) continue block0;
                    throw new flu_1();
                }
                n2 = n;
            }
        }
        this.b((long)n2);
        n = this.a(fku_22, 8500L);
        if (n < 0) {
            return -129;
        }
        return n2;
    }

    int a(long l, long l2, long l3, int n, int n2) {
        int n3;
        long l4 = l3;
        long l5 = l3;
        fku_2 fku_22 = new fku_2();
        while (l2 < l4) {
            long l6 = l4 - l2 < 8500L ? l2 : (l2 + l4) / 2L;
            this.b(l6);
            n3 = this.a(fku_22, -1L);
            if (n3 == -128) {
                return -128;
            }
            if (n3 < 0 || fku_22.g() != n) {
                l4 = l6;
                if (n3 < 0) continue;
                l5 = n3;
                continue;
            }
            l2 = n3 + fku_22.c + fku_22.f;
        }
        this.b(l5);
        n3 = this.a(fku_22, -1L);
        if (n3 == -128) {
            return -128;
        }
        if (l2 >= l3 || n3 == -1) {
            this.x = n2 + 1;
            this.y = new long[n2 + 2];
            this.y[n2 + 1] = l2;
        } else {
            n3 = this.a(l5, this.u, l3, fku_22.g(), n2 + 1);
            if (n3 == -128) {
                return -128;
            }
        }
        this.y[n2] = l;
        return 0;
    }

    int a(fls_1 fls_12, flb_1 flb_12, int[] nArray, fku_2 fku_22) {
        fku_2 fku_23 = new fku_2();
        fkt_2 fkt_22 = new fkt_2();
        if (fku_22 == null) {
            int n = this.a(fku_23, 8500L);
            if (n == -128) {
                return -128;
            }
            if (n < 0) {
                return -132;
            }
            fku_22 = fku_23;
        }
        if (nArray != null) {
            nArray[0] = fku_22.g();
        }
        this.K.a(fku_22.g());
        fls_12.a();
        flb_12.a();
        int n = 0;
        while (n < 3) {
            int n2;
            this.K.a(fku_22);
            while (n < 3 && (n2 = this.K.b(fkt_22)) != 0) {
                if (n2 == -1) {
                    fls_12.b();
                    flb_12.b();
                    this.K.c();
                    return -1;
                }
                if (fls_12.a(flb_12, fkt_22) != 0) {
                    fls_12.b();
                    flb_12.b();
                    this.K.c();
                    return -1;
                }
                ++n;
            }
            if (n >= 3 || this.a(fku_22, 1L) >= 0) continue;
            fls_12.b();
            flb_12.b();
            this.K.c();
            return -1;
        }
        return 0;
    }

    void a(fls_1 fls_12, flb_1 flb_12, int n) {
        fku_2 fku_22 = new fku_2();
        this.C = new fls_1[this.x];
        this.D = new flb_1[this.x];
        this.z = new long[this.x];
        this.B = new long[this.x];
        this.A = new int[this.x];
        block0: for (int k = 0; k < this.x; ++k) {
            if (fls_12 != null && flb_12 != null && k == 0) {
                this.C[k] = fls_12;
                this.D[k] = flb_12;
                this.z[k] = n;
            } else {
                this.b(this.y[k]);
                this.C[k] = new fls_1();
                this.D[k] = new flb_1();
                if (this.a(this.C[k], this.D[k], null, null) == -1) {
                    this.z[k] = -1L;
                } else {
                    this.z[k] = this.u;
                    this.K.c();
                }
            }
            long l = this.y[k + 1];
            this.b(l);
            do {
                int n2;
                if ((n2 = this.a(fku_22)) != -1) continue;
                this.C[k].b();
                this.D[k].b();
                continue block0;
            } while (fku_22.f() == -1L);
            this.A[k] = fku_22.g();
            this.B[k] = fku_22.f();
        }
    }

    private int p() {
        if (this.F) {
            System.exit(1);
        }
        this.L.a(this.C[0]);
        this.M.a(this.L);
        this.F = true;
        return 0;
    }

    int a() {
        fls_1 fls_12 = new fls_1();
        flb_1 flb_12 = new flb_1();
        fku_2 fku_22 = new fku_2();
        int[] nArray = new int[1];
        int n = this.a(fls_12, flb_12, nArray, null);
        int n2 = nArray[0];
        int n3 = (int)this.u;
        this.K.c();
        if (n == -1) {
            return -1;
        }
        if (n < 0) {
            return n;
        }
        this.t = true;
        flm_1.a(this.s, 0L, 2);
        long l = this.u = flm_1.a(this.s);
        l = this.a(fku_22);
        if (fku_22.g() != n2) {
            if (this.a(0L, 0L, l + 1L, n2, 0) < 0) {
                this.d();
                return -128;
            }
        } else if (this.a(0L, l, l + 1L, n2, 0) < 0) {
            this.d();
            return -128;
        }
        this.a(fls_12, flb_12, n3);
        return 0;
    }

    int b() {
        this.x = 1;
        this.C = new fls_1[this.x];
        this.C[0] = new fls_1();
        this.D = new flb_1[this.x];
        this.D[0] = new flb_1();
        int[] nArray = new int[1];
        if (this.a(this.C[0], this.D[0], nArray, null) == -1) {
            return -1;
        }
        this.G = nArray[0];
        this.p();
        return 0;
    }

    void c() {
        this.K.c();
        this.L.a();
        this.M.a();
        this.F = false;
        this.I = 0.0f;
        this.J = 0.0f;
    }

    int a(int n) {
        fku_2 fku_22 = new fku_2();
        while (true) {
            fkt_2 fkt_22;
            int n2;
            if (this.F && (n2 = this.K.b(fkt_22 = new fkt_2())) > 0) {
                long l = fkt_22.f;
                if (this.M.a(fkt_22) == 0) {
                    int n3 = this.L.a(null, null);
                    this.L.a(this.M);
                    this.J += (float)(this.L.a(null, null) - n3);
                    this.I += (float)(fkt_22.c * 8);
                    if (l != -1L && fkt_22.e == 0) {
                        n3 = this.t ? this.H : 0;
                        int n4 = this.L.a(null, null);
                        l -= (long)n4;
                        for (int k = 0; k < n3; ++k) {
                            l += this.B[k];
                        }
                        this.E = l;
                    }
                    return 1;
                }
            }
            if (n == 0) {
                return 0;
            }
            if (this.a(fku_22, -1L) < 0) {
                return 0;
            }
            this.I += (float)(fku_22.c * 8);
            if (this.F && this.G != fku_22.g()) {
                this.c();
            }
            if (!this.F) {
                int n5;
                if (this.t) {
                    this.G = fku_22.g();
                    for (n5 = 0; n5 < this.x && this.A[n5] != this.G; ++n5) {
                    }
                    if (n5 == this.x) {
                        return -1;
                    }
                    this.H = n5;
                    this.K.a(this.G);
                    this.K.f();
                } else {
                    int[] nArray = new int[1];
                    int n6 = this.a(this.C[0], this.D[0], nArray, fku_22);
                    this.G = nArray[0];
                    if (n6 != 0) {
                        return n6;
                    }
                    ++this.H;
                    n5 = 0;
                }
                this.p();
            }
            this.K.a(fku_22);
        }
    }

    int d() {
        this.M.a();
        this.L.a();
        this.K.c();
        if (this.C != null && this.x != 0) {
            for (int k = 0; k < this.x; ++k) {
                this.C[k].b();
                this.D[k].b();
            }
            this.C = null;
            this.D = null;
        }
        if (this.z != null) {
            this.z = null;
        }
        if (this.B != null) {
            this.B = null;
        }
        if (this.A != null) {
            this.A = null;
        }
        if (this.y != null) {
            this.y = null;
        }
        this.w.a();
        return 0;
    }

    static int a(InputStream inputStream, long l, int n) {
        if (inputStream instanceof fln_2) {
            fln_2 fln_22 = (fln_2)inputStream;
            try {
                if (n == 0) {
                    fln_22.a(l);
                } else if (n == 2) {
                    fln_22.a(fln_22.a() - l);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            return 0;
        }
        try {
            if (n == 0) {
                inputStream.reset();
            }
            inputStream.skip(l);
        }
        catch (Exception exception) {
            return -1;
        }
        return 0;
    }

    static long a(InputStream inputStream) {
        try {
            if (inputStream instanceof fln_2) {
                fln_2 fln_22 = (fln_2)inputStream;
                return fln_22.b();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return 0L;
    }

    int a(InputStream inputStream, byte[] byArray, int n) {
        return this.b(inputStream, byArray, n);
    }

    int b(InputStream inputStream, byte[] byArray, int n) {
        int n2;
        this.s = inputStream;
        this.w.d();
        if (byArray != null) {
            int n3 = this.w.a(n);
            System.arraycopy(byArray, 0, this.w.a, n3, n);
            this.w.b(n);
        }
        if ((n2 = inputStream instanceof fln_2 ? this.a() : this.b()) != 0) {
            this.s = null;
            this.d();
        }
        return n2;
    }

    public int e() {
        return this.x;
    }

    public boolean f() {
        return this.t;
    }

    public int b(int n) {
        if (n >= this.x) {
            return -1;
        }
        if (!this.t && n != 0) {
            return this.b(0);
        }
        if (n < 0) {
            long l = 0L;
            for (int k = 0; k < this.x; ++k) {
                l += (this.y[k + 1] - this.z[k]) * 8L;
            }
            return (int)Math.rint((float)l / this.f(-1));
        }
        if (this.t) {
            return (int)Math.rint((float)((this.y[n + 1] - this.z[n]) * 8L) / this.f(n));
        }
        if (this.C[n].e > 0) {
            return this.C[n].e;
        }
        if (this.C[n].d > 0) {
            if (this.C[n].f > 0) {
                return (this.C[n].d + this.C[n].f) / 2;
            }
            return this.C[n].d;
        }
        return -1;
    }

    public int g() {
        int n;
        int n2 = n = this.t ? this.H : 0;
        if (this.J == 0.0f) {
            return -1;
        }
        int n3 = (int)((double)(this.I / this.J * (float)this.C[n].c) + 0.5);
        this.I = 0.0f;
        this.J = 0.0f;
        return n3;
    }

    public int c(int n) {
        if (n >= this.x) {
            return -1;
        }
        if (!this.t && n >= 0) {
            return this.c(-1);
        }
        if (n < 0) {
            return this.G;
        }
        return this.A[n];
    }

    public long d(int n) {
        if (!this.t || n >= this.x) {
            return -1L;
        }
        if (n < 0) {
            long l = 0L;
            for (int k = 0; k < this.x; ++k) {
                l += this.d(k);
            }
            return l;
        }
        return this.y[n + 1] - this.y[n];
    }

    public long e(int n) {
        if (!this.t || n >= this.x) {
            return -1L;
        }
        if (n < 0) {
            long l = 0L;
            for (int k = 0; k < this.x; ++k) {
                l += this.e(k);
            }
            return l;
        }
        return this.B[n];
    }

    public float f(int n) {
        if (!this.t || n >= this.x) {
            return -1.0f;
        }
        if (n < 0) {
            float f2 = 0.0f;
            for (int k = 0; k < this.x; ++k) {
                f2 += this.f(k);
            }
            return f2;
        }
        return (float)this.B[n] / (float)this.C[n].c;
    }

    public int g(int n) {
        if (!this.t) {
            return -1;
        }
        if (n < 0 || (long)n > this.y[this.x]) {
            this.E = -1L;
            this.c();
            return -1;
        }
        this.E = -1L;
        this.c();
        this.b((long)n);
        switch (this.a(1)) {
            case 0: {
                this.E = this.e(-1);
                return 0;
            }
            case -1: {
                this.E = -1L;
                this.c();
                return -1;
            }
        }
        while (true) {
            switch (this.a(0)) {
                case 0: {
                    return 0;
                }
                case -1: {
                    this.E = -1L;
                    this.c();
                    return -1;
                }
            }
        }
    }

    public int a(long l) {
        int n = -1;
        long l2 = this.e(-1);
        if (!this.t) {
            return -1;
        }
        if (l < 0L || l > l2) {
            this.E = -1L;
            this.c();
            return -1;
        }
        for (n = this.x - 1; n >= 0 && l < (l2 -= this.B[n]); --n) {
        }
        long l3 = l - l2;
        long l4 = this.y[n + 1];
        long l5 = this.y[n];
        int n2 = (int)l5;
        fku_2 fku_22 = new fku_2();
        while (l5 < l4) {
            long l6 = l4 - l5 < 8500L ? l5 : (l4 + l5) / 2L;
            this.b(l6);
            int n3 = this.a(fku_22, l4 - l6);
            if (n3 == -1) {
                l4 = l6;
                continue;
            }
            long l7 = fku_22.f();
            if (l7 < l3) {
                n2 = n3;
                l5 = this.u;
                continue;
            }
            l4 = l6;
        }
        if (this.g(n2) != 0) {
            this.E = -1L;
            this.c();
            return -1;
        }
        if (this.E >= l) {
            this.E = -1L;
            this.c();
            return -1;
        }
        if (l > this.e(-1)) {
            this.E = -1L;
            this.c();
            return -1;
        }
        while (this.E < l) {
            int n4 = (int)(l - this.E);
            float[][][] fArrayArray = new float[1][][];
            int[] nArray = new int[this.h((int)-1).b];
            int n5 = this.L.a(fArrayArray, nArray);
            if (n5 > n4) {
                n5 = n4;
            }
            this.L.a(n5);
            this.E += (long)n5;
            if (n5 >= n4 || this.a(1) != 0) continue;
            this.E = this.e(-1);
        }
        return 0;
    }

    int a(float f2) {
        int n = -1;
        long l = this.e(-1);
        float f3 = this.f(-1);
        if (!this.t) {
            return -1;
        }
        if (f2 < 0.0f || f2 > f3) {
            this.E = -1L;
            this.c();
            return -1;
        }
        for (n = this.x - 1; n >= 0; --n) {
            l -= this.B[n];
            if (f2 >= (f3 -= this.f(n))) break;
        }
        long l2 = (long)((float)l + (f2 - f3) * (float)this.C[n].c);
        return this.a(l2);
    }

    public long h() {
        return this.u;
    }

    public long i() {
        return this.E;
    }

    public float j() {
        int n = -1;
        long l = 0L;
        float f2 = 0.0f;
        if (this.t) {
            l = this.e(-1);
            f2 = this.f(-1);
            for (n = this.x - 1; n >= 0; --n) {
                f2 -= this.f(n);
                if (this.E >= (l -= this.B[n])) break;
            }
        }
        return f2 + (float)(this.E - l) / (float)this.C[n].c;
    }

    public fls_1 h(int n) {
        if (this.t) {
            if (n < 0) {
                if (this.F) {
                    return this.C[this.H];
                }
                return null;
            }
            if (n >= this.x) {
                return null;
            }
            return this.C[n];
        }
        if (this.F) {
            return this.C[0];
        }
        return null;
    }

    public flb_1 i(int n) {
        if (this.t) {
            if (n < 0) {
                if (this.F) {
                    return this.D[this.H];
                }
                return null;
            }
            if (n >= this.x) {
                return null;
            }
            return this.D[n];
        }
        if (this.F) {
            return this.D[0];
        }
        return null;
    }

    int k() {
        return 1;
    }

    int a(byte[] byArray, int n, int n2, int n3, int n4, int[] nArray) {
        int n5 = this.k();
        int n6 = 0;
        while (true) {
            if (this.F) {
                float[][][] fArrayArray = new float[1][][];
                int[] nArray2 = new int[this.h((int)-1).b];
                int n7 = this.L.a(fArrayArray, nArray2);
                float[][] fArray = fArrayArray[0];
                if (n7 != 0) {
                    int n8 = this.h((int)-1).b;
                    int n9 = n3 * n8;
                    if (n7 > n / n9) {
                        n7 = n / n9;
                    }
                    if (n3 == 1) {
                        int n10 = n4 != 0 ? 0 : 128;
                        for (int k = 0; k < n7; ++k) {
                            for (int i2 = 0; i2 < n8; ++i2) {
                                int n11 = (int)((double)fArray[i2][nArray2[i2] + k] * 128.0 + 0.5);
                                if (n11 > 127) {
                                    n11 = 127;
                                } else if (n11 < -128) {
                                    n11 = -128;
                                }
                                byArray[n6++] = (byte)(n11 + n10);
                            }
                        }
                    } else {
                        int n12;
                        int n13 = n12 = n4 != 0 ? 0 : 32768;
                        if (n5 == n2) {
                            if (n4 != 0) {
                                for (int k = 0; k < n8; ++k) {
                                    int n14 = nArray2[k];
                                    int n15 = k;
                                    for (int i3 = 0; i3 < n7; ++i3) {
                                        int n16 = (int)((double)fArray[k][n14 + i3] * 32768.0 + 0.5);
                                        if (n16 > Short.MAX_VALUE) {
                                            n16 = Short.MAX_VALUE;
                                        } else if (n16 < Short.MIN_VALUE) {
                                            n16 = Short.MIN_VALUE;
                                        }
                                        byArray[n15] = (byte)(n16 >>> 8);
                                        byArray[n15 + 1] = (byte)n16;
                                        n15 += n8 * 2;
                                    }
                                }
                            } else {
                                for (int k = 0; k < n8; ++k) {
                                    float[] fArray2 = fArray[k];
                                    int n17 = k;
                                    for (int i4 = 0; i4 < n7; ++i4) {
                                        int n18 = (int)((double)fArray2[i4] * 32768.0 + 0.5);
                                        if (n18 > Short.MAX_VALUE) {
                                            n18 = Short.MAX_VALUE;
                                        } else if (n18 < Short.MIN_VALUE) {
                                            n18 = Short.MIN_VALUE;
                                        }
                                        byArray[n17] = (byte)(n18 + n12 >>> 8);
                                        byArray[n17 + 1] = (byte)(n18 + n12);
                                        n17 += n8 * 2;
                                    }
                                }
                            }
                        } else if (n2 != 0) {
                            for (int k = 0; k < n7; ++k) {
                                for (int i5 = 0; i5 < n8; ++i5) {
                                    int n19 = (int)((double)fArray[i5][k] * 32768.0 + 0.5);
                                    if (n19 > Short.MAX_VALUE) {
                                        n19 = Short.MAX_VALUE;
                                    } else if (n19 < Short.MIN_VALUE) {
                                        n19 = Short.MIN_VALUE;
                                    }
                                    byArray[n6++] = (byte)((n19 += n12) >>> 8);
                                    byArray[n6++] = (byte)n19;
                                }
                            }
                        } else {
                            for (int k = 0; k < n7; ++k) {
                                for (int i6 = 0; i6 < n8; ++i6) {
                                    int n20 = (int)((double)fArray[i6][k] * 32768.0 + 0.5);
                                    if (n20 > Short.MAX_VALUE) {
                                        n20 = Short.MAX_VALUE;
                                    } else if (n20 < Short.MIN_VALUE) {
                                        n20 = Short.MIN_VALUE;
                                    }
                                    byArray[n6++] = (byte)(n20 += n12);
                                    byArray[n6++] = (byte)(n20 >>> 8);
                                }
                            }
                        }
                    }
                    this.L.a(n7);
                    this.E += (long)n7;
                    if (nArray != null) {
                        nArray[0] = this.H;
                    }
                    return n7 * n9;
                }
            }
            switch (this.a(1)) {
                case 0: {
                    return 0;
                }
                case -1: {
                    return -1;
                }
            }
        }
    }

    public fls_1[] l() {
        return this.C;
    }

    public flb_1[] m() {
        return this.D;
    }

    public void n() {
        this.s.close();
    }
}

