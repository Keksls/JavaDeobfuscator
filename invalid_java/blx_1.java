/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  gnu.trove.iterator.TByteIntIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.google.common.collect.Ordering;
import gnu.trove.iterator.TByteIntIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blX
 */
public abstract class blx_1
extends epq_2
implements rv_0,
TF,
Tw,
ajf_1,
afa_0,
csa_1,
cUM {
    public static final int a = 999999;
    public static final int b = 800067;
    public static final int d = 800068;
    public static final String e = "Smiley_";
    public static final String f = "name";
    public static final String g = "sex";
    public static final String h = "breedInfo";
    public static final String i = "breedId";
    public static final String j = "smileyDescriptorLibrary";
    public static final String k = "actorDescriptorLibrary";
    public static final String l = "actorAnimationName";
    public static final String m = "actorAnimationPath";
    public static final String n = "actorLinkage";
    public static final String o = "actorAnimation";
    public static final String p = "actorEquipment";
    public static final String q = "actor";
    public static final String r = "direction";
    public static final String s = "avatarUrl";
    public static final String t = "level";
    public static final String u = "realLevel";
    public static final String v = "nameAndLevel";
    public static final String w = "levelValue";
    public static final String x = "companionRealLevel";
    public static final String y = "nonOrientable";
    public static final String z = "id";
    public static final String A = "timelineDescription";
    public static final String B = "states";
    public static final String C = "naturalState";
    public static final String D = "protectorStates";
    public static final String E = "allStates";
    public static final String F = "breedHudState";
    public static final String G = "spellsInventory";
    public static final String H = "isInSameTeam";
    public static final String I = "isInBlueTeam";
    public static final String J = "timelinePosition";
    public static final String K = "characteristics";
    public static final String L = "isFightStateBarDisplayed";
    public static final String M = "isKO";
    public static final String N = "leaderShipCost";
    public static final String O = "stateAffinities";
    public static final String P = "visible";
    public static final String Q = "hpBarVisible";
    public static final String R = "healResistDescription";
    public static final String S = "canSelectTimePointBonus";
    public static final String T = "type";
    public static final String U = "resistancesOverheadEnabled";
    public static final String V = "shortcutBarManager";
    public static final String[] W = new String[]{"name", "sex", "breedInfo", "breedId", "smileyDescriptorLibrary", "actorDescriptorLibrary", "actorAnimationName", "actorAnimationPath", "actorLinkage", "actorAnimation", "actorEquipment", "actor", "avatarUrl", "levelValue", "level", "direction", "characteristics", "states", "naturalState", "protectorStates", "allStates", "timelinePosition", "isFightStateBarDisplayed", "resistancesOverheadEnabled", "isKO", "spellsInventory", "leaderShipCost", "type", "stateAffinities", "visible", "canSelectTimePointBonus", "healResistDescription", "nonOrientable"};
    public static final String X = "CHEVEUXCUSTOM";
    public static final String Y = "VETEMENTCUSTOM";
    public biI Z;
    private final ArrayList<cSY> al = new ArrayList();
    private static final agi am = new bly_1();
    public final eps_0[] aa = new eps_0[]{eps_0.w, eps_0.x, eps_0.y, eps_0.v};
    private boolean an;
    private abz_0 ao;
    private bvx_2 ap;
    private int aq = -1;
    private biF ar;
    private ctk_2 as;
    protected final bPd ab = new bPd();
    private bvw_2 at;
    private bwm_2 au;
    private final HashSet<blx_1> av = new HashSet();
    protected ArrayList<bPb> ac;
    protected ArrayList<bPb> ad;
    protected ArrayList<bPb> ae;
    protected final bpb_0 af;
    protected blv_1 ag;
    protected bor_1 ah;
    private boolean aw;
    private boolean ax;
    private aby_0 ay;
    private boolean az;
    private byte aA = (byte)-1;
    private byte aB = (byte)-1;
    private agi aC;
    private bmg_2 aD;
    private byte aE;
    protected bor_2 ai;
    private boolean aF = true;
    private boolean aG = false;
    protected TByteIntHashMap aj;

    protected blx_1() {
        this.av.clear();
        this.av.add(this);
        this.cW.a(new bgE(this));
        this.af = new bpb_0();
    }

    public void y() {
        if (this.ag != null) {
            this.ag.d();
        }
    }

    public void z() {
        if (this.ag != null) {
            this.ag.c();
        }
    }

    public void A() {
        if (this.ag != null) {
            this.ag.a();
        }
    }

    public void B() {
        if (this.Z == null) {
            return;
        }
        biS biS2 = this.Z.cg();
        biS2.i();
    }

    public void a(blv_1 blv_12) {
        if (this.ag == null) {
            this.ag = new blv_1(this);
        }
        this.ag.a(blv_12);
    }

    public int C() {
        return 0;
    }

    public blv_1 D() {
        return this.ag;
    }

    public boolean E() {
        return this.aw;
    }

    public boolean M() {
        return this.f(eoz_1.bf);
    }

    public int N() {
        return this.ak() ? this.cY.D() : this.cY.C();
    }

    public boolean O() {
        return false;
    }

    public void b(boolean bl) {
        this.aw = bl;
    }

    public boolean P() {
        return this.ax;
    }

    public void c(boolean bl) {
        this.ax = bl;
    }

    @Override
    public void Q() {
        super.Q();
        if (this.ap != null) {
            this.a(this, this.ap.j());
        }
    }

    public void a(blx_1 blx_12, Collection<blx_1> collection) {
        long l = azu_0.j().n().u();
        if (euw_2.a.d(l, blx_12.a_())) {
            for (blx_1 blx_13 : collection) {
                cef_0.a(blx_13.a_(), blx_13.bF(), true, false);
            }
        } else {
            cef_0.a(blx_12.a_(), blx_12.bF(), true, false);
        }
    }

    @Override
    public String toString() {
        return this.gd();
    }

    @Override
    public long R() {
        return 0L;
    }

    public fo_1[] S() {
        return new fo_1[]{fo_1.c};
    }

    @Override
    public abstract eph_2 T();

    @Override
    public void c(String string, Object object) {
    }

    @Override
    public Object b(String string) {
        if (string.equals(f)) {
            return this.dp();
        }
        if (string.equals(v)) {
            return this.a(this.dp());
        }
        if (string.equals(g)) {
            return this.gX();
        }
        if (string.equals(h)) {
            return this.bb();
        }
        if (string.equals(i)) {
            return this.cY.s();
        }
        if (string.equals(j)) {
            return this.bs();
        }
        if (string.equals(k)) {
            return this.bv();
        }
        if (string.equals(l)) {
            return "AnimStatique";
        }
        if (string.equals(m)) {
            return this.bv().x();
        }
        if (string.equals(n)) {
            return this.bv().P();
        }
        if (string.equals(o)) {
            return this.bv().F();
        }
        if (string.equals(p)) {
            return this.bv().an();
        }
        if (string.equals(q)) {
            return this.bv();
        }
        if (string.equals(z)) {
            return this.cN;
        }
        if (string.equals(w)) {
            return this.dr();
        }
        if (string.equals(t)) {
            return this.cy();
        }
        if (string.equals(u)) {
            return this.cB();
        }
        if (string.equals(A)) {
            return this.a(this);
        }
        if (string.equals(N)) {
            return this.gY() == 1 ? Integer.valueOf(this.a(eoz_1.N) ? bpc_1.a().a(this.gO()).G() : -1) : null;
        }
        if (string.equals(K)) {
            return this.ah;
        }
        if (string.equals(B)) {
            return this.cH();
        }
        if (string.equals(D)) {
            return this.ai();
        }
        if (string.equals(E)) {
            return this.ah();
        }
        if (string.equals(F)) {
            return this.aj();
        }
        if (string.equals(O)) {
            return this.af;
        }
        if (string.equals(H)) {
            return this.aD();
        }
        if (string.equals(I)) {
            return this.aE();
        }
        if (string.equals(J)) {
            bvx_2 bvx_22 = this.ap;
            if (bvx_22 == null) {
                return null;
            }
            int n = bvx_22.as();
            int n2 = bvx_22.A().k(this.a_());
            int n3 = Math.max(0, bvx_22.A().r());
            if (n2 == -1) {
                return null;
            }
            int n4 = (n2 - n3 + n) % n;
            if (n4 == -1) {
                return null;
            }
            return n4 + 1;
        }
        if (string.equals(L)) {
            return this.an;
        }
        if (string.equals(r)) {
            return this.F().l;
        }
        if (string.equals(M)) {
            return this.p();
        }
        if (string.equals(G)) {
            return this.bg();
        }
        if (string.equals(P)) {
            return this.bv().at();
        }
        if (string.equals(Q)) {
            if (!this.bv().at()) {
                return false;
            }
            if (this.a(eoz_1.bp)) {
                return false;
            }
            fit_1 fit_12 = fis_1.a().f("fight.displayHPBar");
            byte by = fit_12 != null && fit_12.i() >= 0 ? (byte)fit_12.i() : (byte)((bvx_0)ans_0.D().h()).d(bWe.x);
            if (by == bvq_0.a.a()) {
                return true;
            }
            if (by == bvq_0.c.a()) {
                return false;
            }
            epa_1 epa_12 = this.a_(eps_0.Y);
            epa_1 epa_13 = this.a_(eps_0.b);
            epa_1 epa_14 = this.a_(eps_0.T);
            return epa_12.a() > 0 || epa_13.a() + epa_14.a() < epa_13.c() + epa_14.c();
        }
        if (string.equals(S)) {
            return this.bp();
        }
        if (string.equals(R)) {
            return this.hp() > 0.0f ? bae.h().a("desc.healRes", (int)this.hp()) : null;
        }
        if (string.equals(T)) {
            return this.gY();
        }
        if (string.equals(y)) {
            return this.M();
        }
        if (C.equals(string)) {
            return this.ad();
        }
        if (U.equals(string)) {
            return this.aG;
        }
        if (this.au != null) {
            return this.au.a(string);
        }
        return null;
    }

    public int U() {
        return Arrays.stream(this.aa).map(eps_02 -> this.cV.c((ru_0)eps_02)).max(Integer::compareTo).get();
    }

    public int V() {
        return Arrays.stream(this.aa).map(eps_02 -> this.cV.c((ru_0)eps_02)).min(Integer::compareTo).get();
    }

    public bpe_0 ad() {
        int n;
        short[] sArray = this.cY.w();
        if (sArray == null || sArray.length == 0) {
            cJ.warn((Object)String.format("No natural state found for breed %s !", this.cY.s()));
            return null;
        }
        ArrayList<bpe_0> arrayList = new ArrayList<bpe_0>();
        for (n = 0; n < sArray.length; n = (int)((short)(n + 3))) {
            short s2 = sArray[n];
            bpe_0 bpe_02 = (bpe_0)fih_0.a().a(s2);
            if (bpe_02 == null || !bpe_02.j()) continue;
            arrayList.add(bpe_02);
        }
        n = arrayList.size();
        if (n > 0) {
            if (n > 1) {
                cJ.warn((Object)String.format("Too much natural state provided for breed %s !", this.cY.s()));
            }
            return (bpe_0)arrayList.get(0);
        }
        cJ.warn((Object)String.format("No natural state found for breed %s !", this.cY.s()));
        return null;
    }

    public String a(String string, int n) {
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)string).i().a(azf_2.v.w()).a((CharSequence)" ").a(this.e(n));
        try {
            ezm_1 ezm_12 = this.dx();
            if (ezm_12 != null && ezm_12.d().c() != -1) {
                ani_22.a(bac.a(116), 14, 16, null, null);
            }
        }
        catch (gm_0 gm_02) {
            cJ.error((Object)"Exception trying to getNameAndLevel", (Throwable)gm_02);
        }
        return ani_22.r();
    }

    public String a(String string) {
        return this.a(string, (int)this.fd());
    }

    public String a(blx_1 blx_12) {
        return bae.h().a("fight.timeline.fighterDescription", blx_12.dp(), this.cD(), this.h(blx_12), this.d(blx_12), this.f(blx_12), this.b(blx_12), this.i(blx_12));
    }

    private Object e(int n) {
        return bae.h().a("levelShort.custom", n);
    }

    private Object cy() {
        return bae.h().a("levelShort.custom", this.dr());
    }

    private Object cB() {
        return bae.h().a("levelShort.custom", this.dt());
    }

    private Object cD() {
        return this.e(this.fd());
    }

    public String b(blx_1 blx_12) {
        ani_2 ani_22 = new ani_2();
        try {
            ani_22.a(bac.a(5), 16, 16, null).a((CharSequence)" ");
        }
        catch (gm_0 gm_02) {
            cJ.warn((Object)gm_02.getMessage());
            ani_22.a((CharSequence)bae.h().a("WPShort", new Object[0])).a((CharSequence)" : ");
        }
        ani_22.d(blx_12.c(eps_0.e)).a((CharSequence)"/").d(blx_12.d(eps_0.e));
        return ani_22.r();
    }

    public String c(blx_1 blx_12) {
        ani_2 ani_22 = new ani_2();
        ani_22.d(blx_12.c(eps_0.e)).a((CharSequence)"/").d(blx_12.d(eps_0.e));
        return ani_22.r();
    }

    public String d(blx_1 blx_12) {
        ani_2 ani_22 = new ani_2();
        try {
            ani_22.a(bac.a(1), 16, 16, null).a((CharSequence)" ");
        }
        catch (gm_0 gm_02) {
            cJ.warn((Object)gm_02.getMessage());
            ani_22.a((CharSequence)bae.h().a("APShort", new Object[0])).a((CharSequence)" : ");
        }
        ani_22.d(blx_12.c(eps_0.c)).a((CharSequence)"/").d(blx_12.d(eps_0.c));
        return ani_22.r();
    }

    public String e(blx_1 blx_12) {
        ani_2 ani_22 = new ani_2();
        ani_22.d(blx_12.c(eps_0.c)).a((CharSequence)"/").d(blx_12.d(eps_0.c));
        return ani_22.r();
    }

    public String f(blx_1 blx_12) {
        ani_2 ani_22 = new ani_2();
        try {
            ani_22.a(bac.a(2), 16, 16, null).a((CharSequence)" ");
        }
        catch (gm_0 gm_02) {
            cJ.warn((Object)gm_02.getMessage());
            ani_22.a((CharSequence)bae.h().a("MPShort", new Object[0])).a((CharSequence)" : ");
        }
        ani_22.d(blx_12.c(eps_0.d)).a((CharSequence)"/").d(blx_12.d(eps_0.d));
        return ani_22.r();
    }

    public String g(blx_1 blx_12) {
        ani_2 ani_22 = new ani_2();
        ani_22.d(blx_12.c(eps_0.d)).a((CharSequence)"/").d(blx_12.d(eps_0.d));
        return ani_22.r();
    }

    public Object h(blx_1 blx_12) {
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)this.ah.a(eps_0.b).c());
        if (this.d(eps_0.T) != 0) {
            ani_22.m().a((CharSequence)this.ah.a(eps_0.T).c());
        }
        return ani_22.r();
    }

    public Object i(blx_1 blx_12) {
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)bae.h().a("INITShort", new Object[0])).a((CharSequence)" : ");
        ani_22.d(blx_12.c(eps_0.B));
        return ani_22.r();
    }

    public Object j(blx_1 blx_12) {
        ani_2 ani_22 = new ani_2();
        int n = blx_12.c(eps_0.u);
        ani_22.a((CharSequence)"Res.F").a((CharSequence)" : ");
        int n2 = blx_12.c(eps_0.v) + n;
        ani_22.d(n2).a((CharSequence)"% ");
        ani_22.a((CharSequence)"Res.E").a((CharSequence)" : ");
        n2 = blx_12.c(eps_0.w) + n;
        ani_22.d(n2).a((CharSequence)"% ");
        ani_22.a((CharSequence)"Res.T").a((CharSequence)" : ");
        n2 = blx_12.c(eps_0.x) + n;
        ani_22.d(n2).a((CharSequence)"% ");
        ani_22.a((CharSequence)"Res.V").a((CharSequence)" : ");
        n2 = blx_12.c(eps_0.y) + n;
        ani_22.d(n2).a((CharSequence)"%");
        return ani_22.r();
    }

    public String ae() {
        bPb bPb2;
        int n;
        int n2;
        ani_2 ani_22 = new ani_2();
        ArrayList<bPb> arrayList = this.cH();
        if (arrayList != null && arrayList.size() > 0) {
            n2 = arrayList.size();
            for (n = 0; n < n2; ++n) {
                bPb2 = arrayList.get(n);
                ani_22.a(bPb2.a(), 16, 16, null);
            }
        }
        if ((arrayList = this.ai()) != null && arrayList.size() > 0) {
            n2 = arrayList.size();
            for (n = 0; n < n2; ++n) {
                bPb2 = arrayList.get(n);
                ani_22.a(bPb2.a(), 16, 16, null);
            }
        }
        return ani_22.q() > 0 ? ani_22.r() : null;
    }

    protected void af() {
        if (this.ac == null || this.ad == null || this.ae == null) {
            this.ad = new ArrayList();
            this.ac = new ArrayList();
            this.ae = new ArrayList();
            for (sd_0 sd_02 : this.dR()) {
                bPb bPb2;
                if (!this.a(sd_02) || (bPb2 = this.ab.a(sd_02, -1L)) == null) continue;
                switch (sd_02.k().G_()) {
                    case 19: 
                    case 33: {
                        if (this.ad.contains(bPb2)) break;
                        this.ad.add(bPb2);
                        break;
                    }
                    default: {
                        if (this.ac.contains(bPb2)) break;
                        this.ac.add(bPb2);
                    }
                }
                if (this.ae.contains(bPb2)) continue;
                this.ae.add(bPb2);
            }
            this.ag();
        }
    }

    protected void ag() {
        Collections.sort(this.ac);
        Collections.sort(this.ae);
        Collections.sort(this.ad);
    }

    protected ArrayList<bPb> ah() {
        if (box_2.a(this)) {
            return null;
        }
        if (this.ae == null) {
            this.af();
        }
        return !this.ae.isEmpty() ? this.ae : null;
    }

    public ArrayList<bPb> ai() {
        if (this.ad == null) {
            this.af();
        }
        return !this.ad.isEmpty() ? this.ad : null;
    }

    private ArrayList<bPb> cH() {
        if (this.ac == null) {
            this.af();
        }
        return !this.ac.isEmpty() ? this.ac : null;
    }

    protected bPb aj() {
        return null;
    }

    protected final boolean a(sd_0 sd_02) {
        if (sd_02.k() == null) {
            return false;
        }
        if (sd_02.bt_() == efc_0.b.a()) {
            return false;
        }
        if (sd_02.bt_() == efc_0.do.a()) {
            return false;
        }
        if (sd_02 instanceof eig_0) {
            return false;
        }
        if (sd_02.k() != null && sd_02.k().G_() == 1) {
            bpe_0 bpe_02 = (bpe_0)sd_02.k();
            return bpe_02.j();
        }
        int n = sd_02.k().G_();
        if (n == 16 || n == 18 || n == 26 || n == 28 || n == 34 || n == 30 || n == 32 || n == 33 || n == 19) {
            return true;
        }
        if (!this.ak()) {
            return false;
        }
        if (n == 12 && sd_02.f() != null && ((efh_0)sd_02.f()).L()) {
            return true;
        }
        if (n == 12 || n == 14 || n == 31) {
            return false;
        }
        return sd_02.as() || sd_02.P();
    }

    @Override
    public String[] d() {
        return W;
    }

    @Override
    public boolean a_(String string) {
        return string.equals(f);
    }

    @Override
    public void b(String string, Object object) {
    }

    @Override
    public void a(String string, Object object) {
        if (string.equals(L)) {
            if (object instanceof Boolean) {
                this.an = (Boolean)object;
                if (azu_0.j().k() != null && this.ap != null && azu_0.j().k().bz() == this.ap) {
                    fis_1.a().a((ajf_1)this, L);
                }
            } else {
                cJ.error((Object)"Tentative de modifier l'attribut isFightStateBarDisplayed avec une valeur non bool\u00e9enne");
            }
        }
        if (string.equals(f)) {
            this.c(object.toString());
            fis_1.a().a((ajf_1)this, f);
        }
    }

    @Override
    public boolean ak() {
        return (this.ap != null || this.aq != -1) && this.cM;
    }

    public int al() {
        return this.av.size();
    }

    public Collection<blx_1> am() {
        return this.av;
    }

    public blx_1 b(long l) {
        for (blx_1 blx_12 : this.am()) {
            if (blx_12 == null || blx_12.a_() != l) continue;
            return blx_12;
        }
        return null;
    }

    @Override
    public void a(int n) {
        this.aq = n;
        if (this.ap != null && this.ap.c() != n) {
            if (n != -1) {
                cJ.error((Object)"Pas de fight alors qu'on a un fightId ?");
            }
            this.a((bvx_2)null);
        }
        this.cM = n != -1;
    }

    protected void a(bvx_2 bvx_22) {
        this.ap = bvx_22;
    }

    public bwm_2 ao() {
        return this.au;
    }

    public void a(bwm_2 bwm_22) {
        this.au = bwm_22;
    }

    public blx_1 a(long l, aff_1 aff_12, short s2, eqy_1 eqy_12, vw_0 vw_02, boolean bl, eri_2<eoz_1> eri_22) {
        bpb_1 bpb_12 = bpc_1.a().a(s2);
        if (bpb_12 == null) {
            cJ.error((Object)("Impossible d'invoquer la cr\u00e9ature " + s2 + " : non enregistr\u00e9 dans le MonsterCharacteristicManager"));
            return null;
        }
        blx_1 blx_12 = bmf_2.a().c(l);
        blx_1 blx_13 = blx_12 != null ? blx_12 : bmv_1.cy();
        this.a(blx_13, l, aff_12, eqy_12, bl, bpb_12, vw_02, eri_22);
        return blx_13;
    }

    private void a(blx_1 blx_12, long l, aff_1 aff_12, eqy_1 eqy_12, boolean bl, bpb_1 bpb_12, vw_0 vw_02, eri_2<eoz_1> eri_22) {
        blx_12.dk();
        blx_12.a(vw_02);
        this.a(blx_12, l, aff_12, eqy_12, bpb_12);
        blx_12.cw();
        eqy_12.a(blx_12, this);
        blx_12.h((byte)2);
        blx_1 blx_13 = bl ? blx_12 : this;
        if (eri_22 != null && !eri_22.d()) {
            if (blx_12.gQ() == null) {
                blx_12.gl();
            }
            eri_2<eoz_1> eri_23 = blx_12.gQ();
            for (byte by : eri_22.a()) {
                eoz_1 eoz_12 = eoz_1.a(by);
                if (eoz_12 != null) {
                    eri_23.c(eoz_12);
                    continue;
                }
                cJ.error((Object)("id d'une propri\u00e9t\u00e9 de base incorrect :" + by));
            }
        }
        byte by = eqy_12.o() == -1 ? this.Y() : eqy_12.o();
        this.a(blx_12, blx_13, by);
        blx_12.l(blx_13);
        bmf_2.a().b(blx_12);
        blx_12.bv().c(blx_12.Y());
        blx_12.bv().c(blx_12.F());
        cuy_0.a(this.ap, blx_12);
        aPc.f().a(blx_12, blx_12.aq);
        bwa_0.b(blx_12);
        blx_12.bI();
        blx_12.aQ();
        blx_1.k(blx_12);
    }

    public static void k(blx_1 blx_12) {
        bOw bOw2 = blx_12.cg();
        if (bOw2 == null) {
            return;
        }
        fiO fiO2 = blx_12.ar().dz();
        eri_2<eoz_1> eri_22 = blx_12.gQ();
        if (eri_22 != null && ((rt_0)eri_22).a(eoz_1.bb) && fiO2 != null) {
            ArrayList<bpl_0> arrayList = new ArrayList<bpl_0>();
            fiO2.d().stream().map(n -> {
                if (n == 0) {
                    return null;
                }
                return bpp_0.a().a((int)n, blx_12.ar().dr());
            }).forEach(bpl_02 -> {
                if (bpl_02 == null) {
                    arrayList.add(null);
                    return;
                }
                bpl_0 bpl_03 = (bpl_0)blx_12.aZ().c(bpl_02.aT_());
                bpl_02.c(bpl_03 != null ? bpl_03.a() : (long)bpl_02.aT_());
                arrayList.add((bpl_0)bpl_02);
            });
            bOw2.a(arrayList);
        } else {
            Iterable<bpl_0> iterable = blx_12.bh();
            bOw2.a(Ordering.natural().onResultOf(new bpo_0()::a).sortedCopy(iterable));
        }
    }

    private void a(blx_1 blx_12, long l, aff_1 aff_12, eqy_1 eqy_12, bpb_1 bpb_12) {
        blx_12.a(l);
        blx_12.c(bpb_12);
        if (eqy_12 != null) {
            blx_12.a_(eqy_12.g());
            blx_12.g(eqy_12.n());
        } else {
            cJ.warn((Object)("Charac null a l'initisalisation d'une invoc, uid : " + l));
        }
        blx_12.a(aff_12);
        aej_2 aej_22 = eqy_12.l();
        if (aej_22 == aej_2.k) {
            blx_12.a(this.F());
        } else {
            blx_12.a(aej_22);
        }
        blx_12.z(true);
        blx_12.ai = this.ai;
    }

    private void a(blx_1 blx_12, blx_1 blx_13, byte by) {
        blx_12.aw = true;
        if (this.ap != null) {
            this.ap.a(blx_12, by, true, blx_13);
            blx_12.ax = true;
        } else if (this.at != null) {
            this.at.a(blx_12, this.Y());
        }
    }

    @Override
    public boolean a(erc_2 erc_22) {
        aoc_2 aoc_22;
        boolean bl = super.a(erc_22);
        if (bl) {
            aoc_22 = this.bv();
            this.aC = ((afe_0)aoc_22).aZ();
            ((afe_0)aoc_22).a(false, afm_0.e, afm_0.o);
            ((afv)aoc_22).c(((afa_0)((Object)erc_22)).e());
            ((abu)aoc_22).a(new blz_1(this, erc_22, (biI)aoc_22));
        }
        aoc_22 = azu_0.j().k();
        if (this.bp()) {
            ((blx_1)aoc_22).ch();
        }
        return bl;
    }

    @Override
    public boolean b(aff_1 aff_12) {
        return this.a(aff_12, false);
    }

    @Override
    public boolean c(aff_1 aff_12) {
        return this.a(aff_12, true);
    }

    private void cI() {
        biI biI2 = this.bv();
        biI2.f((String)null);
        biI2.bQ().d(biI2);
        if (this.dc == null) {
            cJ.trace((Object)"Essaye de d\u00e9poser alors qu'il ne porte personne");
            return;
        }
        if (this.dc instanceof bmv_1 && ((bmv_1)this.dc).gO() == 3794) {
            biI2.e("Anim03PorteTonneau");
        } else {
            biI2.e("Anim04Porte");
        }
    }

    private boolean a(aff_1 aff_12, boolean bl) {
        return this.a(aff_12, bl, bl);
    }

    private boolean a(aff_1 aff_12, boolean bl, boolean bl2) {
        biI biI2 = this.bv();
        if (bl) {
            this.cI();
        } else {
            biI2.bQ().d(biI2);
        }
        afv afv2 = biI2.a(bl2, aff_12);
        if (this.aC == null) {
            if (afv2 == null) {
                cJ.error((Object)"On d\u00e9pose rien (?) . double uncarry ?");
            } else {
                cJ.error((Object)"Reset le movementSelector \u00e0 null (interdit!!)");
                biI2.a(agm.a());
            }
        } else {
            biI2.a(this.aC);
            this.aC = null;
        }
        return super.c(aff_12);
    }

    @Override
    public void ap() {
        biI biI2 = this.bv();
        biI2.bd();
        super.ap();
        biI2.aH();
    }

    @Override
    public void at() {
        super.at();
        this.bv().bQ().f(this.bv());
        bnx_2 bnx_22 = azu_0.j().k().ff();
        if (bnx_22 != null) {
            bnx_22.b(this);
        }
    }

    @Override
    public void a(erb_2 erb_22) {
        super.a(erb_22);
        this.bv().a(agk.a());
        bnx_2 bnx_22 = azu_0.j().k().ff();
        if (bnx_22 != null) {
            bnx_22.a(this);
        }
    }

    @Override
    public void a(int n, Object object) {
        switch (n) {
            case 300: {
                this.a((bvx_2)object);
                this.aq = this.ap.c();
                this.z();
                break;
            }
            case 301: {
                this.an = false;
                this.a((bvx_2)null);
                this.aq = -1;
                this.au = null;
                if (this.bv().aM() == 1) {
                    this.bv().a((byte)0);
                }
                this.z();
                this.bI();
            }
        }
    }

    public blx_1 aq() {
        return blx_1.b(this.ap, this);
    }

    public blx_1 ar() {
        return blx_1.c(this.ap, this);
    }

    @Override
    public void a(tk_0 tk_02) {
        switch (tk_02.a()) {
            case 1000: {
                ejh_0 ejh_02 = ((epz_0)tk_02).b();
                if (!this.a(ejh_02)) break;
                this.d(true);
                if (this != azu_0.j().k() || !(ejh_02 instanceof eja_0)) break;
                fie_0 fie_02 = ((eja_0)ejh_02).aF();
                if (fie_02 != null) {
                    bua_0.a.a(new buy_2(fie_02.p()));
                    break;
                }
                cJ.warn((Object)"Etat inexistant on ne peut pas lancer l'\u00e9v\u00e8nement");
                break;
            }
            case 1002: {
                epb_1 epb_12 = (epb_1)tk_02;
                if (this != azu_0.j().k()) break;
                for (Map.Entry<Long, sd_0> entry : epb_12.b().entrySet()) {
                    this.ab.a(entry.getValue(), entry.getKey());
                }
                this.ac = null;
                this.ad = null;
                this.ae = null;
                fis_1.a().a((ajf_1)this, B, D, F, E);
                break;
            }
            case 1001: {
                this.d(false);
                break;
            }
            case 1003: {
                this.ac = null;
                this.ad = null;
                this.ae = null;
                fis_1.a().a((ajf_1)this, B, D, F, E);
                break;
            }
            case 101: {
                if (azu_0.j().k() != this && this.bV()) break;
                this.bv().bW();
                break;
            }
            case 102: {
                this.bv().bZ();
                break;
            }
        }
    }

    protected void d(boolean bl) {
        bxo_2 bxo_22;
        if (azu_0.j().k() == null) {
            return;
        }
        this.ab.b();
        this.ac = null;
        this.ad = null;
        this.ae = null;
        fis_1.a().a((ajf_1)this, B, D, F, E);
        if (this.ap != null && this.ap.C() && (bxo_22 = this.ap.A()) != null) {
            bxo_22.N();
        }
    }

    @Override
    public cSS[] aI() {
        ArrayList arrayList = new ArrayList();
        for (int k = 0; k < this.al.size(); ++k) {
            arrayList.add(this.al.get(k).a());
        }
        return arrayList.toArray(new cSS[arrayList.size()]);
    }

    @Override
    public boolean aJ() {
        return true;
    }

    @Override
    public Point aK() {
        ace_0 ace_02 = ans_0.D().c();
        afd_1 afd_12 = aht_0.c(ace_02, this.J(), this.K(), this.L() + (float)this.W());
        int n = Hw.b(afd_12.a);
        int n2 = Hw.b(afd_12.b);
        return new Point(n, n2);
    }

    @Override
    public short aL() {
        return (short)((float)this.Z_().d() * 10.0f);
    }

    public bhe_0 as() {
        return bhe_0.a();
    }

    @Override
    protected faV au() {
        return bUH.a(this);
    }

    @Override
    public eyo_1 av() {
        return eyo_1.g();
    }

    @Override
    public boolean a(Tv tv, TF tF) {
        boolean bl;
        boolean bl2 = bl = !this.b(tv, tF);
        if (!bl) {
            cJ.warn((Object)("Action " + tv + " non prise en compte par ce CharacterInfo, type=" + this.getClass().getName() + ", id=" + this.a_()));
        }
        return bl;
    }

    @Override
    public void b(Tv tv) {
        throw new UnsupportedOperationException("Les actions ne sont pas forward\u00e9e au serveur pour le moment, il existe encore des protocoles sous-jacents.");
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        throw new UnsupportedOperationException("Pas d'action cliente prise en compte sur ce type d'\u00e9l\u00e9ment interactif.");
    }

    @Override
    public Tv v() {
        return null;
    }

    @Override
    public Tv[] w() {
        return Tv.O;
    }

    @Override
    public So<efh_0> aw() {
        So<efh_0> so = super.aw();
        if (so != null) {
            return so;
        }
        if (this.aq != -1 && this.cM && bwj_1.a().a(this.aq) != null) {
            return bwj_1.a().a(this.aq).h();
        }
        return null;
    }

    @Override
    public So<efh_0> ax() {
        return bgg_0.k();
    }

    @Override
    public void a(Su su) {
    }

    @Override
    public void b(Su su) {
    }

    @Override
    public void c(Su su) {
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public void ay() {
        super.ay();
        this.aA = (byte)-1;
        this.aB = (byte)-1;
        this.aF = true;
    }

    protected void a(epq_1 epq_12) {
        this.af.a();
        short[] sArray = epq_12.w();
        if (sArray == null || sArray.length == 0) {
            return;
        }
        for (int n = 0; n < sArray.length; n = (int)((short)(n + 3))) {
            short s2;
            short s3 = sArray[n];
            eJL eJL2 = this.dR();
            if (eJL2 != null) {
                eJL2.h(s3);
            }
            if ((s2 = sArray[n + 1]) == -1) {
                s2 = this.dr();
            }
            sd_0.bs_();
            eGm eGm2 = eGm.a(this.cW, this, s3, s2, sArray[n + 2] == 0);
            eGm2.V();
            eGm2.a(this);
            eGm2.aL();
            eGm2.a(null, false);
        }
    }

    @Override
    public void x() {
        if (this.ap != null) {
            this.ap.C(this);
        }
        if (this.at != null) {
            this.at.b(this);
        }
        super.x();
        this.an = false;
        this.ao = null;
        this.a((bvx_2)null);
        this.aq = -1;
        this.au = null;
        this.ar = null;
        this.as = null;
        this.at = null;
        if (this.Z != null) {
            this.Z.cg().j();
        }
        this.a((biI)null);
        this.av.clear();
        this.ab.b();
        this.y();
        bmf_2.a().c(this.aD);
        this.aD = null;
        this.aF = true;
        if (this.ag != null) {
            this.ag.e();
        }
        if (this.ay != null) {
            this.ay.R();
            this.ay = null;
        }
        this.ai = null;
    }

    @Override
    public void q() {
        super.q();
        this.ah.a(new eps_0[]{eps_0.b});
    }

    @Override
    public void n() {
        super.n();
        if (this.Z != null) {
            dbm_0.a().a(this.Z);
        }
    }

    @Override
    public void s() {
        if (this.Z == null) {
            cJ.error((Object)"actor null ? ", (Throwable)new Exception());
        } else {
            ddy_0.a().c(this);
            this.Z.bO();
        }
        super.s();
    }

    @Override
    public void a(els_0 els_02) {
        super.a(els_02);
        if (this.ap == null) {
            this.a((bvx_2)els_02);
            this.aq = this.ap.c();
        }
        this.Z.c((short)exh_2.r.A);
        this.aF();
    }

    @Override
    public void az() {
        Object object;
        super.az();
        this.a(new epa_0());
        if (this.S_()) {
            object = this.bv();
            afz_0.d().b((afv)object);
        }
        if ((object = this.cG()) != null) {
            Optional<exk_2> optional = this.dC().b(((eyz_0)object).a(exh_2.r));
            optional.ifPresent(exk_22 -> this.Z.a(exk_22.T(), (short)exh_2.r.A));
        }
        this.aG();
        if (this.Z != null && this.Z.cg() != null) {
            this.Z.cg().d();
        }
    }

    @Override
    public void aA() {
        blx_1.a(this.ap, this);
        if (this.ap != null && !this.ap.z()) {
            this.aB();
        }
    }

    @Override
    public void a(long l, long l2) {
        super.a(l, l2);
        if (this.ap == null) {
            return;
        }
        blx_1 blx_12 = (blx_1)this.ap.n(l);
        blx_1 blx_13 = (blx_1)this.ap.n(l2);
        if (blx_12 != null) {
            blx_12.aB();
            if (blx_13 != null && blx_13.bp()) {
                blx_1.k(blx_12);
            }
        }
    }

    @Override
    public void b(byte by) {
        super.b(by);
        this.aB();
    }

    public void aB() {
        this.aC();
        this.cJ();
        if (this.au != null) {
            this.au.l();
        }
    }

    public void aC() {
        boolean bl;
        if (this.ap == null) {
            return;
        }
        if (!this.ap.F(this)) {
            return;
        }
        boolean bl2 = bl = this.ap.A().i(this.cN) && this.ca();
        if (bl) {
            this.bv().d(this.Y());
        } else {
            this.bv().c(this.Y());
        }
    }

    private void cJ() {
        if (this.ap == null) {
            return;
        }
        if (!this.ap.F(this)) {
            return;
        }
        this.bv().c(this.F());
    }

    @Override
    public void a(rs_0 rs_02) {
        ru_0 ru_02 = rs_02.p();
        bmr_1 bmr_12 = azu_0.j().k();
        if (ru_02.b() == 0) {
            switch ((eps_0)rs_02.p()) {
                case k: {
                    bOQ.a().e();
                }
                case b: 
                case d: {
                    if (azu_0.j().c(cyp_0.g())) {
                        cyp_0.g().l();
                    }
                    if (azu_0.j().c(cYT.a())) {
                        cYT.a().j();
                    }
                }
                case c: 
                case e: 
                case B: 
                case J: 
                case f: 
                case g: 
                case A: 
                case C: 
                case o: 
                case h: {
                    if (bmr_12 == null || !this.bo() && this.gk()) break;
                    this.a("updateShortcut", new bma_2(this, bmr_12));
                }
            }
            switch ((eps_0)rs_02.p()) {
                case b: 
                case Y: 
                case T: 
                case V: {
                    fis_1.a().a((ajf_1)this, Q);
                    fis_1.a().a((ajf_1)this, "hpPercentage");
                }
            }
        }
    }

    @Override
    public void a(rx_0 rx_02, rz_0 rz_02) {
        if (rx_02 == null) {
            return;
        }
        if (rx_02.a() == 1) {
            switch ((eoz_1)rx_02) {
                case X: {
                    this.ah.a(new eps_0[]{eps_0.c});
                    break;
                }
                case d: 
                case aI: 
                case I: 
                case J: {
                    if (this.ap == null || this.ap != azu_0.j().k().cP()) break;
                    cyp_0.g().l();
                    cYT.a().j();
                    break;
                }
                case r: 
                case f: {
                    boolean bl;
                    if (!this.aD()) {
                        this.bv().av();
                        if (this.gQ() != null) {
                            boolean bl2 = !this.a(rx_02);
                            this.bv().c(bl2);
                            if (bl2) {
                                this.bv().bN();
                            } else {
                                this.bv().bO();
                            }
                        }
                    }
                    cuy_0.a(this.ap, this);
                    bvx_2 bvx_22 = this.ap;
                    if (bvx_22 == null) break;
                    fis_1.a().a((ajf_1)this, Q);
                    boolean bl3 = bl = !this.a(rx_02);
                    if (bl) {
                        ((bwo_0)bvx_22.g()).b(this);
                        dbm_0.a().c(this);
                        break;
                    }
                    ((bwo_0)bvx_22.g()).a(this);
                    dbm_0.d(this);
                    break;
                }
                case bp: {
                    fis_1.a().a((ajf_1)this, Q);
                }
            }
        }
    }

    public boolean aD() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        bvx_2 bvx_22 = bmr_12.bz();
        return this.bo() || bvx_22 != null && bvx_22 == this.ap && bmr_12.Y() == this.Y();
    }

    public boolean aE() {
        bmr_1 bmr_12 = azu_0.j().k();
        return this.aD() || bmr_12.dm() != null && this.Y() == 1;
    }

    @Override
    public void a(aej_2 aej_22) {
        this.bv().a(aej_22);
        fis_1.a().a((ajf_1)this, r);
    }

    @Override
    public void a(int n, int n2, short s2) {
        super.a(n, n2, s2);
        this.bv().b((float)n, (float)n2, (float)s2);
    }

    @Override
    public void a(aff_1 aff_12) {
        this.a(aff_12.d(), aff_12.e(), aff_12.f());
    }

    @Override
    public void b(int n, int n2, short s2) {
        if (this.hf() != null) {
            ((blx_1)this.hf()).a(new aff_1(n, n2, s2), true, false);
        }
        this.a(n, n2, s2, false);
    }

    public void a(int n, int n2, short s2, boolean bl) {
        this.bq();
        aff_1 aff_12 = new aff_1(n, n2, s2);
        super.a(aff_12);
        this.bv().a(aff_12, bl, false, false);
    }

    public abstract void aF();

    public abstract void aG();

    public void a(cSY cSY2) {
        this.al.add(cSY2);
    }

    public void b(int n) {
        int n2 = this.al.size();
        for (int k = 0; k < n2; ++k) {
            if (this.al.get(k).b() != n) continue;
            this.al.remove(k);
        }
    }

    public void aH() {
        IsoParticleSystem isoParticleSystem;
        if (azu_0.j().k().ak() && this.aq != azu_0.j().k().bA()) {
            return;
        }
        Iterator<IsoParticleSystem> iterator = aik_0.a().c();
        while (iterator.hasNext()) {
            FreeParticleSystem freeParticleSystem;
            isoParticleSystem = iterator.next();
            if (!(isoParticleSystem instanceof FreeParticleSystem) || (freeParticleSystem = (FreeParticleSystem)isoParticleSystem).ad() != 999999 || freeParticleSystem.h() != this.bv()) continue;
            return;
        }
        isoParticleSystem = aij_0.a().a(999999);
        if (isoParticleSystem == null) {
            return;
        }
        ((FreeParticleSystem)isoParticleSystem).a(this.bv());
        aik_0.a().b(isoParticleSystem);
    }

    public void aM() {
        this.e(false);
    }

    public void e(boolean bl) {
        if (bl) {
            this.a((biI)null);
        }
    }

    protected final void aN() {
        fis_1 fis_12 = fis_1.a();
        fis_12.a((ajf_1)this, o, m, k, p);
    }

    @Override
    public void b(byte[] byArray) {
        this.aO();
        super.b(byArray);
        this.aP();
    }

    public void aO() {
        this.aE = (byte)(this.aE + 1);
    }

    public void aP() {
        assert (this.aE > 0);
        this.aE = (byte)(this.aE - 1);
        this.aQ();
    }

    public final void aQ() {
        boolean bl;
        aoc_2 aoc_22;
        if (this.aE > 0) {
            return;
        }
        try {
            aoc_22 = this.Z;
            if (aoc_22 == null) {
                return;
            }
            if (((abu)aoc_22).an() == null) {
                return;
            }
            ((biE)aoc_22).bE();
            ((abu)aoc_22).an().I();
            biX biX2 = ((biI)aoc_22).cl();
            boolean bl2 = bl = (biX2 == null || biX2.b) && !((biI)aoc_22).cm();
            if (biX2 == null) {
                ((biE)aoc_22).m(Integer.toString(this.X_()));
                this.aV();
            } else {
                biX2.a(this);
            }
            if (bl) {
                this.aY();
                this.aW();
            }
            this.aR();
            this.aU();
            this.aX();
            this.cL();
            this.aT();
            if (bl) {
                this.aS();
            }
        }
        catch (Exception exception) {
            cJ.error((Object)("probl\u00e8me lors de l'application de l'equipement sur l'acteur " + this.a_() + " " + this.dp()), (Throwable)exception);
        }
        aoc_22 = azu_0.j().k();
        boolean bl3 = this.ap != null && aoc_22 != null && ((bmr_1)aoc_22).cP() == this.ap;
        boolean bl4 = bl = this.ap != null && this.ap.e() != elp_0.e;
        if (bl3 && bl) {
            byj_1.a().b(this.cN);
        }
        this.aN();
    }

    private void cL() {
        ead_0 ead_02 = this.fl();
        if (ead_02 != null && ead_02.ac_() == 14) {
            ((bqi_2)ead_02).j();
        }
    }

    protected void aR() {
        if (this.ai != null) {
            this.ai.a(this.bv());
        }
    }

    protected void aS() {
        faV faV2 = this.fE();
        fcu_0 fcu_02 = faV2.w();
        if (fcu_02 == null) {
            return;
        }
        biZ.a(fcu_02, faV2.n(), new bmb_1(this));
    }

    protected void aT() {
        ead_0 ead_02 = this.fl();
        if (ead_02 != null && ead_02.ac_() == 16) {
            bql_2 bql_22 = (bql_2)ead_02;
            bql_22.h();
        }
    }

    protected void aU() {
    }

    protected void aV() {
        String string = this.bX();
        String string2 = this.bW();
        if (string != null || string2 != null) {
            String string3;
            String string4;
            try {
                string4 = azs_0.a().a("ANMEquipmentPath");
            }
            catch (gm_0 gm_02) {
                cJ.error((Object)"Erreur au chargement d'une propri\u00e9t\u00e9", (Throwable)gm_02);
                return;
            }
            if (string != null) {
                string3 = String.format(string4, string);
                this.bv().a(string3, atn_2.a(Y));
            }
            if (string2 != null) {
                string3 = String.format(string4, string2);
                this.bv().a(string3, atn_2.a(X));
            }
        }
    }

    protected void aW() {
        if (this.Z != null) {
            this.bv().ch();
        }
    }

    protected void aX() {
    }

    public void aY() {
        TByteIntHashMap tByteIntHashMap = this.bc();
        if (tByteIntHashMap == null) {
            return;
        }
        TByteIntIterator tByteIntIterator = tByteIntHashMap.iterator();
        while (tByteIntIterator.hasNext()) {
            tByteIntIterator.advance();
            byte by = tByteIntIterator.key();
            int n = tByteIntIterator.value();
            bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(n);
            if (bjw_12 == null) {
                cJ.error((Object)("Le ReferenceItem d'id " + n + " n'existe pas"));
                continue;
            }
            this.bv().a(bjw_12, (short)by);
        }
    }

    public fiz<bpl_0> aZ() {
        return null;
    }

    @Override
    public void c(int n) {
        super.c(n);
        for (eql_2 eql_22 : this.cL) {
            eql_22.a(this);
        }
    }

    public fhD ba() {
        return fhD.a;
    }

    public bks_1 bb() {
        return bkt_1.a().a(this.Z_().s());
    }

    @Nullable
    public TByteIntHashMap bc() {
        return this.aj;
    }

    public void a(TByteIntHashMap tByteIntHashMap) {
        this.aj = tByteIntHashMap;
    }

    public void b(TByteIntHashMap tByteIntHashMap) {
        this.aj = tByteIntHashMap;
    }

    public long bd() {
        return this.a_();
    }

    public boolean be() {
        long l = this.T_();
        return cci_2.a.d(l);
    }

    public boolean bf() {
        long l = this.fc();
        return cci_2.a.a(this.cR, l);
    }

    public bor_0 bg() {
        return null;
    }

    public bpl_0 c(long l) {
        return null;
    }

    public Iterable<bpl_0> bh() {
        return null;
    }

    @Override
    public boolean a(int n, short s2) {
        if (!this.bl()) {
            cJ.error((Object)"Trying to add a spell to a temporary inventory, but no temporary inventory");
            return false;
        }
        bph_0 bph_02 = bpp_0.a().a(n);
        if (bph_02 == null) {
            cJ.error((Object)("Trying to add spell " + n + " to temporary inventory, but this spell doesn't exist"));
            return false;
        }
        bpl_0 bpl_02 = new bpl_0(bph_02, s2, bph_02.i(), this);
        try {
            if (!((uf_0)this.bg().e()).a(bpl_02)) {
                return false;
            }
        }
        catch (uz_0 uz_02) {
            cJ.error((Object)"Exception levee", (Throwable)uz_02);
            return false;
        }
        catch (Uy uy) {
            cJ.error((Object)"Exception levee", (Throwable)uy);
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        blx_1 blx_12 = cZa.a().d();
        if (blx_12 == this && (this.ar() == bmr_12 || this.bp())) {
            bOw bOw2 = bmr_12.cg();
            bOw2.a(this.bg().e());
            bOw2.z();
        }
        return true;
    }

    @Override
    public void bi() {
        if (this.bg() == null) {
            return;
        }
        this.bg().a(this);
    }

    @Override
    protected void a(int n, epd_2 epd_22) {
        short s2;
        this.bj();
        if (this.bg() == null) {
            return;
        }
        bpb_1 bpb_12 = bpc_1.a().a((short)n);
        if (bpb_12 == null) {
            return;
        }
        ArrayList<abi_2<bph_0>> arrayList = bpb_12.g();
        switch (epd_22) {
            case b: {
                s2 = this.dr();
                break;
            }
            default: {
                s2 = bpb_12.v();
            }
        }
        ArrayList<bpl_0> arrayList2 = new ArrayList<bpl_0>();
        for (abi_2<bph_0> abi_22 : arrayList) {
            bph_0 bph_02 = abi_22.b();
            bpl_0 bpl_02 = new bpl_0(bph_02, s2, bph_02.i(), this);
            arrayList2.add(bpl_02);
        }
        this.bg().a(arrayList2, this);
    }

    public boolean bj() {
        return this.a((bwv_0)null);
    }

    public boolean a(bwv_0 bwv_02) {
        if (this.ap == null) {
            return false;
        }
        bwu_0 bwu_02 = this.bv().bQ();
        if (bwu_02 instanceof bwz_0) {
            return false;
        }
        bwz_0 bwz_02 = new bwz_0(this);
        if (bwv_02 != null) {
            bwz_02.a(bwv_02);
        }
        if (bwu_02 != null) {
            bwa_0.c(this.bv(), bwz_02);
            return true;
        }
        this.bv().a(bwz_02);
        bwz_02.d(this.bv());
        return true;
    }

    @Override
    public void bk() {
        if (this.bg() == null) {
            return;
        }
        this.bg().g();
    }

    @Override
    public boolean bl() {
        if (this.bg() == null) {
            return false;
        }
        return this.bg().f();
    }

    public boolean bm() {
        return this.Z != null;
    }

    public boolean bn() {
        return this.an;
    }

    @Override
    public boolean ab() {
        if (this.bV()) {
            return false;
        }
        return super.ab();
    }

    public boolean bo() {
        return false;
    }

    public boolean bp() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        blx_1 blx_12 = this.aq();
        if (blx_12 == this) {
            return this.U_() == bmr_12.U_();
        }
        return blx_12.U_() == bmr_12.U_() || blx_12.bp();
    }

    public void bq() {
        if (this.ar != null) {
            biI biI2 = this.bv();
            if (biI2 == null) {
                return;
            }
            biI2.c(this.ar);
            this.ar = null;
        }
    }

    public void br() {
        Object object;
        if (this.gY() == 5) {
            object = this.a_(eps_0.b);
            ((epa_1)object).b(((epa_1)object).d());
        }
        object = this.bv();
        boolean bl = false;
        if (this.ab_()) {
            bl = true;
            ((biI)object).a(bwy_0.g());
        } else {
            String string = ((abu)object).F();
            if (this.ab_() && string.equalsIgnoreCase("AnimKO-SortieHS") || string.equalsIgnoreCase("AnimKO-Debut") || this.ab_() && string.equalsIgnoreCase("AnimDesincarnation") || this.ab_() && string.equalsIgnoreCase("AnimTombe") || string.equalsIgnoreCase("AnimEmote-Victoire")) {
                bl = true;
            }
        }
        if (!this.ab_()) {
            if (bl) {
                ((biI)object).a(bwy_0.g());
                bwy_0.g().a((biI)object);
            } else {
                bwa_0.c((biI)object, bwy_0.g());
            }
        }
        ((afe_0)object).bd();
        ((biE)object).t(false);
        ((abu)object).e(((abu)object).aw());
        ((abu)object).ad();
        ((afe_0)object).aQ();
        ((biI)object).bP();
        ((biI)object).c(true);
        ((biI)object).u(false);
    }

    public void a(bvw_2 bvw_22) {
        this.at = bvw_22;
        if (bvw_22 != null) {
            this.aq = bvw_22.c();
            this.cM = true;
        } else {
            this.aq = -1;
            this.cM = false;
        }
    }

    public void a(ctk_2 ctk_22) {
        this.as = ctk_22;
    }

    public void c(aej_2 aej_22) {
        boolean bl;
        assert (aej_22 != null);
        boolean bl2 = bl = !this.F().equals((Object)aej_22);
        if (bl) {
            super.a(aej_22);
            fis_1.a().a((ajf_1)this, r);
        }
    }

    public void f(boolean bl) {
        this.an = bl;
    }

    public void c(int n, int n2, short s2) {
        super.a(n, n2, s2);
    }

    public void a(biF biF2) {
        if (biF2 == null) {
            return;
        }
        biI biI2 = this.bv();
        if (biI2 == null) {
            return;
        }
        this.ar = biF2;
        biI2.b(this.ar);
    }

    @Nullable
    public aby_0 bs() {
        if (this.ay == null) {
            aby_0 aby_02 = new aby_0(abd_1.c(), this.bv().J(), this.bv().K(), this.bv().L());
            String string = this.bt();
            try {
                aby_02.a(String.format(azs_0.a().a(this.bu()), string), true);
            }
            catch (IOException iOException) {
                cJ.error((Object)"", (Throwable)iOException);
                aby_02.R();
                return null;
            }
            catch (gm_0 gm_02) {
                cJ.error((Object)"", (Throwable)gm_02);
                aby_02.R();
                return null;
            }
            aby_02.a(string);
            this.ay = aby_02;
        }
        return this.ay;
    }

    protected abstract String bt();

    protected abstract String bu();

    @NotNull
    public biI bv() {
        if (this.Z == null) {
            this.a(new biI(this));
            if (this.X() >= 1) {
                this.Z.a(am);
            }
        }
        return this.Z;
    }

    @Override
    public afv e() {
        return this.bv();
    }

    public bvw_2 bw() {
        return this.at;
    }

    public void bx() {
    }

    public void by() {
        this.a_(false);
        this.D(false);
        if (this.Z != null) {
            this.Z.c(true);
        }
        this.gL();
    }

    public bvx_2 bz() {
        return this.ap;
    }

    public int bA() {
        return this.aq;
    }

    public abz_0 bB() {
        return this.ao;
    }

    public ctk_2 bC() {
        return this.as;
    }

    public void a(abz_0 abz_02) {
        this.ao = abz_02;
    }

    public bPd bD() {
        return this.ab;
    }

    public void a(biI biI2) {
        if (biI2 == this.Z) {
            return;
        }
        if (this.Z != null) {
            afz_0.d().b(this.Z);
            this.Z.bV();
        }
        this.Z = biI2;
        if (this.aF && this.Z != null) {
            afz_0.d().a(this.Z);
        }
    }

    public void g(boolean bl) {
        this.aF = bl;
    }

    public void bE() {
        this.cM();
    }

    private void cM() {
        eqy_1 eqy_12 = this.fC();
        if (eqy_12 != null) {
            long l;
            bmf_2 bmf_22 = bmf_2.a();
            blx_1 blx_12 = bmf_22.c(l = eqy_12.m());
            if (blx_12 == null && this.aD == null) {
                this.aD = new bmc_1(this, l, eqy_12, bmf_22);
                bmf_22.a(this.aD);
            } else {
                eqy_12.a(this, blx_12);
                this.l(blx_12);
            }
        }
    }

    protected void l(blx_1 blx_12) {
        throw new UnsupportedOperationException("Doit \u00eatre un NPC");
    }

    public abstract byte bF();

    @Override
    public byte Y() {
        if (this.at != null) {
            return this.at.d(this.a_());
        }
        return super.Y();
    }

    public int bG() {
        if (this.db != -1) {
            return this.db;
        }
        if (this.Z_() == null) {
            return 30000;
        }
        return this.Z_().B();
    }

    public void a(bvx_2 bvx_22, byte[] byArray, byte[] byArray2) {
        this.a(byArray2, false, bvx_22);
        this.a(byArray, true);
    }

    public void c(byte[] byArray) {
        this.a(byArray, true, null);
    }

    public void a(byte[] byArray, boolean bl, els_0 els_02) {
        int n = this.c(eps_0.b);
        this.a(byArray);
        if (!this.S_()) {
            this.co();
        }
        if (bl) {
            this.cO();
        } else {
            bgy.a(this.cP());
        }
        if (!bl && els_02 != null) {
            this.b(els_02.h());
        }
        this.o(n);
    }

    public void a(byte[] byArray, boolean bl) {
        eri_2<eoz_1> eri_22 = this.gQ();
        if (eri_22 != null) {
            eri_22.b();
        }
        this.d(byArray);
        if (bl) {
            this.gm();
        }
        this.aF();
        eps_0[] eps_0Array = eps_0.values();
        for (int k = 0; k < eps_0Array.length; ++k) {
            eps_0 eps_02 = eps_0Array[k];
            epa_1 epa_12 = this.a_(eps_02);
            epa_12.s();
        }
    }

    private void cO() {
        LinkedList<sd_0> linkedList = this.cP();
        this.a(linkedList);
    }

    private void a(LinkedList<sd_0> linkedList) {
        for (int k = 0; k < linkedList.size(); ++k) {
            sd_0 sd_02 = linkedList.get(k);
            if (sd_02 instanceof eja_0) {
                sd_02.B();
            }
            sd_02.Y();
            ejh_0 ejh_02 = (ejh_0)sd_02;
            if (!ejh_02.bg()) continue;
            ejh_02.c(null, false);
        }
    }

    private LinkedList<sd_0> cP() {
        Iterator<sd_0> iterator = this.dR().iterator();
        LinkedList<sd_0> linkedList = new LinkedList<sd_0>();
        while (iterator.hasNext()) {
            sd_0 sd_02 = iterator.next();
            if (sd_02 instanceof eja_0) {
                linkedList.addFirst(sd_02);
                continue;
            }
            linkedList.addLast(sd_02);
        }
        return linkedList;
    }

    public final void bH() {
        List<eja_0> list = this.d(this.cW);
        this.dR().a();
        this.a(list);
        this.bI();
        this.a(this.Z_());
    }

    @Override
    public void bI() {
        if (this.gY() == 5) {
            return;
        }
        super.bI();
    }

    public void bJ() {
        super.bI();
    }

    @Override
    protected void bK() {
        if (this.ap == null) {
            return;
        }
        tg_0 tg_02 = this.ap.g();
        if (tg_02 == null) {
            return;
        }
        byte by = this.Z();
        if (by == -1) {
            return;
        }
        ti_0 ti_02 = tg_02.a(by);
        if (ti_02 == null) {
            tg_02.h(this);
        } else if (ti_02 != this) {
            cJ.error((Object)("Obstacle de meme id " + ti_02 + " different de nous " + this + " id = " + by));
        }
    }

    public void bL() {
        fis_1.a().a((ajf_1)this, k);
    }

    public int bM() {
        if (this.fE() == null) {
            return 0;
        }
        return this.fE().n();
    }

    @Override
    public int bN() {
        bmf_0 bmf_02 = bme_0.a.a(this.cZ.d(), this.cZ.e());
        if (bmf_02 == null || bmf_02.h() == null) {
            return 0;
        }
        return bmf_02.h().F();
    }

    @Override
    public int bO() {
        bmf_0 bmf_02 = bme_0.a.a(this.cZ.d(), this.cZ.e());
        return bmf_02 != null ? bmf_02.e() : -1;
    }

    public boolean bP() {
        if (this.ap == null) {
            return false;
        }
        return this.dR().i(977) != null;
    }

    @Override
    public int bQ() {
        int n = 0;
        if (this.ap != null) {
            for (elw_0 elw_02 : this.ap.j()) {
                bmv_1 bmv_12;
                if (!(elw_02 instanceof bmv_1) || !(bmv_12 = (bmv_1)elw_02).C_() || bmv_12.ab_() || bmv_12.aq() != this || bmv_12.f(eoz_1.aW)) continue;
                n += bmv_12.cW().u();
            }
        } else {
            for (epq_2 epq_22 : this.am()) {
                if (!epq_22.C_() || epq_22.ab_() || epq_22.f(eoz_1.aW) || !(epq_22 instanceof bmv_1)) continue;
                n += ((bmv_1)epq_22).cW().u();
            }
        }
        return n;
    }

    @NotNull
    public baa_2 bR() {
        return bab_2.a(this);
    }

    @Nullable
    public apd_0 bS() {
        return null;
    }

    public void bT() {
    }

    public void h(boolean bl) {
        this.az = bl;
    }

    public boolean bU() {
        return this.az;
    }

    public boolean bV() {
        if (this.aD()) {
            return false;
        }
        return !this.a(eoz_1.g) && this.a(eoz_1.f) || this.a(eoz_1.r);
    }

    public String bW() {
        if (this.aB < 0) {
            return null;
        }
        return bkw_1.a().a(this.cY.s(), this.gX(), this.bY(), this.aB);
    }

    public String bX() {
        if (this.aA < 0) {
            return null;
        }
        return bkw_1.a().n(this.cY.s(), this.gX(), this.aA);
    }

    public byte bY() {
        return this.aA;
    }

    public void a(byte by, boolean bl) {
        this.aA = by;
        if (bl) {
            this.aQ();
        }
    }

    public byte bZ() {
        return this.aB;
    }

    public void b(byte by, boolean bl) {
        this.aB = by;
        if (bl) {
            this.aQ();
        }
    }

    public boolean ca() {
        bvx_2 bvx_22;
        if (!this.bv().at()) {
            return false;
        }
        if (this.a(eoz_1.at)) {
            return false;
        }
        if (this.a(eoz_1.ag)) {
            return false;
        }
        if (this.a(eoz_1.ah) && (bvx_22 = this.ap) != null) {
            for (blx_1 blx_12 : bvx_22.am()) {
                if (!blx_12.C_() || !blx_12.a(eoz_1.ag) || blx_12.ar() != this) continue;
                return false;
            }
        }
        return true;
    }

    public int cb() {
        return 900016;
    }

    public int cc() {
        return 900019;
    }

    public void a(eps_0 ... eps_0Array) {
        this.ah.a(eps_0Array);
    }

    public bor_1 cd() {
        return this.ah;
    }

    public long ce() {
        return 0L;
    }

    public short cf() {
        return 0;
    }

    public void i(boolean bl) {
        if (this.aG == bl) {
            return;
        }
        this.aG = bl;
        fis_1.a().a((ajf_1)this, U);
    }

    @Nullable
    public bOw cg() {
        return null;
    }

    public void ch() {
        bOw bOw2 = this.cg();
        if (bOw2 == null) {
            return;
        }
        bOw2.z();
    }

    @Override
    public /* synthetic */ epq_2 ci() {
        return this.ar();
    }

    public /* synthetic */ epq_2 b(long l, aff_1 aff_12, short s2, eqy_1 eqy_12, vw_0 vw_02, boolean bl, eri_2 eri_22) {
        return this.a(l, aff_12, s2, eqy_12, vw_02, bl, eri_22);
    }

    @Override
    public /* synthetic */ exp_1 cj() {
        return this.as();
    }

    @Override
    public /* synthetic */ epq_2 d(long l) {
        return this.b(l);
    }

    @Override
    public /* synthetic */ els_0 ck() {
        return this.bz();
    }

    @Override
    public /* synthetic */ epq_2 cl() {
        return this.aq();
    }

    @Override
    @NotNull
    public /* synthetic */ YQ cm() {
        return this.bv();
    }

    @Override
    public /* synthetic */ csb_1 cn() {
        return this.ao();
    }
}

