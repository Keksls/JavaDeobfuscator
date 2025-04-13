/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from YF
 */
public class yf_0
extends yg_0 {
    private byte[] i;
    private byte[] j;
    private short[] k;
    private int[] l;

    @Override
    public final int a(int n, int n2, ys_0[] ys_0Array, int n3) {
        assert (this.a(n, n2, ys_0Array));
        ys_0 ys_02 = ys_0Array[n3];
        ys_02.a = n;
        ys_02.b = n2;
        ys_02.c = this.f;
        ys_02.e = false;
        ys_02.d = 0;
        int n4 = this.d(n, n2);
        ys_02.z = this.i[n4];
        ys_02.A = this.j[n4];
        ys_02.B = this.k[n4];
        return 1;
    }

    @Override
    public short c(int n, int n2) {
        return this.k[this.d(n, n2)];
    }

    private int d(int n, int n2) {
        int n3 = n - this.d;
        int n4 = n2 - this.e;
        int n5 = n4 * 18 + n3;
        return yc_0.a(this.l, n5, this.i.length);
    }

    @Override
    public int a(int n, int n2, yt_0[] yt_0Array, int n3) {
        assert (this.a(n, n2, yt_0Array));
        yt_0 yt_02 = yt_0Array[n3];
        yt_02.a = n;
        yt_02.b = n2;
        yt_02.c = this.f;
        yt_02.e = false;
        yt_02.d = 0;
        return 1;
    }

    @Override
    public void a(arf_1 arf_12) {
        int n;
        super.a(arf_12);
        int n2 = arf_12.a();
        this.i = new byte[n2];
        this.j = new byte[n2];
        this.k = new short[n2];
        for (n = 0; n < n2; ++n) {
            this.i[n] = arf_12.a();
            this.j[n] = arf_12.a();
            this.k[n] = arf_12.b();
        }
        n = arf_12.a() & 0xFF;
        this.l = yc_0.a(this.l, n, arf_12);
    }
}

