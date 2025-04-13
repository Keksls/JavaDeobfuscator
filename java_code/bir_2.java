/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bir
 */
public class bir_2
implements ajh_1,
exs_1 {
    private static final Logger i = Logger.getLogger(bir_2.class);
    public static final String a = "description";
    public static final String b = "iconUrl";
    public static final String d = "quantity";
    public static final String e = "rewardTypePopupVisible";
    public static final String f = "boosterDescription";
    public static final String g = "boosterQuantity";
    public static final String[] h = new String[]{"description", "iconUrl", "quantity", "rewardTypePopupVisible", "boosterDescription", "boosterQuantity"};
    private final bib_2 j;
    private final int k;
    private final boolean l;

    public bir_2(bib_2 bib_22) {
        this.j = bib_22;
        this.k = this.j();
        this.l = this.k();
    }

    private int j() {
        if (this.j.d() == bhn_1.e) {
            boolean bl;
            bjw_1 bjw_12 = (bjw_1)this.f();
            bhg_0 bhg_02 = bHJ.a().a(649);
            boolean bl2 = bl = bjw_12 != null && bjw_12.F().c(bhg_02);
            if (!bl) {
                return this.j.c()[1];
            }
            boolean bl3 = azu_0.j().k().N_().a(enw_0.u);
            float f2 = bl3 ? 1.0f : 0.5f;
            return (int)Math.ceil((float)this.j.c()[1] * f2);
        }
        if (this.j.d() == bhn_1.a) {
            return this.j.c()[1];
        }
        if (this.j.d() == bhn_1.l) {
            return this.j.c()[0];
        }
        return 1;
    }

    private boolean k() {
        if (this.j.d() == bhn_1.e) {
            ezr_0 ezr_02 = this.f();
            return ezr_02 != null && ezr_02.V();
        }
        return false;
    }

    @Override
    public String[] d() {
        return h;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(b)) {
            int[] nArray = this.j.c();
            int n = nArray != null && nArray.length > 0 ? nArray[0] : 0;
            bhn_1 bhn_12 = (bhn_1)this.j.d();
            switch (bhn_12) {
                case a: 
                case e: {
                    bHS bHS2 = (bHS)eyo_1.g().d(n);
                    return bHS2.b().b(b);
                }
                case b: {
                    return azs_0.a().u(n);
                }
                case c: {
                    return azs_0.a().r(n);
                }
                case d: {
                    return azs_0.a().a("pointsOfInterestIconPath", "defaultIconPath", n);
                }
                case p: {
                    return azs_0.a().g(n);
                }
            }
            try {
                return String.format(azs_0.a().a("rewardTypeIconsPath"), bhn_12.b());
            }
            catch (gm_0 gm_02) {
                i.warn((Object)gm_02.getMessage(), (Throwable)gm_02);
                return null;
            }
        }
        if (string.equals(f)) {
            bmr_1 bmr_12 = azu_0.j().k();
            int[] nArray = this.j.c();
            int n = nArray != null && nArray.length > 0 ? nArray[0] : 0;
            OR oR = this.j.d();
            if (oR == bhn_1.f) {
                return fla_0.b(n);
            }
            if (oR == bhn_1.m) {
                long l = bmr_12.du().b(bmr_12.dt());
                long l2 = l * (long)n / 100L;
                return fla_0.b(l2);
            }
            if (oR == bhn_1.q) {
                long l = Math.round((double)n / 100.0 * (double)oe_0.a(bmr_12.dt()));
                return fla_0.b(l);
            }
            if (oR == bhn_1.k) {
                return "";
            }
            return this.a();
        }
        if (string.equals(d)) {
            return this.k;
        }
        if (string.equals(g)) {
            return this.l();
        }
        if (string.equals(e)) {
            int n = this.j.d().b();
            return n != bhn_1.p.b() && n != bhn_1.e.b();
        }
        return null;
    }

    private int l() {
        if (this.j.c().length > 1) {
            return this.j.c()[1] - this.k;
        }
        return 0;
    }

    @Nullable
    public Object a() {
        bmr_1 bmr_12 = (bmr_1)bzf_1.a(cVh.e().j());
        bmr_1 bmr_13 = bmr_12 != null ? bmr_12 : azu_0.j().k();
        int[] nArray = this.j.c();
        int n = nArray != null && nArray.length > 0 ? nArray[0] : 0;
        OR oR = this.j.d();
        if (oR == bhn_1.a || oR == bhn_1.e) {
            Object r2 = eyo_1.g().d(n);
            return ((ezr_0)r2).e();
        }
        if (oR == bhn_1.b) {
            return bae.h().a("unlockedTitle", bae.h().a(34, (long)n, new Object[0]));
        }
        if (oR == bhn_1.c) {
            return bae.h().a(80, (long)n, new Object[0]);
        }
        if (oR == bhn_1.d) {
            return bae.h().a("landmark.gfx", new Object[0]);
        }
        if (oR == bhn_1.f) {
            return fla_0.a(n, bmr_13);
        }
        if (oR == bhn_1.m) {
            long l = bmr_13.du().b(bmr_13.dt());
            long l2 = l * (long)n / 100L;
            return fla_0.a(l2, bmr_13);
        }
        if (oR == bhn_1.q) {
            long l = Math.round((double)n / 100.0 * (double)oe_0.a(bmr_13.dt()));
            return fla_0.a(l, bmr_13);
        }
        if (oR == bhn_1.h) {
            return bae.h().a("reward.spellRestat", new Object[0]);
        }
        if (oR == bhn_1.i) {
            return bae.h().a(8, (long)this.j.c()[0], new Object[0]);
        }
        if (oR == bhn_1.j) {
            return bae.h().a("reward.learnRecipe", new Object[0]);
        }
        if (oR == bhn_1.k) {
            return n;
        }
        if (oR == bhn_1.l) {
            return bae.h().a("guild.pointsGain", n);
        }
        if (oR == bhn_1.p) {
            return bae.h().a(3, (long)n, new Object[0]);
        }
        if (oR == bhn_1.o) {
            return bae.h().a(36, (long)n, new Object[0]);
        }
        return null;
    }

    public bib_2 b() {
        return this.j;
    }

    public boolean c() {
        return this.l() > 0;
    }

    public int e() {
        int[] nArray = this.j.c();
        return nArray != null && nArray.length > 0 ? nArray[0] : 0;
    }

    public ezr_0 f() {
        return eyo_1.g().d(this.e());
    }

    public bpl_0 g() {
        int n = this.e();
        bph_0 bph_02 = bpp_0.a().a(n);
        return new bpl_0(bph_02, 0, -1L, null);
    }

    @Override
    public exk_2 h() {
        if (this.j == null || this.j.d() != bhn_1.e) {
            return null;
        }
        ezr_0 ezr_02 = this.f();
        if (ezr_02 == null) {
            return null;
        }
        return new exi_2(ezr_02);
    }

    public boolean i() {
        return this.l;
    }
}

