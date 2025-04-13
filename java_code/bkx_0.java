/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKx
 */
public abstract class bkx_0
implements ajh_1 {
    public static final String x = "totalTaxFactor";
    public static final String y = "taxFactorBreakdown";
    public static final String z = "totalTaxes";
    protected static final String[] A = new String[]{"totalTaxFactor", "taxFactorBreakdown", "totalTaxes"};

    public abstract long a();

    public abstract int i();

    @Nullable
    public abstract bLg j();

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "totalTaxFactor": {
                return this.b();
            }
            case "taxFactorBreakdown": {
                return this.c();
            }
            case "totalTaxes": {
                return this.o();
            }
        }
        return null;
    }

    protected long n() {
        long l = this.o();
        long l2 = azu_0.j().k().dK().a();
        if (l < 0L) {
            return l2;
        }
        return l2 - l;
    }

    public long o() {
        if (this.j() == null) {
            return 0L;
        }
        long l = (long)((double)((long)this.i() * this.a()) * this.j().a().d());
        return fje_0.a.a(azu_0.j().k(), fjb_0.a, l);
    }

    protected boolean p() {
        long l = this.o();
        if (l < 0L) {
            return false;
        }
        return azu_0.j().k().dK().a() >= l;
    }

    protected boolean q() {
        long l = this.o();
        if (l < 0L) {
            return false;
        }
        return azu_0.j().k().dK().a() >= l + (long)this.i() * this.a();
    }

    private String b() {
        if (this.j() == null) {
            return null;
        }
        double d2 = bkx_0.e() * this.j().a().d();
        return bkx_0.a(d2, true, true);
    }

    private String c() {
        if (this.j() == null) {
            return null;
        }
        String string = bkx_0.a(this.j().a().d(), false, false);
        String string2 = bkx_0.a(bkx_0.e(), true, false);
        return bae.h().a("market.sell.tax.breakdown", string, string2);
    }

    private static double e() {
        return fje_0.a.a(azu_0.j().k(), fjb_0.a);
    }

    private static String a(double d2, boolean bl, boolean bl2) {
        ani_2 ani_22 = new ani_2();
        if (bl) {
            ani_22.a(bkx_0.a(d2));
        }
        ani_22.a(Hw.a(d2 * 100.0, 2));
        if (bl2) {
            ani_22.a((CharSequence)" %");
        }
        if (bl) {
            ani_22.j();
        }
        return ani_22.r();
    }

    private static azj_2 a(double d2) {
        if (d2 < 0.2) {
            return new fyr_0(elw_1.dr);
        }
        if (d2 < 0.4) {
            return new fyr_0(elw_1.dq);
        }
        return new fyr_0(elw_1.dp);
    }

    @Override
    public String[] d() {
        return A;
    }
}

