/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntByteIterator
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TIntByteHashMap
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntByteIterator;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TIntByteHashMap;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.set.hash.TLongHashSet;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bUW
implements ajh_1 {
    private static final bUW af = new bUW();
    private static final Logger ag = Logger.getLogger(bUW.class);
    public static final String a = "name";
    public static final String b = "candidates";
    public static final String d = "government";
    public static final String e = "governor";
    public static final String f = "marshal";
    public static final String g = "general";
    public static final String h = "governorHistory";
    public static final String i = "isVoteRunning";
    public static final String j = "candidateRegistrationFee";
    public static final String k = "nationColor";
    public static final String l = "flagIconUrl";
    public static final String m = "electionClosureDescription";
    public static final String n = "electionTotalVotes";
    public static final String o = "electionTotalCandidates";
    public static final String p = "governorIsLocalPlayer";
    public static final String q = "canEditGovernorSpeech";
    public static final String r = "canEditMarshalSpeech";
    public static final String s = "canEditGeneralSpeech";
    public static final String t = "governorTitles";
    public static final String u = "timeBeforeMandateEnd";
    public static final String v = "timeBeforeMandateEndPerc";
    public static final String w = "mandateStartDate";
    public static final String x = "mandateEndDate";
    public static final String y = "localPlayerHasRankToChangeTaxes";
    public static final String z = "localPlayerHasRankToBuyChallenges";
    public static final String A = "localPlayerHasRankToBuyClimateBonuses";
    public static final String B = "localPlayerHasRankToBuyZoology";
    public static final String C = "localPlayerHasRankToChangeLaws";
    public static final String D = "localPlayerHasRankToChangeDiplomacy";
    public static final String E = "protectorList";
    public static final String F = "protectorTotalWillsSize";
    public static final String G = "protectorSatisfiedWillsSize";
    public static final String H = "economy";
    public static final String I = "laws";
    public static final String J = "otherNationsLaws";
    public static final String K = "nationDiplomacyList";
    public static final String L = "sortedNationTerritoriesList";
    public static final String M = "currentGovernorOpinionId";
    public static final String N = "currentGovernorOpinionText";
    public static final String O = "currentGovernorOpinionValue";
    public static final String P = "opinionBadConsequency";
    public static final String Q = "opinionGoodConsequency";
    public static final String R = "currentGovernorPopularityScoreText";
    public static final String S = "opinionDirty";
    public static final String T = "cantGiveOpinionReason";
    public static final String[] U = new String[]{"name", "candidates", "government", "governor", "marshal", "general", "governorHistory", "isVoteRunning", "candidateRegistrationFee", "nationColor", "flagIconUrl", "electionClosureDescription", "electionTotalVotes", "electionTotalCandidates", "governorIsLocalPlayer", "canEditGovernorSpeech", "canEditMarshalSpeech", "canEditGeneralSpeech", "governorTitles", "timeBeforeMandateEnd", "timeBeforeMandateEndPerc", "mandateStartDate", "mandateEndDate", "localPlayerHasRankToChangeTaxes", "localPlayerHasRankToBuyChallenges", "localPlayerHasRankToBuyClimateBonuses", "localPlayerHasRankToBuyZoology", "localPlayerHasRankToChangeLaws", "localPlayerHasRankToChangeDiplomacy", "protectorList", "protectorTotalWillsSize", "protectorSatisfiedWillsSize", "economy", "laws", "nationDiplomacyList", "sortedNationTerritoriesList", "otherNationsLaws", "currentGovernorOpinionId", "currentGovernorOpinionText", "currentGovernorOpinionValue", "opinionDirty", "cantGiveOpinionReason"};
    public static final String V = "fca33a";
    private faX ah;
    private final fet_0 ai = new fet_0();
    private final TIntObjectHashMap<ArrayList<bUC>> aj = new TIntObjectHashMap();
    private bUQ ak;
    private bUM al;
    private bUM am;
    private bUC an;
    private final TShortObjectHashMap<bUP> ao = new TShortObjectHashMap();
    private ArrayList<bUP> ap;
    private final TLongObjectHashMap<bVo> aq = new TLongObjectHashMap();
    private ArrayList<bVo> ar;
    private String as;
    ArrayList<bVs> at;
    bVl au;
    bVm av;
    private ArrayList<buu_0> aw;
    private ArrayList<bVq> ax;
    private final TIntObjectHashMap<String> ay = new TIntObjectHashMap();
    private final TIntIntHashMap az = new TIntIntHashMap();
    private ArrayList<bVm> aA;
    private byte aB;
    final fbx_0 W = new bux_0(this);
    final fbx_0 X = new bVd(this);
    final fbx_0 Y = new bVe(this);
    final fbx_0 Z = new bVf(this);
    final fbx_0 aa = new bVg(this);
    final fbx_0 ab = new bVh(this);
    final fbx_0 ac = new bVi(this);
    private TIntByteHashMap aC;
    private TIntByteHashMap aD;
    final fbx_0 ad = new bVj(this);
    final fbx_0 ae = new bVk(this);

    public static bUW a() {
        return af;
    }

    private bUW() {
        for (fcu_0 enum_ : fcu_0.values()) {
            if (enum_ == fcu_0.a || enum_ == fcu_0.h || enum_ == fcu_0.i) continue;
            this.aq.put(enum_.a(), (Object)new bVo(enum_));
        }
        for (Enum enum_ : bUO.values()) {
            this.ao.put(((bUO)enum_).a(), (Object)new bUP((bUO)enum_));
        }
        this.ao.put((short)-1, (Object)new bUP(null));
    }

    void G() {
        dhc dhc2;
        String string;
        String string2;
        String string3;
        int n;
        String string4;
        String string5;
        fbl_0 fbl_02;
        TIntByteIterator tIntByteIterator;
        TIntByteHashMap tIntByteHashMap;
        boolean bl;
        if (this.ah == faX.i) {
            return;
        }
        this.v();
        boolean bl2 = false;
        boolean bl3 = this.L();
        int n2 = fis_1.a().d("nationCurrentPageIndex");
        boolean bl4 = n2 == 3;
        boolean bl5 = bl = fpm_0.b().q("nationDialog") && bl4;
        if (bl3 && !bl4) {
            tIntByteHashMap = this.b(bl3);
            tIntByteIterator = tIntByteHashMap.iterator();
            while (tIntByteIterator.hasNext()) {
                tIntByteIterator.advance();
                bl2 = true;
                fbl_02 = fbl_0.a(tIntByteIterator.value());
                string5 = null;
                string4 = null;
                switch (fbl_02) {
                    case b: {
                        string5 = "nation.suggestAllianceChat";
                        string4 = "notification.diplomacySuggestAllianceText";
                    }
                }
                if (string5 != null) {
                    n = fbc_0.a.a(tIntByteIterator.key()).c();
                    string3 = bae.h().a(39, (long)n, new Object[0]);
                    string2 = bae.h().a(string5, string3);
                    aul_0.a().e(string2);
                }
                if (string4 == null) continue;
                n = fbc_0.a.a(tIntByteIterator.key()).c();
                string3 = bae.h().a(39, (long)n, new Object[0]);
                string2 = bae.h().a("notification.diplomacyTitle", new Object[0]);
                string = cIg.createLink(bae.h().a(string4, string3), blr_1.e, "3");
                dhc2 = new dhc(string2, string, blr_1.e, 600132);
                add_2.b().a(dhc2);
            }
        }
        tIntByteHashMap = this.b(false);
        if (this.aC != null) {
            tIntByteIterator = tIntByteHashMap.iterator();
            while (tIntByteIterator.hasNext()) {
                tIntByteIterator.advance();
                if (tIntByteIterator.value() == this.aC.get(tIntByteIterator.key())) continue;
                bl2 = true;
                fbl_02 = fbl_0.a(tIntByteIterator.value());
                string5 = null;
                string4 = null;
                switch (fbl_02) {
                    case b: {
                        string5 = "nation.allianceChat";
                        string4 = "notification.diplomacyAllianceText";
                        break;
                    }
                    case a: {
                        string5 = "nation.declareWarChat";
                        string4 = "notification.diplomacyWarText";
                    }
                }
                if (string5 != null) {
                    n = fbc_0.a.a(tIntByteIterator.key()).c();
                    string3 = bae.h().a(39, (long)n, new Object[0]);
                    string2 = bae.h().a(string5, string3);
                    aul_0.a().e(string2);
                }
                if (string4 == null) break;
                n = fbc_0.a.a(tIntByteIterator.key()).c();
                string3 = bae.h().a(39, (long)n, new Object[0]);
                string2 = bae.h().a("notification.diplomacyTitle", new Object[0]);
                string = cIg.createLink(bae.h().a(string4, string3), blr_1.e, "3");
                dhc2 = new dhc(string2, string, blr_1.e, 600132);
                add_2.b().a(dhc2);
                break;
            }
        }
        this.aC = tIntByteHashMap;
        fis_1.a().a((ajf_1)this, K, L);
        if (!bl && bl2) {
            cxu_0.a().f();
        }
        dbd.a().a(true);
    }

    private TIntByteHashMap b(boolean bl) {
        TIntByteHashMap tIntByteHashMap = new TIntByteHashMap();
        for (buu_0 buu_02 : this.M()) {
            if (buu_02.c()) continue;
            int n = buu_02.g();
            if (bl) {
                if (!buu_02.a()) continue;
                tIntByteHashMap.put(n, fbl_0.b.a());
                continue;
            }
            tIntByteHashMap.put(n, buu_02.b().a());
        }
        return tIntByteHashMap;
    }

    public void a(faX faX2) {
        faX faX3;
        TIntObjectIterator<faX> tIntObjectIterator;
        if (this.ah != null) {
            this.ah.a(fbz_0.e).b(this.W);
            this.ah.a(fbz_0.f).b(this.X);
            this.ah.a(fbz_0.i).b(this.Y);
            this.ah.a(fbz_0.k).b(this.Z);
            this.ah.a(fbz_0.d).b(this.aa);
            this.ah.a(fbz_0.l).b(this.ac);
            tIntObjectIterator = fbc_0.a.a();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                faX3 = (faX)tIntObjectIterator.value();
                faX3.a(fbz_0.g).b(this.ad);
                faX3.a(fbz_0.g).b(this.ae);
                faX3.a(fbz_0.d).b(this.ab);
            }
        }
        this.ah = faX2;
        fis_1.a().a("nation", this);
        this.ah.a(fbz_0.e).a(this.W);
        this.ah.a(fbz_0.f).a(this.X);
        this.ah.a(fbz_0.i).a(this.Y);
        this.ah.a(fbz_0.k).a(this.Z);
        this.ah.a(fbz_0.d).a(this.aa);
        this.ah.a(fbz_0.l).a(this.ac);
        tIntObjectIterator = fbc_0.a.a();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            faX3 = (faX)tIntObjectIterator.value();
            faX3.a(fbz_0.g).a(this.ae);
            faX3.a(fbz_0.d).a(this.ab);
        }
        this.w();
    }

    public String b() {
        if (this.ah != null) {
            return bae.h().a(39, (long)this.ah.c(), new Object[0]);
        }
        return null;
    }

    public bVo a(long l) {
        return (bVo)this.aq.get(l);
    }

    @Override
    public String[] d() {
        return U;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.b();
        }
        if (string.equals(b)) {
            int n = ddH.a().d();
            if (this.aj.isEmpty() || !this.aj.containsKey(n)) {
                return null;
            }
            return this.aj.get(n);
        }
        if (string.equals(i)) {
            return this.ah.v();
        }
        if (string.equals(j)) {
            return this.n();
        }
        if (string.equals(d)) {
            if (this.ar == null) {
                this.ar = new ArrayList();
                TLongObjectIterator tLongObjectIterator = this.aq.iterator();
                while (tLongObjectIterator.hasNext()) {
                    tLongObjectIterator.advance();
                    this.ar.add((bVo)tLongObjectIterator.value());
                }
                this.ar.sort(new bUY(this));
            }
            return this.ar;
        }
        if (string.equals(h)) {
            return this.an;
        }
        if (string.equals(e)) {
            return this.I();
        }
        if (string.equals(f)) {
            return this.J();
        }
        if (string.equals(g)) {
            return this.K();
        }
        if (string.equals(l)) {
            int n = this.ah.c();
            return azs_0.a().m(n == 0 ? -1 : n);
        }
        if (string.equals(m)) {
            return bae.h().a("election.closureDescription", V, this.U());
        }
        if (string.equals(o)) {
            int n = this.ah.v() ? this.ah.A() : this.ah.C().a();
            return bae.h().a("election.totalCandidates", V, n);
        }
        if (string.equals(n)) {
            int n = this.ah.v() ? this.ah.B() : this.ah.C().b();
            return bae.h().a("election.totalVotes", V, n);
        }
        if (string.equals(p)) {
            if (this.ak == null) {
                return false;
            }
            return this.ak.a().a() == azu_0.j().k().a_();
        }
        if (string.equals(q)) {
            if (bUW.H()) {
                return true;
            }
            if (this.ak == null) {
                return false;
            }
            return this.ak.a().a() == azu_0.j().k().a_();
        }
        if (string.equals(r)) {
            if (bUW.H()) {
                return true;
            }
            if (this.am == null) {
                return false;
            }
            return this.am.a().a() == azu_0.j().k().a_();
        }
        if (string.equals(s)) {
            if (bUW.H()) {
                return true;
            }
            if (this.al == null) {
                return false;
            }
            return this.al.a().a() == azu_0.j().k().a_();
        }
        if (string.equals(t)) {
            if (this.ap == null) {
                this.ap = new ArrayList();
                TShortObjectIterator tShortObjectIterator = this.ao.iterator();
                while (tShortObjectIterator.hasNext()) {
                    tShortObjectIterator.advance();
                    this.ap.add((bUP)tShortObjectIterator.value());
                }
                this.ap.sort(new buz_0(this));
            }
            return this.ap;
        }
        if (string.equals(k)) {
            return this.V();
        }
        if (string.equals(w)) {
            wt_0 wt_02 = this.T();
            return DateFormat.getDateTimeInstance(2, 2, bae.h().f().a()).format(wt_02.i());
        }
        if (string.equals(x)) {
            wt_0 wt_03 = this.S();
            return DateFormat.getDateTimeInstance(2, 2, bae.h().f().a()).format(wt_03.i());
        }
        if (string.equals(v)) {
            return new fjv_1(this.R() * 100.0f);
        }
        if (string.equals(y)) {
            fcu_0 fcu_02 = azu_0.j().k().fE().w();
            return fcu_02 != null && fcv_0.d(fcu_02);
        }
        if (string.equals(A)) {
            fcu_0 fcu_03 = azu_0.j().k().fE().w();
            return fcu_03 != null && fcv_0.f(fcu_03);
        }
        if (string.equals(B)) {
            fcu_0 fcu_04 = azu_0.j().k().fE().w();
            return fcu_04 != null && fcv_0.c(fcu_04);
        }
        if (string.equals(C)) {
            return this.O();
        }
        if (string.equals(z)) {
            fcu_0 fcu_05 = azu_0.j().k().fE().w();
            return fcu_05 != null && fcv_0.b(fcu_05);
        }
        if (string.equals(D)) {
            return this.L();
        }
        if (string.equals(F)) {
            int n = 0;
            ArrayList<bVs> arrayList = this.Q();
            for (bVs bVs2 : arrayList) {
                n += bVs2.c();
            }
            return n;
        }
        if (string.equals(G)) {
            int n = 0;
            for (bVs bVs3 : this.Q()) {
                n += bVs3.f();
            }
            return n;
        }
        if (string.equals(E)) {
            return this.Q();
        }
        if (string.equals(u)) {
            return Float.valueOf(this.R());
        }
        if (string.equals(J)) {
            if (this.aA == null) {
                this.aA = new ArrayList();
                TIntObjectIterator<faX> tIntObjectIterator = fbc_0.a.a(new Integer[]{this.ah.c()});
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    faX faX2 = (faX)tIntObjectIterator.value();
                    this.aA.add(new bVm(this, faX2));
                }
            }
            return this.aA;
        }
        if (string.equals(I)) {
            return this.P();
        }
        if (string.equals(H)) {
            if (this.au == null) {
                this.au = new bVl(this.ah.E().c());
            }
            return this.au;
        }
        if (string.equals(K)) {
            return this.M();
        }
        if (string.equals(L)) {
            return this.N();
        }
        if (string.equals(P)) {
            DecimalFormat decimalFormat = new DecimalFormat("#0.##");
            String string2 = decimalFormat.format(-50.0) + "%";
            return bae.h().a("nation.opinionBadConsequency", string2);
        }
        if (string.equals(Q)) {
            DecimalFormat decimalFormat = new DecimalFormat("#0.##");
            String string3 = decimalFormat.format(50.0) + "%";
            return bae.h().a("nation.opinionGoodConsequency", string3);
        }
        if (string.equals(R)) {
            fer_0 fer_02 = this.ah.G();
            DecimalFormat decimalFormat = new DecimalFormat("#0.##");
            ani_2 ani_22 = new ani_2();
            ani_22.a().a((CharSequence)bae.h().a("nation.opinionScore", new Object[0])).a((CharSequence)" : ");
            ani_22.a((CharSequence)decimalFormat.format(fer_02.d() * 100.0f)).a('%');
            return ani_22.r();
        }
        if (string.equals(N)) {
            fer_0 fer_03 = this.ah.G();
            int n = fer_03.a(fep_0.c);
            int n2 = fer_03.a(fep_0.b);
            int n3 = fer_03.a(fep_0.a);
            DecimalFormat decimalFormat = new DecimalFormat("#0.##");
            ani_2 ani_23 = new ani_2();
            ani_23.a().a((CharSequence)bae.h().a("nation.opinionScore", new Object[0])).a((CharSequence)" : ");
            ani_23.a((CharSequence)decimalFormat.format(fer_03.d() * 100.0f)).a((CharSequence)"%");
            ani_23.b().m();
            ani_23.i().a(azf_2.j.w());
            ani_23.a((CharSequence)bae.h().a("nation.opinionGood", new Object[0])).a((CharSequence)" : ");
            ani_23.d(n);
            ani_23.j().m();
            ani_23.i().a(azf_2.w.w());
            ani_23.a((CharSequence)bae.h().a("nation.opinionNeutral", new Object[0])).a((CharSequence)" : ");
            ani_23.d(n2);
            ani_23.j().m();
            ani_23.i().a(azf_2.h.w());
            ani_23.a((CharSequence)bae.h().a("nation.opinionBad", new Object[0])).a((CharSequence)" : ");
            ani_23.d(n3);
            ani_23.j();
            return ani_23.r();
        }
        if (string.equals(O)) {
            fer_0 fer_04 = this.ah.G();
            return new fjv_1((fer_04.c() > 0 ? fer_04.d() + 1.0f : 1.0f) / 2.0f * 100.0f);
        }
        if (string.equals(S)) {
            return this.aB != azu_0.j().k().fE().v().d;
        }
        if (string.equals(T)) {
            fer_0 fer_05 = this.ah.G();
            bmr_1 bmr_12 = azu_0.j().k();
            if (!bmr_12.a(enw_0.m)) {
                return bae.h().a("error.playerNotSubscriptionRight", new Object[0]);
            }
            if (!emj_0.a.a(new emh_0[]{bmr_12})) {
                return bae.h().a("error.playerNotSubscribed", new Object[0]);
            }
            int n = fer_05.a(bmr_12);
            if (n == 0) {
                return null;
            }
            switch (n) {
                case 2: {
                    return bae.h().a("opinionReason.didntVote", new Object[0]);
                }
                case 1: {
                    return bae.h().a("opinionReason.voteRunning", new Object[0]);
                }
                case 3: {
                    return bae.h().a("opinionReason.noGovernor", new Object[0]);
                }
            }
            return null;
        }
        if (string.equals(M)) {
            return this.aB;
        }
        return null;
    }

    private static boolean H() {
        return emp_0.b(azu_0.j().n().v(), emq_0.br);
    }

    private Object I() {
        fcq_0 fcq_02;
        if (this.ak == null && (fcq_02 = this.ah.D().c()) != null) {
            this.ak = new bUQ(fcq_02);
        }
        return this.ak;
    }

    private Object J() {
        fcq_0 fcq_02;
        if (this.am == null && (fcq_02 = this.ah.D().b(fcu_0.c)) != null) {
            this.am = new bUM(fcq_02);
        }
        return this.am;
    }

    private Object K() {
        fcq_0 fcq_02;
        if (this.al == null && (fcq_02 = this.ah.D().b(fcu_0.d)) != null) {
            this.al = new bUM(fcq_02);
        }
        return this.al;
    }

    private boolean L() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        fcu_0 fcu_02 = bmr_12.fE().w();
        return fcu_02 != null && fcv_0.h(fcu_02);
    }

    public void a(int n, String string) {
        this.ay.put(n, (Object)string);
    }

    public String a(int n) {
        return (String)this.ay.get(n);
    }

    private ArrayList<buu_0> M() {
        if (this.aw == null) {
            this.aw = new ArrayList();
            TIntObjectIterator<faX> tIntObjectIterator = fbc_0.a.a(new Integer[0]);
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                int n = tIntObjectIterator.key();
                this.aw.add(new buu_0(n));
            }
        }
        return this.aw;
    }

    private ArrayList<bVq> N() {
        if (this.ax == null) {
            this.ax = new ArrayList();
            TIntObjectIterator<faX> tIntObjectIterator = fbc_0.a.a();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                int n = tIntObjectIterator.key();
                if (this.b(n) <= 0) continue;
                this.ax.add(new bVq(n));
            }
            this.ax.sort(new bVa(this));
            int n = 0;
            for (bVq bVq2 : this.ax) {
                bVq2.a(n += bVq2.a());
            }
            this.ax.sort(new bVb(this));
        }
        return this.ax;
    }

    boolean O() {
        fcu_0 fcu_02 = azu_0.j().k().fE().w();
        return fcu_02 != null && fcv_0.g(fcu_02);
    }

    private bVm P() {
        if (this.av == null) {
            this.av = new bVm(this, this.ah);
        }
        return this.av;
    }

    public int c() {
        return this.av.e();
    }

    private ArrayList<bVs> Q() {
        if (this.at == null) {
            this.at = new ArrayList();
            TIntObjectIterator<fem_0> tIntObjectIterator = this.ah.E().a();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                this.at.add(new bVs((fem_0)tIntObjectIterator.value()));
            }
        }
        return this.at;
    }

    public void e() {
        fis_1.a().a((ajf_1)this.av, "currentLawPoints");
    }

    public int f() {
        int n = 0;
        TIntObjectIterator<faX> tIntObjectIterator = fbc_0.a.a();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            n += this.b(tIntObjectIterator.key());
        }
        return n;
    }

    public int b(int n) {
        return this.az.get(n);
    }

    public void a(int n, int n2) {
        this.az.put(n, n2);
    }

    public void b(faX faX2) {
        faX2.a(fbz_0.d).a(this.ab);
    }

    public void c(faX faX2) {
        faX2.a(fbz_0.d).b(this.ab);
    }

    public void a(byte by) {
        this.aB = by;
        fis_1.a().a((ajf_1)this, M, O, S);
    }

    public byte g() {
        return this.aB;
    }

    public void h() {
        if (this.am == null) {
            return;
        }
        fis_1.a().a((ajf_1)this.am, this.am.d());
    }

    public void i() {
        if (this.al == null) {
            return;
        }
        fis_1.a().a((ajf_1)this.al, this.al.d());
    }

    public void a(bUM bUM2) {
        fis_1.a().a((ajf_1)bUM2, bUM2.d());
    }

    public void j() {
        this.k();
        this.u();
    }

    public void k() {
        this.v();
        this.F();
        this.r();
        this.s();
        this.t();
        this.q();
        this.a(false);
        this.a((String)null);
    }

    public void a(boolean bl) {
        if (bl) {
            TIntObjectIterator<faX> tIntObjectIterator = fbc_0.a.a();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                faX faX2 = (faX)tIntObjectIterator.value();
                faX2.a(fbz_0.g).b(this.ae);
                faX2.a(fbz_0.g).a(this.ad);
            }
        } else {
            TIntObjectIterator<faX> tIntObjectIterator = fbc_0.a.a();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                faX faX3 = (faX)tIntObjectIterator.value();
                faX3.a(fbz_0.g).b(this.ad);
                faX3.a(fbz_0.g).a(this.ae);
            }
        }
    }

    public void l() {
        this.j();
        this.K();
        this.I();
        this.J();
        fis_1.a().a((ajf_1)this, U);
    }

    public void m() {
        this.at = null;
        fis_1.a().a((ajf_1)this, E);
    }

    private float R() {
        wu_0 wu_02 = wc_0.p().a();
        wt_0 wt_02 = this.T();
        ww_0 ww_02 = wt_02.g(wu_02);
        ww_0 ww_03 = new ww_0(this.ah.y());
        ww_03.e(this.ah.x());
        return (float)ww_02.g() / (float)ww_03.g();
    }

    private wt_0 S() {
        wt_0 wt_02 = new wt_0(this.ah.w());
        wt_02.a(this.ah.x());
        return wt_02;
    }

    private wt_0 T() {
        wt_0 wt_02 = new wt_0(this.ah.w());
        wt_02.a(this.ah.x());
        wt_02.b(this.ah.y());
        return wt_02;
    }

    private String U() {
        wt_0 wt_02 = wt_0.b(System.currentTimeMillis());
        wu_0 wu_02 = this.ah.w();
        ww_0 ww_02 = new ww_0(this.ah.x().g() - wu_02.g(wt_02).g());
        if (!ww_02.e()) {
            return "-";
        }
        return bae.h().a("remainingDuration", 0, 0, ww_02.d(), ww_02.c(), ww_02.b(), ww_02.a());
    }

    public long n() {
        return this.ah.I();
    }

    private azj_2 V() {
        return anr_0.aa;
    }

    private void W() {
        if (this.ah == null) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        fcs_0 fcs_02 = this.ah.D();
        fcq_0 fcq_02 = fcs_02.b(bmr_12.a_());
        TLongObjectIterator tLongObjectIterator = this.aq.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bVo bVo2 = (bVo)tLongObjectIterator.value();
            fcu_0 fcu_02 = bVo2.a();
            fcq_0 fcq_03 = fcs_02.b(fcu_02);
            bVo2.a(fcq_03 == null ? null : fcq_03.f());
        }
    }

    private void X() {
        int n;
        if (this.ah == null) {
            return;
        }
        int n2 = n = this.ah.v() ? ddH.a().d() : 0;
        while (n != -1) {
            ArrayList arrayList = (ArrayList)this.aj.get(n);
            if (arrayList != null && !this.ah.v()) {
                n = this.c(n + 1);
                continue;
            }
            ArrayList<bUC> arrayList2 = new ArrayList<bUC>();
            ArrayList<fcf> arrayList3 = new ArrayList<fcf>();
            if (this.ah.v()) {
                this.ah.a(0, 3, arrayList3);
            } else if (arrayList2.isEmpty()) {
                this.ah.C().a(n * 3, 3, arrayList3);
            }
            if (arrayList3.isEmpty()) {
                n = -1;
                continue;
            }
            boolean bl = true;
            for (fcf fcf2 : arrayList3) {
                if (n == 0 && bl && !this.ah.v() && !fcf2.d()) {
                    arrayList2.add(new bUN(fcf2));
                } else {
                    arrayList2.add(new bUC(fcf2));
                }
                bl = false;
            }
            this.aj.put(n, arrayList2);
            n = this.ah.v() ? -1 : this.c(n + 1);
        }
    }

    private int c(int n) {
        for (int k = n; k < this.aj.size(); ++k) {
            ArrayList arrayList = (ArrayList)this.aj.get(k);
            if (arrayList == null) {
                return -1;
            }
            if (arrayList.size() >= 3) continue;
            return k;
        }
        return n;
    }

    public void o() {
        TIntObjectIterator tIntObjectIterator = this.aj.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ArrayList arrayList = (ArrayList)tIntObjectIterator.value();
            int n = arrayList.size();
            for (int k = 0; k < n; ++k) {
                ((bUC)arrayList.get(k)).b();
            }
        }
        this.aj.clear();
        this.ah.J();
    }

    public void p() {
        this.av = null;
    }

    public void q() {
        this.aA = null;
    }

    public void r() {
        this.ak = null;
    }

    public void s() {
        this.am = null;
    }

    public void t() {
        this.al = null;
    }

    public void u() {
        this.aC = null;
    }

    public void v() {
        this.aw = null;
        this.ax = null;
    }

    public void w() {
        this.X();
        this.W();
        this.D();
        this.i();
        this.h();
        this.e();
        fis_1.a().a((ajf_1)this, U);
    }

    public bUC b(long l) {
        TIntObjectIterator tIntObjectIterator = this.aj.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            for (bUC bUC2 : (ArrayList)tIntObjectIterator.value()) {
                if (bUC2.a().a() != l) continue;
                return bUC2;
            }
        }
        return null;
    }

    public faX x() {
        return this.ah;
    }

    public bUP a(short s2) {
        return (bUP)this.ao.get(s2);
    }

    public void a(String string) {
        this.as = string;
    }

    public String y() {
        return this.as;
    }

    public bUQ z() {
        return this.ak;
    }

    public bUM A() {
        return this.am;
    }

    public bUM B() {
        return this.al;
    }

    public boolean C() {
        wt_0 wt_02 = wt_0.b(System.currentTimeMillis());
        wt_0 wt_03 = new wt_0(this.ah.w());
        return wt_02.b(wt_03);
    }

    public void D() {
        if (this.ak == null) {
            return;
        }
        fis_1.a().a((ajf_1)this.ak, this.ak.d());
    }

    public TLongHashSet E() {
        TLongHashSet tLongHashSet = new TLongHashSet();
        if (this.av == null) {
            return tLongHashSet;
        }
        for (bUR bUR2 : this.av.h) {
            if (!bUR2.b()) continue;
            tLongHashSet.add(bUR2.a().a());
        }
        for (bUR bUR2 : this.av.i) {
            if (!bUR2.b()) continue;
            tLongHashSet.add(bUR2.a().a());
        }
        return tLongHashSet;
    }

    public void F() {
        if (this.av == null) {
            return;
        }
        for (bUR bUR2 : this.av.h) {
            bUR2.c();
        }
    }
}

