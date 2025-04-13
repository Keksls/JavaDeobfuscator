/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.text.DateFormat;
import java.util.Locale;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkN
 */
public class bkn_2
implements ajh_1 {
    public static final String a = "isRunning";
    public static final String b = "ownerNation";
    public static final String d = "territoryName";
    public static final String e = "endTerritoryName";
    public static final String f = "battlegroundType";
    public static final String g = "levelRange";
    public static final String h = "beginHour";
    public static final String i = "date";
    public static final String j = "attackTeam";
    public static final String k = "defenseTeam";
    public static final String l = "stateIcon";
    public static final String m = "stateText";
    public static final String n = "beginHourText";
    public static final String o = "isFinished";
    public static final String p = "explanationWinText";
    public static final String q = "scoreStampIcon";
    public static final String r = "scoreStampText";
    public static final String s = "battlegroundRemainingTime";
    public static final String t = "linkedZoneView";
    public static final String u = "rewardXp";
    public static final String v = "rewardXpAmount";
    public static final String w = "rewardItem";
    public static final String x = "rewardMerit";
    public static final String y = "rewardGlory";
    public static final String z = "getRewardButtonText";
    public static final String A = "hasReward";
    public static final String B = "getRewardLocationText";
    public static final String C = "winnerIcon";
    public static final String[] D = new String[]{"isRunning", "ownerNation", "territoryName", "battlegroundType", "levelRange", "beginHour", "attackTeam", "defenseTeam", "stateIcon", "stateText", "beginHourText", "isFinished", "rewardXp", "rewardXpAmount", "rewardItem", "rewardMerit", "rewardGlory", "linkedZoneView"};
    private exi_2 E;
    private int F;
    private exi_2 G;
    private exi_2 H;
    private exi_2 I;
    private String J;
    private final bkj_2 K;
    private final bkj_2 L;
    private final bkm_2 M;
    private final fhe_0 N;
    private fhl O;
    private brm_1 P;
    private boolean Q = true;
    private long R;
    private long S;

    public bkn_2(fhe_0 fhe_02) {
        this.N = fhe_02;
        this.K = new bkj_2(fhe_02, false);
        this.L = new bkj_2(fhe_02, true);
        this.L.a(true);
        this.M = new bkm_2(this.N.d());
    }

    @Override
    public String[] d() {
        return D;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.N.g().b(wc_0.p().a()) && this.N.q() <= 0;
        }
        if (string.equals(o)) {
            return this.e();
        }
        if (string.equals(b)) {
            return bVr.b.a(this.N.r());
        }
        if (string.equals(d)) {
            Optional<fhc_0> optional = fhd_0.a.a(this.N.f());
            if (optional.isEmpty()) {
                return null;
            }
            fhc_0 fhc_02 = optional.get();
            return bae.h().a(66, (long)fhc_02.b(), new Object[0]);
        }
        if (string.equals(e)) {
            Optional<fhc_0> optional = fhd_0.a.a(this.N.f());
            if (optional.isEmpty()) {
                return null;
            }
            fhc_0 fhc_03 = optional.get();
            int n = azu_0.j().k().bM();
            boolean bl = this.L.b(n) && this.L.b(this.N.q());
            boolean bl2 = this.K.b(n) && this.K.b(this.N.q());
            boolean bl3 = bl2 || bl;
            String string2 = bae.h().a(66, (long)fhc_03.b(), new Object[0]);
            return bae.h().a("battleground.end.title", bl3 ? 1 : 0, string2);
        }
        if (string.equals(f)) {
            return this.M;
        }
        if (string.equals(g)) {
            fhi fhi2 = this.N.e();
            return bae.h().a("stasis.dungeon.level.range", fhi2.b(), fhi2.c());
        }
        if (string.equals(h)) {
            Locale locale = bae.h().f().a();
            DateFormat dateFormat = DateFormat.getTimeInstance(3, locale);
            dateFormat.setTimeZone(wt_0.a);
            return dateFormat.format(this.N.g().i());
        }
        if (string.equals(i)) {
            Locale locale = bae.h().f().a();
            DateFormat dateFormat = DateFormat.getDateInstance(3, locale);
            dateFormat.setTimeZone(wt_0.a);
            return dateFormat.format(this.N.g().i());
        }
        if (string.equals(j)) {
            return this.K;
        }
        if (string.equals(k)) {
            return this.L;
        }
        if (string.equals(l)) {
            if (this.e()) {
                return azs_0.a().r(String.valueOf(2));
            }
            wu_0 wu_02 = wc_0.p().a();
            return azs_0.a().r(String.valueOf(this.N.g().d(wu_02) ? 0 : 1));
        }
        if (string.equals(m)) {
            wu_0 wu_03 = wc_0.p().a();
            if (this.N.g().d(wu_03)) {
                return bae.h().a("battleground.state.1", new Object[0]);
            }
            return bae.h().a("battleground.state." + (this.e() ? 3 : 2), new Object[0]);
        }
        if (string.equals(n)) {
            Locale locale = bae.h().f().a();
            DateFormat dateFormat = DateFormat.getTimeInstance(3, locale);
            dateFormat.setTimeZone(wt_0.a);
            String string3 = dateFormat.format(this.N.g().i());
            return bae.h().a("battleground.enter.begin", string3);
        }
        if (string.equals(u)) {
            return this.E;
        }
        if (string.equals(v)) {
            return this.F > 0 ? Integer.valueOf(this.F) : null;
        }
        if (string.equals(w)) {
            return this.G;
        }
        if (string.equals(x)) {
            return this.H;
        }
        if (string.equals(y)) {
            return this.I;
        }
        if (string.equals(C)) {
            return this.c();
        }
        if (string.equals(p)) {
            int n = this.N.q();
            String string4 = bae.h().a("nation.short." + n, new Object[0]);
            return bae.h().a("battleground.end.win.explanation", this.L.b(n) ? 1 : 0, string4);
        }
        if (string.equals(q)) {
            return this.O != null ? "stamp" + this.O.a() : "stampD";
        }
        if (string.equals(r)) {
            return this.O != null ? bae.h().a("battleground.end.stamp" + this.O.a(), new Object[0]) : bae.h().a("battleground.end.stamp", new Object[0]) + "D";
        }
        if (string.equals(s)) {
            long l;
            this.R = wc_0.p().e();
            if (this.Q) {
                this.Q = false;
                return "-";
            }
            if (this.N.h() != null && this.N.h().h() > 0L && (l = this.N.h().h() + fhe_0.c - this.R) > 0L) {
                ww_0 ww_02 = ww_0.b(l);
                return wa_0.c(ww_02);
            }
            l = this.N.g().h() + fhe_0.b - this.R;
            if (l < 0L) {
                return "-";
            }
            ww_0 ww_03 = ww_0.b(l);
            return wa_0.c(ww_03);
        }
        if (t.equals(string)) {
            return this.P;
        }
        if (z.equals(string)) {
            bmr_1 bmr_12 = azu_0.j().k();
            String string5 = euw_2.a.c(bmr_12.U_(), this.S) != null ? "battleground.end.rewards.button.available" : "battleground.end.rewards.button.unavailable";
            return bae.h().a(string5, new Object[0]);
        }
        if (A.equals(string)) {
            return this.b() && this.a();
        }
        if (B.equals(string)) {
            Object object = bae.h().a("battleground.end.rewards.location", new Object[0]);
            any_1 any_12 = aZG.e().a("rewards");
            if (any_12 != null) {
                object = (String)object + " (" + new aZF(any_12).a() + ")";
            }
            return object;
        }
        return null;
    }

    public boolean a() {
        return this.E != null || this.G != null || this.H != null || this.I != null;
    }

    public boolean b() {
        bmr_1 bmr_12 = azu_0.j().k();
        return bmr_12 != null && euw_2.a.c(bmr_12.U_(), this.S) != null;
    }

    public String c() {
        int n = this.N.q();
        return azs_0.a().m(n == 0 ? -1 : n);
    }

    public boolean e() {
        return this.N.q() > 0;
    }

    public fhe_0 f() {
        return this.N;
    }

    public void a(exi_2 exi_22) {
        this.E = exi_22;
    }

    public void a(int n) {
        this.F = n;
    }

    public void b(exi_2 exi_22) {
        this.G = exi_22;
    }

    public void c(exi_2 exi_22) {
        this.H = exi_22;
    }

    public void d(exi_2 exi_22) {
        this.I = exi_22;
    }

    public String g() {
        return this.J;
    }

    public void a(String string) {
        this.J = string;
    }

    public void a(long l) {
        this.O = fhl.a(l);
    }

    public void a(brm_1 brm_12) {
        this.P = brm_12;
    }

    public brm_1 h() {
        return this.P;
    }

    public bkj_2 i() {
        return this.K;
    }

    public bkj_2 j() {
        return this.L;
    }

    public void k() {
        fis_1.a().a((ajf_1)this.K, "score", "placeText");
        fis_1.a().a((ajf_1)this.L, "score", "placeText");
    }

    public void b(long l) {
        this.S = l;
    }

    public long l() {
        return this.S;
    }
}

