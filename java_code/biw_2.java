/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;

/*
 * Renamed from biw
 */
public class biw_2
extends bim_2
implements fwo {
    public static final String a = "name";
    public static final String b = "iconUrl";
    public static final String d = "isCompleted";
    public static final String e = "isFollowable";
    public static final String f = "isAlwaysFollowable";
    public static final String t = "isActivated";
    public static final String u = "isFollowed";
    public static final String v = "progressionText";
    public static final String w = "progressionValue";
    public static final String x = "goals";
    public static final String y = "remainingGoals";
    public static final String z = "hasBaseRewards";
    public static final String A = "rewards";
    public static final String B = "xpReward";
    public static final String C = "aptitudeReward";
    public static final String D = "textRewards";
    public static final String E = "visualRewards";
    public static final String F = "visualBoosterRewards";
    public static final String G = "stateColor";
    public static final String H = "isQuest";
    public static final String I = "isShareable";
    public static final String J = "duration";
    public static final String K = "recommandedLevel";
    public static final String L = "recommandedPlayers";
    public static final String M = "remainingTime";
    public static final String N = "cooldown";
    public static final String O = "isRunning";
    public static final String P = "canReset";
    public static final String Q = "rank";
    public static final String R = "activable";
    public static final String S = "activationCriterionDescription";
    public static final String T = "mercenariesStateColor";
    public static final String U = "concernedCharacters";
    public static final String V = "heroesPartyExists";
    public static final String W = "freeSubscriptionLevel";
    public static final String X = "kamaReward";
    public static final String Y = "hasTextRewards";
    public static final String[] Z = new String[]{"name", "iconUrl", "isCompleted", "isFollowed", "isActivated", "progressionText", "progressionValue", "backgroundText", "goals", "rewards", "textRewards", "stateColor", "remainingGoals", "isQuest", "freeSubscriptionLevel", "kamaReward", "visualBoosterRewards", "hasTextRewards"};
    private static final azf_2 ae = new azf_2(0.3f, 0.9f, 0.2f, 1.0f);
    private static final azf_2 af = new azf_2(255, 222, 108, 255);
    protected final int aa;
    private final int ag;
    private final int ah;
    private final long ai;
    protected final bnh_1 ab;
    protected final bhr_1 ac;
    public static final wx_0 ad = new ww_0(10, 0, 0, 0);

    public biw_2(long l, int n, int n2, int n3) {
        this.ai = l;
        this.ab = (bnh_1)euw_2.a.d(l);
        this.ac = bhl_1.a.b(l);
        this.aa = n;
        this.ah = n2;
        this.ag = n3;
    }

    @Override
    public String[] d() {
        return Z;
    }

    @Override
    public Object b(String string) {
        if (string.equals(d)) {
            return this.ac.e(this.aa);
        }
        if (string.equals(t)) {
            return this.u();
        }
        if (string.equals(u)) {
            return this.c();
        }
        if (string.equals(v)) {
            return this.D() + "/" + this.C();
        }
        if (string.equals(w)) {
            return Float.valueOf((float)this.D() / (float)this.C());
        }
        if (string.equals(y)) {
            ArrayList<bip_2> arrayList = new ArrayList<bip_2>();
            bhj_1 bhj_12 = this.ac.w(this.aa);
            for (bhx_2 bhx_22 : bhj_12.r()) {
                if (!this.a(bhx_22) || bhx_22.b()) continue;
                bip_2 bip_22 = biz_2.a.a(this.ai, bhx_22.c());
                arrayList.add(bip_22);
            }
            return arrayList;
        }
        if (string.equals(C)) {
            bhj_1 bhj_13 = this.ac.w(this.aa);
            for (bib_2 bib_22 : bhj_13.s()) {
                bir_2 bir_22;
                if (bib_22.d() != bhn_1.g || (bir_22 = new bir_2(bib_22)).i()) continue;
                return bir_22;
            }
            return null;
        }
        if (string.equals(B)) {
            bhj_1 bhj_14 = this.ac.w(this.aa);
            for (bib_2 bib_23 : bhj_14.s()) {
                bir_2 bir_23;
                if (bib_23.d() != bhn_1.f && bib_23.d() != bhn_1.m && bib_23.d() != bhn_1.q || (bir_23 = new bir_2(bib_23)).i()) continue;
                return bir_23;
            }
            return null;
        }
        if (string.equals(X)) {
            bhj_1 bhj_15 = this.ac.w(this.aa);
            for (bib_2 bib_24 : bhj_15.s()) {
                bir_2 bir_24;
                if (bib_24.d() != bhn_1.k || (bir_24 = new bir_2(bib_24)).i()) continue;
                return bir_24;
            }
            return null;
        }
        if (string.equals(D)) {
            ArrayList<bir_2> arrayList = new ArrayList<bir_2>();
            bhj_1 bhj_16 = this.ac.w(this.aa);
            for (bib_2 bib_25 : bhj_16.s()) {
                bir_2 bir_25;
                if (!bib_25.d().c() || !bib_25.d().a() || bib_25.d() == bhn_1.f || bib_25.d() == bhn_1.m || bib_25.d() == bhn_1.g || bib_25.d() == bhn_1.q || (bir_25 = new bir_2(bib_25)).i()) continue;
                arrayList.add(bir_25);
            }
            return arrayList;
        }
        if (string.equals(E)) {
            ArrayList<bir_2> arrayList = new ArrayList<bir_2>();
            bhj_1 bhj_17 = this.ac.w(this.aa);
            for (bib_2 bib_26 : bhj_17.s()) {
                bir_2 bir_26;
                if (!bib_26.d().c() || bib_26.d().a() || (bir_26 = new bir_2(bib_26)).i()) continue;
                arrayList.add(bir_26);
            }
            return arrayList;
        }
        if (string.equals(F)) {
            ArrayList<bir_2> arrayList = new ArrayList<bir_2>();
            bhj_1 bhj_18 = this.ac.w(this.aa);
            for (bib_2 bib_27 : bhj_18.s()) {
                bir_2 bir_27;
                if (!bib_27.d().c() || bib_27.d().a() || (bir_27 = new bir_2(bib_27)).i() || !bir_27.c()) continue;
                arrayList.add(bir_27);
            }
            return arrayList.isEmpty() ? null : arrayList;
        }
        if (string.equals(A)) {
            ArrayList<bir_2> arrayList = new ArrayList<bir_2>();
            bhj_1 bhj_19 = this.ac.w(this.aa);
            for (bib_2 bib_28 : bhj_19.s()) {
                bir_2 bir_28 = new bir_2(bib_28);
                if (bir_28.i()) continue;
                arrayList.add(bir_28);
            }
            return arrayList;
        }
        if (string.equals(z)) {
            bhj_1 bhj_110 = this.ac.w(this.aa);
            for (bib_2 bib_29 : bhj_110.s()) {
                if ((!bib_29.d().c() || bib_29.d().a()) && (bib_29.d() == bhn_1.f || bib_29.d() == bhn_1.m || bib_29.d() == bhn_1.g || bib_29.d() == bhn_1.q)) continue;
                return true;
            }
            return false;
        }
        if (string.equals(G)) {
            bhr_1 bhr_12 = this.ac;
            if (bhr_12.e(this.aa)) {
                return ae;
            }
            if (bhr_12.d(this.aa)) {
                return azf_2.e;
            }
            return azf_2.h;
        }
        if (string.equals(H)) {
            return this.a();
        }
        if (string.equals(J)) {
            bhj_1 bhj_111 = this.ac.w(this.aa);
            if (bhj_111.b() <= 0) {
                return null;
            }
            ww_0 ww_02 = ww_0.a(bhj_111.b() / 1000);
            return bae.h().a(J, new Object[0]) + wa_0.d(ww_02);
        }
        if (string.equals(I)) {
            bhj_1 bhj_112 = this.ac.w(this.aa);
            boolean bl = rl_0.a(bhj_112, wc_0.p().a());
            return bhj_112.x() && bl && !bhj_112.l();
        }
        if (string.equals(L)) {
            bhj_1 bhj_113 = this.ac.w(this.aa);
            return bhj_113.A();
        }
        if (string.equals(K)) {
            bhj_1 bhj_114 = this.ac.w(this.aa);
            return bae.h().a("levelShort.custom", bhj_114.z());
        }
        if (string.equals(e)) {
            bhj_1 bhj_115 = this.ac.w(this.aa);
            return bhj_115.u();
        }
        if (string.equals(f)) {
            bhj_1 bhj_116 = this.ac.w(this.aa);
            return bhj_116.v();
        }
        if (string.equals(P)) {
            return this.ac.m(this.aa);
        }
        if (string.equals(O)) {
            return this.ac.h(this.aa);
        }
        if (string.equals(Q)) {
            bhj_1 bhj_117 = this.ac.w(this.aa);
            return bhj_117.g();
        }
        if (string.equals(S)) {
            bhj_1 bhj_118 = this.ac.w(this.aa);
            ani_2 ani_22 = new ani_2();
            apc_2 apc_22 = bhj_118.F();
            if (apc_22 == null) {
                return "";
            }
            String string2 = eDm.a((aot_2)apc_22);
            ani_22.i().a(this.ac.a(this.aa, this.ab) ? azf_2.e : azf_2.h);
            ani_22.a((CharSequence)string2);
            return ani_22.r();
        }
        if (string.equals(T)) {
            if (this.ac.e(this.aa)) {
                return ae;
            }
            if (this.ac.d(this.aa)) {
                return af;
            }
            if (this.ac.a(this.aa, this.ab)) {
                return azf_2.e;
            }
            return azf_2.h;
        }
        if (string.equals(R)) {
            return this.A();
        }
        if (string.equals(U)) {
            return this.B();
        }
        if (string.equals(V)) {
            return euw_2.a.h(this.ab.U_()) > 1;
        }
        if (string.equals(N)) {
            bhj_1 bhj_119 = this.ac.w(this.aa);
            if (!bhj_119.l()) {
                return null;
            }
            wx_0 wx_02 = bhj_119.c() != 0L && bhj_119.j() != 0L ? rl_0.g(bhj_119, wc_0.p().a()) : (bhj_119.e() != null ? rl_0.a((rk_0)bhj_119, wc_0.p().a()) : wx_0.g);
            if (!wx_02.e()) {
                return null;
            }
            return wa_0.c(wx_02);
        }
        if (string.equals(Y)) {
            bhj_1 bhj_120 = this.ac.w(this.aa);
            for (bib_2 bib_210 : bhj_120.s()) {
                if (!bib_210.d().c() || !bib_210.d().a()) continue;
                return true;
            }
            return false;
        }
        return super.b(string);
    }

    public boolean a() {
        return biz_2.a.e(this.ai, this.aa);
    }

    public int b() {
        bhj_1 bhj_12 = this.ac.w(this.aa);
        return bhj_12.h();
    }

    private boolean A() {
        TLongHashSet tLongHashSet = euw_2.a.e(this.ab.U_());
        for (long l : tLongHashSet) {
            bhr_1 bhr_12 = bhl_1.a.b(l);
            if (!bhr_12.m(this.aa) || !bhr_12.a(this.aa, (rp_0)euw_2.a.d(l))) continue;
            return true;
        }
        return false;
    }

    private String B() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        TLongHashSet tLongHashSet = euw_2.a.e(this.ab.U_());
        TLongIterator tLongIterator = tLongHashSet.iterator();
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        while (tLongIterator.hasNext()) {
            boolean bl4;
            long l = tLongIterator.next();
            bhr_1 bhr_12 = bhl_1.a.b(l);
            bnh_1 bnh_12 = (bnh_1)euw_2.a.d(l);
            boolean bl5 = bhr_12.m(this.aa) && bhr_12.a(this.aa, bnh_12);
            boolean bl6 = bhr_12.d(this.aa) && !bhr_12.e(this.aa);
            boolean bl7 = bl4 = bhr_12.d(this.aa) && bhr_12.e(this.aa);
            if (bl4 && bl) {
                stringBuilder3.append(bnh_12.dp());
                bl = false;
                continue;
            }
            if (bl4) {
                stringBuilder3.append(", ").append(bnh_12.dp());
                continue;
            }
            if (bl5 && bl3) {
                stringBuilder.append(bnh_12.dp());
                bl3 = false;
                continue;
            }
            if (bl5) {
                stringBuilder.append(", ").append(bnh_12.dp());
                continue;
            }
            if (bl6 && bl2) {
                stringBuilder2.append(bnh_12.dp());
                bl2 = false;
                continue;
            }
            if (!bl6) continue;
            stringBuilder2.append(", ").append(bnh_12.dp());
        }
        ani_2 ani_22 = new ani_2();
        if (!stringBuilder.toString().isEmpty()) {
            ani_22.a().a((CharSequence)(bae.h().a("available", new Object[0]) + " " + bae.h().a("colon", new Object[0]))).b().a(stringBuilder);
        }
        if (!stringBuilder2.toString().isEmpty()) {
            if (!ani_22.toString().isEmpty()) {
                ani_22.m();
            }
            ani_22.a().a((CharSequence)(bae.h().a("inProgress", new Object[0]) + " " + bae.h().a("colon", new Object[0]))).b().a(stringBuilder2);
        }
        if (!stringBuilder3.toString().isEmpty()) {
            if (!ani_22.toString().isEmpty()) {
                ani_22.a('\n');
            }
            ani_22.a().a((CharSequence)(bae.h().a("terminated", new Object[0]) + " " + bae.h().a("colon", new Object[0]))).b().a(stringBuilder3);
        }
        return ani_22.toString();
    }

    @Override
    protected String e() {
        bhj_1 bhj_12 = this.ac.w(this.aa);
        StringBuilder stringBuilder = new StringBuilder();
        if (bae.h().a(63, (long)this.aa)) {
            stringBuilder.append(bae.h().a(63, (long)this.aa, new Object[0]));
        }
        ArrayList<bhx_2> arrayList = bhj_12.r();
        for (bhx_2 bhx_22 : arrayList) {
            String string;
            apc_2 apc_22 = bhx_22.l();
            if (apc_22 == null || !apc_22.b(this.ab, this.ab, null, this.ac) || !bae.h().a(149, (long)bhx_22.c()) || (string = bae.h().a(149, (long)bhx_22.c(), new Object[0])).isEmpty()) continue;
            stringBuilder.append('\n');
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    @Override
    protected String f() {
        if (!bae.h().a(62, (long)this.aa)) {
            return null;
        }
        return bae.h().a(62, (long)this.aa, new Object[0]);
    }

    @Override
    protected String g() {
        return azs_0.a().t(this.ag);
    }

    @Override
    public int h() {
        return 1;
    }

    @Override
    protected String j() {
        bhj_1 bhj_12 = this.ac.w(this.aa);
        if (!bhj_12.m() || bhj_12.k() == 0L) {
            return null;
        }
        wx_0 wx_02 = bhj_12.b() != 0 ? rl_0.h(bhj_12, wc_0.p().a()) : (bhj_12.e() != null ? rl_0.i(bhj_12, wc_0.p().a()) : wx_0.g);
        if (!wx_02.e()) {
            return null;
        }
        return wa_0.c(wx_02);
    }

    @Override
    protected ArrayList<bil_2> k() {
        ArrayList<bil_2> arrayList = new ArrayList<bil_2>();
        bhj_1 bhj_12 = this.ac.w(this.aa);
        for (bhx_2 bhx_22 : bhj_12.r()) {
            if (!this.a(bhx_22)) continue;
            bip_2 bip_22 = biz_2.a.a(this.ai, bhx_22.c());
            arrayList.add(bip_22);
        }
        return arrayList;
    }

    @Override
    protected String l() {
        return null;
    }

    @Override
    protected String m() {
        return null;
    }

    public boolean c() {
        return this.ac.l(this.aa) || this.ac.o(this.aa);
    }

    public boolean n() {
        return this.ac.w(this.aa).n();
    }

    public boolean t() {
        Object t = euw_2.a.d(this.ai);
        return t != null && this.ac.b(this.aa, (rp_0)t);
    }

    public boolean u() {
        return this.ac.d(this.aa);
    }

    private int C() {
        ArrayList<bhx_2> arrayList = this.ac.w(this.aa).r();
        int n = 0;
        for (bhx_2 bhx_22 : arrayList) {
            if (!this.a(bhx_22)) continue;
            ++n;
        }
        return n;
    }

    private int D() {
        int n = 0;
        bhr_1 bhr_12 = this.ac;
        for (bhx_2 bhx_22 : bhr_12.w(this.aa).r()) {
            if (!this.a(bhx_22) || bhr_12.a(bhx_22.c()) && !bhr_12.b(bhx_22.c())) continue;
            ++n;
        }
        return n;
    }

    private boolean a(bhx_2 bhx_22) {
        return bhk_1.a(bhx_22, this.ab);
    }

    @Override
    public int i() {
        return this.aa;
    }

    public int v() {
        return this.ah;
    }

    public boolean equals(Object object) {
        if (!(object instanceof biw_2)) {
            return false;
        }
        return this.aa == ((biw_2)object).aa;
    }

    public void w() {
        fis_1.a().a((ajf_1)this, u);
    }

    public void x() {
        fis_1.a().a((ajf_1)this, v, w, y);
    }

    public void y() {
        fis_1.a().a((ajf_1)this, T, R, S, t, d, O, P);
    }

    public void z() {
        wx_0 wx_02;
        bhj_1 bhj_12 = this.ac.w(this.aa);
        if (!this.ac.e(this.aa) && bhj_12.m() && bhj_12.e() != null && (wx_02 = rl_0.i(bhj_12, wc_0.p().a())).c(ad)) {
            this.ac.b(bhj_12.a(), false);
            if (this.ac.l(bhj_12.a())) {
                cle_1 cle_12 = new cle_1(bhj_12.a(), false);
                azu_0.j().K().c(cle_12);
            }
        }
        fis_1.a().a((ajf_1)this, M, N);
    }

    public String toString() {
        return "AchievementView{m_achievementId=" + this.aa + ", m_gfxId=" + this.ag + ", m_rootCategoryId=" + this.ah + "}";
    }

    @Override
    public String getFilterableStringValue() {
        return this.f();
    }
}

