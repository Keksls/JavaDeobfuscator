/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from azr
 */
public final class azr_2
extends abp_1 {
    public static final byte a = 1;
    public static final byte b = 2;
    public static final byte c = 17;
    public static final byte d = 18;
    private int f;
    private int g;
    private short h;
    private short i;
    private afe_1 j;
    private final int k;
    private azs_2 l;
    private byte[] m;
    private byte n = (byte)17;
    private azc_2 o;

    public azr_2(int n, int n2, short s2, azs_2 azs_22, byte[] byArray) {
        this.f = n;
        this.g = n2;
        this.j = new afe_1(this.f, this.g);
        this.k = s2;
        this.l = azs_22;
        this.m = byArray;
    }

    public azr_2(short s2, short s3, short s4, short s5, byte by, azs_2 azs_22, byte[] byArray) {
        this((int)s2, (int)s3, (short)by, azs_22, byArray);
        this.h = s4;
        this.i = s5;
    }

    public azr_2(int n, int n2, short s2, azs_2 azs_22, ByteBuffer byteBuffer) {
        this.f = n;
        this.g = n2;
        this.j = new afe_1(this.f, this.g);
        this.k = s2;
        this.l = azs_22;
        this.m = new byte[byteBuffer.limit()];
        byteBuffer.get(this.m);
    }

    public azr_2(azr_2 azr_22) {
        this.f = azr_22.f;
        this.g = azr_22.g;
        this.h = azr_22.h;
        this.i = azr_22.i;
        this.n = azr_22.n;
        this.j = new afe_1(this.f, this.g);
        this.k = azr_22.k;
        azs_2 azs_22 = this.l = azr_22.l != null ? new azs_2(azr_22.l) : null;
        if (azr_22.m != null) {
            this.m = new byte[azr_22.m.length];
            System.arraycopy(azr_22.m, 0, this.m, 0, this.m.length);
        } else {
            this.m = null;
        }
        if (azr_22.o != null) {
            this.o = new azc_2(azr_22.o);
        }
    }

    public int a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public afe_1 c() {
        return this.j;
    }

    public short e() {
        return this.h;
    }

    public short f() {
        return this.i;
    }

    public void a(short s2, short s3) {
        this.h = s2;
        this.i = s3;
    }

    public int a(int n, int n2) {
        assert (n < this.f);
        assert (n2 < this.g);
        if (this.k == 32) {
            int n3 = (n2 * this.f + n) * 4;
            return this.m[n3 + 3] & 0xFF;
        }
        return 255;
    }

    public azj_2 b(int n, int n2) {
        azf_2 azf_22 = this.c(n, n2);
        if (this.n == 18 || this.n == 2) {
            azf_22.b(azf_22.a());
        }
        return azf_22;
    }

    private azf_2 c(int n, int n2) {
        assert (n < this.f);
        assert (n2 < this.g);
        int n3 = (n2 * this.f + n) * ((this.k + 7) / 8);
        if (this.k == 32) {
            return new azf_2(this.m[n3], this.m[n3 + 1], this.m[n3 + 2], this.m[n3 + 3]);
        }
        if (this.k == 24) {
            return new azf_2(this.m[n3], this.m[n3 + 1], this.m[n3 + 2], -1);
        }
        if (this.k == 8) {
            return this.j() ? this.l.a(aba_1.a(this.m[n3])) : new azf_2(this.m[n3], this.m[n3], this.m[n3], -1);
        }
        if (this.k == 4) {
            return n3 % 2 == 0 ? this.l.a((byte)(this.m[n3 / 2] & 0xF0) >> 4) : this.l.a((byte)(this.m[n3 / 2] & 0xF));
        }
        return null;
    }

    public void a(int n, int n2, azj_2 azj_22) {
        assert (n < this.f);
        assert (n2 < this.g);
        int n3 = (n2 * this.f + n) * ((this.k + 7) / 8);
        if (this.k == 32) {
            this.m[n3] = azj_22.m();
            this.m[n3 + 1] = azj_22.n();
            this.m[n3 + 2] = azj_22.o();
            this.m[n3 + 3] = azj_22.l();
        } else if (this.k == 24) {
            this.m[n3] = azj_22.m();
            this.m[n3 + 1] = azj_22.n();
            this.m[n3 + 2] = azj_22.o();
        } else assert (false) : "Unsupported color format";
    }

    public int g() {
        return this.k;
    }

    public byte[] h() {
        return this.m;
    }

    public boolean j() {
        return this.l != null;
    }

    public void a(float f2, float f3, azq_2 azq_22) {
        int n = Math.round((float)this.f * f2);
        int n2 = Math.round((float)this.g * f3);
        assert (n > 0 && n2 > 0);
        int n3 = this.k >> 3;
        byte[] byArray = new byte[n * n2 * n3];
        if (azq_22 == null) {
            int n4 = (int)Math.ceil(1.0f / f2);
            int n5 = (int)Math.ceil(1.0f / f3);
            for (int k = 0; k < n2; ++k) {
                int n6 = (int)((float)k / f3);
                for (int i2 = 0; i2 < n; ++i2) {
                    int n7 = (int)((float)i2 / f2);
                    for (int i3 = 0; i3 < n3; ++i3) {
                        byte by;
                        byArray[(k * n + i2) * n3 + i3] = by = this.a(n4, n5, n7, n6, i3);
                    }
                }
            }
        } else {
            for (int k = 0; k < n2; ++k) {
                int n8 = (int)((float)k / f3);
                for (int i4 = 0; i4 < n; ++i4) {
                    int n9 = (int)((float)i4 / f2);
                    for (int i5 = 0; i5 < n3; ++i5) {
                        byte by;
                        byArray[(k * n + i4) * n3 + i5] = by = this.a(azq_22, n9, n8, i5);
                    }
                }
            }
        }
        this.f = n;
        this.g = n2;
        this.j = new afe_1(this.f, this.g);
        this.m = byArray;
    }

    public void k() {
        this.m = null;
    }

    public void a(int n) {
        this.o = new azc_2(this, n);
    }

    public azc_2 l() {
        return this.o;
    }

    public void a(byte[] byArray, byte by) {
        this.o = new azc_2(byArray, this.f, by);
    }

    public void a(azr_2 azr_22) {
        assert (azr_22.f <= this.f && azr_22.g <= this.g) : "layer trop grand";
        assert (azr_22.k == this.k) : "Impossible de merger des layers de profondeur diff\u00e9rente";
        if (this.k != 32) {
            return;
        }
        for (int k = 0; k < azr_22.f; ++k) {
            for (int i2 = 0; i2 < azr_22.g; ++i2) {
                int n = (i2 * this.f + k) * ((this.k + 7) / 8);
                float f2 = (float)aba_1.a(azr_22.m[n + 3]) / 255.0f;
                if (f2 == 0.0f) continue;
                float f3 = (float)aba_1.a(this.m[n]) * (1.0f - f2) + (float)aba_1.a(azr_22.m[n]) * f2;
                float f4 = (float)aba_1.a(this.m[n + 1]) * (1.0f - f2) + (float)aba_1.a(azr_22.m[n + 1]) * f2;
                float f5 = (float)aba_1.a(this.m[n + 2]) * (1.0f - f2) + (float)aba_1.a(azr_22.m[n + 2]) * f2;
                float f6 = (float)aba_1.a(this.m[n + 3]) * (1.0f - f2) + (float)aba_1.a(azr_22.m[n + 3]);
                this.m[n] = (byte)Math.min(255.0f, f3);
                this.m[n + 1] = (byte)Math.min(255.0f, f4);
                this.m[n + 2] = (byte)Math.min(255.0f, f5);
                this.m[n + 3] = (byte)Math.min(255.0f, f6);
            }
        }
    }

    public void a(azh_2 azh_22) {
        assert (this.k == 32 || this.k == 24) : "Unsupported color format for this operation";
        byte by = this.n;
        for (int k = 0; k < this.f; ++k) {
            for (int i2 = 0; i2 < this.g; ++i2) {
                byte by2;
                int n = (i2 * this.f + k) * ((this.k + 7) / 8);
                byte by3 = this.m[n];
                byte by4 = this.m[n + 1];
                byte by5 = this.m[n + 2];
                byte by6 = by2 = this.k == 32 ? this.m[n + 3] : (byte)-1;
                if (!azh_22.a(by3, by4, by5, by2, by)) continue;
                azh_22.a(this.m, n, by);
            }
        }
    }

    public void m() {
        int n;
        int n2;
        azj_2[][] azj_2Array = new azj_2[this.f][this.g];
        for (n2 = 0; n2 < this.f; ++n2) {
            for (n = 0; n < this.g; ++n) {
                azj_2Array[n2][n] = this.c(this.f - n2 - 1, n);
            }
        }
        for (n2 = 0; n2 < this.f; ++n2) {
            for (n = 0; n < this.g; ++n) {
                this.a(n2, n, azj_2Array[n2][n]);
            }
        }
    }

    public void a(ByteBuffer byteBuffer, int n, int n2) {
        int n3 = Hw.e(n);
        int n4 = Hw.e(n2);
        int n5 = this.k / 8;
        if (this.m == null || this.m.length != n3 * n4 * n5) {
            this.m = new byte[n3 * n4 * n5];
        }
        int n6 = n * n5;
        int n7 = byteBuffer.capacity() / n6;
        byteBuffer.rewind();
        byte[] byArray = new byte[n6];
        int n8 = n3 * n5;
        int n9 = 0;
        for (int k = 0; k < n7; ++k) {
            byteBuffer.get(byArray, 0, n6);
            System.arraycopy(byArray, 0, this.m, n9, n6);
            n9 += n8;
        }
        this.f = n;
        this.g = n2;
        this.j = new afe_1(n3, n4);
    }

    @Override
    protected void j_() {
        this.m = null;
        this.n = 0;
        this.o = null;
        if (this.l != null) {
            this.l.u();
            this.l = null;
        }
    }

    private byte a(azq_2 azq_22, int n, int n2, int n3) {
        int n4 = this.k >> 3;
        int n5 = azq_22.b() / 2;
        float[] fArray = azq_22.a();
        float f2 = 0.0f;
        int n6 = -1;
        for (int k = 0; k < azq_22.b(); ++k) {
            int n7 = n2 + k - n5;
            if (n7 >= 0 && n7 <= this.g) {
                int n8 = n7 * this.f;
                for (int i2 = 0; i2 < azq_22.b(); ++i2) {
                    int n9 = n + i2 - n5;
                    ++n6;
                    if (n9 < 0 || n9 > this.f) continue;
                    float f3 = this.m[(n8 + n9) * n4 + n3] & 0xFF;
                    f2 += fArray[n6] * f3;
                }
                continue;
            }
            n6 += azq_22.b();
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 255.0f) {
            f2 = 255.0f;
        }
        if (f2 > 127.0f) {
            f2 -= 256.0f;
        }
        return (byte)f2;
    }

    private byte a(int n, int n2, int n3, int n4, int n5) {
        int n6 = this.k >> 3;
        float f2 = 1.0f / (float)(n * n2);
        float f3 = 0.0f;
        for (int k = 0; k < n2; ++k) {
            int n7 = n4 + k;
            if (n7 < 0 || n7 >= this.g) continue;
            int n8 = n7 * this.f;
            for (int i2 = 0; i2 < n; ++i2) {
                int n9 = n3 + i2;
                if (n9 < 0 || n9 >= this.f) continue;
                float f4 = this.m[(n8 + n9) * n6 + n5] & 0xFF;
                f3 += f2 * f4;
            }
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 255.0f) {
            f3 = 255.0f;
        }
        if (f3 > 127.0f) {
            f3 -= 256.0f;
        }
        return (byte)f3;
    }

    private void a(byte[] byArray, abt_1<Integer> abt_12, byte by) {
        int n = abt_12.a();
        azf_2 azf_22 = this.l.a(aba_1.a(by));
        byArray[n++] = azf_22.m();
        byArray[n++] = azf_22.n();
        byArray[n++] = azf_22.o();
        abt_12.a(n);
    }

    public byte n() {
        return this.n;
    }

    public void a(byte by) {
        this.n = by;
    }
}

