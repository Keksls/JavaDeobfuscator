/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from dam
 */
public class dam_0
implements ahr_1 {
    private static final Logger a = Logger.getLogger(dam_0.class);
    private static final dam_0 b = new dam_0();
    private static final float[] c = new float[]{0.0f, 1.0f, 0.0f, 0.6f};
    private abv_0 d;
    private exk_2 e;
    private aff_1 f;

    public static dam_0 a() {
        return b;
    }

    public exk_2 c() {
        return this.e;
    }

    public void a(exk_2 exk_22) {
        this.e = exk_22;
    }

    public void d() {
        fyt_0.a().a(frb_0.A, true);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = new abv_0("actionRange", c);
            ace_0 ace_02 = ans_0.D().c();
            aff_1 aff_12 = dam_0.b(ace_02.c(), ace_02.d());
            this.a(aff_12, false);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d.a();
            fyt_0.a().c();
        }
        this.e = null;
        this.f = null;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19751: {
                dhL dhL2 = (dhL)adt_12;
                aff_1 aff_12 = dam_0.b(dhL2.r(), dhL2.s());
                this.a(aff_12, false);
                return false;
            }
            case 16119: {
                dhL dhL3 = (dhL)adt_12;
                if (dhL3.o()) {
                    aff_1 aff_13 = dam_0.b(dhL3.r(), dhL3.s());
                    this.a(aff_13.d(), aff_13.e());
                } else {
                    azu_0.j().b(this);
                }
                return false;
            }
        }
        return true;
    }

    protected void a(aff_1 aff_12, boolean bl) {
        if (aff_12 == null) {
            this.d.a();
            this.f = null;
            return;
        }
        if (aff_12.equals(this.f) && !bl) {
            return;
        }
        this.d.a();
        this.f = aff_12;
        int n = this.b(aff_12);
        this.d.a(c);
        this.a(aff_12);
    }

    private static aff_1 b(int n, int n2) {
        aff_1 aff_12 = agz.a(ans_0.D().c(), n, n2, false);
        if (aff_12 == null) {
            return null;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        yz_0.a(bmr_12.W(), bmr_12.X(), bmr_12.fV());
        short s2 = yz_0.a(aff_12.d(), aff_12.e(), aff_12.f());
        if (s2 == Short.MIN_VALUE || Math.abs(aff_12.f() - s2) > 1) {
            return null;
        }
        aff_12.a(s2);
        return aff_12;
    }

    protected void a(aff_1 aff_12) {
        bih_1 bih_12 = (bih_1)this.e.T().p();
        int n = bih_12.g();
        this.d.a(aff_12.d(), aff_12.e(), aff_12.f());
        int n2 = aff_12.d() + n;
        for (int k = aff_12.d() - n; k <= n2; ++k) {
            int n3 = aff_12.e() + n;
            for (int i2 = aff_12.e() - n; i2 <= n3; ++i2) {
                if (!(Hw.l(k - aff_12.d()) + Hw.l(i2 - aff_12.e()) <= Hw.l(n))) continue;
                this.d.a(k, i2, aff_12.f());
            }
        }
    }

    protected void e() {
    }

    protected void a(int n, int n2) {
        bmr_1 bmr_12 = azu_0.j().k();
        bih_1 bih_12 = (bih_1)this.e.T().p();
        bih_12.a(new aff_1(n, n2, bmr_12.I()));
        bih_12.a(this.e, n, n2);
    }

    protected int b(aff_1 aff_12) {
        if (this.e == null) {
            return -1;
        }
        return 0;
    }
}

