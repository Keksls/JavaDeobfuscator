/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKU
 */
public class fku_2 {
    private static final int[] g = new int[256];
    public byte[] a;
    public int b;
    public int c;
    public byte[] d;
    public int e;
    public int f;

    public void a() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f = 0;
    }

    int b() {
        return this.a[this.b + 4] & 0xFF;
    }

    int c() {
        return this.a[this.b + 5] & 1;
    }

    public int d() {
        return this.a[this.b + 5] & 2;
    }

    public int e() {
        return this.a[this.b + 5] & 4;
    }

    public long f() {
        long l = this.a[this.b + 13] & 0xFF;
        l = l << 8 | (long)(this.a[this.b + 12] & 0xFF);
        l = l << 8 | (long)(this.a[this.b + 11] & 0xFF);
        l = l << 8 | (long)(this.a[this.b + 10] & 0xFF);
        l = l << 8 | (long)(this.a[this.b + 9] & 0xFF);
        l = l << 8 | (long)(this.a[this.b + 8] & 0xFF);
        l = l << 8 | (long)(this.a[this.b + 7] & 0xFF);
        l = l << 8 | (long)(this.a[this.b + 6] & 0xFF);
        return l;
    }

    public int g() {
        return this.a[this.b + 14] & 0xFF | (this.a[this.b + 15] & 0xFF) << 8 | (this.a[this.b + 16] & 0xFF) << 16 | (this.a[this.b + 17] & 0xFF) << 24;
    }

    int h() {
        return this.a[this.b + 18] & 0xFF | (this.a[this.b + 19] & 0xFF) << 8 | (this.a[this.b + 20] & 0xFF) << 16 | (this.a[this.b + 21] & 0xFF) << 24;
    }

    void i() {
        int n;
        int n2 = 0;
        for (n = 0; n < this.c; ++n) {
            n2 = n2 << 8 ^ g[n2 >>> 24 & 0xFF ^ this.a[this.b + n] & 0xFF];
        }
        for (n = 0; n < this.f; ++n) {
            n2 = n2 << 8 ^ g[n2 >>> 24 & 0xFF ^ this.d[this.e + n] & 0xFF];
        }
        this.a[this.b + 22] = (byte)n2;
        this.a[this.b + 23] = (byte)(n2 >>> 8);
        this.a[this.b + 24] = (byte)(n2 >>> 16);
        this.a[this.b + 25] = (byte)(n2 >>> 24);
    }

    public fku_2 j() {
        return this.a(new fku_2());
    }

    public fku_2 a(fku_2 fku_22) {
        byte[] byArray = new byte[this.c];
        System.arraycopy(this.a, this.b, byArray, 0, this.c);
        fku_22.c = this.c;
        fku_22.a = byArray;
        fku_22.b = 0;
        byArray = new byte[this.f];
        System.arraycopy(this.d, this.e, byArray, 0, this.f);
        fku_22.f = this.f;
        fku_22.d = byArray;
        fku_22.e = 0;
        return fku_22;
    }

    private static int a(int n) {
        int n2 = n << 24;
        for (int k = 0; k < 8; ++k) {
            if ((n2 & Integer.MIN_VALUE) != 0) {
                n2 = n2 << 1 ^ 0x4C11DB7;
                continue;
            }
            n2 <<= 1;
        }
        return n2;
    }

    static {
        for (int k = 0; k < g.length; ++k) {
            fku_2.g[k] = fku_2.a(k);
        }
    }
}

