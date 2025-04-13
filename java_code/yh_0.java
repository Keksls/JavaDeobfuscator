/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from YH
 */
public class yh_0
extends yg_0 {
    private static final Logger k = Logger.getLogger(yh_0.class);
    public static final byte h = 1;
    public static final byte i = 2;
    private final byte[] l = new byte[324];
    private final byte[] m = new byte[324];
    private final short[] n = new short[324];
    private final short[] o = new short[324];
    private final byte[] p = new byte[324];
    private final byte[] q = new byte[324];

    @Override
    public final int a(int n, int n2, ys_0[] ys_0Array, int n3) {
        assert (this.a(n, n2, ys_0Array));
        ys_0 ys_02 = ys_0Array[n3];
        ys_02.a = n;
        ys_02.b = n2;
        int n4 = this.d(n, n2);
        ys_02.c = this.o[n4];
        ys_02.e = (this.q[n4] & 1) == 1;
        ys_02.d = this.p[n4];
        ys_02.z = this.l[n4];
        ys_02.A = this.m[n4];
        ys_02.B = this.n[n4];
        return 1;
    }

    @Override
    public short c(int n, int n2) {
        return this.n[this.d(n, n2)];
    }

    private int d(int n, int n2) {
        int n3 = n - this.d;
        int n4 = n2 - this.e;
        return n4 * 18 + n3;
    }

    @Override
    public int a(int n, int n2, yt_0[] yt_0Array, int n3) {
        assert (this.a(n, n2, yt_0Array));
        yt_0 yt_02 = yt_0Array[n3];
        yt_02.a = n;
        yt_02.b = n2;
        int n4 = this.d(n, n2);
        yt_02.c = this.o[n4];
        yt_02.e = (this.q[n4] & 2) == 2;
        yt_02.d = this.p[n4];
        return 1;
    }

    @Override
    public void a(arf_1 arf_12) {
        super.a(arf_12);
        for (int k = 0; k < 324; ++k) {
            this.l[k] = arf_12.a();
            this.m[k] = arf_12.a();
            this.n[k] = arf_12.b();
            this.o[k] = arf_12.b();
            this.p[k] = arf_12.a();
            this.q[k] = arf_12.a();
        }
    }
}

