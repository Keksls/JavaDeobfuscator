/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

/*
 * Renamed from bll
 */
public abstract class bll_2
extends bim_2 {
    private static final Logger w = Logger.getLogger(bll_2.class);
    public static final String a = "score";
    public static final String b = "firstRankReward";
    public static final String d = "secondRankReward";
    public static final String e = "thirdRankReward";
    public static final String f = "finalReward";
    public static final String t = "hasRewards";
    public static final String u = "hasMoreThanOneReward";
    public static final String v = "resultDescriptionIconUrl";
    private long x;
    private blf_2 y = null;

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.x;
        }
        if (string.equals(v)) {
            blt_2 blt_22 = blc_2.a().c(this.v());
            bls_2 bls_22 = this.u();
            if (blt_22 == null || !blt_22.i().h()) {
                return azs_0.a().a("challengeResultQualityIconsPath", "defaultIconPath", ezt_2.b.a());
            }
            short s2 = bls_22.y();
            if (s2 <= 0) {
                return azs_0.a().a("challengeResultQualityIconsPath", "defaultIconPath", ezt_2.e.a());
            }
            if (s2 == 1) {
                return azs_0.a().a("challengeResultQualityIconsPath", "defaultIconPath", ezt_2.b.a());
            }
            float f2 = (float)(s2 - 3) / (float)(bls_22.D() - 3);
            if (s2 == 2 || s2 == 3) {
                return azs_0.a().a("challengeResultQualityIconsPath", "defaultIconPath", ezt_2.c.a());
            }
            if ((double)f2 <= 0.5) {
                return azs_0.a().a("challengeResultQualityIconsPath", "defaultIconPath", ezt_2.d.a());
            }
            return azs_0.a().a("challengeResultQualityIconsPath", "defaultIconPath", ezt_2.e.a());
        }
        if (string.equals(b)) {
            if (bll_2.b(this.v())) {
                return new bln_2();
            }
            bls_2 bls_23 = this.u();
            if (bls_23 == null) {
                blt_2 blt_23 = blc_2.a().c(this.v());
                ArrayList<blg_2> arrayList = blt_23.k();
                if (arrayList == null || arrayList.size() < 1) {
                    return null;
                }
                blg_2 blg_22 = arrayList.get(0);
                return blj_2.a.a(blg_22.b(), blg_22);
            }
            return bls_23.c(0);
        }
        if (string.equals(d)) {
            bls_2 bls_24 = this.u();
            if (bls_24 == null) {
                blt_2 blt_24 = blc_2.a().c(this.v());
                ArrayList<blg_2> arrayList = blt_24.k();
                if (arrayList == null || arrayList.size() < 2) {
                    return null;
                }
                blg_2 blg_23 = arrayList.get(1);
                return blj_2.a.a(blg_23.b(), blg_23);
            }
            return bls_24.c(1);
        }
        if (string.equals(e)) {
            bls_2 bls_25 = this.u();
            if (bls_25 == null) {
                blt_2 blt_25 = blc_2.a().c(this.v());
                ArrayList<blg_2> arrayList = blt_25.k();
                if (arrayList == null || arrayList.size() < 3) {
                    return null;
                }
                blg_2 blg_24 = arrayList.get(2);
                return blj_2.a.a(blg_24.b(), blg_24);
            }
            return bls_25.c(2);
        }
        if (string.equals(f)) {
            if (bll_2.b(this.v())) {
                return new bln_2();
            }
            bls_2 bls_26 = this.u();
            return bls_26.z();
        }
        if (string.equals(t)) {
            blt_2 blt_26 = blc_2.a().c(this.v());
            return !blt_26.k().isEmpty();
        }
        if (string.equals(u)) {
            blt_2 blt_27 = blc_2.a().c(this.v());
            return blt_27.k().size() > 1;
        }
        return super.b(string);
    }

    public void a() {
        bla_2 bla_22 = this.a(this.v());
        if (bla_22 != null) {
            String string;
            Matcher matcher;
            if (bla_22.e() != null && bla_22.e().length() > 0) {
                this.x = this.u().a(bla_22.e());
            }
            if ((matcher = blb_2.k.matcher(string = bla_22.a())).find()) {
                this.x = this.u().a(matcher.group().substring(1, matcher.group().length() - 1));
            }
        }
    }

    @Override
    protected String f() {
        blt_2 blt_22 = blc_2.a().c(this.v());
        return blt_22.c();
    }

    @Override
    protected String g() {
        blt_2 blt_22 = blc_2.a().c(this.v());
        try {
            return String.format(azs_0.a().a("challengeCategoryIconsPath"), blt_22.h().a());
        }
        catch (gm_0 gm_02) {
            w.warn((Object)gm_02.getMessage());
            return null;
        }
    }

    @Override
    public int i() {
        return this.v();
    }

    @Override
    public int h() {
        return 2;
    }

    @Override
    protected String j() {
        bls_2 bls_22 = this.u();
        if (bls_22 == null) {
            return null;
        }
        short s2 = bls_22.o();
        return s2 > 0 ? bll_2.a(s2) : null;
    }

    @Override
    protected ArrayList<bil_2> k() {
        int n = this.v();
        bla_2 bla_22 = this.a(n);
        ArrayList<bil_2> arrayList = new ArrayList<bil_2>();
        if (bla_22 != null) {
            blb_2 blb_22 = blj_2.a.a(n, bla_22.d());
            arrayList.add(blb_22);
        } else {
            arrayList.add(new blz_2(n));
        }
        return arrayList;
    }

    private bla_2 a(int n) {
        bla_2 bla_22 = blc_2.a().d(n);
        if (bla_22 == null) {
            bla_22 = blc_2.a().e(n);
        }
        return bla_22;
    }

    @Override
    protected String m() {
        blt_2 blt_22 = blc_2.a().c(this.v());
        return "challengeCategory" + blt_22.i().b();
    }

    @Override
    protected String l() {
        blt_2 blt_22 = blc_2.a().c(this.v());
        if (blt_22 == null || !blt_22.i().h()) {
            return null;
        }
        bls_2 bls_22 = this.u();
        if (bls_22 == null) {
            return null;
        }
        short s2 = bls_22.y();
        if (s2 == -2) {
            return bae.h().a("challenge.ranking.loser", new Object[0]);
        }
        if (s2 == -1) {
            return bae.h().a("challenge.ranking.unknown", new Object[0]);
        }
        ani_2 ani_22 = new ani_2();
        ani_22.a(s2).a((CharSequence)"/").d(bls_22.D());
        return ani_22.r();
    }

    private static String a(short s2) {
        int n = s2 / 60;
        int n2 = s2 - 60 * n;
        return String.format("%d:%s", n, n2 > 9 ? Integer.valueOf(n2) : "0" + n2);
    }

    public void b() {
        this.q();
        this.r();
        this.p();
    }

    public void c() {
    }

    public void n() {
    }

    public void t() {
    }

    protected abstract bls_2 u();

    public abstract int v();

    @Override
    protected String e() {
        blt_2 blt_22 = blc_2.a().c(this.v());
        return blt_22.e();
    }

    private static boolean b(int n) {
        return ArrayUtils.contains((int[])eoc_0.q, (int)n);
    }
}

