/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ys
 */
public final class ys_0
extends yr_0 {
    public static final int g = 128;
    public static final int h = 64;
    public static final int i = 48;
    public static final int j = 16;
    private static final int C = 192;
    private static final int D = 48;
    public static final int k = 15;
    private static final int E = 207;
    public static final int l = 0;
    public static final int m = 128;
    public static final int n = 64;
    public static final int o = 192;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 4;
    public static final int s = 8;
    public static final int t = 16;
    public static final int u = 32;
    public static final int v = 64;
    public static final int w = 128;
    public static final int x = 256;
    public static final int y = 512;
    public byte z;
    public byte A = 0;
    public short B;

    public ys_0() {
    }

    public ys_0(ys_0 ys_02) {
        this.a(ys_02);
    }

    @Deprecated
    public static ys_0[] b() {
        ys_0[] ys_0Array = new ys_0[32];
        for (int k = 0; k < ys_0Array.length; ++k) {
            ys_0Array[k] = new ys_0();
        }
        return ys_0Array;
    }

    public static short a(ys_0[] ys_0Array, yv_0 yv_02, int n, int n2, short s2) {
        short s3;
        block2: {
            int n3;
            block1: {
                s3 = -1;
                n3 = yv_02.a(n, n2, ys_0Array, 0);
                if (n3 != 1) break block1;
                if (ys_0Array[0].c != s2) break block2;
                s3 = 0;
                break block2;
            }
            for (int k = 0; k < n3; ++k) {
                if (ys_0Array[k].c != s2 || ys_0Array[k].e) continue;
                s3 = (short)k;
                break;
            }
        }
        return s3;
    }

    public void a(ys_0 ys_02) {
        this.a = ys_02.a;
        this.b = ys_02.b;
        this.c = ys_02.c;
        this.d = ys_02.d;
        this.e = ys_02.e;
        this.z = ys_02.z;
        this.A = ys_02.A;
        this.B = ys_02.B;
    }

    public String toString() {
        return "CellPathData(" + this.a + "," + this.b + "," + this.c + "," + this.d + ")";
    }

    public int c() {
        return this.A & 0xC0;
    }

    public int d() {
        return this.A;
    }

    public int e() {
        return this.A & 0x30;
    }

    public int f() {
        return this.A & 0xFFFFFF30;
    }

    public int g() {
        return this.A & 0xF;
    }

    public boolean h() {
        return (this.B & 1) == 1;
    }

    public boolean i() {
        return (this.B & 2) == 2;
    }

    public boolean j() {
        return (this.B & 4) == 4;
    }

    public boolean k() {
        return (this.B & 0x20) == 32;
    }

    public boolean l() {
        return (this.B & 8) == 8;
    }

    public boolean m() {
        return (this.B & 0x40) == 64;
    }

    public boolean n() {
        return (this.B & 0x80) == 128;
    }

    public boolean o() {
        return (this.B & 0x10) == 16;
    }

    public boolean p() {
        return (this.B & 0x100) == 256;
    }

    public boolean q() {
        return (this.B & 0x200) == 512;
    }

    public static boolean a(int n) {
        return (n & 0x80) == 128;
    }

    public static boolean b(int n) {
        return (n & 0x40) == 64;
    }

    @Override
    public yr_0 b(yr_0 yr_02) {
        ys_0 ys_02 = new ys_0();
        ys_0.a(this, yr_02, ys_02);
        ys_0 ys_03 = yr_02.c >= this.c ? (ys_0)yr_02 : this;
        ys_02.z = ys_03.z;
        ys_02.A = ys_03.A;
        ys_02.B = ys_03.B;
        return ys_02;
    }
}

