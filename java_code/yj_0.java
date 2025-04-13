/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from YJ
 */
public class yj_0
extends yg_0 {
    private static final Logger j = Logger.getLogger(yj_0.class);
    private static final TIntArrayList k = new TIntArrayList(32);
    private static final Object l = new Object();
    private static final byte m = 1;
    private static final byte n = 2;
    public static final int h = 1;
    private byte[] o;
    private byte[] p;
    private short[] q;
    private byte[] r;
    private short[] s;
    private byte[] t;
    private long[] u;
    private int[] v;

    public final boolean d(int n, int n2) {
        int n3 = this.e(n, n2);
        if (n3 == 0) {
            return false;
        }
        return (this.r[n3 - 1] & 1) == 1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final int a(int n, int n2, ys_0[] ys_0Array, int n3) {
        assert (this.a(n, n2, ys_0Array));
        int n4 = this.e(n, n2);
        if (n4 != 0) {
            ys_0 ys_02 = ys_0Array[n3];
            ys_02.a = n;
            ys_02.b = n2;
            this.a(ys_02, n4 - 1);
            return 1;
        }
        Object object = l;
        synchronized (object) {
            TIntArrayList tIntArrayList = this.a(n - this.d, n2 - this.e, k);
            int n5 = tIntArrayList.size();
            for (int k = 0; k < n5; ++k) {
                ys_0 ys_03 = ys_0Array[n3 + k];
                ys_03.a = n;
                ys_03.b = n2;
                this.a(ys_03, tIntArrayList.getQuick(k));
            }
            return n5;
        }
    }

    @Override
    public short c(int n, int n2) {
        int n3 = this.e(n, n2);
        if (n3 >= this.q.length) {
            return 0;
        }
        return this.q[n3];
    }

    private void a(ys_0 ys_02, int n) {
        ys_02.c = this.s[n];
        ys_02.e = (this.r[n] & 1) == 1;
        ys_02.d = this.t[n];
        ys_02.z = this.o[n];
        ys_02.A = this.p[n];
        ys_02.B = this.q[n];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int a(int n, int n2, yt_0[] yt_0Array, int n3) {
        assert (this.a(n, n2, yt_0Array));
        int n4 = this.e(n, n2);
        if (n4 != 0) {
            yt_0 yt_02 = yt_0Array[n3];
            yt_02.a = n;
            yt_02.b = n2;
            this.a(yt_02, n4 - 1);
            return 1;
        }
        Object object = l;
        synchronized (object) {
            TIntArrayList tIntArrayList = this.a(n - this.d, n2 - this.e, k);
            int n5 = tIntArrayList.size();
            for (int k = 0; k < n5; ++k) {
                yt_0 yt_03 = yt_0Array[n3 + k];
                yt_03.a = n;
                yt_03.b = n2;
                this.a(yt_03, tIntArrayList.getQuick(k));
            }
            return n5;
        }
    }

    private void a(yt_0 yt_02, int n) {
        yt_02.c = this.s[n];
        yt_02.e = (this.r[n] & 2) == 2;
        yt_02.d = this.t[n];
    }

    @Override
    public void a(arf_1 arf_12) {
        int n;
        super.a(arf_12);
        int n2 = arf_12.a() & 0xFF;
        this.o = new byte[n2];
        this.p = new byte[n2];
        this.q = new short[n2];
        this.s = new short[n2];
        this.t = new byte[n2];
        this.r = new byte[n2];
        for (n = 0; n < n2; ++n) {
            this.o[n] = arf_12.a();
            this.p[n] = arf_12.a();
            this.q[n] = arf_12.b();
            this.s[n] = arf_12.b();
            this.t[n] = arf_12.a();
            this.r[n] = arf_12.a();
        }
        n = arf_12.a() & 0xFF;
        this.u = yc_0.a(this.u, n, arf_12);
        int n3 = arf_12.b() & 0xFFFF;
        this.v = arf_12.c(n3);
    }

    private int e(int n, int n2) {
        int n3 = n - this.d;
        int n4 = n2 - this.e;
        int n5 = n4 * this.a() + n3;
        return yc_0.a(this.u, n5, this.o.length + 1);
    }

    private TIntArrayList a(int n, int n2, TIntArrayList tIntArrayList) {
        tIntArrayList.reset();
        for (int n3 : this.v) {
            int n4 = n3 >> 8 & 0xFF;
            if (n4 < n2) continue;
            if (n4 > n2) break;
            int n5 = n3 & 0xFF;
            if (n5 < n) continue;
            if (n5 > n) break;
            int n6 = n3 >> 16 & 0xFFFF;
            tIntArrayList.add(n6);
        }
        assert (tIntArrayList.size() != 1) : "nombre de z incorrect";
        return tIntArrayList;
    }
}

