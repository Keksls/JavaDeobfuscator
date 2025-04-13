/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from byp
 */
public class byp_2
implements ajh_1 {
    private static final byp_2 O = new byp_2();
    private final erk_1 P = new byq_2(this);
    erg_1 Q;
    public static final String a = "name";
    public static final String b = "blazon";
    public static final String d = "numMembers";
    public static final String e = "membersLevelAverage";
    public static final String f = "guildLevelText";
    public static final String g = "currentGuildPoints";
    public static final String h = "totalGuildPoints";
    public static final String i = "conquestPoints";
    public static final String j = "membersList";
    public static final String k = "displayDisconnectedMembers";
    public static final String l = "canInvite";
    public static final String m = "iAmLeader";
    public static final String n = "guildDescription";
    public static final String o = "guildMessage";
    public static final String p = "hasRightToEditGuildDescription";
    public static final String q = "hasRightToEditGuildMessage";
    public static final String r = "hasRightToEditRanks";
    public static final String s = "hasRightToCreateRanks";
    public static final String t = "hasRightToBuyBonus";
    public static final String u = "hasHavenWorld";
    public static final String v = "havenWorldPageWarning";
    public static final String w = "localPlayer";
    public static final String x = "ranks";
    public static final String y = "smileys";
    public static final String z = "quests";
    public static final String A = "level";
    public static final String B = "nextLevel";
    public static final String C = "nextLevelCost";
    public static final String D = "nextLevelDuration";
    public static final String E = "canLevelUp";
    public static final String F = "availableBonuses";
    public static final String G = "loadingBonuses";
    public static final String H = "permanentBonuses";
    public static final String I = "temporaryBonuses";
    public static final String J = "simultaneousBonusesText";
    public static final String K = "currentWeekGuildPoints";
    public static final String L = "guildMembersThreshold";
    public static final String M = "mustRename";
    public static final String[] N = new String[]{"name", "blazon", "numMembers", "membersLevelAverage", "guildLevelText", "currentGuildPoints", "totalGuildPoints", "membersList", "displayDisconnectedMembers", "canInvite", "iAmLeader", "guildDescription", "guildMessage", "hasRightToEditGuildDescription", "hasRightToEditGuildMessage", "hasRightToEditRanks", "hasRightToCreateRanks", "hasRightToBuyBonus", "havenWorldPageWarning", "localPlayer", "ranks", "quests", "level", "nextLevel", "nextLevelCost", "availableBonuses", "loadingBonuses", "temporaryBonuses", "permanentBonuses", "simultaneousBonusesText", "conquestPoints", "currentWeekGuildPoints", "guildMembersThreshold", "mustRename"};
    private boolean R = true;
    final ArrayList<byo_2> S = new ArrayList();
    final ArrayList<byj_2> T = new ArrayList();
    private Comparator<byo_2> U = byb_1.a;
    private boolean V;
    private int W;
    private final ArrayList<bxj_1> X = new ArrayList();

    public static byp_2 a() {
        return O;
    }

    public void b() {
        bmr_1 bmr_12 = azu_0.j().k();
        this.Q = ((bot_2)bmr_12.eV()).f();
        this.y();
        this.e();
        this.c(false);
        this.U = byb_1.a;
        this.V = true;
        this.W = 0;
        this.X.clear();
        for (xg_0 xg_02 : xg_0.values()) {
            if (xg_02.a() > 14) break;
            this.X.add(bxj_1.a(bmr_12.gO(), bmr_12.gX(), xg_02.a()));
        }
        this.d(false);
        fis_1.a().a((ajf_1)this, N);
    }

    private void y() {
        this.Q.c((TObjectProcedure<erh_1>)((TObjectProcedure)erh_12 -> {
            this.a((erh_1)erh_12);
            return true;
        }));
    }

    void a(erh_1 erh_12) {
        if (!bxv_1.b(eqs_2.a.a(erh_12.a()))) {
            return;
        }
        bxy_1 bxy_12 = byk_2.a.a(erh_12.a());
        bxy_12.h();
    }

    public void c() {
        byn_2 byn_22 = this.a(this.Q.b()).j();
        fis_1.a().a("selectedGuildRank", byn_22);
        fyy_0 fyy_02 = fpm_0.b().h().d("guildManagementDialog");
        if (fyy_02 == null) {
            return;
        }
        fug_0 fug_02 = (fug_0)fyy_02.a("guildName");
        fug_02.c(((byj_2)byn_22).e());
    }

    public void e() {
        this.Q.a(this.P);
    }

    public bxj_1 a(byte by) {
        for (bxj_1 bxj_12 : this.X) {
            if (bxj_12.a() != by) continue;
            return bxj_12;
        }
        return null;
    }

    public ArrayList<byj_2> f() {
        return this.T;
    }

    public byj_2 a(long l) {
        for (byj_2 byj_22 : this.T) {
            if (byj_22.h() != l) continue;
            return byj_22;
        }
        return null;
    }

    public erl_1 b(long l) {
        return this.Q.a(l);
    }

    public boolean g() {
        return this.Q != null;
    }

    public erg_1 h() {
        return this.Q;
    }

    public void i() {
        String string = bae.h().a("guild.newRank", new Object[0]);
        long l = eQt.a(new ArrayList<eQt>());
        czd_2 czd_22 = new czd_2(string, l);
        int n = this.Q.o();
        if (n >= 15) {
            return;
        }
        ern_1 ern_12 = this.Q.c(this.Q.d());
        if (ern_12 == null) {
            return;
        }
        if (string.length() > 16) {
            return;
        }
        erl_1 erl_12 = this.Q.a(azu_0.j().k().a_());
        if (!this.Q.c(erl_12.d()).a(eQt.d, ern_12.d())) {
            return;
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(czd_22);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void c(long l) {
        this.c();
        cze_2 cze_22 = new cze_2(l);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(cze_22);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void a(long l, short s2) {
        czi_2 czi_22 = new czi_2(l, s2);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(czi_22);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void a(byj_2 byj_22) {
        czg_2 czg_22 = new czg_2(byj_22.h(), byj_22.f(), byj_22.e());
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(czg_22);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void a(String string) {
        cza_1 cza_12 = new cza_1(string);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(cza_12);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void c(String string) {
        czc_1 czc_12 = new czc_1(string);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(czc_12);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void e(String string) {
        czj_2 czj_22 = new czj_2(string);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(czj_22);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void b(byte by) {
        czl_2 czl_22 = new czl_2(by);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(czl_22);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public int j() {
        return this.S.size();
    }

    public void k() {
        if (this.Q == null || this.Q.h() == null || this.Q.h().isEmpty()) {
            return;
        }
        aUm aUm2 = new aUm(aup_0.g.f(), this.Q.h());
        aUm2.a(aup_0.g);
        if (!aUf.a()) {
            aUf.a(aUm2);
        } else {
            aul_0.a().a(aUm2);
        }
    }

    public void a(int n) {
        etk_2 etk_22 = eta_2.a((short)n);
        etw_2 etw_22 = eta_2.a(etk_22);
        String string = bae.h().a(126, (long)etw_22.a(), new Object[0]);
        String string2 = bae.h().a("notification.havenWorldBuildingAddedText", string);
        dbo_0.a.a(string2, 8);
        aUh.b("guild.chatBuildingAdded", string);
    }

    public void b(int n) {
        etk_2 etk_22 = eta_2.a((short)n);
        etw_2 etw_22 = eta_2.a(etk_22);
        String string = bae.h().a(126, (long)etw_22.a(), new Object[0]);
        String string2 = bae.h().a("notification.havenWorldBuildingRemovedText", string);
        dbo_0.a.a(string2, 8);
        aUh.b("guild.chatBuildingRemoved", string);
    }

    public void a(int n, int n2) {
        etk_2 etk_22 = eta_2.a((short)n2);
        etw_2 etw_22 = eta_2.a(etk_22);
        if (etw_22.a() != n2) {
            this.a(etw_22.a());
            return;
        }
        String string = bae.h().a(126, (long)n, new Object[0]);
        String string2 = bae.h().a(126, (long)n2, new Object[0]);
        String string3 = bae.h().a("notification.havenWorldBuildingEvolvedText", string, string2);
        dbo_0.a.a(string3, 8);
        aUh.b("guild.chatBuildingEvolved", string, string2);
    }

    public void c(int n) {
        if (this.W == n) {
            this.V = !this.V;
        } else {
            this.V = true;
            this.W = n;
        }
        Comparator<byo_2> comparator = null;
        switch (this.W) {
            case 0: {
                if (this.V) {
                    comparator = byb_1.a;
                    break;
                }
                comparator = byb_1.b;
                break;
            }
            case 1: {
                if (this.V) {
                    comparator = bya_2.a;
                    break;
                }
                comparator = bya_2.b;
                break;
            }
            case 2: {
                if (this.V) {
                    comparator = byz_2.a;
                    break;
                }
                comparator = byz_2.b;
                break;
            }
            case 3: {
                if (this.V) {
                    comparator = byz_2.a;
                    break;
                }
                comparator = byz_2.b;
                break;
            }
            case 5: {
                comparator = this.V ? byc_2.a : byc_2.b;
            }
        }
        this.U = comparator;
        this.f(true);
    }

    @Override
    public String[] d() {
        return N;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            if (this.Q == null) {
                return null;
            }
            return this.Q.e();
        }
        if (string.equals(b)) {
            if (this.Q == null) {
                return null;
            }
            eqd_2 eqd_22 = new eqd_2(this.Q.f());
            if (eqd_22 == null) {
                return null;
            }
            bxo_1 bxo_12 = new bxo_1(eqd_22.a(), eqd_22.c(), bxm_1.a().a(eqd_22.d()), bxm_1.a().a(eqd_22.b()));
            ays_2 ays_22 = bxp_1.a().a(bxo_12);
            bxo_12.e();
            return ays_22;
        }
        if (string.equals(d)) {
            if (this.Q == null) {
                return 0;
            }
            return this.b(false).size() + " / " + this.Q.m();
        }
        if (string.equals(e)) {
            if (this.Q == null) {
                return 0;
            }
            long l = 0L;
            for (byo_2 byo_22 : this.S) {
                l += (long)byo_22.e();
            }
            return Math.round((float)l / (float)this.Q.m());
        }
        if (string.equals(g)) {
            return this.Q.j();
        }
        if (string.equals(i)) {
            return 0;
        }
        if (string.equals(h)) {
            return this.Q.k();
        }
        if (string.equals(w)) {
            ArrayList<byo_2> arrayList = new ArrayList<byo_2>();
            arrayList.add(this.r());
            return arrayList;
        }
        if (string.equals(j)) {
            return this.b(this.R);
        }
        if (string.equals(l)) {
            return this.a(eQt.a);
        }
        if (string.equals(k)) {
            return this.R;
        }
        if (string.equals(r)) {
            return this.a(eQt.d);
        }
        if (string.equals(s)) {
            return this.a(eQt.d, this.Q.c(this.w()).d());
        }
        if (string.equals(p)) {
            return this.a(eQt.f);
        }
        if (string.equals(q)) {
            return this.a(eQt.g);
        }
        if (string.equals(t)) {
            return this.z() && this.a(eQt.j);
        }
        if (string.equals(u)) {
            if (this.Q == null) {
                return null;
            }
            return fis_1.a().e("havenWorld") != null;
        }
        if (string.equals(v)) {
            boolean bl;
            if (this.Q == null) {
                return null;
            }
            Object object = fis_1.a().e("havenWorld");
            int n = enp_2.a.b(ens_2.bz);
            boolean bl2 = bl = this.Q.i() < n;
            if (bl || object == null) {
                return bae.h().a("guild.havenWorldPageWarning", n);
            }
            return null;
        }
        if (string.equals(n)) {
            if (this.Q == null) {
                return null;
            }
            return this.Q.g();
        }
        if (string.equals(o)) {
            if (this.Q == null) {
                return null;
            }
            return this.Q.h();
        }
        if (string.equals(x)) {
            this.T.sort(new bys_2(this));
            return this.T;
        }
        if (string.equals(m)) {
            return this.q();
        }
        if (string.equals(y)) {
            return this.X;
        }
        if (string.equals(z)) {
            return this.B();
        }
        if (string.equals(A)) {
            return this.n();
        }
        if (string.equals(B)) {
            if (this.Q.i() == 10) {
                return null;
            }
            return this.n() + 1;
        }
        if (string.equals(C)) {
            if (this.Q.i() == 10) {
                return null;
            }
            return eqw_2.b.a(this.n() + 1);
        }
        if (string.equals(D)) {
            if (this.Q.i() == 10) {
                return null;
            }
            eqp_2 eqp_22 = eqt_2.a(this.n() + 1);
            eqd_0 eqd_02 = eqp_22.a();
            return wa_0.c(eqd_02.b());
        }
        if (string.equals(E)) {
            if (this.Q.i() == 10) {
                return false;
            }
            int n = eqw_2.b.a(this.n() + 1);
            if (n > this.Q.j()) {
                return false;
            }
            eqp_2 eqp_23 = eqt_2.a(this.n() + 1);
            eqd_0 eqd_03 = eqp_23.a();
            erh_1 erh_12 = this.Q.a(eqd_03.a());
            return erh_12 == null || !bxv_1.a(erh_12, eqd_03, this.Q);
        }
        if (string.equals(F)) {
            return this.l();
        }
        if (string.equals(G)) {
            return this.m();
        }
        if (string.equals(I)) {
            return this.a(false);
        }
        if (string.equals(J)) {
            if (this.z()) {
                return null;
            }
            int n = this.Q.q().b();
            return bae.h().a("guildBonus.maxSimultaneous", n);
        }
        if (string.equals(K)) {
            int n = wc_0.p().get(3);
            int n2 = this.Q.t() != n ? 0 : this.Q.s();
            return n2 + "/" + this.Q.r();
        }
        if (string.equals(H)) {
            ArrayList<String> arrayList = new ArrayList<String>();
            ArrayList<efh_0> arrayList2 = new ArrayList<efh_0>();
            for (bxy_1 bxy_12 : this.a(true)) {
                eqh_0 eqh_02 = bxy_12.e();
                if (eqh_02.a() == eqg_0.a) {
                    eqk_0 eqk_02 = (eqk_0)eqh_02;
                    int n = eqk_02.b();
                    efh_0 efh_02 = bgh_0.a().d(n);
                    arrayList2.add(efh_02);
                    continue;
                }
                arrayList.add(bxy_12.a());
            }
            bow_1 bow_12 = new bow_1(bae.h(), arrayList2, 0, true);
            arrayList.addAll(bow_12.a());
            return arrayList;
        }
        if (string.equals(L)) {
            return 200 + this.Q.x();
        }
        if (string.equals(M)) {
            return era_1.e.matcher(this.Q.e()).find();
        }
        return null;
    }

    private boolean z() {
        int n = this.Q.q().b();
        return this.m().size() < n;
    }

    public ArrayList<bxx_1> l() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (eqp_2 eqp_22 : eqp_2.values()) {
            if (eqt_2.a(eqp_22)) continue;
            eqd_0 eqd_02 = eqp_22.a();
            int n = eqd_02.a();
            erh_1 erh_12 = this.Q.a(n);
            int n2 = eqw_2.b.c(n);
            if (!tIntObjectHashMap.containsKey(n2)) {
                tIntObjectHashMap.put(n2, new ArrayList());
            }
            ArrayList arrayList = (ArrayList)tIntObjectHashMap.get(n2);
            if (erh_12 != null) continue;
            arrayList.add(byk_2.a.a(n));
        }
        ArrayList arrayList = new ArrayList(tIntObjectHashMap.size());
        bxx_1 bxx_12 = null;
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bxx_12 = new bxx_1(tIntObjectIterator.key(), (ArrayList)tIntObjectIterator.value());
            arrayList.add(bxx_12);
        }
        arrayList.sort(new byt_2(this));
        return arrayList;
    }

    public ArrayList<bxy_1> m() {
        ArrayList<bxy_1> arrayList = new ArrayList<bxy_1>();
        this.Q.c(new byu_2(this, arrayList));
        return arrayList;
    }

    public ArrayList<bxy_1> a(boolean bl) {
        ArrayList<bxy_1> arrayList = new ArrayList<bxy_1>();
        for (eqp_2 eqp_22 : eqp_2.values()) {
            eqd_0 eqd_02;
            erh_1 erh_12;
            if (eqt_2.a(eqp_22) || (erh_12 = this.Q.a((eqd_02 = eqp_22.a()).a())) == null || !eqd_02.e() ^ bl || bxv_1.a(erh_12, eqd_02, this.Q)) continue;
            arrayList.add(byk_2.a.a(eqd_02.a()));
        }
        return arrayList;
    }

    public ArrayList<byo_2> b(boolean bl) {
        ArrayList<byo_2> arrayList = new ArrayList<byo_2>();
        for (byo_2 byo_22 : this.S) {
            if (!bl && !byo_22.h()) continue;
            arrayList.add(byo_22);
        }
        return arrayList;
    }

    public short n() {
        return this.Q.i();
    }

    public boolean a(eQt eQt2) {
        return this.a(eQt2, (short)-1);
    }

    public boolean a(eQt eQt2, short s2) {
        if (this.Q == null) {
            return false;
        }
        long l = this.o();
        if (l == -1L) {
            return false;
        }
        ern_1 ern_12 = this.Q.c(l);
        if (ern_12 == null) {
            return false;
        }
        return ern_12.a(eQt2, s2);
    }

    public long o() {
        byo_2 byo_22 = this.r();
        if (byo_22 == null) {
            return -1L;
        }
        return byo_22.b();
    }

    public ern_1 p() {
        if (this.Q == null) {
            return null;
        }
        return this.Q.c(this.o());
    }

    public boolean q() {
        if (this.Q == null) {
            return false;
        }
        byo_2 byo_22 = this.r();
        if (byo_22 == null) {
            return false;
        }
        return this.Q.b() == byo_22.b();
    }

    public byo_2 r() {
        return this.d(azu_0.j().k().a_());
    }

    public byo_2 d(long l) {
        for (byo_2 byo_22 : this.S) {
            if (byo_22.g() != l) continue;
            return byo_22;
        }
        return null;
    }

    public List<byo_2> s() {
        return this.S;
    }

    public void c(boolean bl) {
        this.T.clear();
        this.Q.b(new byv_2(this));
        this.f(bl);
        this.A();
        if (bl) {
            fis_1.a().a((ajf_1)this, x, p, q, r, s, t);
        }
    }

    private void A() {
        this.T.sort(new byw_2(this));
    }

    void a(erl_1 erl_12) {
        for (byo_2 byo_22 : this.S) {
            if (byo_22.g() != erl_12.a()) continue;
            fis_1.a().a((ajf_1)byo_22, byo_2.t);
        }
        fis_1.a().a((ajf_1)this, p, q, r, s, t);
    }

    private void a(ern_1 ern_12) {
        for (byj_2 byj_22 : this.T) {
            if (byj_22.h() != ern_12.a()) continue;
            fis_1.a().a((ajf_1)byj_22, byj_2.i);
        }
    }

    public void d(boolean bl) {
        this.S.clear();
        this.Q.a(new byx_2(this));
        this.f(bl);
        if (bl) {
            fis_1.a().a((ajf_1)this, d, e, d, j, w, r, s, p, q, t);
        }
    }

    private void f(boolean bl) {
        this.S.sort(this.U);
        if (bl) {
            fis_1.a().a((ajf_1)this, m, l, e, w, j);
        }
    }

    public boolean t() {
        return this.R;
    }

    public void e(boolean bl) {
        if (this.R == bl) {
            return;
        }
        this.R = bl;
        this.d(true);
    }

    public void a(long l, long l2) {
        czb_1 czb_12 = new czb_1(l, l2);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(czb_12);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void e(long l) {
        czk_2 czk_22 = new czk_2(l);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(czk_22);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public boolean a(@Nullable bnh_1 bnh_12) {
        boolean bl = this.Q != null && this.a(eQt.a) && !this.Q.n();
        return bl && (bnh_12 == null || bnh_12.fc() <= 0L);
    }

    public void f(String string) {
        if (aUh.a(string, eAO.d)) {
            return;
        }
        aUh.b("guild.inviting.character", string);
        czz_2 czz_22 = new czz_2(string);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(czz_22);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void u() {
        czf_2 czf_22 = new czf_2();
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(czf_22);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public long v() {
        if (this.Q == null) {
            return -1L;
        }
        return this.Q.b();
    }

    public long w() {
        if (this.Q == null) {
            return -1L;
        }
        return this.Q.d();
    }

    private ArrayList<biw_2> B() {
        ArrayList<biw_2> arrayList = new ArrayList<biw_2>();
        eqn_2.a.a(new byy_2(this, arrayList));
        return arrayList;
    }

    public void x() {
        if (this.Q != null) {
            this.Q.b(this.P);
        }
        this.Q = null;
        this.S.clear();
        this.T.clear();
        this.X.clear();
    }
}

