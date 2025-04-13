/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class enJ
extends yg_0
implements fki_0 {
    private static final Logger k = Logger.getLogger(enJ.class);
    public static final xj_0 h = new xj_0(18, 18, (short)Short.MIN_VALUE);
    public static final xj_0 i = new xj_0(18, 18, 0);
    private esy_2[] l;
    private xk_0 m;
    private xk_0 n;
    private xk_0 o;

    public enJ(int n, int n2) {
        this.d = n * 18;
        this.e = n2 * 18;
        this.f = 0;
    }

    @Override
    public void a(fkk_0 fkk_02, fkk_0 fkk_03, fkk_0 fkk_04, fkk_0 fkk_05) {
        int n = 9;
        int n2 = 9;
        this.a(fkk_02, 0, 0);
        this.a(fkk_03, 9, 0);
        this.a(fkk_04, 0, 9);
        this.a(fkk_05, 9, 9);
        this.m = fkk_0.a(fkk_02, fkk_03, fkk_04, fkk_05);
        this.n = fkk_0.b(fkk_02, fkk_03, fkk_04, fkk_05);
        this.o = fkk_0.c(fkk_02, fkk_03, fkk_04, fkk_05);
    }

    @Override
    public void a(@NotNull esy_2[] esy_2Array) {
        this.l = esy_2Array;
    }

    private void a(fkk_0 fkk_02, int n, int n2) {
        int n3 = n + this.d;
        int n4 = n2 + this.e;
        for (int k = 0; k < 9; ++k) {
            for (int i2 = 0; i2 < 9; ++i2) {
                if (fkk_02 != null && !fkk_02.a(i2, k)) continue;
                this.a(i2 + n3, k + n4, true);
            }
        }
    }

    @Override
    public final boolean a(int n, int n2) {
        if (!super.a(n, n2)) {
            return false;
        }
        if (this.l.length != 0) {
            for (esy_2 esy_22 : this.l) {
                if (!esy_22.a(n, n2) || !esy_22.c(n, n2)) continue;
                return true;
            }
        }
        return true;
    }

    @Override
    public void a(arf_1 arf_12) {
        throw new UnsupportedOperationException("Impossible sur les patch");
    }

    @Override
    public final int a(int n, int n2, ys_0[] ys_0Array, int n3) {
        assert (this.a(n, n2, ys_0Array));
        int n4 = 1;
        ys_0 ys_02 = ys_0Array[n3];
        ys_02.a = n;
        ys_02.b = n2;
        ys_02.c = this.d(n, n2);
        ys_02.d = (byte)Math.max(0, ys_02.c);
        ys_02.z = (byte)(super.a(n, n2) ? -1 : 7);
        ys_02.e = false;
        ys_02.A = (byte)this.e(n, n2);
        ys_02.B = (byte)this.c(n, n2);
        if (this.l.length != 0) {
            for (esy_2 esy_22 : this.l) {
                int n5 = esy_22.a(n, n2, ys_0Array, n3 + n4);
                if (n5 == -1) continue;
                n4 += enJ.a(ys_0Array, n3, n3 + n4, n5);
            }
        }
        return n4;
    }

    @Override
    public int a(int n, int n2, yt_0[] yt_0Array, int n3) {
        assert (this.a(n, n2, yt_0Array));
        int n4 = 1;
        yt_0 yt_02 = yt_0Array[n3];
        yt_02.a = n;
        yt_02.b = n2;
        yt_02.c = this.d(n, n2);
        yt_02.d = (byte)Math.max(0, yt_02.c);
        yt_02.e = false;
        if (this.l.length != 0) {
            for (esy_2 esy_22 : this.l) {
                int n5 = esy_22.a(n, n2, yt_0Array, n3 + n4);
                if (n5 == -1) continue;
                n4 += enJ.a(yt_0Array, n3, n3 + n4, n5);
            }
        }
        return n4;
    }

    private short d(int n, int n2) {
        if (this.m == null) {
            return h.a();
        }
        return h.a(n - this.d, n2 - this.e, 0, this.m);
    }

    @Override
    public short c(int n, int n2) {
        if (this.o == null) {
            return i.a();
        }
        return i.a(n - this.d, n2 - this.e, 0, this.o);
    }

    private short e(int n, int n2) {
        if (this.n == null) {
            return i.a();
        }
        return i.a(n - this.d, n2 - this.e, 0, this.n);
    }

    private static int a(yr_0[] yr_0Array, int n, int n2, int n3) {
        for (int k = n; k < n2; ++k) {
            int n4 = n2;
            while (n4 < n2 + n3) {
                if (!yr_0.a(yr_0Array[k], yr_0Array[n4])) {
                    ++n4;
                    continue;
                }
                yr_0 yr_02 = yr_0Array[k];
                yr_0Array[k] = yr_0Array[k].b(yr_0Array[n4]);
                if (--n3 == 0) continue;
                System.arraycopy(yr_0Array, n4 + 1, yr_0Array, n4, n3);
                yr_0Array[n4 + n3] = yr_02;
            }
        }
        return n3;
    }
}

