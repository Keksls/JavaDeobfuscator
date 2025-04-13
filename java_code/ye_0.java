/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from YE
 */
public class ye_0
extends yg_0 {
    private static final Logger i = Logger.getLogger(ye_0.class);
    private final byte[] j = new byte[324];
    private final byte[] k = new byte[324];
    private final short[] l = new short[324];

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
        return n4 * 18 + n3;
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
        super.a(arf_12);
        for (int k = 0; k < 324; ++k) {
            this.j[k] = arf_12.a();
            this.k[k] = arf_12.a();
            this.l[k] = arf_12.b();
        }
    }
}

