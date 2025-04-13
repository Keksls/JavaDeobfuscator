/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.google.common.base.Strings;
import gnu.trove.iterator.TLongIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from bmr
 */
public class bmr_1
extends bnh_1
implements rv_0,
Xe,
aha_0<afe_0, cch_1>,
byl_1,
eeg_0,
ewt_2,
eyg_2,
eyv_1,
erk_2<bol_0>,
ezu_2,
fao_0,
flb_0 {
    protected static final bwi_0 al = new bwi_0();
    public static final String am = "bags";
    public static final String an = "selectedItemInventoryDescription";
    public static final String ao = "headEquipment";
    public static final String ap = "hairEquipment";
    public static final String aq = "faceEquipment";
    public static final String ar = "shoulderEquipment";
    public static final String as = "neckEquipment";
    public static final String at = "chestEquipment";
    public static final String au = "armsEquipment";
    public static final String av = "leftHandEquipment";
    public static final String aw = "rightHandEquipment";
    public static final String ax = "beltEquipment";
    public static final String ay = "skirtEquipment";
    public static final String az = "trousersEquipment";
    public static final String aA = "legsEquipment";
    public static final String aB = "petEquipment";
    public static final String aC = "mountEquipment";
    public static final String aD = "backEquipment";
    public static final String aE = "wingEquipment";
    public static final String aF = "firstWeaponEquipment";
    public static final String aG = "secondWeaponEquipment";
    public static final String aH = "accessoryEquipment";
    public static final String aI = "craft";
    public static final String aJ = "kamas";
    public static final String aK = "formatedKamas";
    public static final String aL = "tokens";
    public static final String aM = "temporaryTransferInventory";
    public static final String aN = "availableTitles";
    public static final String aO = "isRealLevel";
    public static final String aP = "currentLevelPercentage";
    public static final String aQ = "currentLevelPercentageInText";
    public static final String aR = "xpRatio";
    public static final String aS = "xpToNextLevel";
    public static final String aT = "currentExperience";
    public static final String aU = "aptitudes";
    public static final String aV = "commonAptitudes";
    public static final String aW = "breedAptitudes";
    public static final String aX = "availableCommonPoints";
    public static final String aY = "availableAptitudePoints";
    public static final String aZ = "hasAptitudePoints";
    public static final String ba = "wakfuGauge";
    public static final String bb = "wakfuGaugePopupText";
    public static final String bc = "wakfuGaugeIconStyle";
    public static final String bd = "wakfuGaugeColor";
    public static final String be = "nation";
    public static final String bf = "characterIconUrl";
    public static final String bg = "isInSubscriberZone";
    public static final String bh = "companionList";
    public static final String bi = "actorAnimationName";
    public static final String bj = "actorStandardScale";
    public static final String bk = "availableLevels";
    public static final String bl = "nameAndLevel";
    public static final String bm = "walkOrRun";
    public static final String bn = "isHatHidden";
    public static final String bo = "rerollXpBonus";
    public static final String bp = "rerollXpBonusValue";
    public static final String bq = "rerollXpBonusDescription";
    public static final String br = "hasRerollXpBonus";
    static final String[] bs = new String[]{"shortcutBarManager", "bags", "actorAnimationName", "headEquipment", "hairEquipment", "faceEquipment", "shoulderEquipment", "neckEquipment", "chestEquipment", "armsEquipment", "leftHandEquipment", "rightHandEquipment", "beltEquipment", "skirtEquipment", "trousersEquipment", "legsEquipment", "petEquipment", "mountEquipment", "backEquipment", "wingEquipment", "firstWeaponEquipment", "secondWeaponEquipment", "accessoryEquipment", "kamas", "formatedKamas", "tokens", "temporaryTransferInventory", "availableTitles", "currentLevelPercentage", "currentLevelPercentageInText", "xpRatio", "currentExperience", "xpToNextLevel", "wakfuGauge", "wakfuGaugePopupText", "wakfuGaugeIconStyle", "isInSubscriberZone", "companionList", "nameAndLevel", "isHatHidden"};
    public static final String[] bt = new String[bs.length + bnh_1.ct.length];
    public static final String[] bu;
    protected boolean bv;
    short df;
    private final HashMap<bpl_0, Short> dg = new HashMap();
    private final HashMap<exk_2, Short> dh = new HashMap();
    bmu_2 di;
    final bOw dj = new bOw();
    final bui_0 dk = new bui_0();
    final fhT dl = new fhT();
    final ewk_1 dm = new ewk_1();
    private final eaz_0<bmr_1> dn;
    final bHi do = new bHi();
    private boolean dp = true;
    protected boolean bw = false;
    private final bhn_0 dq;
    bsx_2 dr;
    private bsx_2 ds;
    private bmn_2 dt;
    private boolean du = false;
    private final bnx_0 dv = new bnx_0();
    @NotNull
    private final byn_1 dw = new byn_1(this);
    private boolean dx = true;
    private final boz_0 dy = new boz_0(this);
    final flb_0 bx = new flc_0(false);
    private final bqz_2 dz = new bqz_2();
    fam_0 dA = null;
    private bmf_0 dB;
    private bvx_2 dC;
    private final bxk_2 dD = new bxk_2();
    private boolean dE;
    TIntHashSet dF;
    TIntHashSet dG;
    TIntHashSet dH;
    final eyx_2 dI = new eyx_2();
    private long dJ;
    private boolean dK = false;
    private final fiR dL = new fiR();
    private ezy_2 dM = new ezy_2();
    @NotNull
    ezm_1 dN = new ezm_1();
    @NotNull
    private blu_1 dO = blu_1.a;
    private final blh_0 dP = new blh_0(this);

    public boz_0 cy() {
        return this.dy;
    }

    public bmr_1(boolean bl) {
        this.bv = bl;
        ((epc_0)this.gP()).a(this);
        this.dm.a(ewl_1.a);
        this.dm.a(ewl_1.b);
        exb_2 exb_22 = (exb_2)this.dm.b(ewl_1.b);
        this.dq = new bhn_0(exb_22);
        exb_22.a(this.dq);
        this.dn = new eaz_0<bmr_1>(this);
        this.dv.a(true);
        this.cD = false;
        this.dz.a(() -> fis_1.a().a((ajf_1)this, "states"));
        bqz_1.a.a(this.bD());
        this.dM.a(new ezq_1(this));
        if (!bl) {
            fis_1.a().a("inventory.occupation.allows.interaction", true);
        }
        int n = ((bvx_0)ans_0.D().h()).d(bWe.am);
        this.dO = blu_1.a(n);
    }

    private void hL() {
        this.dP.b();
    }

    @Override
    protected emg_0 cz() {
        emg_0 emg_02 = new emg_0();
        emg_02.a(new bnw_1(this));
        return emg_02;
    }

    @Override
    protected bos_2 cA() {
        return new bot_2();
    }

    @Override
    public boolean bo() {
        return true;
    }

    @Override
    public fam_0 cB() {
        return this.dA;
    }

    @Override
    public eef_0<bmr_1> cC() {
        return this.dP;
    }

    @Override
    public void a(long l) {
        super.a(l);
        this.dj.a(l);
        byj_1.a().a(l, this);
    }

    public void cD() {
        byj_1.a().b(this.cN, this);
    }

    @Override
    public void cw() {
        this.dy.a(this.bD());
        this.bv().f(((bvx_0)ans_0.D().h()).a(bWe.r));
        this.a(-1);
        int n = this.a_(eps_0.b).b();
        this.hN();
        this.dy.a();
        this.co();
        this.dL.a(this.cF);
        this.hL();
        this.eu().a(this.a_());
        this.cD = true;
        this.hj();
        this.hM();
        this.o(n);
        this.d(true);
        bhr_1 bhr_12 = bhl_1.a.b(this.a_());
        bhr_12.b().a(bhr_12);
        this.do.a(this);
    }

    private void hM() {
        if (this.cE != null) {
            eJL.a(this.cE, this.cW, this);
            this.cE = null;
        }
    }

    private void hN() {
        if (this.cY == epn_2.d && this.cH() == null) {
            this.di = new bmu_2(this);
            this.a(new bol_0(this.cN));
        }
        if (this.cY == epn_2.u) {
            this.ah.c();
        }
    }

    @Override
    public boolean F_() {
        return this.cD;
    }

    @Override
    public void cE() {
        new bmv_2(this, this.cu.bo());
        super.cE();
        new bmx_2(this, this.cu.bD());
        new bmy_2(this, this.cu.bq());
        new bma_1(this, this.cu.bB());
        new bmz_1(this.cu.bL());
        new bmh_2(this, this.cu.bI());
        new bme_2(this, this.cu.bJ());
        new bmg_1(this, this.cu.bN());
        new bmj_1(this, this.cu.bP());
        new bmu_1(this, this.cu.bx());
        new bmd_2(this, this.cu.co());
        new bmk_2(this, this.cu.bG());
        new bmb_2(this, this.cu.bZ());
        new bmf_1(this, this.cu.ck());
        new bmm_1(this, this.cu.cl());
        new bmw_1(this, this.cu.cq());
        new bml_2(this, this.cu.cg());
        new bmi_2(this, this.cu.cs());
        new bmc_2(this, this.cu.p());
    }

    @Override
    public void co() {
        this.gP().a();
        this.dn.a();
        this.cv().a();
        this.fJ();
        this.d((Su)this);
        this.hO();
    }

    private void hO() {
        if (!(this.cY instanceof epn_2)) {
            return;
        }
        ((epn_2)this.cY).g().a(this.gP(), this.dr());
    }

    public void d(Su su) {
        for (eps_0 eps_02 : eps_0.values()) {
            if (eps_02.k()) {
                su.b(eps_02).g(this.cY.a(eps_02));
                continue;
            }
            su.b(eps_02).b(this.cY.a(eps_02));
        }
        su.b(eps_0.c).n();
        su.b(eps_0.d).n();
        su.b(eps_0.l).n();
        rs_0 rs_02 = su.b(eps_0.e);
        rs_02.n();
        epq_0.a(su.b(eps_0.al), rs_02);
        this.gN();
    }

    @Override
    protected void cF() {
        fis_1.a().a((ajf_1)this, aP, aQ, aR, aT, aS);
    }

    @Override
    public eyz_0 cG() {
        ezj_1 ezj_12 = this.dN.d();
        if (ezj_12 == null) {
            return null;
        }
        int n = ezj_12.e();
        return this.d((int)((byte)n));
    }

    @Override
    @Nullable
    public eyz_0 d(int n) {
        eZb eZb2 = eZe.a.a(this.cO, this.cN);
        if (eZb2 == null) {
            return null;
        }
        return eZb2.a(Hw.b((long)n));
    }

    @Override
    public void a(ezm_1 ezm_12) {
        this.dN = ezm_12;
        for (ezj_1 ezj_12 : ezm_12.a().values()) {
            if (ezj_12.b() != null && !ezj_12.b().isBlank()) continue;
            if (ezj_12.f()) {
                if (ezj_12.c() == -1) {
                    ezj_12.a(bae.h().a("build.permanent.default.name", new Object[0]));
                    continue;
                }
                ezj_12.a(bae.h().a("build.permanent.name", ezj_12.c()));
                continue;
            }
            ezj_12.a(cZI.d(ezj_12.c()));
        }
        this.dj.a(ezm_12);
    }

    public exk_2 g(long l) {
        Optional<exk_2> optional = this.dC().b(l);
        if (optional.isPresent() && optional.get().aU_()) {
            return optional.get();
        }
        return this.do.i(l);
    }

    public void j(boolean bl) {
        this.dK = bl;
    }

    private void hP() {
        exh_2[] exh_2Array;
        if (this.cz == null) {
            this.cz = new TByteIntHashMap();
        } else {
            this.cz.clear();
        }
        if (this.aj == null) {
            this.aj = new TByteIntHashMap();
        } else {
            this.aj.clear();
        }
        for (exh_2 exh_22 : exh_2Array = exh_2.values()) {
            Optional<exk_2> optional = eZi.a(this, exh_22);
            Optional<Integer> optional2 = optional.map(exk_22 -> this.a((exk_2)exk_22, exh_22)).or(() -> this.a(exh_22));
            optional2.ifPresent(n -> this.aj.put(exh_22.A, n.intValue()));
            if (!optional.isPresent()) continue;
            optional2.ifPresent(n -> this.cz.put(exh_22.A, n.intValue()));
        }
    }

    private int a(exk_2 exk_22, exh_2 exh_22) {
        Optional<ft_1> optional = bol_1.a(exh_22);
        int n = bol_1.b(exk_22);
        if (optional.isEmpty()) {
            return n;
        }
        Optional optional2 = ena_0.a().b(this.U_(), end_0.i);
        if (optional2.isEmpty()) {
            return n;
        }
        Optional<fk_2> optional3 = ((ebo_0)optional2.get()).c(this.a_(), optional.get());
        if (optional3.isEmpty()) {
            return n;
        }
        int n2 = optional3.get().c();
        bjw_1 bjw_12 = bhb_0.d().a(n2);
        if (bjw_12 == null || bjw_12.O() == null) {
            return n;
        }
        if (exk_22.U().d() != bjw_12.F().d()) {
            return n;
        }
        return n2;
    }

    private Optional<Integer> a(exh_2 exh_22) {
        Optional<ft_1> optional = bol_1.a(exh_22);
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        Optional optional2 = ena_0.a().b(this.U_(), end_0.i);
        if (optional2.isEmpty()) {
            return Optional.empty();
        }
        Optional<fk_2> optional3 = ((ebo_0)optional2.get()).c(this.a_(), optional.get());
        if (optional3.isEmpty()) {
            return Optional.empty();
        }
        int n = optional3.get().c();
        bjw_1 bjw_12 = bhb_0.d().a(n);
        if (bjw_12 == null) {
            return Optional.empty();
        }
        return Optional.of(n);
    }

    @Override
    @Nullable
    public TByteIntHashMap bc() {
        if (!this.dK) {
            this.hP();
        }
        return this.aj;
    }

    public bol_0 cH() {
        if (this.di != null) {
            return this.di.a();
        }
        return null;
    }

    @Override
    public void a(bol_0 bol_02) {
        if (this.di == null) {
            this.di = new bmu_2(this);
        }
        this.di.a(bol_02);
        bol_02.a(this);
    }

    @Override
    public void cI() {
        if (this.di != null) {
            this.di.cI();
        }
    }

    @Override
    public void c(byte by) {
        if (this.di != null) {
            this.di.c(by);
        }
    }

    @Override
    public void d(byte by) {
        if (this.di != null) {
            this.di.d(by);
        }
    }

    @Override
    public boolean e(byte by) {
        if (!this.ak() || this.t()) {
            return false;
        }
        return this.f(by) <= 0;
    }

    @Override
    public int f(byte by) {
        if (this.cH() == null) {
            return 0;
        }
        if (!this.ak() || this.t()) {
            return 0;
        }
        fia_0 fia_02 = this.hv().m();
        return fia_02.b((epq_2)this, by, (int)this.bz().A().u());
    }

    public boolean cJ() {
        return this.dp;
    }

    public void k(boolean bl) {
        if (this.dp != bl) {
            this.dp = bl;
            cyt_0.b(this.dp);
        }
    }

    public void a(exk_2 exk_22, short s2, short s3, long l, long l2) {
        if (!this.dp) {
            return;
        }
        this.a(exk_22, s2, l, l2, s3);
        cyt_0.a().i();
        fta_0.getInstance().c();
    }

    private void a(exk_2 exk_22, short s2, long l, long l2, short s3) {
        Object object;
        if (s2 == 0) {
            return;
        }
        int n = 1;
        long l3 = 0L;
        long l4 = exk_22.a();
        exg_2 exg_22 = this.do.d(l);
        exg_2 exg_23 = euu_2.l(this.cO, l2);
        if (exg_23 == null) {
            return;
        }
        if (exk_22.e() > s2 && s2 != -1) {
            object = exk_22.u();
            try {
                l3 = ((exk_2)object).a();
                n = evj_2.a().a(exg_22.g(), exg_23.g(), s3, exk_22, s2, (exk_2)object, this, this.ge());
            }
            catch (Exception exception) {
                cJ.error((Object)"Exception survenue durant le transfert de bag ? bag (avec split) : ", (Throwable)exception);
            }
        } else {
            try {
                n = evj_2.a().a(exg_22.g(), exg_23.g(), s3, exk_22, s2, null, this, this.ge());
            }
            catch (Exception exception) {
                cJ.error((Object)"Exception survenue durant le transfert de bag ? bag (sans split) : ", (Throwable)exception);
            }
        }
        if (n == 0) {
            object = new cns_0();
            ((cnO)object).c(l2);
            ((cnO)object).f(l);
            ((cns_0)object).b(s3);
            ((cnO)object).b(l4);
            ((cnO)object).e(l3);
            ((cns_0)object).a(s2);
            azu_0.j().K().c(object);
        }
    }

    @Override
    public eJG cK() {
        return this.cW;
    }

    public void cL() {
        this.dg.clear();
    }

    @Override
    public void a(bpl_0 bpl_02) {
        Short s2 = this.dg.get(bpl_02);
        if (s2 == null) {
            s2 = 0;
        }
        s2 = (short)(s2 + 1);
        this.dg.put(bpl_02, s2);
    }

    public ArrayList<abo_2<bpl_0, Short>> cM() {
        ArrayList<abo_2<bpl_0, Short>> arrayList = new ArrayList<abo_2<bpl_0, Short>>();
        for (bpl_0 bpl_02 : this.dg.keySet()) {
            Short s2 = this.dg.get(bpl_02);
            if (s2 == null) continue;
            arrayList.add(new abo_2<bpl_0, Short>(bpl_02, s2));
        }
        return arrayList;
    }

    public void cN() {
        this.dh.clear();
    }

    @Override
    public void a(exk_2 exk_22) {
        Short s2 = this.dh.get(exk_22);
        if (s2 == null) {
            s2 = 0;
        }
        s2 = (short)(s2 + 1);
        this.dh.put(exk_22, s2);
    }

    public ArrayList<abo_2<exk_2, Short>> cO() {
        ArrayList<abo_2<exk_2, Short>> arrayList = new ArrayList<abo_2<exk_2, Short>>();
        for (exk_2 exk_22 : this.dh.keySet()) {
            Short s2 = this.dh.get(exk_22);
            if (s2 == null) continue;
            arrayList.add(new abo_2<exk_2, Short>(exk_22, s2));
        }
        return arrayList;
    }

    public final void h(long l) {
        boolean bl = ((bvx_0)ans_0.D().h()).a(bWe.G);
        cmw_0 cmw_02 = new cmw_0(l, bl);
        azu_0.j().K().c(cmw_02);
    }

    private blx_1 n(blx_1 blx_12) {
        bvw_2 bvw_22 = blx_12.bw();
        byte by = bvw_22.d(blx_12.a_());
        Collection<blx_1> collection = bvw_22.f(by);
        Iterator<blx_1> iterator = collection.iterator();
        blx_1 blx_13 = null;
        if (iterator.hasNext()) {
            blx_13 = iterator.next();
        }
        return blx_13;
    }

    public void m(blx_1 blx_12) {
        cmr_0 cmr_02 = new cmr_0();
        cmr_02.a(blx_12.a_());
        cmr_02.a(blx_12.G(), blx_12.H(), blx_12.I());
        if (((bvx_0)ans_0.D().h()).a(bWe.G)) {
            cmr_02.c();
        }
        azu_0.j().K().c(cmr_02);
    }

    public void e(int n) {
        azu_0.j().K().c(new cqk_0(n));
    }

    @Override
    public void a(afe_0 afe_02, cch_1 cch_12, cch_1 cch_13) {
        bua_0.a.a(new btW(cch_12, cch_13));
        bmf_0 bmf_02 = bme_0.a.b(cch_13.a(), cch_13.b());
        if (bmf_02 != this.dB) {
            try {
                this.a(bmf_02);
            }
            catch (Exception exception) {
                cJ.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public bvx_2 cP() {
        if (this.bz() != null) {
            return this.bz();
        }
        return this.dC;
    }

    public int cQ() {
        bvx_2 bvx_22 = this.cP();
        return bvx_22 == null ? -1 : bvx_22.c();
    }

    public boolean cR() {
        return !this.ak() && this.cY();
    }

    public boolean a(eco_0 eco_02) {
        Iterator<Map.Entry<Integer, Cm<Short, Short>>> iterator = eco_02.l();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Cm<Short, Short>> entry = iterator.next();
            if (this.b((int)entry.getKey(), (short)entry.getValue().a())) continue;
            return false;
        }
        return true;
    }

    public boolean b(int n, short s2) {
        int n2 = 0;
        for (exk_2 ews_222 : this.do.i(n)) {
            if ((n2 += ews_222.e()) < s2) continue;
            return true;
        }
        ewx_2 ewx_22 = (ewx_2)this.a(ewl_1.a);
        ewz_2 ewz_22 = ewx_22.a(n);
        if (ewz_22 == null) {
            return false;
        }
        return ewz_22.b() >= s2;
    }

    public int b(eco_0 eco_02) {
        int n = Integer.MAX_VALUE;
        Iterator<Map.Entry<Integer, Cm<Short, Short>>> iterator = eco_02.l();
        while (iterator.hasNext()) {
            int n2;
            ewx_2 ewx_22;
            ewz_2 ewz_22;
            Map.Entry<Integer, Cm<Short, Short>> entry = iterator.next();
            int n3 = entry.getKey();
            int n4 = this.do.a(n3);
            if (n4 == 0 && (ewz_22 = (ewx_22 = (ewx_2)this.a(ewl_1.a)).a(n3)) != null) {
                n4 = ewz_22.b();
            }
            if ((n2 = n4 / entry.getValue().a()) >= n) continue;
            n = n2;
        }
        return n;
    }

    public void cS() {
        this.A(800200);
    }

    private void A(int n) {
        FreeParticleSystem freeParticleSystem = aij_0.a().a(n);
        if (freeParticleSystem == null) {
            return;
        }
        freeParticleSystem.a(this.bv());
        aik_0.a().b(freeParticleSystem);
    }

    @Override
    public ewr_2 a(ewl_1 ewl_12) {
        return this.dm.b(ewl_12);
    }

    @Override
    public void b(int n, epd_2 epd_22) {
        super.b(n, epd_22);
        this.dj.e();
    }

    @Override
    protected void a(int n, epd_2 epd_22) {
        super.a(n, epd_22);
        bOC bOC2 = this.dj.c();
        if (bOC2 != null) {
            bOC2.a(this);
            bOC2.s();
        }
        this.dj.e();
    }

    @Override
    public void bk() {
        super.bk();
        bPJ.a(this.dz(), this.aZ(), this.cg());
        bOC bOC2 = this.dj.c();
        if (bOC2 != null) {
            bOC2.q();
            bOC2.e();
        }
        this.dj.f();
    }

    public void l(boolean bl) {
        this.dE = bl;
    }

    @Override
    public void a(ays_2 ays_22, String string) {
        if (ays_22 != null) {
            fis_1.a().a((ajf_1)this, bf);
        } else {
            cJ.warn((Object)string);
        }
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "formatedKamas": {
                return bae.h().a(this.dK().a());
            }
            case "kamas": {
                return this.dK().a();
            }
            case "availableLevels": {
                return this.hV();
            }
            case "shortcutBarManager": {
                return this.dj;
            }
            case "characterIconUrl": {
                return byj_1.a().a(this.a_());
            }
            case "bags": {
                return this.do;
            }
            case "actorAnimationName": {
                return "AnimStatique";
            }
            case "headEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.a));
                return optional.orElse(null);
            }
            case "hairEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.b));
                return optional.orElse(null);
            }
            case "faceEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.c));
                return optional.orElse(null);
            }
            case "shoulderEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.d));
                return optional.orElse(null);
            }
            case "neckEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.e));
                return optional.orElse(null);
            }
            case "chestEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.f));
                return optional.orElse(null);
            }
            case "armsEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.g));
                return optional.orElse(null);
            }
            case "leftHandEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.h));
                return optional.orElse(null);
            }
            case "rightHandEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.i));
                return optional.orElse(null);
            }
            case "beltEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.k));
                return optional.orElse(null);
            }
            case "skirtEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.j));
                return optional.orElse(null);
            }
            case "trousersEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.l));
                return optional.orElse(null);
            }
            case "legsEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.m));
                return optional.orElse(null);
            }
            case "backEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.n));
                return optional.orElse(null);
            }
            case "wingEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.o));
                return optional.orElse(null);
            }
            case "firstWeaponEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.p));
                return optional.orElse(null);
            }
            case "secondWeaponEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.q));
                return optional.orElse(null);
            }
            case "accessoryEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.r));
                return optional.orElse(null);
            }
            case "petEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.w));
                return optional.orElse(null);
            }
            case "mountEquipment": {
                Optional<exk_2> optional = this.dC().b(this.cG().a(exh_2.y));
                return optional.orElse(null);
            }
            case "craft": {
                brx_0 brx_02 = this.dO();
                return brx_02.g() ? null : brx_02;
            }
            case "temporaryTransferInventory": {
                return this.dq;
            }
            case "availableTitles": {
                return this.hU().stream().sorted(bQF.j).collect(Collectors.toList());
            }
            case "currentLevelPercentage": {
                return Float.valueOf(this.dv());
            }
            case "currentLevelPercentageInText": {
                return String.format("(%s %%)", Hw.c(this.dv() * 100.0f));
            }
            case "isReachedMaxLvl": {
                return this.dt() >= enp_2.a.b(ens_2.v);
            }
            case "xpRatio": {
                if (this.dt() >= enp_2.a.b(ens_2.v)) {
                    return bae.h().a("maxLevel", new Object[0]);
                }
                return bae.h().a(aR, bae.h().a(this.du().c(this.ce())), bae.h().a(this.du().b(this.dt())));
            }
            case "currentExperience": {
                if (this.dt() >= enp_2.a.b(ens_2.v)) {
                    return bae.h().a("maxLevel", new Object[0]);
                }
                return this.du().c(this.ce());
            }
            case "xpToNextLevel": {
                return "/ " + bae.h().a(this.du().b(this.dt()));
            }
            case "wakfuGauge": {
                return Float.valueOf(1.0f - (this.cu() + 1.0f) / 2.0f);
            }
            case "wakfuGaugePopupText": {
                float f2 = this.cu() * 100.0f;
                String string2 = Math.abs((int)f2) + "% ";
                ani_2 ani_22 = new ani_2();
                ani_22.a((CharSequence)bae.h().a("wakfu.gaugePopup", new Object[0]));
                if (f2 > 0.0f) {
                    ani_22.a((CharSequence)"\n").a("28d2c4").a((CharSequence)string2).a((CharSequence)bae.h().a("WAKFU", new Object[0])).j();
                } else if (f2 < 0.0f) {
                    ani_22.a((CharSequence)"\n").a("ab00ff").a((CharSequence)string2).a((CharSequence)bae.h().a("STASIS", new Object[0])).j();
                } else {
                    return null;
                }
                return ani_22.r();
            }
            case "wakfuGaugeColor": {
                float f3 = this.cu();
                float f4 = Math.abs(f3);
                float[] fArray = f3 < 0.0f ? anr_0.u : anr_0.t;
                return Hw.a(1.0f, fArray[0], f4) + "," + Hw.a(1.0f, fArray[1], f4) + "," + Hw.a(1.0f, fArray[2], f4);
            }
            case "wakfuGaugeIconStyle": {
                float f5 = this.cu();
                return f5 < 0.0f ? "StasisIcon" : (f5 > 0.0f ? "wakfuIcon" : "");
            }
            case "hasAptitudePoints": {
                return this.hW();
            }
            case "nation": {
                return ((bUH)this.fE()).a();
            }
            case "isInSubscriberZone": {
                return emj_0.b.a(new emh_0[]{this});
            }
            case "companionList": {
                return this.cU();
            }
            case "actorStandardScale": {
                return Float.valueOf(1.5f);
            }
            case "nameAndLevel": {
                return this.a(this.dp(), (int)this.dr());
            }
            case "isHatHidden": {
                return !this.W_();
            }
            case "rerollXpBonus": {
                return this.hS();
            }
            case "rerollXpBonusValue": {
                return Float.valueOf(this.cT());
            }
            case "rerollXpBonusDescription": {
                return this.hQ();
            }
            case "hasRerollXpBonus": {
                return this.hR();
            }
            case "isRealLevel": {
                return this.dr() == this.dt();
            }
        }
        return super.b(string);
    }

    private String hQ() {
        enu_0 enu_02 = enu_0.a(azu_0.j().n().g());
        if (this.dt() == Collections.max(bmr_1.p(azu_0.j().n().u())).shortValue()) {
            return bae.h().a("rerollXp.info.onlyLowerLevelCharacters", new Object[0]);
        }
        if (enu_02.a(enw_0.n)) {
            return bae.h().a("rerollXp.info.hasRight", new Object[0]);
        }
        return bae.h().a("rerollXp.info.notRight", Float.valueOf(this.H(true)));
    }

    private boolean hR() {
        enu_0 enu_02 = enu_0.a(azu_0.j().n().g());
        return enu_02.a(enw_0.n);
    }

    private String hS() {
        return bae.h().a("rerollXp.factor", Float.valueOf(this.cT()));
    }

    public float cT() {
        return this.H(this.hR());
    }

    private float H(boolean bl) {
        long l = azu_0.j().n().u();
        ArrayList<Short> arrayList = bmr_1.p(l);
        return fkz_0.a(this.dt(), arrayList, bl);
    }

    @NotNull
    private static ArrayList<Short> p(long l) {
        ArrayList<Short> arrayList = new ArrayList<Short>();
        euw_2.a.a(l, new bms_2(arrayList));
        return arrayList;
    }

    private List<Integer> hT() {
        return bol_1.a(ft_1.g);
    }

    private List<bQF> hU() {
        ArrayList<bQF> arrayList = new ArrayList<bQF>();
        arrayList.add(new bQF(0, false));
        this.hT().forEach(n -> {
            if (cbp_1.a.a((int)n) == null) {
                return;
            }
            arrayList.add(new bQF(n.shortValue(), bol_1.c(n, ft_1.g)));
        });
        return arrayList;
    }

    private List<Short> hV() {
        ezi_1[] ezi_1Array;
        ArrayList<Short> arrayList = new ArrayList<Short>();
        arrayList.add(this.dt());
        for (ezi_1 ezi_12 : ezi_1Array = ezi_1.values()) {
            arrayList.add(ezi_12.a());
        }
        return arrayList;
    }

    public brn[] cU() {
        int n = this.dw.a() != null ? this.dw.a().d() + 1 : 1;
        brn[] brnArray = new brn[n];
        brnArray[0] = new brm(this.a_(), this.dp(), this.gO(), this.gX());
        if (!this.dw.d()) {
            return brnArray;
        }
        TLongObjectHashMap<epl_0> tLongObjectHashMap = this.dw.a().e();
        int n2 = 1;
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            epl_0 epl_02 = (epl_0)tLongObjectIterator.value();
            if (!(epl_02 instanceof epk_0)) continue;
            eBt eBt2 = ((epk_0)epl_02).b();
            long l = azu_0.j().n().u();
            if (eBo.a.a(l, eBt2.b()) == null) continue;
            brnArray[n2++] = new bqY(eBt2);
        }
        return brnArray;
    }

    private boolean hW() {
        return bkr_2.v.h();
    }

    @Override
    protected void af() {
        if (this.ac == null || this.ad == null) {
            this.ac = new ArrayList();
            this.ad = new ArrayList();
            this.ae = new ArrayList();
            for (sd_0 sd_02 : this.dy) {
                Object object;
                if (!this.a(sd_02)) continue;
                long l = -1L;
                block0 : switch (sd_02.k().G_()) {
                    case 18: {
                        Object object2;
                        if (this.ak()) break;
                        object = this.dG().iterator();
                        while (object.hasNext()) {
                            object2 = (flm_0)object.next();
                            if ((long)((flm_0)object2).b() != sd_02.k().aS_()) continue;
                            int n = ((flm_0)object2).e();
                            l = n != -1 ? (long)(n / 1000) : -1L;
                            break block0;
                        }
                        break;
                    }
                    case 1: {
                        short s2 = ((bpe_0)sd_02.k()).p();
                        Object object2 = this.dy.i(s2);
                        if (object2 == null) break;
                        l = this.dy.c(((sd_0)object2).c());
                        break;
                    }
                    default: {
                        l = this.dy.c(sd_02.c());
                    }
                }
                if ((object = this.bD().a(sd_02, l)) == null) continue;
                switch (sd_02.k().G_()) {
                    case 19: 
                    case 33: {
                        if (this.ad.contains(object)) break;
                        this.ad.add(object);
                        break;
                    }
                    default: {
                        if (this.ac.contains(object)) break;
                        this.ac.add(object);
                    }
                }
                if (this.ae.contains(object)) continue;
                this.ae.add(object);
            }
            this.ag();
        }
    }

    @Override
    public String[] d() {
        return bt;
    }

    @Override
    @Nullable
    public fig a(fid fid2, byte by) {
        bOv bOv2 = null;
        try {
            bOv2 = this.dj.b(fid2, by);
            return bOv2.r();
        }
        catch (Exception exception) {
            cJ.error((Object)("Exception while trying to het shortcutbar " + fid2 + " / " + by), (Throwable)exception);
            return null;
        }
    }

    @Override
    public fib a(byte by, short s2, fio_0 fio_02) {
        bOv bOv2 = this.dj.b(fid.b, by);
        if (bOv2 == null) {
            return null;
        }
        boq_0 boq_02 = boq_0.a(fie.a, fio_02.a(), fio_02.aT_(), fio_02.n());
        bOv2.a(boq_02, s2 == -1 ? bOv2.b() : s2);
        bOv2.j();
        if (this.dj == dcj_0.a().h()) {
            dcj_0.a().b(by);
        }
        return boq_02;
    }

    @Override
    public void a(byte by, short s2, fib fib2) {
        bOv bOv2 = this.dj.b(fid.b, by);
        if (bOv2 == null) {
            return;
        }
        if (fib2 == null) {
            bOv2.a(s2, true);
        } else {
            bOv2.c((boq_0)fib2);
        }
        bOv2.j();
        if (this.dj == dcj_0.a().h() && bOv2.l()) {
            dcj_0.a().a(by, true);
        }
    }

    @Override
    @NotNull
    public bOw cg() {
        return this.dj;
    }

    public fhT cV() {
        return this.dl;
    }

    @Override
    public void a(zt_2 zt_22) {
    }

    public boolean cW() {
        return this.du;
    }

    @Override
    public boolean cX() {
        return this.bv;
    }

    public void m(boolean bl) {
        this.du = bl;
    }

    public boolean cY() {
        return this.dx;
    }

    public void n(boolean bl) {
        this.dx = bl;
    }

    public eaz_0<bmr_1> cZ() {
        return this.dn;
    }

    @Override
    public void a(rs_0 rs_02) {
        super.a(rs_02);
        this.a("characUpdate", () -> {
            this.hX();
            this.hY();
        });
    }

    private void hX() {
        eyz_0 eyz_02 = this.cG();
        if (eyz_02 == null) {
            return;
        }
        Map<exh_2, Long> map = eyz_02.a();
        for (Map.Entry<exh_2, Long> entry : map.entrySet()) {
            Optional<exk_2> optional = this.dC().b(entry.getValue());
            optional.ifPresent(exk_2::P);
        }
    }

    private void hY() {
        TLongObjectIterator<exg_2> tLongObjectIterator = this.do.i();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            for (exk_2 exk_22 : (exg_2)tLongObjectIterator.value()) {
                exk_22.P();
            }
        }
    }

    @Override
    public cSS[] aI() {
        abz_0 abz_02 = this.bB();
        if (abz_02 != null && abz_02 instanceof bfr_0) {
            bfr_0 bfr_02 = (bfr_0)abz_02;
            cUM cUM2 = (cUM)((Object)bfr_02.d());
            return cUM2.aI();
        }
        return cSS.k;
    }

    public bHi da() {
        return this.do;
    }

    @Override
    public ezu_1 db() {
        return (ezu_1)this.dM.a(this.dN.d().e());
    }

    @Override
    public ezu_1 f(int n) {
        return (ezu_1)this.dM.a(n);
    }

    @Override
    protected bPb aj() {
        short s2;
        if (this.cY == epn_2.o) {
            s2 = 7919;
        } else if (this.cY == epn_2.h) {
            s2 = 3683;
        } else if (this.cY == epn_2.e) {
            s2 = 8552;
        } else {
            return null;
        }
        List<sd_0> list = this.dy.a(1);
        for (sd_0 sd_02 : list) {
            Object EC = sd_02.k();
            if (!(EC instanceof bpe_0) || ((bpe_0)EC).b() != s2) continue;
            return this.ab.a(sd_02, -1L);
        }
        return null;
    }

    @Override
    public void a(So so, boolean bl) {
        super.a(so, bl);
        this.d(true);
    }

    @Override
    public void o(boolean bl) {
        super.o(bl);
        bgy.a.b(this, bl);
        this.d(true);
    }

    @Override
    public void bI() {
        super.bI();
        eyt_0 eyt_02 = this.dC();
        Optional<exk_2> optional = eyt_02.b(this.cG().a(exh_2.p));
        Optional<exk_2> optional2 = eyt_02.b(this.cG().a(exh_2.q));
        this.dj.a((exk_2)optional.orElse(null), (exk_2)optional2.orElse(null));
        Optional<exk_2> optional3 = eyt_02.b(this.cG().a(exh_2.y));
        this.dj.b((exk_2)optional3.orElse(null));
    }

    public TIntHashSet dc() {
        return this.dG;
    }

    @Override
    public void p(boolean bl) {
        bgy.a.a(this, bl);
        this.d(true);
    }

    @Override
    public void dd() {
        bgy.a.a(this);
        this.d(true);
    }

    public TIntHashSet de() {
        return this.dF;
    }

    public TIntHashSet df() {
        return this.dH;
    }

    public eyx_2 dg() {
        return this.dI;
    }

    @Override
    public fhD ba() {
        return bhh_1.a(end_0.h).map(emy_02 -> (fhz)emy_02).map(fhz::a).orElse(fhD.a);
    }

    public boolean dh() {
        TLongIterator tLongIterator = euw_2.a.e(this.cO).iterator();
        while (tLongIterator.hasNext()) {
            exb_2 exb_22 = (exb_2)((bmr_1)euw_2.a.d(tLongIterator.next())).a(ewl_1.b);
            if (exb_22.e()) continue;
            return true;
        }
        return false;
    }

    public bsx_2 di() {
        return this.ds;
    }

    @Override
    public void a(bsx_2 bsx_22) {
        this.ds = bsx_22;
    }

    public bsx_2 dj() {
        return this.dr;
    }

    @Override
    public long cq() {
        return this.dK().a();
    }

    @Override
    public long e(long l) {
        long l2 = this.dr.t().a();
        this.dK().d(l);
        return l2 - this.dr.t().a();
    }

    @Override
    public long f(long l) {
        long l2 = this.dr.t().a();
        this.dK().c(l);
        return l2 - this.dr.t().a();
    }

    @Override
    public void a(long l, short s2) {
        this.j(l);
        long l2 = this.du().a(this.dt() + 1) - this.ce();
        String string = bae.h().a("infoPop.xpGain", this.dp(), l, l2, aug_0.g, s2);
        al.a(string);
        super.a(l, s2);
    }

    @Override
    public void aF() {
    }

    @Override
    public void aG() {
    }

    @Override
    protected void dk() {
        if (this.hv() != eqi_2.e) {
            return;
        }
        this.a(new bmt_1());
    }

    @Override
    public void a(els_0 els_02) {
        this.dk();
        this.dj.p();
        super.a(els_02);
        short s2 = this.gO();
        if (s2 == epn_2.n.s()) {
            this.dt = boc_2.a.a(this);
        } else if (s2 == epn_2.g.s()) {
            boe_2.a.a(this);
        }
        if (this.dn()) {
            new bxj_2().a();
        } else if (els_02.af_() == emr_2.v && els_02.x(this) == 1 && ((bvx_0)ans_0.D().h()).a(bWe.G)) {
            cni_0 cni_02 = new cni_0();
            cni_02.a(true);
            azu_0.j().K().c(cni_02);
        }
        aPc.f().c(els_02.c());
        if (!this.bv) {
            aPc.f().i();
        }
        if (this.dE && els_02 instanceof bvx_2) {
            cVA.h().a((bvx_2)els_02);
        }
    }

    @Override
    public void az() {
        super.az();
        epn_2 epn_22 = this.ev();
        if (epn_22 == epn_2.d) {
            bol_0 bol_02 = this.cH();
            if (bol_02 != null) {
                bol_02.f();
            }
        } else if (epn_22 == epn_2.n) {
            boc_2.a.a((abu_1)this);
        } else if (epn_22 == epn_2.g) {
            boe_2.a.a((abu_1)this);
        }
        this.d(true);
    }

    @Override
    public void a(tk_0 tk_02) {
        super.a(tk_02);
        if (this.dt != null) {
            this.dt.a(tk_02);
        }
    }

    public void dl() {
        abz_0 abz_02 = this.bB();
        if (abz_02 != null) {
            this.a((abz_0)null);
        }
    }

    @Override
    public boolean O() {
        boolean bl;
        any_1 any_12 = aZG.e().a(bm);
        boolean bl2 = bl = any_12 != null && fzK.a().a(any_12.b());
        if (this.dO.equals(blu_1.d)) {
            return !bl;
        }
        return bl;
    }

    @Override
    public int N() {
        if (this.ak()) {
            return this.cY.D();
        }
        switch (this.dO) {
            case a: {
                return 0;
            }
            case b: {
                return 5;
            }
        }
        return this.cY.C();
    }

    private boolean hZ() {
        if (this.bv().bq()) {
            return false;
        }
        if (this.dh()) {
            dds_0.a().e();
            return false;
        }
        if (this.dn()) {
            this.dD.a();
            return false;
        }
        return true;
    }

    @Override
    protected void a(bvx_2 bvx_22) {
        super.a(bvx_22);
        aPr.a().a(bvx_22);
        dem.a();
        if (azu_0.j().c(cwu_0.h())) {
            if (bvx_22 != null) {
                cwu_0.h().a(bvx_22);
            } else {
                cwu_0.h().i();
            }
        }
    }

    public void b(bvx_2 bvx_22) {
        this.dC = bvx_22;
        aPr.a().a(bvx_22);
    }

    public bvx_2 dm() {
        return this.dC;
    }

    public boolean dn() {
        return this.dC != null;
    }

    public boolean a(apq_2 apq_22, boolean bl, boolean bl2) {
        if (!this.hZ()) {
            return false;
        }
        return this.bv().a(apq_22, bl, bl2);
    }

    public boolean a(aff_1 aff_12, boolean bl, boolean bl2) {
        if (!this.hZ()) {
            return false;
        }
        return this.bv().b(aff_12, bl, bl2);
    }

    public boolean b(aff_1 aff_12, boolean bl, boolean bl2) {
        return this.hZ() && this.bv().c(aff_12, bl, bl2);
    }

    public boolean a(boolean bl, boolean bl2, List<aff_1> list) {
        return this.hZ() && this.bv().a(bl, bl2, list);
    }

    public boolean a(int n, int n2, short s2, boolean bl, boolean bl2) {
        return this.hZ() && this.bv().b(n, n2, s2, bl, bl2);
    }

    public boolean a(apl_1 apl_12, boolean bl) {
        return this.hZ() && this.bv().a(apl_12, bl);
    }

    public bnx_0 do() {
        return this.dv;
    }

    @Override
    public String dp() {
        try {
            String string = azs_0.a().a("nameForced");
            if (!Strings.isNullOrEmpty((String)string)) {
                return string;
            }
        }
        catch (gm_0 gm_02) {
            cJ.debug((Object)"[PROPERTY] Failed to load default name", (Throwable)gm_02);
        }
        return super.dp();
    }

    @Override
    public void a(eyu_1 eyu_12, long l2) {
        Object object;
        if (l2 != 0L) {
            object = l2 < 0L ? "kama.loss" : "kama.gain";
            aUh.b((String)object, Math.abs(l2));
        }
        object = euw_2.a.e(this.U_());
        object.forEach(l -> {
            bmr_1 bmr_12 = (bmr_1)euw_2.a.d(l);
            fis_1.a().a((ajf_1)bmr_12, aJ);
            fis_1.a().a((ajf_1)bmr_12, aK);
            return true;
        });
        fis_1.a().a((ajf_1)brd_0.k, "companyAwardsList");
    }

    @Override
    public boolean g(int n) {
        bls_2 bls_22 = blc_2.a().b(n);
        return bls_22 != null;
    }

    @Override
    public boolean dq() {
        Optional<bls_2> optional = blo_1.e().d();
        return optional.map(bls_22 -> this.g(bls_22.c())).orElse(false);
    }

    @Override
    public long ce() {
        return this.bx.ce();
    }

    @Override
    public short dr() {
        short s2 = this.dN.h();
        return s2 == -1 ? this.dt() : s2;
    }

    public boolean ds() {
        return this.cy;
    }

    @Override
    public short dt() {
        return this.bx.dr();
    }

    @Override
    public oj_0 du() {
        return this.bx.du();
    }

    @Override
    public float dv() {
        return this.bx.dv();
    }

    @Override
    public flk_0 i(long l) {
        return this.bx.i(l);
    }

    @Override
    public flk_0 j(long l) {
        flk_0 flk_02 = this.bx.j(l);
        this.a(flk_02);
        return flk_02;
    }

    @Override
    void a(flk_0 flk_02) {
        if (flk_02.e()) {
            short s2 = flk_02.a();
            cxu_0.a().d();
            Optional<emy_0> optional = ena_0.a().a(this.cO, end_0.b);
            if (optional.isPresent()) {
                ebe_0 ebe_02 = (ebe_0)optional.get();
                ebe_02.c(s2 * 3);
            }
            fis_1.a().a((ajf_1)this, aX, aY, aZ);
            fis_1.a().a((ajf_1)this.cF, this.cF.d());
            if (this.cY instanceof epn_2 && !this.ak()) {
                ((epn_2)this.cY).g().b(this.gP(), (short)(this.dt() - s2), this.dt());
                this.gN();
            }
            short s3 = this.dt();
            for (bpl_0 bpl_02 : this.cF.i()) {
                bpl_02.c(s3);
            }
            fis_1.a().a((ajf_1)this.cF, this.cF.d());
            blo_1.e().g();
        }
        this.fe();
    }

    @Override
    public flk_0 a(short s2) {
        flk_0 flk_02 = this.bx.a(s2);
        this.a(flk_02);
        return flk_02;
    }

    @Override
    public void q(boolean bl) {
        this.bv = bl;
    }

    @Override
    @NotNull
    public fiR dw() {
        return this.dL;
    }

    @Override
    public ezm_1 dx() {
        return this.dN;
    }

    @Override
    public ezj_1 dy() {
        return this.dN.a(0);
    }

    @Override
    @Nullable
    public fiO dz() {
        ezj_1 ezj_12 = this.dN.d();
        if (ezj_12 == null) {
            return null;
        }
        return this.dL.b(ezj_12.e());
    }

    @Override
    public int C() {
        ezj_1 ezj_12 = this.dN.d();
        return ezj_12.e();
    }

    @Override
    public ezy_2 dA() {
        return this.dM;
    }

    @Override
    public void a(ezy_2 ezy_22) {
        this.dM = ezy_22;
        this.dM.a(new bku_2(this));
        this.dM.d();
    }

    @Override
    public eZb dB() {
        return eZe.a.a(this.cO, this.cN);
    }

    @Override
    public eyt_0 dC() {
        return bjd_1.a.a(this.cN);
    }

    public void dD() {
    }

    @Override
    public void a(@NotNull blu_1 blu_12) {
        this.dO = blu_12;
    }

    @NotNull
    public byn_1 dE() {
        return this.dw;
    }

    public long dF() {
        return this.dw.b();
    }

    @Override
    public long R() {
        return azu_0.j().n().u();
    }

    public boolean h(int n) {
        return this.hT().stream().anyMatch(n2 -> n2 == n);
    }

    @Override
    public void i(int n) {
        super.i(n);
        fis_1.a().a((ajf_1)this, ba, bb, bc, bd);
    }

    @Override
    public Collection<flm_0> dG() {
        return this.dz.b();
    }

    public bqz_2 dH() {
        return this.dz;
    }

    @Override
    public void a(int n, faV faV2, fbm_0 fbm_02, int n2, int n3) {
        Object object;
        String string;
        Object object2;
        super.a(n, faV2, fbm_02, n2, n3);
        fcu_0 fcu_02 = this.fE().w();
        if (this.cD && fcu_02 != null && n2 < fcu_02.h() && faV2.n() == n) {
            object2 = bae.h().a("notification.nationRankLostTitle", new Object[0]);
            string = cIg.createLink(bae.h().a("notification.nationRankLostText", bae.h().a(57, (long)((int)fcu_02.a()), new Object[0])), blr_1.e);
            object = new dhc((String)object2, string, blr_1.e, 600132);
            add_2.b().a((adt_1)object);
        }
        if (this.bz() == null) {
            this.bI();
        }
        object2 = fbo_0.a().a(n2);
        if (this.cD && fbm_02 != object2) {
            string = bae.h().a("notification.citizenRankTitle", new Object[0]);
            object = cIg.createLink(bae.h().a("notification.citizenRankText", bae.h().a(object2.a(), new Object[0])), blr_1.c);
            dhc dhc2 = new dhc(string, (String)object, blr_1.c);
            add_2.b().a(dhc2);
        }
        bua_0.a.a(new bus_1((fbm_0)object2, n2));
    }

    @Override
    public void a(bmf_0 bmf_02) {
        Object object;
        this.dB = bmf_02;
        if (bmf_02 != null && bmf_02.h() != null) {
            object = (bne_0)bmt_0.d.b();
            ((fgU)object).a((bMn)bmf_02.h());
            fgV.a.a((fgU)object);
            bua_0.a.a(new bva_1(bmf_02.e()));
        } else {
            dfc.d((short)17494);
            blo_1.e().a((bls_2)null);
            blo_1.e().l();
            bRC.c().e();
            bRD.c().e();
        }
        cxj_2.a.a(this.dB);
        object = (bUH)this.fE();
        bUG bUG2 = (bUG)((bUH)object).a();
        fis_1.a().a((ajf_1)bUG2, "currentNationCitizenScore", "nativeNationCitizenScore");
        blf_1.b();
    }

    public bmf_0 dI() {
        return this.dB;
    }

    public void b(bmf_0 bmf_02) {
        this.dB = bmf_02;
    }

    @Override
    public void k(long l) {
        this.dJ = this.T_();
        if (bmp_1.a().b(this)) {
            bmp_1.a().a((blx_1)this, l);
        }
        biz_2.a.a(this.cN, l);
        super.k(l);
    }

    @Override
    public long dJ() {
        return this.dJ;
    }

    @Override
    public void bT() {
        super.bT();
        bOQ.a().e();
        this.dj.y();
    }

    @Override
    public void j(int n) {
        this.eu().a(n);
    }

    @Override
    public eyu_1 dK() {
        return faf_0.a.a(this.cO);
    }

    public boolean b(exk_2 exk_22) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public exg_2 c(exk_2 exk_22) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public XW dL() {
        return ccm_1.g().d();
    }

    @Override
    public boolean a(Xd xd) {
        if (xd == Xd.b) {
            return this.dF() != 0L;
        }
        return false;
    }

    @Override
    public long b(Xd xd) {
        if (xd == Xd.b) {
            return this.dw.b();
        }
        return 0L;
    }

    @Override
    public boolean b() {
        return this.dw.b() != 0L || this.fc() > 0L;
    }

    @Override
    public boolean b(aff_1 aff_12) {
        boolean bl = super.b(aff_12);
        this.ch();
        return bl;
    }

    public bui_0 dM() {
        return this.dk;
    }

    @Override
    public void x() {
        super.x();
        this.dj.a();
        if (this.dr != null) {
            this.dr.B();
            this.dr = null;
        }
        bqz_1.a.b(this.bD());
        this.dt = null;
    }

    @Override
    public void a(rx_0 rx_02, rz_0 rz_02) {
        if (rx_02 == null) {
            return;
        }
        super.a(rx_02, rz_02);
        if (rx_02.a() == 0) {
            switch ((erl_2)rx_02) {
                case aa: {
                    fis_1.a().a("chat.enable.interactions", !this.f(erl_2.aa));
                    aUxx.a().r();
                    break;
                }
                case aP: {
                    fis_1.a().a("aptitude.enable.interactions", !this.f(erl_2.aP));
                    break;
                }
                case aQ: {
                    fis_1.a().a("fighter.enable.interactions", !this.f(erl_2.aQ));
                    break;
                }
                case aS: {
                    fis_1.a().a("inventory.enable.interactions", !this.f(erl_2.aS));
                    break;
                }
                case aT: {
                    fis_1.a().a("quests.enable.interactions", !this.f(erl_2.aT));
                    break;
                }
                case aU: {
                    fis_1.a().a("spells.enable.interactions", !this.f(erl_2.aU));
                    break;
                }
                case aV: {
                    fis_1.a().a("character.sheet.enable.interactions", !this.f(erl_2.aV));
                    break;
                }
                case ab: {
                    fis_1.a().a("followed.achievements.enable.interactions", !this.f(erl_2.ab));
                    dem.a();
                    break;
                }
                case af: {
                    fis_1.a().a("callHelpDisabled", this.a(rx_02));
                    break;
                }
                case ag: {
                    fis_1.a().a("lockFightDisabled", this.a(rx_02));
                    break;
                }
                case ah: {
                    fis_1.a().a("cellReportDisabled", this.a(rx_02));
                    break;
                }
                case ai: {
                    fis_1.a().a("hideFightersDisabled", this.a(rx_02));
                    break;
                }
                case aj: {
                    fis_1.a().a("giveUpDisabled", this.a(rx_02));
                }
            }
        }
    }

    @Override
    public void a(ead_0 ead_02) {
        super.a(ead_02);
        fis_1.a().a("hasOccupation", true);
        boolean bl = flC.a(this.hB());
        if (bl && cZI.A()) {
            cZI.a().h();
        }
        fis_1.a().a("inventory.occupation.allows.interaction", !bl);
    }

    @Override
    public boolean dN() {
        return this.r(true);
    }

    @Override
    public boolean r(boolean bl) {
        if (super.r(bl)) {
            fis_1.a().a("hasOccupation", false);
            fis_1.a().a("inventory.occupation.allows.interaction", true);
            if (cZI.A()) {
                cZI.a().i();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        if (super.a(bl, bl2)) {
            fis_1.a().a("hasOccupation", false);
            fis_1.a().a("inventory.occupation.allows.interaction", true);
            return true;
        }
        return false;
    }

    public brx_0 dO() {
        return bgg.a.d(this.U_());
    }

    @Override
    public Optional<fkU> dP() {
        return Optional.of(cdn_1.a);
    }

    public void b(short s2) {
        this.df = s2;
    }

    @Override
    public short cf() {
        return this.df;
    }

    @Override
    public /* synthetic */ erp_2 dQ() {
        return this.cH();
    }

    @Override
    public /* synthetic */ eJL dR() {
        return this.cy();
    }

    @Override
    public /* synthetic */ exh_1 dS() {
        return this.da();
    }

    @Override
    public /* synthetic */ se_0 x_() {
        return this.cy();
    }

    static /* synthetic */ Logger dT() {
        return cJ;
    }

    static /* synthetic */ Logger dU() {
        return cJ;
    }

    static /* synthetic */ Logger dV() {
        return cJ;
    }

    static /* synthetic */ Logger dW() {
        return cJ;
    }

    static /* synthetic */ Logger dX() {
        return cJ;
    }

    static /* synthetic */ long a(bmr_1 bmr_12) {
        return bmr_12.cN;
    }

    static /* synthetic */ Logger dY() {
        return cJ;
    }

    static /* synthetic */ Logger dZ() {
        return cJ;
    }

    static /* synthetic */ Logger ea() {
        return cJ;
    }

    static /* synthetic */ long b(bmr_1 bmr_12) {
        return bmr_12.cN;
    }

    static /* synthetic */ Logger eb() {
        return cJ;
    }

    static /* synthetic */ long c(bmr_1 bmr_12) {
        return bmr_12.cN;
    }

    static /* synthetic */ long d(bmr_1 bmr_12) {
        return bmr_12.cN;
    }

    static /* synthetic */ Collection e(bmr_1 bmr_12) {
        return bmr_12.cL;
    }

    static /* synthetic */ Logger ec() {
        return cJ;
    }

    static /* synthetic */ Logger ed() {
        return cJ;
    }

    static /* synthetic */ Logger ee() {
        return cJ;
    }

    static /* synthetic */ Logger ef() {
        return cJ;
    }

    static /* synthetic */ Logger eg() {
        return cJ;
    }

    static /* synthetic */ Logger eh() {
        return cJ;
    }

    static /* synthetic */ Logger ei() {
        return cJ;
    }

    static /* synthetic */ Logger ej() {
        return cJ;
    }

    static /* synthetic */ Logger ek() {
        return cJ;
    }

    static /* synthetic */ Logger el() {
        return cJ;
    }

    static /* synthetic */ long f(bmr_1 bmr_12) {
        return bmr_12.cO;
    }

    static /* synthetic */ Logger em() {
        return cJ;
    }

    static {
        System.arraycopy(bs, 0, bt, 0, bs.length);
        System.arraycopy(ct, 0, bt, bs.length, bnh_1.ct.length);
        bu = new String[]{bi, ao, ap, aq, ar, as, at, au, av, aw, ax, ay, az, aA, aB, aC, aD, aE, aF, aG, aH, "actorEquipment"};
    }
}

