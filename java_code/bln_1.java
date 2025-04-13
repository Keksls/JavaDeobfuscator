/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Date;

/*
 * Renamed from bln
 */
public class bln_1
extends blv_2
implements ajh_1 {
    public static final String a = "isChaos";
    public static final String b = "isCurrentChallengeRunning";
    public static final String d = "isCompleted";
    public static final String e = "isSuccess";
    public static final String f = "currentGoalText";
    public static final String g = "currentGoalProgression";
    public static final String h = "currentGoalProgressionRatio";
    public static final String i = "score";
    public static final String j = "titleText";
    public static final String k = "timeStateText";
    public static final String l = "buttonStyle";
    public static final String m = "timerBackgroundColor";
    public static final String n = "detailAvailable";
    public static final String o = "entityCount";
    public static final String p = "ranking";
    public static final String q = "finalReward";
    public static final String r = "firstRankReward";
    public static final String s = "secondRankReward";
    public static final String t = "thirdRankReward";
    public static final String u = "winnerName";
    public static final String v = "winnerScore";
    public static final String w = "resultDescriptionIconUrl";
    public static final String x = "challengeTypeIconUrl";
    public static final String y = "challengeTypeName";
    public static final String z = "amIFirst";
    public static final String A = "joinButtonPopup";
    public static final String B = "isEmpty";
    public static final String C = "endReason";
    public static final String[] D = new String[]{"isChaos", "isCompleted", "isSuccess", "currentGoalText", "currentGoalProgression", "currentGoalProgressionRatio", "score", "titleText", "timeStateText", "buttonStyle", "timerBackgroundColor", "detailAvailable", "entityCount", "ranking", "finalReward", "firstRankReward", "secondRankReward", "thirdRankReward", "winnerName", "winnerScore", "resultDescriptionIconUrl", "challengeTypeIconUrl", "challengeTypeName", "amIFirst", "joinButtonPopup", "isEmpty", "endReason"};
    public static final String[] E = new String[D.length + blv_2.ar.length];
    private Date au;
    private long av = 0L;
    private boolean aw = false;
    private boolean ax = false;
    private boolean ay = false;
    private boolean az = false;
    private int aA;
    private int aB = 0;
    private long aC;
    private long aD;

    public bln_1(blv_2 blv_22, int n) {
        super(blv_22);
        this.aA = n;
        this.aD = this.Y();
    }

    @Override
    public String[] d() {
        return E;
    }

    public boolean a() {
        return this.aw;
    }

    public boolean b() {
        return this.ax;
    }

    public boolean c() {
        return this.ay;
    }

    private String U() {
        short s2 = this.at.y();
        if (s2 == -2) {
            return bae.h().a("challenge.ranking.loser", new Object[0]);
        }
        if (s2 == -1) {
            return bae.h().a("challenge.ranking.unknown", new Object[0]);
        }
        ani_2 ani_22 = new ani_2();
        ani_22.i().a(14).a(s2).j().i().a(10).a((CharSequence)"/").d(this.aB).j();
        return ani_22.r();
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e();
        }
        if (string.equals("remainingTime")) {
            short s2 = this.h();
            if (s2 > 0) {
                return bln_1.a(s2);
            }
        } else {
            if (string.equals("meetsRequirements")) {
                faV faV2 = azu_0.j().k().fE();
                int n = faV2.c(faV2.n());
                boolean bl = fbo_0.a().a(n).a(fbs_0.l);
                return bl && this.C() && (this.F.p() <= 0 || this.F.p() > this.aB);
            }
            if (string.equals(g)) {
                if (this.b() || this.c()) {
                    return -1;
                }
                bla_2 bla_22 = this.X();
                if (bla_22 != null && bla_22.e() != null && bla_22.e().length() > 0) {
                    long l = this.D().a(bla_22.e());
                    float f2 = 0.0f;
                    try {
                        f2 = bla_22.g() ? (float)((long)bla_22.f() - l) / (float)bla_22.f() : (float)l / (float)bla_22.f();
                    }
                    catch (Exception exception) {
                        ac.error((Object)("Une erreure est survenue dans le calcul de la progression du challenge d'id : " + this.P() + " value/maxValue:" + l + "/" + bla_22.f()));
                    }
                    if (f2 < 0.0f) {
                        return 0;
                    }
                    if (f2 > 1.0f) {
                        return 1;
                    }
                    return Float.valueOf(f2);
                }
                return -1;
            }
            if (!string.equals(b)) {
                if (string.equals(d)) {
                    return this.ax || this.ay;
                }
                if (string.equals(e)) {
                    return this.ax;
                }
                if (string.equals(h)) {
                    bla_2 bla_23 = this.X();
                    if (bla_23 != null && bla_23.e() != null && bla_23.e().length() > 0) {
                        long l = this.D().a(bla_23.e());
                        if (bla_23.g()) {
                            return (long)bla_23.f() - l + "/" + bla_23.f();
                        }
                        return l + "/" + bla_23.f();
                    }
                    return null;
                }
                if (!string.equals(k)) {
                    if (string.equals(j)) {
                        return this.l();
                    }
                    if (!string.equals(l) && !string.equals(m)) {
                        if (string.equals(n)) {
                            return this.N() || this.L() || this.b();
                        }
                        if (string.equals(o)) {
                            return this.aB;
                        }
                        if (string.equals(q)) {
                            return this.at.z();
                        }
                        if (string.equals(r)) {
                            return this.at.c(0);
                        }
                        if (string.equals(s)) {
                            return this.at.c(1);
                        }
                        if (string.equals(t)) {
                            return this.at.c(2);
                        }
                        if (string.equals(u)) {
                            String string2 = this.at.A();
                            return string2 != null && string2.length() > 0 ? string2 : null;
                        }
                        if (string.equals(v)) {
                            return this.at.B();
                        }
                        if (string.equals(w)) {
                            short s3 = this.at.y();
                            if (s3 <= 0) {
                                return azs_0.a().a("challengeResultQualityIconsPath", "defaultIconPath", ezt_2.e.a());
                            }
                            if (s3 == 1) {
                                return azs_0.a().a("challengeResultQualityIconsPath", "defaultIconPath", ezt_2.b.a());
                            }
                            float f3 = (float)(s3 - 3) / (float)(this.aB - 3);
                            if (s3 == 2 || s3 == 3) {
                                return azs_0.a().a("challengeResultQualityIconsPath", "defaultIconPath", ezt_2.c.a());
                            }
                            if ((double)f3 <= 0.5) {
                                return azs_0.a().a("challengeResultQualityIconsPath", "defaultIconPath", ezt_2.d.a());
                            }
                            return azs_0.a().a("challengeResultQualityIconsPath", "defaultIconPath", ezt_2.e.a());
                        }
                        if (string.equals(x)) {
                            return this.v();
                        }
                        if (string.equals(y)) {
                            return this.B().a();
                        }
                        if (string.equals(z)) {
                            return this.at.y() == 1;
                        }
                        if (string.equals(p)) {
                            return this.U();
                        }
                        if (string.equals(A)) {
                            ani_2 ani_22 = new ani_2();
                            bmr_1 bmr_12 = azu_0.j().k();
                            if (!emj_0.b.a(new emh_0[]{bmr_12})) {
                                ani_22.a().a(azf_2.h.w()).a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0])).b();
                                return ani_22.r();
                            }
                            faV faV3 = bmr_12.fE();
                            int n = faV3.c(faV3.n());
                            boolean bl = fbo_0.a().a(n).a(fbs_0.l);
                            if (!bl) {
                                ani_22.a().a(azf_2.h.w()).a((CharSequence)bae.h().a("nation.rank.unauthorized.for.challenges", new Object[0])).b();
                                return ani_22.r();
                            }
                            String string3 = this.F.f();
                            if (!this.C() && string3 != null && string3.length() != 0) {
                                ani_22.a().a(azf_2.h.w()).a((CharSequence)bae.h().a("requirements", new Object[0])).a((CharSequence)" :").b().m();
                                ani_22.i().a(azf_2.h.w()).a((CharSequence)string3).j();
                                return ani_22.r();
                            }
                            if (this.F.p() > 0 && this.aB >= this.F.p()) {
                                ani_22.a().a(azf_2.h.w()).a((CharSequence)bae.h().a("challenge.maxUsersLimit", new Object[0])).b();
                                return ani_22.r();
                            }
                            return bae.h().a("challenge.accept", new Object[0]);
                        }
                        if (string.equals(B)) {
                            return false;
                        }
                        if (string.equals(C)) {
                            int n = this.at.C();
                            if (n == 5) {
                                return bae.h().a("challenge.notEnoughPlayers", new Object[0]);
                            }
                            return null;
                        }
                    }
                }
            }
        }
        return super.b(string);
    }

    public boolean e() {
        return this.at.b().a();
    }

    private bla_2 V() {
        ArrayList<bla_2> arrayList = this.F.r();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            bla_2 bla_22 = arrayList.get(k);
            if (this.D().a(bla_22) != 1) continue;
            return bla_22;
        }
        return null;
    }

    private bla_2 W() {
        ArrayList<bla_2> arrayList = this.F.r();
        int n = arrayList.size();
        for (int k = n - 1; k >= 0; --k) {
            bla_2 bla_22 = arrayList.get(k);
            if (this.D().a(bla_22) != 2) continue;
            return bla_22;
        }
        return null;
    }

    private bla_2 X() {
        bla_2 bla_22 = this.V();
        if (bla_22 == null) {
            bla_22 = this.W();
        }
        if (bla_22 == null) {
            ac.warn((Object)("Challenge : aucun objectif charg\u00e9 ou termin\u00e9, \u00e9trange : challengeId = " + this.D().c()));
        }
        return bla_22;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void g() {
        super.g();
        short s2 = this.h();
        short s3 = this.i();
        if (!this.K() && this.a()) {
            if (s2 < 6 && s2 > 0) {
                cdw_0.n().c(600128L);
            } else if (s2 == 0) {
                cdw_0.n().c(600129L);
            }
        }
        if ((this.N() || !this.K() && this.a()) && s2 == 0) {
            this.j(false);
            this.h(true);
            if (!this.L()) {
                this.j();
            }
            fis_1.a().a((ajf_1)this, "isProposed", "isActivated", b);
            this.k();
        } else {
            if (this.a() && this.K() && !this.w().a()) {
                if (s3 < 6 && s3 > 0) {
                    cdw_0.n().c(600128L);
                } else if (!this.I() && s3 == 0) {
                    cdw_0.n().c(600138L);
                }
            }
            if (s3 == 0 && s2 == 0 && !this.w().a()) {
                this.f(true);
            }
        }
        if (s2 > -1 || fpm_0.b().q(this.E())) {
            fis_1.a().a((ajf_1)this, "remainingTime");
        }
        fis_1.a().a((ajf_1)this, k, "remainingTime");
    }

    public void a(Date date) {
        this.au = date;
    }

    public short h() {
        if (this.au == null) {
            return -1;
        }
        long l = System.currentTimeMillis();
        short s2 = (short)((this.au.getTime() - l) / 1000L);
        return s2 > 0 ? s2 : (short)0;
    }

    public void a(long l, long l2) {
    }

    public short i() {
        if (this.F.j() == 0) {
            return 0;
        }
        if (this.D().w() == null) {
            return -1;
        }
        return 0;
    }

    @Override
    public void j() {
        super.j();
    }

    @Override
    public void k() {
        fis_1.a().a((ajf_1)this, blu_2.aa);
        fis_1.a().a((ajf_1)this, E);
    }

    public String l() {
        return "";
    }

    private String a(String string, String string2) {
        ani_2 ani_22 = new ani_2();
        ani_22.i().a(string2).a((CharSequence)string).j();
        return ani_22.r();
    }

    public void a(boolean bl) {
        this.aw = bl;
    }

    public void b(boolean bl) {
        this.ay = bl;
    }

    public void c(boolean bl) {
        this.ax = bl;
    }

    public boolean m() {
        return this.az;
    }

    public void d(boolean bl) {
        this.az = bl;
    }

    public int n() {
        return this.aA;
    }

    public void a(int n) {
        this.aB = n;
    }

    @Override
    public void o() {
        fis_1.a().a((ajf_1)this, p, z);
    }

    @Override
    public void p() {
        fis_1.a().a((ajf_1)this, q);
    }

    @Override
    public void q() {
        fis_1.a().a((ajf_1)this, r);
    }

    @Override
    public void r() {
        fis_1.a().a((ajf_1)this, s);
    }

    @Override
    public void s() {
        fis_1.a().a((ajf_1)this, t);
    }

    @Override
    public void t() {
        fis_1.a().a((ajf_1)this, u);
    }

    @Override
    public void u() {
        fis_1.a().a((ajf_1)this, v);
    }

    public ays_2 v() {
        ays_2 ays_22 = ayu_2.a().a(this.aD);
        if (ays_22 != null) {
            return ays_22;
        }
        String[] stringArray = new String[2];
        try {
            stringArray[0] = String.format(azs_0.a().a("challengeCategoryIconsPath"), this.A().a());
            stringArray[1] = String.format(azs_0.a().a("challengeUserTypeIconsPath"), this.B().b());
        }
        catch (gm_0 gm_02) {
            ac.info((Object)gm_02.getMessage());
        }
        azk_2 azk_22 = new azk_2();
        azk_22.a(stringArray);
        azk_22.A();
        ays_2 ays_23 = ayu_2.a().b((aui_2)auj_1.a.a(), this.aD, azk_22, true);
        azk_22.u();
        return ays_23;
    }

    private long Y() {
        return auc_1.d("generatedChallengeTypeTexture-" + this.A().a() + "-" + this.B().b());
    }

    static {
        System.arraycopy(D, 0, E, 0, D.length);
        System.arraycopy(blv_2.ar, 0, E, D.length, blv_2.ar.length);
    }
}

