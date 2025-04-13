/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cdi
 */
class cdi_1
extends aoc_0
implements fki_0 {
    private static final Logger s = Logger.getLogger(cdi_1.class);
    static final aeu_0[] o = new aeu_0[0];
    static final afo[] p = new afo[0];
    static final afs[] q = new afs[0];
    static final afc[] r = new afc[0];
    private esy_2[] t;

    cdi_1() {
    }

    @Override
    public void a(fkk_0 fkk_02, fkk_0 fkk_03, fkk_0 fkk_04, fkk_0 fkk_05) {
        this.m = fkk_0.d(fkk_02, fkk_03, fkk_04, fkk_05);
        ccj_2 ccj_22 = (ccj_2)fkk_02;
        ccj_2 ccj_23 = (ccj_2)fkk_03;
        ccj_2 ccj_24 = (ccj_2)fkk_04;
        ccj_2 ccj_25 = (ccj_2)fkk_05;
        this.a(this.a(ccj_22, ccj_23, ccj_24, ccj_25));
        this.a(this.c(ccj_22, ccj_23, ccj_24, ccj_25));
        this.a(this.d(ccj_22, ccj_23, ccj_24, ccj_25));
        this.a(this.b(ccj_22, ccj_23, ccj_24, ccj_25));
        this.e(ccj_22, ccj_23, ccj_24, ccj_25);
        this.a(this.a(ccj_22, ccj_23, ccj_24, ccj_25, ccm_2.a));
        this.b(this.a(ccj_22, ccj_23, ccj_24, ccj_25, ccm_2.b));
        this.c(this.a(ccj_22, ccj_23, ccj_24, ccj_25, ccm_2.c));
        this.d(this.a(ccj_22, ccj_23, ccj_24, ccj_25, ccm_2.d));
    }

    private afc[] a(ccj_2 ccj_22, ccj_2 ccj_23, ccj_2 ccj_24, ccj_2 ccj_25) {
        return r;
    }

    private aeu_0[] b(ccj_2 ccj_22, ccj_2 ccj_23, ccj_2 ccj_24, ccj_2 ccj_25) {
        qt_0[] qt_0Array;
        qt_0[] qt_0Array2;
        qt_0[] qt_0Array3;
        qt_0[] qt_0Array4 = ccj_22 == null ? o : ccj_22.a().d();
        int n = qt_0Array4.length + (qt_0Array3 = ccj_23 == null ? o : ccj_23.a().d()).length + (qt_0Array2 = ccj_24 == null ? o : ccj_24.a().d()).length + (qt_0Array = ccj_25 == null ? o : ccj_25.a().d()).length;
        if (n == 0) {
            return o;
        }
        qt_0[] qt_0Array5 = new aeu_0[n];
        this.a(qt_0Array5, qt_0Array4, qt_0Array3, qt_0Array2, qt_0Array);
        return qt_0Array5;
    }

    private afs[] c(ccj_2 ccj_22, ccj_2 ccj_23, ccj_2 ccj_24, ccj_2 ccj_25) {
        qt_0[] qt_0Array;
        qt_0[] qt_0Array2;
        qt_0[] qt_0Array3;
        qt_0[] qt_0Array4 = ccj_22 == null ? q : ccj_22.a().c();
        int n = qt_0Array4.length + (qt_0Array3 = ccj_23 == null ? q : ccj_23.a().c()).length + (qt_0Array2 = ccj_24 == null ? q : ccj_24.a().c()).length + (qt_0Array = ccj_25 == null ? q : ccj_25.a().c()).length;
        if (n == 0) {
            return q;
        }
        qt_0[] qt_0Array5 = new afs[n];
        this.a(qt_0Array5, qt_0Array4, qt_0Array3, qt_0Array2, qt_0Array);
        return qt_0Array5;
    }

    private afo[] d(ccj_2 ccj_22, ccj_2 ccj_23, ccj_2 ccj_24, ccj_2 ccj_25) {
        qt_0[] qt_0Array;
        qt_0[] qt_0Array2;
        qt_0[] qt_0Array3;
        qt_0[] qt_0Array4 = ccj_22 == null ? p : ccj_22.a().b();
        int n = qt_0Array4.length + (qt_0Array3 = ccj_23 == null ? p : ccj_23.a().b()).length + (qt_0Array2 = ccj_24 == null ? p : ccj_24.a().b()).length + (qt_0Array = ccj_25 == null ? p : ccj_25.a().b()).length;
        if (n == 0) {
            return p;
        }
        qt_0[] qt_0Array5 = new afo[n];
        this.a(qt_0Array5, qt_0Array4, qt_0Array3, qt_0Array2, qt_0Array);
        return qt_0Array5;
    }

    private void a(qt_0[] qt_0Array, qt_0[] qt_0Array2, qt_0[] qt_0Array3, qt_0[] qt_0Array4, qt_0[] qt_0Array5) {
        qt_0 qt_02;
        int n;
        int n2 = 0;
        for (n = 0; n < qt_0Array2.length; ++n) {
            qt_02 = qt_0Array2[n].a();
            qt_02.a = (byte)(qt_02.a + 0);
            qt_02.b = (byte)(qt_02.b + 0);
            qt_0Array[n2++] = qt_02;
        }
        for (n = 0; n < qt_0Array3.length; ++n) {
            qt_02 = qt_0Array3[n].a();
            qt_02.a = (byte)(qt_02.a + 9);
            qt_02.b = (byte)(qt_02.b + 0);
            qt_0Array[n2++] = qt_02;
        }
        for (n = 0; n < qt_0Array4.length; ++n) {
            qt_02 = qt_0Array4[n].a();
            qt_02.a = (byte)(qt_02.a + 0);
            qt_02.b = (byte)(qt_02.b + 9);
            qt_0Array[n2++] = qt_02;
        }
        for (n = 0; n < qt_0Array5.length; ++n) {
            qt_02 = qt_0Array5[n].a();
            qt_02.a = (byte)(qt_02.a + 9);
            qt_02.b = (byte)(qt_02.b + 9);
            qt_0Array[n2++] = qt_02;
        }
    }

    @Override
    public void a(@NotNull esy_2[] esy_2Array) {
        this.t = esy_2Array;
    }

    private long a(ccj_2 ccj_22, ccj_2 ccj_23, ccj_2 ccj_24, ccj_2 ccj_25, ccm_2 ccm_22) {
        long l = 0L;
        short s2 = ccj_22 == null ? (short)0 : ccj_22.a().a(ccm_22);
        short s3 = ccj_23 == null ? (short)0 : ccj_23.a().a(ccm_22);
        short s4 = ccj_24 == null ? (short)0 : ccj_24.a().a(ccm_22);
        short s5 = ccj_25 == null ? (short)0 : ccj_25.a().a(ccm_22);
        for (int k = 0; k < 18; k += 3) {
            for (int i2 = 0; i2 < 18; i2 += 3) {
                int n = eov_0.a(k, i2);
                boolean bl = this.a(k, i2, s2, s3, s4, s5);
                l = Hw.a(l, n, bl);
            }
        }
        return l;
    }

    private boolean a(int n, int n2, short s2, short s3, short s4, short s5) {
        short s6 = n < 9 ? (n2 < 9 ? s2 : s4) : (n2 < 9 ? s3 : s5);
        int n3 = n % 9;
        int n4 = n2 % 9;
        int n5 = eov_0.a(n3, n4);
        return Hw.a(s6, n5);
    }

    private void e(ccj_2 ccj_22, ccj_2 ccj_23, ccj_2 ccj_24, ccj_2 ccj_25) {
        float f2 = 0.0f;
        f2 += ccj_22 != null ? ccj_22.a().a() : 0.0f;
        f2 += ccj_23 != null ? ccj_23.a().a() : 0.0f;
        f2 += ccj_24 != null ? ccj_24.a().a() : 0.0f;
        this.a(f2 += ccj_25 != null ? ccj_25.a().a() : 0.0f);
    }

    @Override
    public short e(int n, int n2, int n3) {
        if (this.t.length != 0) {
            for (esy_2 esy_22 : this.t) {
                int n4 = n + this.a * 18;
                int n5 = n2 + this.b * 18;
                if (!esy_22.a(n4, n5, n3)) continue;
                return 0;
            }
        }
        return super.e(n, n2, n3);
    }
}

