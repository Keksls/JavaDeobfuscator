/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from YI
 */
public class yi_0
extends yg_0 {
    private static final Logger i = Logger.getLogger(yi_0.class);
    private byte[] j;
    private byte[] k;
    private short[] l;
    private byte[] m;
    private short[] n;
    private byte[] o;
    private long[] p;

    @Override
    public final int a(int n, int n2, ys_0[] ys_0Array, int n3) {
        assert (this.a(n, n2, ys_0Array));
        ys_0 ys_02 = ys_0Array[n3];
        ys_02.a = n;
        ys_02.b = n2;
        int n4 = this.d(n, n2);
        ys_02.c = this.n[n4];
        ys_02.e = (this.m[n4] & 1) == 1;
        ys_02.d = this.o[n4];
        ys_02.z = this.j[n4];
        ys_02.A = this.k[n4];
        ys_02.B = this.l[n4];
        return 1;
    }

    @Override
    public short c(int n, int n2) {
        return this.l[this.d(n, n2)];
    }

    private int d(int n, int n2) {
        int n3 = n - this.d;
        int n4 = n2 - this.e;
        int n5 = n4 * 18 + n3;
        return yc_0.a(this.p, n5, this.j.length);
    }

    @Override
    public int a(int n, int n2, yt_0[] yt_0Array, int n3) {
        assert (this.a(n, n2, yt_0Array));
        yt_0 yt_02 = yt_0Array[n3];
        yt_02.a = n;
        yt_02.b = n2;
        int n4 = this.d(n, n2);
        yt_02.c = this.n[n4];
        yt_02.e = (this.m[n4] & 2) == 2;
        yt_02.d = this.o[n4];
        return 1;
    }

    @Override
    public void a(arf_1 arf_12) {
        int n;
        super.a(arf_12);
        int n2 = arf_12.a() & 0xFF;
        this.j = new byte[n2];
        this.k = new byte[n2];
        this.l = new short[n2];
        this.n = new short[n2];
        this.o = new byte[n2];
        this.m = new byte[n2];
        for (n = 0; n < n2; ++n) {
            this.j[n] = arf_12.a();
            this.k[n] = arf_12.a();
            this.l[n] = arf_12.b();
            this.n[n] = arf_12.b();
            this.o[n] = arf_12.a();
            this.m[n] = arf_12.a();
        }
        n = arf_12.a() & 0xFF;
        this.p = yc_0.a(this.p, n, arf_12);
    }
}

