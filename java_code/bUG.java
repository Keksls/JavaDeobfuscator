/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.HashSet;
import java.util.Optional;

public final class bUG
implements ajh_1,
bUF {
    public static final String a = "nationId";
    public static final String b = "hasVoted";
    public static final String d = "isCandidate";
    public static final String e = "candidateInfo";
    public static final String f = "nationRankDescription";
    public static final String g = "nativeNationCitizenScore";
    public static final String h = "currentNationCitizenScore";
    public static final String i = "isPassportActive";
    public static final String j = "passportStampIconUrl";
    public static final String k = "nationColor";
    public static final String l = "nationName";
    public static final String m = "canApplyForGovernorConcerningCrimes";
    public static final String n = "canVoteConcerningCrimes";
    public static final String o = "candidateRegistrationWarningInfo";
    public static final String p = "pvpStateStyle";
    public static final String q = "pvpStatePercent";
    public static final String r = "pvpStateTitle";
    public static final String s = "pvpStateDescription";
    public static final String t = "pvpMoney";
    private final bUH u;
    private bUC v;
    private final TIntObjectHashMap<bUE> w = new TIntObjectHashMap();

    public bUG(bUH bUH2) {
        this.u = bUH2;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (this.u == null) {
            return null;
        }
        if (string.equals(b)) {
            return this.u.c();
        }
        if (string.equals(a)) {
            return this.u.n();
        }
        if (string.equals(d)) {
            return this.u.j();
        }
        if (string.equals(e)) {
            return this.v;
        }
        if (string.equals(g)) {
            int n = this.u.n();
            bUE bUE2 = Optional.ofNullable((bUE)this.w.get(n)).orElse(new bUE(n));
            bUE2.a(this.u.c(n));
            return bUE2;
        }
        if (string.equals(h)) {
            faU faU2 = this.u.f();
            if (!(faU2 instanceof epq_2)) {
                return null;
            }
            int n = ((epq_2)faU2).fI();
            if (n <= 0) {
                n = this.a((bnh_1)faU2);
            }
            bUE bUE3 = Optional.ofNullable((bUE)this.w.get(n)).orElse(new bUE(n));
            bUE3.a(this.u.c(n));
            return bUE3;
        }
        if (string.equals(f)) {
            ani_2 ani_22 = new ani_2();
            ani_22.i().a(this.h().w());
            fcu_0 fcu_02 = this.u.w();
            ani_22.a((CharSequence)(fcu_02 != null ? bae.h().a(57, (long)((int)fcu_02.a()), new Object[0]) : bae.h().a("nation.citizen.noRank", new Object[0])));
            if (!this.u.x().isEmpty()) {
                for (fct_0 fct_02 : this.u.x()) {
                    ani_22.m();
                    ani_22.a((CharSequence)bae.h().a(fct_02.name(), new Object[0]));
                }
            }
            ani_22.j();
            return ani_22.r();
        }
        if (string.equals(k)) {
            return this.h();
        }
        if (string.equals(i)) {
            return this.u.u();
        }
        if (string.equals(j)) {
            return azs_0.a().a("passportStampIconsPath", "defaultIconPath", this.u.n());
        }
        if (string.equals(l)) {
            return bae.h().a(39, (long)this.u.n(), new Object[0]);
        }
        if (string.equals(m)) {
            bmr_1 bmr_12 = azu_0.j().k();
            return bmr_12.a(enw_0.d) && !this.u.j() && bUD.a().a(this.u);
        }
        if (string.equals(n)) {
            bmr_1 bmr_13 = azu_0.j().k();
            return bmr_13.a(enw_0.d) && bUD.a().b(this.u);
        }
        if (string.equals(o)) {
            ani_2 ani_23 = new ani_2();
            bmr_1 bmr_14 = azu_0.j().k();
            if (bmr_14.a(enw_0.d)) {
                boolean bl = true;
                if (!bUD.a().a(this.u)) {
                    ani_23.a((CharSequence)bae.h().a("nation.rank.unauthorized.for.registration", new Object[0]));
                    bl = false;
                }
                if (bmr_14.cq() < bUW.a().n()) {
                    if (!bl) {
                        ani_23.m();
                    }
                    ani_23.a((CharSequence)bae.h().a("nation.not.enough.kamas.for.registration", this.u.m().I()));
                    bl = false;
                }
                if (bmr_14.fE().j()) {
                    if (!bl) {
                        ani_23.m();
                    }
                    ani_23.a((CharSequence)bae.h().a("nation.vote.candidateRegistration.alreadyCandidate", new Object[0]));
                }
            } else {
                ani_23.a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0]));
            }
            return ani_23.r();
        }
        if (string.equals(p)) {
            bmr_1 bmr_15 = azu_0.j().k();
            cct_1 cct_12 = ccs_1.a().a(bmr_15.T_());
            int n = cct_12 != null && cct_12.a() ? 3 : 0;
            return "pvpState" + n;
        }
        if (string.equals(r)) {
            bmr_1 bmr_16 = azu_0.j().k();
            cct_1 cct_13 = ccs_1.a().a(bmr_16.T_());
            return bae.h().a("pvp.stateTitle." + (cct_13 != null && cct_13.a()), new Object[0]);
        }
        if (string.equals(s)) {
            bmr_1 bmr_17 = azu_0.j().k();
            cct_1 cct_14 = ccs_1.a().a(bmr_17.T_());
            return bae.h().a("pvp.stateDescription." + (cct_14 != null && cct_14.a()), new Object[0]);
        }
        if (string.equals(q)) {
            bmr_1 bmr_18 = azu_0.j().k();
            cct_1 cct_15 = ccs_1.a().a(bmr_18.T_());
            return Float.valueOf(cct_15 != null && cct_15.a() ? 1.0f : 0.0f);
        }
        if (t.equals(string)) {
            return this.u.z();
        }
        return null;
    }

    private azj_2 h() {
        return anr_0.aa;
    }

    @Override
    public void b() {
        this.v = bUW.a().b(this.u.o());
        fis_1.a().a((ajf_1)this, e, b, d, n, m);
    }

    @Override
    public void f() {
        fis_1.a().a((ajf_1)this, q, s);
    }

    @Override
    public void g() {
        this.c();
        fis_1.a().a((ajf_1)this, q, s, p);
    }

    @Override
    public void c() {
        bnh_1 bnh_12 = (bnh_1)this.u.f();
        bnh_12.z();
    }

    private void a(int n, int n2, boolean bl) {
        int n3 = n;
        bnh_1 bnh_12 = (bnh_1)this.u.f();
        if (n3 != bnh_12.fI() && (n3 = this.a(bnh_12)) <= 0) {
            return;
        }
        int n4 = this.u.c(n3);
        fbm_0 fbm_02 = fbo_0.a().a(n4);
        bUE bUE2 = (bUE)this.w.get(n3);
        if (bUE2 == null) {
            bUE2 = new bUE(n3);
            this.w.put(n3, (Object)bUE2);
        }
        bUE2.a(n4);
        fis_1.a().a((ajf_1)this, g, h);
        if (bnh_12.bo() && !euv_2.a.b(bnh_12.U_(), bnh_12.a_())) {
            this.a(n3, fbm_02, n2, n4, bnh_12);
        }
        if (bl) {
            this.c();
        }
    }

    private int a(bnh_1 bnh_12) {
        for (int n : fbc_0.a.b()) {
            faX faX2 = fbc_0.a.a(n);
            if ((long)faX2.n() != bnh_12.T_()) continue;
            return faX2.c();
        }
        return 0;
    }

    private void a(int n, fbm_0 fbm_02, int n2, int n3, bnh_1 bnh_12) {
        boolean bl;
        int n4 = n3 - n2;
        if (n4 == 0) {
            return;
        }
        fbm_0 fbm_03 = fbo_0.a().a(n2);
        boolean bl2 = bl = fbm_03 != fbm_02;
        if (bl && !fbm_03.a(fbs_0.g) && fbm_02.a(fbs_0.g)) {
            String string = bae.h().a(39, (long)n, new Object[0]);
            String string2 = bae.h().a(fbm_02.a(), new Object[0]);
            String string3 = bae.h().a("nation.playerCriminal", string, string2);
            aul_0.a().e(string3);
            String string4 = bae.h().a("notification.outlawTitle", new Object[0]);
            String string5 = cIg.createLink(bae.h().a("notification.outlawText", bae.h().a(39, (long)n, new Object[0])), blr_1.d, String.valueOf(n));
            dhc dhc2 = new dhc(string4, string5, blr_1.d);
            add_2.b().a(dhc2);
        }
        cxu_0.a().a(n3, n3 - n2);
        if (bnh_12.cD) {
            bUG.a(bnh_12, n4);
        }
    }

    private static void a(bnh_1 bnh_12, int n) {
        String string = azs_0.a().a("lawFlyingImagePath", "defaultIconPath", n > 0 ? "1" : "2");
        ays_2 ays_22 = ayu_2.a().b((aui_2)auj_1.a.a(), (long)auc_1.d(string), string, false);
        biI biI2 = bnh_12.bv();
        zp_0 zp_02 = new zp_0();
        zo_0 zo_02 = new zo_0(ays_22, 48, 48, (zt_0)zp_02, 3000);
        zo_02.a(biI2);
        HashSet<za_0> hashSet = zd_0.a().a(biI2);
        zx_0 zx_02 = new zx_0(0, 20);
        ayn_2 ayn_22 = fpm_0.b().g().d("fontDefault10BoldBordered").c();
        zu_0 zu_02 = new zu_0(ayn_22, (n > 0 ? "+" : "") + n, zx_02, 3000);
        zu_02.b(1.0f, 1.0f, 1.0f, 1.0f);
        zu_02.a(biI2);
        int n2 = 0;
        if (hashSet != null) {
            n2 = hashSet.size() * 600;
            zo_02.g(n2);
            zu_02.g(n2);
        }
        zd_0.a().a(zo_02);
        zd_0.a().a(zu_02);
        cdw_0.n().a(n > 0 ? 600139L : 600140L, false, n2);
    }

    @Override
    public void a(faX faX2) {
        if (this.u.f() == azu_0.j().k()) {
            bno_0.a(this.u.f(), true);
        }
        this.w.put(faX2.c(), (Object)new bUE(faX2.c()));
        this.a(faX2.c(), this.u.c(faX2.c()), false);
    }

    @Override
    public void a() {
        fis_1.a().a((ajf_1)this, b);
    }

    @Override
    public void a(int n) {
        this.a(this.u.B(), n, false);
    }

    @Override
    public void a(int n, int n2) {
        this.a(n, n2, true);
    }

    @Override
    public void e() {
        fis_1.a().a((ajf_1)this, i);
    }
}

