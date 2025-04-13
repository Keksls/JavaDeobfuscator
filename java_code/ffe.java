/*
 * Decompiled with CFR 0.152.
 */
public abstract class ffe
extends feW {
    public static final int l = 3;
    public static final int m = -3;
    public static final int n = 2;
    public static final aej_2 o = aej_2.b;
    public static final long p = 9L;
    private static final int q = 100;
    private static final int r = 100;
    private final ffn s = new ffn();
    private boolean t;
    private int u;
    private boolean v;

    public ffe(long l, long l2, String string, long l3, feZ feZ2, ffr ffr2, feX feX2) {
        super(l, l2, string, l3, feZ2, ffr2, feX2);
        this.a(408);
    }

    public eyu_1 n() {
        return faf_0.a.a(this.b);
    }

    public ffn o() {
        return this.s;
    }

    public int p() {
        return this.u;
    }

    public void a(int n) {
        this.u = n <= 0 ? 408 : n;
        this.b();
    }

    public boolean q() {
        return this.v;
    }

    public void b(boolean bl) {
        this.v = bl;
    }

    @Override
    public boolean a(us_2 us_22) {
        super.a(us_22);
        us_22.c = this.u;
        us_22.j = this.q();
        us_22.e.c();
        us_22.e.a = this.t;
        try {
            this.s.a(us_22.e);
        }
        catch (Exception exception) {
            a.error((Object)("Erreur \u00e0 la serialisation des permissions / pourboires" + this), (Throwable)exception);
        }
        return true;
    }

    @Override
    public boolean a(un_2 un_22, boolean bl) {
        if (!super.a(un_22, bl)) {
            return false;
        }
        un_22.i = bl ? new ur_2() : null;
        un_22.h = this.u;
        un_22.k = this.q();
        un_22.j.c();
        un_22.j.a = this.t;
        this.s.a(un_22.j);
        return true;
    }

    @Override
    public boolean a(un_2 un_22) {
        if (!super.a(un_22)) {
            return false;
        }
        this.a(un_22.h);
        this.b(un_22.k);
        this.t = un_22.j.a;
        return this.a(un_22.j);
    }

    public boolean a(epq_2 epq_22, ffk ffk2) {
        if (ffk2 == null) {
            return false;
        }
        if (epq_22.a_() == this.c) {
            return true;
        }
        ffn ffn2 = this.o();
        ffm ffm2 = ffn2.a(epq_22.a_());
        if (ffm2 != null) {
            return ffm2.a(ffk2);
        }
        long l = epq_22.fc();
        ffl ffl2 = ffn2.a(ffp.b);
        if (l != 0L && l == this.g() && ffl2 != null) {
            return ffl2.a(ffk2);
        }
        ffl ffl3 = ffn2.a(ffp.a);
        return ffl3 != null && ffl3.a(ffk2);
    }

    @Override
    public boolean b(us_2 us_22) {
        this.a(us_22.c);
        this.b(us_22.j);
        super.b(us_22);
        this.t = us_22.e.a;
        try {
            this.a(us_22.e);
        }
        catch (Exception exception) {
            a.error((Object)("Exception \u00e0 la d\u00e9-serialisation des permissions du Havre-sac du joueur " + this.c), (Throwable)exception);
        }
        return true;
    }

    public boolean a(ud_2 ud_22) {
        this.s.b(ud_22);
        return true;
    }

    public boolean b(short s2, short s3) {
        return s2 < 0;
    }

    public boolean c(short s2, short s3) {
        return s3 < 0;
    }

    public boolean d(short s2, short s3) {
        return s2 > 100 && s3 > 100;
    }

    protected boolean e(short s2, short s3) {
        boolean bl = false;
        ffi ffi2 = (ffi)this.j.a(s2, s3);
        if (ffi2 != null) {
            short s4 = ffi2.c();
            short s5 = ffi2.d();
            bl = s2 >= s4 && s2 < s4 + 6 && s3 >= s5 && s3 < s5 + 6 && ffi2.a(true) != null;
        }
        return bl;
    }

    @Override
    public void a(yx_0 yx_02) {
        yv_0 yv_02 = yx_02.a();
        if (yv_02 == null) {
            a.error((Object)"Topology null !!! (ne devrait pas arriver)");
            return;
        }
        for (int k = 0; k < 18; ++k) {
            for (int i2 = 0; i2 < 18; ++i2) {
                yx_02.a(i2, k, !this.e((short)i2, (short)k));
            }
        }
        for (feY feY2 : this.j) {
            for (ffq ffq2 : feY2.e()) {
                if (!yv_02.b(ffq2.G(), ffq2.H())) {
                    a.error((Object)("\u00c9l\u00e9ment dans le sac dimensionnel plac\u00e9 au mauvais endroit " + ffq2 + " (" + ffq2.G() + ";" + ffq2.H() + ") de type=" + ffq2.at_()));
                    continue;
                }
                yx_02.a(ffq2.G(), ffq2.H(), ffq2.I(), ffq2.M());
            }
        }
    }

    public ffj a(byte by, exk_2 exk_22, boolean bl) {
        feY feY2 = this.j.a(by);
        if (feY2 instanceof ffi) {
            ffj ffj2 = ((ffi)feY2).a(exk_22, bl);
            return ffj2;
        }
        return null;
    }

    public ffj a(byte by, boolean bl, boolean bl2) {
        feY feY2 = this.j.a(by);
        if (feY2 instanceof ffi) {
            return ((ffi)feY2).a(bl, bl2);
        }
        return null;
    }

    public exk_2 a(byte by, boolean bl) {
        feY feY2 = this.j.a(by);
        if (feY2 instanceof ffi) {
            return ((ffi)feY2).a(bl);
        }
        return null;
    }

    public ffj b(byte by, exk_2 exk_22, boolean bl) {
        feY feY2 = this.j.a(by);
        if (!ffi.a(exk_22)) {
            return ffj.c;
        }
        if (!(feY2 instanceof ffi)) {
            return ffj.j;
        }
        ffi ffi2 = (ffi)feY2;
        if (ffi2.a(true) == null) {
            return ffj.d;
        }
        if (ffi2.a(false) != null) {
            return ffj.e;
        }
        if (ffi2.a(true).aT_() == exk_22.aT_()) {
            return ffj.k;
        }
        return ffi2.a(true, exk_22, bl);
    }

    public ffj a(byte by, boolean bl, byte by2, boolean bl2, boolean bl3) {
        if (by == by2) {
            return ffj.j;
        }
        feY feY2 = this.j.a(by);
        feY feY3 = this.j.a(by2);
        if (!(feY2 instanceof ffi) || !(feY3 instanceof ffi)) {
            return ffj.j;
        }
        ffi ffi2 = (ffi)feY2;
        ffi ffi3 = (ffi)feY3;
        exk_2 exk_22 = ffi2.a(bl);
        if (exk_22 == null) {
            return ffj.j;
        }
        exk_2 exk_23 = ffi3.a(bl2);
        if (exk_23 == null) {
            ffj ffj2 = ffi2.a(bl, false);
            if (ffj2 != ffj.a) {
                return ffj2;
            }
            ffj ffj3 = ffi3.a(exk_22, false);
            if (ffj3 != ffj.a) {
                return ffj3;
            }
            if (bl3) {
                ffi2.a(bl, true);
                ffi3.a(exk_22, true);
            }
            return ffj.a;
        }
        ffj ffj4 = ffi2.a(bl, exk_23, false);
        if (ffj4 != ffj.a) {
            return ffj4;
        }
        ffj ffj5 = ffi3.a(bl2, exk_22, false);
        if (ffj5 != ffj.a) {
            return ffj5;
        }
        if (bl3) {
            ffi2.a(bl, exk_23, true);
            ffi3.a(bl2, exk_22, true);
        }
        return ffj.a;
    }

    protected xk_0 a(int n, int n2) {
        short[] sArray = new short[324];
        short s2 = (short)(n * 18);
        short s3 = (short)(n2 * 18);
        for (feY feY2 : this.j) {
            ffi ffi2 = (ffi)feY2;
            exk_2 exk_22 = ffi2.a(true);
            int n3 = exk_22 != null && ffk.a(exk_22.aT_()) == ffk.e ? 28 : 0;
            int n4 = feY2.c();
            int n5 = feY2.d();
            int n6 = n4 + 6;
            for (int k = n4; k < n6; ++k) {
                int n7 = n5 + 6;
                for (int i2 = n5; i2 < n7; ++i2) {
                    sArray[k - s2 + (i2 - s3) * 18] = n3;
                }
            }
        }
        try {
            xk_0 xk_02 = eov_0.a().a(sArray);
            return xk_02;
        }
        catch (xl_0 xl_02) {
            a.error((Object)"Exception pendant l'update des types de sol du havre-sac ", (Throwable)xl_02);
            return null;
        }
    }

    public boolean r() {
        return this.t;
    }

    public void c(boolean bl) {
        this.t = bl;
    }

    protected abstract void b();
}

