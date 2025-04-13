/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fkk
 */
public abstract class fkk_0 {
    private static final Logger l = Logger.getLogger(fkk_0.class);
    public static final xj_0 a = new xj_0(9, 9, (short)Short.MIN_VALUE);
    public static final xj_0 b = new xj_0(9, 9, 0);
    private static final fkl_0[] m = new fkl_0[0];
    public static final short c = fkk_0.f(1, 0);
    public static final short d = 0;
    public static final int e = 2;
    public static final int f = 2;
    public static final int g = 9;
    public static final int h = 9;
    public static final int i = 81;
    public final int j;
    private byte[] n;
    private xk_0 o;
    private xk_0 p;
    private xk_0 q;
    private xk_0 r;
    private fkl_0[] s;

    protected fkk_0(int n) {
        this.j = n;
    }

    public boolean a(int n, int n2) {
        assert (n >= 0 && n < 9);
        assert (n2 >= 0 && n2 < 9);
        if (this.n == null) {
            return false;
        }
        return aby_2.a(this.n, n2 * 9 + n);
    }

    public boolean b(int n, int n2) {
        assert (n >= 0 && n < 9);
        assert (n2 >= 0 && n2 < 9);
        this.a();
        if (this.s == m) {
            return false;
        }
        for (int k = 0; k < this.s.length; ++k) {
            if (this.s[k].a != n || this.s[k].b != n2) continue;
            return true;
        }
        return false;
    }

    private void a() {
        if (this.s != null) {
            return;
        }
        ArrayList<fkl_0> arrayList = new ArrayList<fkl_0>();
        for (int k = 0; k < 9; ++k) {
            for (int i2 = 0; i2 < 9; ++i2) {
                int[] nArray;
                short s2 = eov_0.b().a(k, i2, 0, this.o);
                epj_1 epj_12 = epi_1.a().a(s2);
                if (epj_12 == null || eoD.a((int)s2) || (nArray = epj_12.b()).length == 0) continue;
                short s3 = fkk_0.a(this, k, i2);
                arrayList.add(new fkl_0((byte)k, (byte)i2, s3, nArray[0]));
            }
        }
        if (arrayList.isEmpty()) {
            this.s = m;
        } else {
            this.s = new fkl_0[arrayList.size()];
            arrayList.toArray(this.s);
        }
    }

    public void a(TObjectProcedure<fkl_0> tObjectProcedure) {
        this.a();
        if (this.s == m) {
            return;
        }
        for (int k = 0; k < this.s.length; ++k) {
            if (tObjectProcedure.execute((Object)this.s[k])) continue;
            return;
        }
    }

    public short c(int n, int n2) {
        return b.a(n, n2, 0, this.q);
    }

    public short d(int n, int n2) {
        return b.a(n, n2, 0, this.r);
    }

    public short e(int n, int n2) {
        return a.a(n, n2, 0, this.p);
    }

    public short a(int n, int n2, int n3) {
        return eov_0.b().a(n, n2, n3, this.o);
    }

    public void a(arf_1 arf_12) {
        this.b(arf_12);
        this.c(arf_12);
    }

    protected final void b(arf_1 arf_12) {
        byte by = arf_12.a();
        if (by <= 0) {
            this.n = null;
        } else {
            assert (by == aby_2.b(81));
            this.n = arf_12.a(by);
        }
        this.p = xk_0.a(arf_12, a.a());
        this.r = xk_0.a(arf_12, b.a());
        this.q = xk_0.a(arf_12, b.a());
    }

    protected void c(arf_1 arf_12) {
        this.o = xk_0.a(arf_12, eov_0.b().a());
    }

    public static short f(int n, int n2) {
        if (n < 0 || n > 15) {
            throw new UnsupportedOperationException("coordon\u00e9e x de patch hors contraintes mapCoordX=" + n);
        }
        if (n2 < 0 || n2 > 4095) {
            throw new UnsupportedOperationException("coordon\u00e9e y de patch hors contraintes mapCoordY=" + n2);
        }
        short s2 = (short)(n & 0xF);
        short s3 = (short)(n2 & 0xFFF);
        return (short)(s2 << 12 | s3);
    }

    public static afe_1 a(int n) {
        int n2 = n >> 12 & 0xF;
        int n3 = n & 0xFFF;
        return new afe_1(n2, n3);
    }

    public static xk_0 a(fkk_0 fkk_02, fkk_0 fkk_03, fkk_0 fkk_04, fkk_0 fkk_05) {
        int n;
        int n2;
        short[] sArray = new short[324];
        int n3 = 0;
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.a(fkk_02, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.a(fkk_03, n, n2);
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.a(fkk_04, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.a(fkk_05, n, n2);
            }
        }
        try {
            return enJ.h.a(sArray);
        }
        catch (xl_0 xl_02) {
            l.error((Object)"", (Throwable)xl_02);
            return null;
        }
    }

    public static xk_0 b(fkk_0 fkk_02, fkk_0 fkk_03, fkk_0 fkk_04, fkk_0 fkk_05) {
        int n;
        int n2;
        short[] sArray = new short[324];
        int n3 = 0;
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.b(fkk_02, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.b(fkk_03, n, n2);
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.b(fkk_04, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.b(fkk_05, n, n2);
            }
        }
        try {
            return enJ.i.a(sArray);
        }
        catch (xl_0 xl_02) {
            l.error((Object)"", (Throwable)xl_02);
            return null;
        }
    }

    public static xk_0 c(fkk_0 fkk_02, fkk_0 fkk_03, fkk_0 fkk_04, fkk_0 fkk_05) {
        int n;
        int n2;
        short[] sArray = new short[324];
        int n3 = 0;
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.c(fkk_02, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.c(fkk_03, n, n2);
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.c(fkk_04, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.c(fkk_05, n, n2);
            }
        }
        try {
            return enJ.i.a(sArray);
        }
        catch (xl_0 xl_02) {
            l.error((Object)"", (Throwable)xl_02);
            return null;
        }
    }

    private static short a(fkk_0 fkk_02, int n, int n2) {
        return fkk_02 != null ? fkk_02.e(n, n2) : a.a();
    }

    private static short b(fkk_0 fkk_02, int n, int n2) {
        return fkk_02 != null ? fkk_02.d(n, n2) : b.a();
    }

    private static short c(fkk_0 fkk_02, int n, int n2) {
        return fkk_02 != null ? fkk_02.c(n, n2) : b.a();
    }

    private static short d(fkk_0 fkk_02, int n, int n2) {
        return fkk_02 != null ? fkk_02.a(n, n2, 0) : eov_0.a().a();
    }

    public static xk_0 d(fkk_0 fkk_02, fkk_0 fkk_03, fkk_0 fkk_04, fkk_0 fkk_05) {
        int n;
        int n2;
        short[] sArray = new short[324];
        int n3 = 0;
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.d(fkk_02, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.d(fkk_03, n, n2);
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.d(fkk_04, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fkk_0.d(fkk_05, n, n2);
            }
        }
        try {
            return eov_0.a().a(sArray);
        }
        catch (xl_0 xl_02) {
            l.error((Object)"", (Throwable)xl_02);
            return null;
        }
    }

    public static int b(int n) {
        int n2 = n / 9;
        if (n < 0 && n % 9 != 0) {
            --n2;
        }
        assert ((double)n2 == Math.floor((double)n / 9.0));
        return n2;
    }

    public static int c(int n) {
        int n2 = n / 9;
        if (n < 0 && n % 9 != 0) {
            --n2;
        }
        assert ((double)n2 == Math.floor((double)n / 9.0));
        return n2;
    }

    public static boolean a(short s2) {
        int n = fkk_0.a((int)s2).a();
        return n != 1 && n != 2;
    }
}

