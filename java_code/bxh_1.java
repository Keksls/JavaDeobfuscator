/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bxh
 */
public class bxh_1
implements ajh_1 {
    private static final Logger B = Logger.getLogger(bxh_1.class);
    public static final String a = "isWinner";
    public static final String b = "localTeamPlayers";
    public static final String d = "localTeamMonsters";
    public static final String e = "localTeamHasMonsters";
    public static final String f = "otherTeamPlayers";
    public static final String g = "otherTeamHasPlayers";
    public static final String h = "otherTeamMonsters";
    public static final String i = "otherTeamHasMonsters";
    public static final String j = "challenges";
    public static final String k = "dungeonStasisIconUrl";
    public static final String l = "dungeonStasisLevel";
    public static final String m = "battlegroundInfo";
    public static final String n = "battlegroundLevelRange";
    public static final String o = "compact";
    public static final String p = "onlyLocal";
    public static final String q = "isPvp";
    public static final String r = "isSavagePvp";
    public static final String s = "isPvm";
    public static final String t = "durationAndTurns";
    public static final String u = "initiatorId";
    public static final String v = "waveCount";
    public static final String w = "waveMonsterCount";
    public static final String x = "waveCountPopup";
    public static final String y = "waveMonsterCountPopup";
    public static final String z = "realWaveCount";
    public static final String A = "realWaveMonsterCount";
    private final jk_0 C;
    private boolean D;
    private final List<bxg_1> E = new ArrayList<bxg_1>();
    private final List<bxg_1> F = new ArrayList<bxg_1>();
    private final List<bxg_1> G = new ArrayList<bxg_1>();
    private final List<bxg_1> H = new ArrayList<bxg_1>();
    private final Collection<bik_2> I;
    private final Map<Long, bxg_1> J = new HashMap<Long, bxg_1>();
    private final Map<Long, bxg_1> K = new HashMap<Long, bxg_1>();
    private final Map<Long, fhp> L = new HashMap<Long, fhp>();
    private final Map<Long, jv> M = new HashMap<Long, jv>();
    private boolean N;
    private boolean O;

    public bxh_1(jk_0 jk_02) {
        this.C = jk_02;
        this.I = bxs_2.a.c();
        this.N = ((bvx_0)ans_0.D().h()).a(bWe.at);
        this.O = ((bvx_0)ans_0.D().h()).a(bWe.au);
        this.e();
    }

    private void e() {
        jo jo2;
        jo jo3 = this.C.k();
        jo jo4 = this.C.n();
        int n = this.C.i();
        int n2 = jo3.c();
        jo jo5 = n2 == n ? jo3 : jo4;
        jo jo6 = jo2 = n2 == n ? jo4 : jo3;
        this.D = bxh_1.a(jo5, jo2) ? bxh_1.a(jo5) : !jo5.d().isEmpty();
        this.J.clear();
        this.K.clear();
        if (this.D) {
            this.a(this.E, jo5, true);
            this.b(this.F, jo5, true);
            jo jo7 = n == n2 ? jo4 : jo3;
            this.a(this.G, jo7, false);
            this.b(this.H, jo7, false);
        } else {
            jo jo8 = n == n2 ? jo4 : jo3;
            this.a(this.E, jo8, false);
            this.b(this.F, jo8, false);
            this.a(this.G, jo5, true);
            this.b(this.H, jo5, true);
        }
    }

    private static boolean a(jo jo2, jo jo3) {
        long l = azu_0.j().n().u();
        for (jg_0 jg_02 : jo2.d()) {
            if (jg_02.e() != l) continue;
            return true;
        }
        for (jg_0 jg_02 : jo3.d()) {
            if (jg_02.e() != l) continue;
            return true;
        }
        return false;
    }

    private static boolean a(jo jo2) {
        long l = azu_0.j().n().u();
        for (jg_0 jg_02 : jo2.d()) {
            if (jg_02.e() != l) continue;
            return true;
        }
        return false;
    }

    private void a(List<bxg_1> list, jo jo2, boolean bl) {
        list.clear();
        long l = azu_0.j().n().u();
        for (jg_0 generatedMessageV3 : jo2.d()) {
            if (this.N && generatedMessageV3.e() != l) continue;
            bxg_1 bxg_12 = new bxg_1(generatedMessageV3, bl);
            list.add(bxg_12);
            this.J.put(bxg_12.c(), bxg_12);
            if (!generatedMessageV3.n()) {
                this.K.put(bxg_12.e(), bxg_12);
            }
            if (this.L.containsKey(bxg_12.c())) {
                bxg_12.a(this.L.get(bxg_12.c()));
            }
            if (generatedMessageV3.n() || !this.M.containsKey(bxg_12.e())) continue;
            bxg_12.a(this.M.get(bxg_12.e()));
        }
        for (jc_0 jc_02 : jo2.g()) {
            if (this.N && jc_02.e() != l || !brP.a.a((short)jc_02.g())) continue;
            list.add(new bxg_1(jc_02, bl));
        }
        list.sort(Comparator.naturalOrder());
    }

    private void b(List<bxg_1> list, jo jo2, boolean bl) {
        list.clear();
        if (this.N) {
            return;
        }
        for (jc_0 jc_02 : jo2.g()) {
            if (brP.a.a((short)jc_02.g())) continue;
            list.add(new bxg_1(jc_02, bl));
        }
    }

    public void a() {
        this.N = !this.N;
        this.e();
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.at, this.N);
        fis_1.a().a((ajf_1)this, this.d());
    }

    public void b() {
        this.O = !this.O;
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.au, this.O);
        fis_1.a().a((ajf_1)this, p);
    }

    public void a(long l, fhp fhp2) {
        bxg_1 bxg_12 = this.J.get(l);
        this.L.put(l, fhp2);
        if (bxg_12 == null) {
            B.error((Object)("Received pvp info for an unknown player of report : " + l));
            return;
        }
        bxg_12.a(fhp2);
        fis_1.a().a((ajf_1)bxg_12, bxg_12.d());
    }

    public void a(jv jv2) {
        this.M.put(jv2.c(), jv2);
        if (!this.K.containsKey(jv2.c())) {
            return;
        }
        bxg_1 bxg_12 = this.K.get(jv2.c());
        bxg_12.a(jv2);
        fis_1.a().a((ajf_1)bxg_12, bxg_12.d());
    }

    public long c() {
        return this.C.c();
    }

    @Override
    public String[] d() {
        return new String[]{a, b, e, d, g, f, i, h, j, k, l, o, p};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.D;
        }
        if (b.equals(string)) {
            return this.E;
        }
        if (d.equals(string)) {
            return this.F;
        }
        if (e.equals(string)) {
            return this.F.size() > 0;
        }
        if (f.equals(string)) {
            return this.G;
        }
        if (g.equals(string)) {
            return this.G.size() > 0;
        }
        if (h.equals(string)) {
            return this.H;
        }
        if (i.equals(string)) {
            return this.H.size() > 0;
        }
        if (j.equals(string)) {
            return this.I;
        }
        if (k.equals(string)) {
            if (!this.C.t()) {
                return null;
            }
            return btf.a(this.C.u());
        }
        if (l.equals(string)) {
            return this.C.t() ? Integer.valueOf(this.C.u()) : null;
        }
        if (m.equals(string)) {
            cct_1 cct_12 = ccs_1.a().a(this.C.E());
            if (cct_12 == null || !cct_12.a()) {
                return null;
            }
            fhe_0 fhe_02 = cxj_2.a.a();
            if (fhe_02 == null) {
                return null;
            }
            return new bkm_2(fhe_02.d());
        }
        if (n.equals(string)) {
            cct_1 cct_13 = ccs_1.a().a(this.C.E());
            if (cct_13 == null || !cct_13.a()) {
                return null;
            }
            fhe_0 fhe_03 = cxj_2.a.a();
            if (fhe_03 == null) {
                return null;
            }
            fhi fhi2 = fhe_03.e();
            return bae.h().a("stasis.dungeon.level.range", fhi2.b(), fhi2.c());
        }
        if (o.equals(string)) {
            return this.N;
        }
        if (p.equals(string)) {
            return this.O;
        }
        if (s.equals(string)) {
            emr_2 emr_22 = emr_2.a(this.C.s());
            if (emr_22 == null) {
                return true;
            }
            return !emr_22.x().a();
        }
        if (q.equals(string)) {
            emr_2 emr_23 = emr_2.a(this.C.s());
            if (emr_23 == null) {
                return true;
            }
            return emr_23.x().a() && emr_23 != emr_2.v;
        }
        if (r.equals(string)) {
            emr_2 emr_24 = emr_2.a(this.C.s());
            if (emr_24 == null) {
                return true;
            }
            return emr_24 == emr_2.v;
        }
        if (t.equals(string)) {
            return bae.h().a("fight.duration.turnCount", this.C.g(), this.C.e() / 1000L / 60L, this.C.e() / 1000L % 60L);
        }
        if (u.equals(string)) {
            return this.C.p() ? this.C.q() : 0L;
        }
        if (v.equals(string)) {
            return this.C.v() ? Integer.valueOf(this.C.w()) : null;
        }
        if (w.equals(string)) {
            return this.C.x() ? Integer.valueOf(this.C.y()) : null;
        }
        if (z.equals(string)) {
            return this.C.z() ? bae.h().a("infinite.waves.result.real.count", this.C.A()) : null;
        }
        if (A.equals(string)) {
            return this.C.B() ? bae.h().a("infinite.waves.result.real.monster.count", this.C.C()) : null;
        }
        if (x.equals(string)) {
            return this.C.v() ? bae.h().a("infinite.waves.result.count", this.C.w()) : null;
        }
        if (y.equals(string)) {
            return this.C.x() ? bae.h().a("infinite.waves.result.monster.count", this.C.y()) : null;
        }
        return null;
    }
}

