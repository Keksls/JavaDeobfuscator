/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteIntIterator
 *  gnu.trove.iterator.TShortIntIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TShortIntHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.iterator.TByteIntIterator;
import gnu.trove.iterator.TShortIntIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TShortIntHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bnh
 */
public class bnh_1
extends blx_1
implements rp_0<bhr_1>,
Sh,
Xe,
ecb_0,
erp_1,
emh_0,
fjk_0 {
    public static final String by = "skinColor";
    public static final String bz = "hairColor";
    public static final String bA = "pupilColor";
    public static final String bB = "costume1Color";
    public static final String bC = "costume2Color";
    public static final String bD = "costume3Color";
    public static final String bE = "costume4Color";
    public static final String bF = "costume5Color";
    public static final String bG = "costume6Color";
    public static final String bH = "clothIndex";
    public static final String bI = "faceIndex";
    public static final String bJ = "skinDescription";
    public static final String bK = "hairDescription";
    public static final String bL = "pupilDescription";
    public static final String bM = "skinAvailability";
    public static final String bN = "hairAvailability";
    public static final String bO = "pupilAvailability";
    public static final String bP = "breedIconUrl";
    public static final String bQ = "illustrationUrl";
    public static final String bR = "characterSelectionIllustrationsUrl";
    public static final String bS = "characterChoiceIllustrationUrl";
    public static final String bT = "characterSheetIllustrationUrl";
    public static final String bU = "characterSheetSmallIllustrationUrl";
    public static final String bV = "characterSheetCircleIllustrationUrl";
    public static final String bW = "setIndex";
    public static final String bX = "hasRecustom";
    public static final String bY = "mustRename";
    public static final String bZ = "currentTitleId";
    public static final String ca = "currentTitle";
    public static final String cb = "currentTitleObject";
    public static final String cc = "hasGuild";
    public static final String cd = "guildName";
    public static final String ce = "guildBlazon";
    public static final String cf = "hasNation";
    public static final String cg = "characterNationStamp";
    public static final String ch = "characterListNation";
    public static final String ci = "characterListNewPlayer";
    public static final String cj = "characterListNationIconUrl";
    public static final String ck = "characterListNewPlayerIconUrl";
    public static final String cl = "citizen";
    public static final String cm = "breedAptitudesTitle";
    public static final String cn = "smileyIconUrl";
    public static final String co = "nameAndLevel";
    public static final String cp = "instanceName";
    public static final String[] cq = new String[]{"costume1Color", "costume2Color", "costume3Color", "costume4Color", "costume5Color", "costume6Color"};
    public static final String[] cr = new String[]{"hairColor", "skinColor", "pupilColor", "costume1Color", "costume2Color", "costume3Color", "costume4Color", "costume5Color", "costume6Color"};
    public static final String[] cs = new String[]{"illustrationUrl", "characterChoiceIllustrationUrl", "setIndex", "hasRecustom", "hairDescription", "skinDescription", "pupilDescription", "currentTitleId", "currentTitle", "currentTitleObject", "hasGuild", "hasNation", "nameAndLevel", "skinColor", "hairColor", "pupilColor", "costume1Color", "costume2Color", "costume3Color", "costume4Color", "costume5Color", "costume6Color"};
    public static final String[] ct = new String[cs.length + blx_1.W.length];
    protected final eqv_1 cu = new eqv_1();
    private final ArrayList<cSY> al = new ArrayList<cSY>(Arrays.asList(cSY.ae, cSY.h, cSY.ag, cSY.b, cSY.f, cSY.c, cSY.d, cSY.ah, cSY.u, cSY.aw, cSY.y, cSY.ac, cSY.E, cSY.J, cSY.S));
    protected eae_0 cv;
    protected int cw;
    protected boolean cx;
    protected boolean cy;
    boolean am;
    short an;
    protected TByteIntHashMap cz;
    protected byte cA;
    protected bpc_2 cB;
    private static final akr_1[] ao;
    private bnx_2 ap;
    protected fjN cC;
    public boolean cD;
    protected zb_1 cE;
    private final eAG aq = new eAI();
    private final bml_1 ar;
    private final bng_1 as = new bng_1(this);
    protected bpk_0 cF;
    private final bnq_2 at = new bnq_2();
    final emg_0 au;
    short av;
    final bos_2 aw;
    private bMk ax;
    private bMk ay;
    long az;
    private final ebp_0 aA = new ebp_0();
    private short aB;
    private eep_0 aC = new eep_0();
    private short aD;

    public bnh_1() {
        this.ag = new blv_1(this);
        this.cV = new epc_0();
        this.ah = new bor_1(this);
        this.ar = new bml_1(4000.0, (epa_1)this.cV.b(eps_0.b));
        this.cW.a(bgh_0.a());
        this.au = this.cz();
        this.aw = this.cA();
        this.cv = new eae_0();
        this.ai = new bor_2(this.aw);
        this.cE();
        int n = enp_2.a.b(ens_2.z);
        if (n > 0) {
            this.c(n);
        }
    }

    protected emg_0 cz() {
        return new baj_0();
    }

    protected bos_2 cA() {
        return new bov_2();
    }

    @Override
    public void cE() {
        super.cE();
        new bnl_1(this, this.cu.bp());
        new bnq_1(this, this.cu.bH());
        new bnv_1(this, this.cu.bl());
        new bni_2(this, this.cu.bm());
        new bnj_2(this, this.cu.bn());
        new bno_2(this, this.cu.bO());
        new bnf_2(this, this.cu.bC());
        new bnp_2(this, this.cu.k());
        new bnb_1(this, this.cu.bR());
        new bnu_1(this, this.cu.bY());
        new bns_1(this, this.cu.bU());
        new bnt_1(this, this.cu.bV());
        new bnr_2(this, this.cu.bW());
        new bnw_2(this, this.cu.bX());
        new bny_1(this, this.cu.cb());
        new bnm_2(this, this.cu.cc());
        new bna_2(this, this.cu.ce());
        new bnz_1(this, this.cu.cf());
        new bnx_1(this, this.cu.br());
        new bng_2(this, this.cu.ch());
        new bnc_1(this, this.cu.bs());
        new bne_2(this, this.cu.by());
        new bnd_1(this, this.cu.ci());
        new bnh_2(this, this.cu.cr());
        new bnn_2(this, this.cu.bt());
        new bnk_1(this, this.cu.cj());
        new bqy_2(this.cu.cp(), this);
        new bqw_2(this, this.cu.q());
        new bqx_2(this, this.cu.bF());
    }

    @Override
    public void ay() {
        super.ay();
        this.aw.j();
        this.az = 0L;
        this.am = false;
        this.an = 0;
        this.aA.a(true);
    }

    @Override
    public void x() {
        if (this.ap != null) {
            this.ap.a();
            this.ap = null;
        }
        super.x();
        this.cu.a();
        this.ep();
        this.eq();
        this.aq.a();
        this.aw.j();
        this.az = 0L;
        this.aA.a(true);
        bhr_1 bhr_12 = bhl_1.a.b(this.a_());
        if (bhr_12 != null) {
            ((bmn_1)bhr_12.b()).a();
        }
    }

    @Override
    public int en() {
        return this.aA.a();
    }

    @Override
    public boolean W_() {
        return this.aA.f();
    }

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public void a() {
    }

    public short eo() {
        return this.av;
    }

    public void a(int n, int n2, int n3, int n4, int n5) {
        exk_2 exk_22;
        if (this.ax != null) {
            this.a(this.ax);
        }
        fge fge2 = fgh.a.a(n);
        ffu_0 ffu_02 = ffx.a.a(fge2);
        this.ax = new bMk(this, ffu_02);
        this.bv().a(this.ax);
        if (this.bo() && (exk_22 = this.cG().a(bjd_1.a.a(this.cN), exh_2.w)) != null && exk_22.f() != null && exk_22.f().a().b() == ffu_02.a().b()) {
            exk_22.f().a(this.ax.d());
        }
        this.a(n2, n3, n4, n5, this.ax);
    }

    public void b(int n, int n2, int n3, int n4, int n5) {
        exk_2 exk_22;
        ffb_0 ffb_02;
        ffb_0 ffb_03 = ffb_02 = this.ay != null ? this.ay.d() : null;
        if (this.ay != null) {
            this.eq();
        }
        fge fge2 = fgh.a.a(n);
        ffu_0 ffu_02 = ffx.a.a(fge2);
        this.ay = new bMf(this, ffu_02);
        this.bv().a(this.ay);
        if (this.bo() && (exk_22 = this.cG().a(bjd_1.a.a(this.cN), exh_2.y)) != null && exk_22.f() != null && exk_22.f().a().b() == ffu_02.a().b()) {
            exk_22.f().b(ffb_02);
            exk_22.f().a(this.ay.d());
        }
        this.a(n2, n3, n4, n5, this.ay);
        this.cy();
    }

    private void cy() {
        if (this.cB instanceof bqi_2) {
            ((bqi_2)this.cB).h();
            ((bqi_2)this.cB).i();
        }
    }

    private void a(int n, int n2, int n3, int n4, bMk bMk2) {
        ffv ffv2 = new ffv(bMk2);
        ffu_0 ffu_02 = bMk2.f();
        try {
            ffv2.c(n4);
            if (n2 > 0) {
                ffv2.b(n2);
            } else if (n2 <= 0 && ffu_02.e() > 0) {
                ffv2.b();
            }
            ffv2.d(n);
            if (n3 > 0 && ffu_02.m() <= 0) {
                ffv2.f(n3);
                ffv2.c(wc_0.p().a());
            } else if (n3 <= 0 && ffu_02.m() > 0) {
                ffv2.d();
                ffv2.e();
            }
        }
        catch (fgm fgm2) {
            cJ.error((Object)("Erreur lors de l'initialisation du familier dans le monde pour le joueur " + this), (Throwable)fgm2);
        }
    }

    public void ep() {
        this.a(this.ax);
        this.ax = null;
    }

    public void eq() {
        this.a(this.ay);
        this.ay = null;
    }

    private void a(bMk bMk2) {
        if (bMk2 == null) {
            return;
        }
        if (this.bm()) {
            this.bv().b(bMk2);
        }
        bMk2.c();
    }

    public bMk er() {
        return this.ax;
    }

    public bMk es() {
        return this.ay;
    }

    @Override
    protected void dk() {
        if (this.hv() != eqi_2.e) {
            return;
        }
        this.a(new bnk_2());
    }

    @Override
    public void a(els_0 els_02) {
        this.dk();
        super.a(els_02);
        if (this.cX()) {
            this.bv().c(true);
        }
        this.y();
        this.z();
        this.et();
        this.a(this.ev());
    }

    public void et() {
        this.at.a(100);
        this.at.a(this);
    }

    @NotNull
    public bml_1 eu() {
        return this.ar;
    }

    @Override
    protected epq_1 cs() {
        return epn_2.b;
    }

    @Override
    protected byte ct() {
        return 0;
    }

    @Override
    public boolean cp() {
        return false;
    }

    @Override
    public void k(int n) {
        if (this.cw == n) {
            return;
        }
        this.cw = n;
        for (eql_2 eql_22 : this.cL) {
            eql_22.a(this);
        }
        this.aQ();
    }

    public epn_2 ev() {
        return (epn_2)super.Z_();
    }

    @Override
    public int X_() {
        int n = super.X_();
        if (n != 0) {
            return n;
        }
        return this.cw;
    }

    public eae_0 ew() {
        return this.cv;
    }

    public void a(int n, boolean bl) {
        this.cv.a(n);
        if (bl) {
            this.cB();
            fis_1.a().a((ajf_1)this, by);
        }
    }

    private void cB() {
        this.c(this.bv(), true);
    }

    public void b(int n, boolean bl) {
        this.cv.b(n);
        if (bl) {
            this.cD();
            fis_1.a().a((ajf_1)this, bz);
        }
    }

    private void cD() {
        this.b(this.bv(), true);
    }

    public void c(int n, boolean bl) {
        this.cv.c(n);
        if (bl) {
            this.cH();
            fis_1.a().a((ajf_1)this, bA);
        }
    }

    private void cH() {
        bog_2.a(new bog_2(this.cv.c()), (abu)this.bv(), atm_1.i, true);
    }

    private void a(atm_1 atm_12, int n) {
        switch (atm_12) {
            case k: {
                this.cv.d(n);
                break;
            }
            case l: {
                this.cv.e(n);
                break;
            }
            case m: {
                this.cv.f(n);
                break;
            }
            case n: {
                this.cv.g(n);
                break;
            }
            case o: {
                this.cv.h(n);
                break;
            }
            case p: {
                this.cv.i(n);
            }
        }
    }

    public void a(atm_1 atm_12, int n, boolean bl) {
        if (!atm_1.a(atm_12)) {
            return;
        }
        this.a(atm_12, n);
        if (bl) {
            this.b(atm_12);
            fis_1.a().a((ajf_1)this, cq);
        }
    }

    public void a(eb eb2, boolean bl) {
        this.a(atm_1.k, eb2.i());
        this.a(atm_1.l, eb2.k());
        this.a(atm_1.m, eb2.m());
        this.a(atm_1.n, eb2.o());
        this.a(atm_1.o, eb2.q());
        this.a(atm_1.p, eb2.s());
        if (bl) {
            this.cI();
            fis_1.a().a((ajf_1)this, cq);
        }
    }

    private int a(atm_1 atm_12) {
        switch (atm_12) {
            case k: {
                return this.cv.d();
            }
            case l: {
                return this.cv.e();
            }
            case m: {
                return this.cv.f();
            }
            case n: {
                return this.cv.g();
            }
            case o: {
                return this.cv.h();
            }
            case p: {
                return this.cv.i();
            }
        }
        throw new IllegalArgumentException("Not a costume: " + atm_12);
    }

    private void b(atm_1 atm_12) {
        if (!atm_1.a(atm_12)) {
            return;
        }
        bog_2.a(new bog_2(this.a(atm_12)), (abu)this.bv(), atm_12, true);
    }

    private void cI() {
        for (atm_1 atm_12 : atm_1.q) {
            this.b(atm_12);
        }
    }

    private void b(abu abu2, boolean bl) {
        bog_2 bog_22 = new bog_2(this.cv.b());
        bog_2.a(bog_22, abu2, atm_1.c, bl);
    }

    private void c(abu abu2, boolean bl) {
        bog_2 bog_22 = new bog_2(this.cv.a());
        bog_2.a(bog_22, abu2, atm_1.b, bl);
    }

    private void d(abu abu2, boolean bl) {
        bog_2 bog_22 = new bog_2(this.cv.c());
        bog_2.a(bog_22, abu2, atm_1.i, bl);
    }

    private void a(atm_1 atm_12, abu abu2, boolean bl) {
        if (!atm_1.a(atm_12)) {
            return;
        }
        bog_2 bog_22 = new bog_2(this.a(atm_12));
        bog_2.a(bog_22, abu2, atm_12, bl);
    }

    @Override
    protected final void aU() {
        this.cD();
        this.cH();
        this.cB();
        this.cI();
    }

    public void ex() {
        this.b(bkw_1.a().c(this.gO(), this.gX(), this.bY()), true);
        this.a(bkw_1.a().b((int)this.gO(), this.gX(), (short)this.bY()), true);
        this.c(bkw_1.a().d(this.gO(), this.gX(), this.bY()), true);
        this.a(atm_1.k, bkw_1.a().e(this.gO(), this.gX(), this.bY()), true);
        this.a(atm_1.l, bkw_1.a().f(this.gO(), this.gX(), this.bY()), true);
        this.a(atm_1.m, bkw_1.a().g(this.gO(), this.gX(), this.bY()), true);
        this.a(atm_1.n, bkw_1.a().h(this.gO(), this.gX(), this.bY()), true);
        this.a(atm_1.o, bkw_1.a().i(this.gO(), this.gX(), this.bY()), true);
        this.a(atm_1.p, bkw_1.a().j(this.gO(), this.gX(), this.bY()), true);
    }

    @Override
    public String bW() {
        if (this.cv.k() < 0) {
            return null;
        }
        return bkw_1.a().a(this.cY.s(), this.gX(), this.cv.j(), this.cv.k());
    }

    @Override
    public String bX() {
        if (this.cv.j() < 0) {
            return null;
        }
        return bkw_1.a().n(this.cY.s(), this.gX(), this.cv.j());
    }

    @Override
    public byte bY() {
        return this.cv.j();
    }

    @Override
    public void a(byte by, boolean bl) {
        this.cv.a(by);
        this.eA();
        if (bl) {
            this.aQ();
        }
    }

    @Override
    public byte bZ() {
        return this.cv.k();
    }

    @Override
    public void b(byte by, boolean bl) {
        this.cv.b(by);
        if (bl) {
            this.aQ();
        }
    }

    public boolean ey() {
        return this.am;
    }

    @Override
    public void a(rs_0 rs_02) {
        super.a(rs_02);
        if (rs_02.p() == eps_0.b) {
            this.at.a(this);
        }
    }

    public bnq_2 ez() {
        return this.at;
    }

    @Override
    public void aF() {
        ((epc_0)this.gP()).a(this);
        bqz_1.a.a(this.bD());
    }

    @Override
    public void aG() {
        ((epc_0)this.gP()).b(this);
        bqz_1.a.b(this.bD());
    }

    public void l(int n) {
        this.aA.a(n);
    }

    public void s(boolean bl) {
        this.aA.a(bl);
    }

    public void c(short s2) {
        this.aB = s2;
    }

    @Override
    protected final void aX() {
        super.aX();
        this.bv().ci();
    }

    public void eA() {
        this.k(this.a(this.ev().s(), this.gX()));
    }

    public short a(short s2, byte by) {
        return bkw_1.a().a(s2, by, (short)this.bY());
    }

    public void b(epq_1 epq_12) {
        this.c(epq_12);
        this.cA = 0;
        this.eA();
    }

    @Override
    public void g(byte by) {
        super.g(by);
        this.cv.c(by);
        this.eA();
    }

    @Override
    @NotNull
    public eAG cv() {
        return this.aq;
    }

    public void eB() {
        this.cQ = bpa_1.c().a();
    }

    public short eC() {
        short[] sArray = bhe_0.a().a(this.ev().s(), this.gX());
        return sArray[this.cA];
    }

    public void eD() {
        short[] sArray = bhe_0.a().a(this.ev().s(), this.gX());
        this.cA = 0;
        if (sArray != null && sArray.length > 0) {
            this.d(sArray[this.cA]);
        }
    }

    public bpc_2 eE() {
        return this.cB;
    }

    @Override
    public void a(ead_0 ead_02) {
        this.cB = (bpc_2)ead_02;
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        if (this.cB == null) {
            return true;
        }
        if (this.cB.a(bl, bl2)) {
            this.cB = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean dN() {
        return this.r(true);
    }

    @Override
    public boolean r(boolean bl) {
        if (this.cB == null) {
            return true;
        }
        if (this.cB.c_(bl)) {
            short s2 = this.cB.ac_();
            this.cB = null;
            long l = euv_2.a.b(this.cO);
            if (this.bo() && this.cN == l && s2 == 4) {
                euw_2.a.b(this.cO, epq_22 -> {
                    if (epq_22.a_() == l) {
                        return true;
                    }
                    epq_22.a_(false);
                    return true;
                });
            }
            return true;
        }
        return false;
    }

    @Override
    public void eF() {
        this.dN();
    }

    @Override
    public long cq() {
        return 0L;
    }

    @Override
    public long e(long l) {
        return 0L;
    }

    @Override
    public long f(long l) {
        return 0L;
    }

    public void d(short s2) {
        if (bnh_1.a(s2, this.bv(), this.gX())) {
            fis_1.a().a((ajf_1)this, bW);
        }
    }

    public static boolean a(short s2, biE biE2, byte by) {
        bhd_1 bhd_12 = bhe_0.a().a(s2);
        if (bhd_12 != null) {
            boolean bl = false;
            for (bjw_1 bjw_12 : bhd_12) {
                if (bjw_12 != null) {
                    exh_2[] exh_2Array;
                    exk_2 exk_22 = new exk_2();
                    exk_22.b(bjw_12);
                    if (exk_22.U() == null || (exh_2Array = exk_22.U().h()).length <= 0) continue;
                    short s3 = exh_2Array[0].A;
                    biE2.a(bjw_12, s3, by);
                    bl = true;
                    continue;
                }
                cJ.error((Object)"Impossible de cree l'item , reference item null");
            }
            return bl;
        }
        cJ.error((Object)("Impossible d'appliquer le set " + s2 + " \u00e0 un personnage : set inconnu"));
        return false;
    }

    @Override
    public String[] d() {
        return ct;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "clothIndex": {
                return (int)this.bY();
            }
            case "faceIndex": {
                return (int)this.bZ();
            }
            case "skinColor": {
                return new azf_2(this.cv.a());
            }
            case "hairColor": {
                return new azf_2(this.cv.b());
            }
            case "pupilColor": {
                return new azf_2(this.cv.c());
            }
            case "costume1Color": {
                return new azf_2(this.cv.d());
            }
            case "costume2Color": {
                return new azf_2(this.cv.e());
            }
            case "costume3Color": {
                return new azf_2(this.cv.f());
            }
            case "costume4Color": {
                return new azf_2(this.cv.g());
            }
            case "costume5Color": {
                return new azf_2(this.cv.h());
            }
            case "costume6Color": {
                return new azf_2(this.cv.i());
            }
            case "hairAvailability": {
                return bkw_1.a().k(this.ev().s(), this.gX(), this.bY());
            }
            case "skinAvailability": {
                return bkw_1.a().l(this.ev().s(), this.gX(), this.bY());
            }
            case "pupilAvailability": {
                return bkw_1.a().m(this.ev().s(), this.gX(), this.bY());
            }
            case "hairDescription": {
                return bkw_1.a().f(this.ev().s(), this.gX());
            }
            case "skinDescription": {
                return bkw_1.a().e(this.ev().s(), this.gX());
            }
            case "hasRecustom": {
                return this.am;
            }
            case "mustRename": {
                return this.hK();
            }
            case "illustrationUrl": {
                try {
                    return String.format(azs_0.a().a("breedIllustrationPath"), this.ev().s(), this.gX());
                }
                catch (gm_0 gm_02) {
                    cJ.error((Object)"PropertyException during getFieldValue for ILLUSTRATION_URL_FIELD", (Throwable)gm_02);
                    break;
                }
            }
            case "characterChoiceIllustrationUrl": {
                try {
                    return String.format(azs_0.a().a("breedCharacterChoiceIllustrationPath"), this.ev().s(), this.gX());
                }
                catch (gm_0 gm_03) {
                    cJ.error((Object)"PropertyException during getFieldValue for CHARACTER_CHOICE_ILLUSTRATION_URL_FIELD", (Throwable)gm_03);
                    break;
                }
            }
            case "characterSheetIllustrationUrl": {
                try {
                    return String.format(azs_0.a().a("breedCharacterSheetIllustrationPath"), this.gO(), this.gX());
                }
                catch (gm_0 gm_04) {
                    cJ.error((Object)"PropertyException during getFieldValue for breedCharacterSheetIllustrationPath", (Throwable)gm_04);
                    break;
                }
            }
            case "characterSheetSmallIllustrationUrl": {
                try {
                    return String.format(azs_0.a().a("breedPortraitIllustrationPath"), this.cY.s() + String.valueOf(this.cS));
                }
                catch (gm_0 gm_05) {
                    cJ.error((Object)"PropertyException during getFieldValue for CHARACTER_SHEET_SMALL_ILLUSTRATION_URL", (Throwable)gm_05);
                    break;
                }
            }
            case "characterSheetCircleIllustrationUrl": {
                try {
                    return String.format(azs_0.a().a("breedCircleIllustrationPath"), this.cY.s() + String.valueOf(this.cS));
                }
                catch (gm_0 gm_06) {
                    cJ.error((Object)"PropertyException during getFieldValue for CHARACTER_SHEET_SMALL_ILLUSTRATION_URL", (Throwable)gm_06);
                    break;
                }
            }
            case "breedIconUrl": {
                try {
                    return String.format(azs_0.a().a("breedIconPath"), this.gO());
                }
                catch (gm_0 gm_07) {
                    cJ.error((Object)gm_07.getMessage(), (Throwable)gm_07);
                    break;
                }
            }
            case "characterSelectionIllustrationsUrl": {
                try {
                    return String.format(azs_0.a().a("breedCharacterSelectionIllustrationPath"), this.gO(), this.cS);
                }
                catch (gm_0 gm_08) {
                    cJ.error((Object)"Error displaying character selection illustration", (Throwable)gm_08);
                    break;
                }
            }
            case "currentTitle": {
                return this.eN();
            }
            case "currentTitleId": {
                return this.eM();
            }
            case "currentTitleObject": {
                return this.eL();
            }
            case "hasGuild": {
                return this.eZ();
            }
            case "guildName": {
                return this.eZ() ? this.fb() : bae.h().a("company.shortDesc.noGuild", new Object[0]);
            }
            case "guildBlazon": {
                if (this.az <= 0L) {
                    return null;
                }
                return bxt_1.a(this.az);
            }
            case "instanceName": {
                if (this.T_() < 0L) {
                    return bae.h().a("desc.havenWorld", new Object[0]);
                }
                if (!bae.h().a(77, this.T_())) {
                    return null;
                }
                return bae.h().a(77, this.T_(), new Object[0]);
            }
            case "hasNation": {
                return this.eG();
            }
            case "characterNationStamp": {
                if (!this.eG()) {
                    return null;
                }
                int n = this.fE().n();
                return azs_0.a().a("passportStampIconsPath", "defaultIconPath", n);
            }
            case "characterListNation": {
                return bae.h().a(39, (long)bmp_1.a().c(this), new Object[0]);
            }
            case "characterListNationIconUrl": {
                int n = bmp_1.a().c(this);
                return azs_0.a().a("nationFlagIconsPath", "defaultIconPath", n != 0 ? n : -1);
            }
            case "characterListNewPlayer": {
                return bae.h().a("character.sheet.newPlayer", new Object[0]);
            }
            case "characterListNewPlayerIconUrl": {
                return azs_0.a().a("mentorIconPath", "defaultIconPath", "newPlayer_41");
            }
            case "citizen": {
                return this.fE();
            }
            case "breedAptitudesTitle": {
                return bae.h().a("breed.aptitudes", this.bb().b());
            }
            case "pupilDescription": {
                String string2 = String.format("breed.pupilDescription.%d%d", this.ev().s(), this.gX());
                return bae.h().d(string2) ? bae.h().a(string2, new Object[0]) : bae.h().a("characterCreation.pupil", new Object[0]);
            }
            case "smileyIconUrl": {
                short s2 = this.gO();
                byte by = this.gX();
                return azs_0.a().l((s2 < 10 ? "0" : "") + s2 + by);
            }
            case "nameAndLevel": {
                return this.a(this.dp(), (int)this.fd());
            }
        }
        return super.b(string);
    }

    public boolean eG() {
        return !faX.a(this.fE().m(), faX.i);
    }

    @Override
    public fhD ba() {
        return this.fE().k();
    }

    public eqv_1 eH() {
        return this.cu;
    }

    @Override
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
            int n2 = this.aj.get(tByteIntIterator.key());
            bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(n2 > 0 ? n2 : n);
            if (bjw_12 == null) {
                cJ.error((Object)("Le ReferenceItem d'id " + n + " n'existe pas (skin r\u00e9f\u00e9renc\u00e9 : " + n2 + ")."));
                continue;
            }
            if (this.en() != 0 && !this.W_() && bjw_12.a(exh_2.a)) continue;
            this.bv().a(bjw_12, (short)by);
        }
    }

    public TByteIntHashMap eI() {
        return this.cz;
    }

    @Override
    protected String bt() {
        return "Smiley_" + this.gO() + this.gX();
    }

    @Override
    protected String bu() {
        return "playerGfxPath";
    }

    public short eJ() {
        return this.an;
    }

    public bhr_1 eK() {
        return bhl_1.a.b(this.a_());
    }

    @Override
    public void cw() {
        this.dR().a((Su)this, this.ge());
        this.bI();
        bhr_1 bhr_12 = bhl_1.a.b(this.a_());
        if (bhr_12 != null) {
            bhr_12.b().a(bhr_12);
        }
    }

    public void l(long l) {
        if (!this.ak()) {
            this.ar.b(l);
        }
    }

    @Override
    public void bE() {
        sn_2 sn_22 = this.cu.bC();
        this.bD().b();
        if (sn_22 != null) {
            if (sn_22.c != null) {
                this.dR().a(sn_22.c.a, this.ge());
            }
            if (sn_22.d != null) {
                this.dR();
                eJL.a(sn_22.d.a, this.cW, this);
            }
        }
        ((afv)this.Z).a(bVv.b);
    }

    @Override
    public void co() {
        if (this.ak()) {
            this.cV.a();
            this.at.a();
            this.fK();
        }
    }

    public bQF eL() {
        return new bQF(this.eM(), false);
    }

    public String a(bvs_0 bvs_02) {
        return bvs_0.a(bvs_02, this.dp(), this.au.s(), this.au.p());
    }

    @Override
    public short eM() {
        return this.aA.e();
    }

    @Nullable
    public String eN() {
        bQF bQF2 = this.eL();
        if (bQF2 == null) {
            return null;
        }
        return bQF2.a(this.gX());
    }

    @Override
    public void e(short s2) {
        if (this.aA.e() == s2) {
            return;
        }
        this.aA.a(s2);
        fis_1.a().a((ajf_1)this, bZ, ca, cb);
    }

    @Override
    public short eO() {
        return this.eM();
    }

    @Override
    public void az() {
        super.az();
        bwu_0 bwu_02 = this.Z.bQ();
        if (bwu_02 != null && bwu_02 != bwy_0.g()) {
            bwu_02.a(this.Z);
        }
        this.Z.a(bwy_0.g());
        bwy_0.g().d(this.Z);
        if (!this.bz().af_().n()) {
            this.a_(false);
        }
        if (!this.bz().b(this.a_()) && this.c(eps_0.b) < 1 && this.p()) {
            this.a_(eps_0.b).b(1);
        }
        if (this.cX()) {
            bmf_2.a().b(this.a_());
            this.bv().cg().a(this.bv());
            this.a_(false);
        }
    }

    @Override
    protected void eP() {
        super.eP();
        this.z();
    }

    @Override
    public int eQ() {
        int n = super.eQ();
        float f2 = 1.0f;
        return (int)((float)n / 1.0f);
    }

    @Override
    public int eR() {
        int n = super.eR();
        float f2 = 1.0f;
        return (int)((float)n / 1.0f);
    }

    @Override
    public float cu() {
        return this.cC == null ? 0.0f : this.cC.b();
    }

    public void i(int n) {
        if (this.cC == null) {
            this.cC = new fjN();
            this.cC.b(n);
            return;
        }
        int n2 = this.cC.a();
        this.cC.b(n);
        if (azu_0.j().k().ak() && this.bA() != azu_0.j().k().bA()) {
            return;
        }
        boolean bl = n == 10000 ? true : (n == -10000 ? false : this.cC.a() >= n2);
        FreeParticleSystem freeParticleSystem = aij_0.a().a(bl ? 800067 : 800068);
        if (freeParticleSystem == null) {
            return;
        }
        freeParticleSystem.a(this.bv());
        aik_0.a().b(freeParticleSystem);
    }

    void a(zb_1 zb_12) {
        this.cE = zb_12;
    }

    @Override
    public void br() {
        super.br();
        this.eS();
        this.eT();
    }

    @Override
    public void bI() {
        if (this.bo()) {
            super.bI();
        } else {
            this.as.a();
        }
        this.a("reloadItemEffects", () -> {
            this.aQ();
            this.eS();
        });
    }

    @Override
    public void eS() {
        bok_1.c(this);
    }

    public void eT() {
        List<eja_0> list = this.dR().n().stream().filter(eja_02 -> eja_02.aF().u()).collect(Collectors.toList());
        biS biS2 = this.bv().cg();
        list.forEach(eja_02 -> biS2.b((ejh_0)eja_02, false));
        list.forEach(eja_02 -> biS2.a((ejh_0)eja_02, false));
    }

    @Override
    public void b(sd_0 sd_02) {
        boolean bl;
        super.b(sd_02);
        boolean bl2 = sd_02.k() != null && sd_02.k().G_() == 28;
        boolean bl3 = bl = sd_02.k() != null && sd_02.k().G_() == 32;
        if (!bl2 && !bl) {
            return;
        }
        this.dR().b(sd_02);
    }

    @Override
    @Nullable
    public fiz<bpl_0> aZ() {
        if (this.cF == null) {
            return null;
        }
        return this.cF.i();
    }

    @Override
    @Nullable
    public Iterable<? extends fio_0> Y_() {
        if (this.cF == null) {
            return null;
        }
        return this.cF.j();
    }

    @Override
    public void a(zt_2 zt_22) {
        if (this.cF == null) {
            this.cF = new bpk_0(this);
        }
        this.cF.i().a(zt_22);
    }

    @Override
    @Nullable
    public bpl_0 c(long l) {
        if (this.cF == null) {
            return null;
        }
        return this.cF.a(l);
    }

    @Override
    @Nullable
    public Iterable<bpl_0> bh() {
        if (this.cF == null) {
            return null;
        }
        return this.cF.c();
    }

    public bpk_0 eU() {
        return this.cF;
    }

    @Override
    public long b(Xd xd) {
        switch (xd) {
            case b: {
                eQb eQb2 = azu_0.j().k().dE().a();
                if (eQb2 == null) {
                    return -1L;
                }
                return eQb2.e(this.a_()) != null ? eQb2.b() : -1L;
            }
        }
        return -1L;
    }

    @Override
    @Deprecated
    public boolean b() {
        return false;
    }

    public bos_2 eV() {
        return this.aw;
    }

    @Override
    @NotNull
    public Optional<ece_0> eW() {
        return bgg.a.a(this.U_());
    }

    @NotNull
    public ece_0 eX() {
        return bgg.a.c(this.U_());
    }

    public void a(eep_0 eep_02) {
        this.aC = eep_02;
    }

    @Override
    public emg_0 N_() {
        return this.au;
    }

    public boolean a(enw_0 enw_02) {
        return this.N_() != null && this.N_().a(enw_02);
    }

    public boolean eY() {
        return (long)this.fE().m().n() == this.T_();
    }

    @Contract(pure=true)
    public boolean eZ() {
        return this.aw.d() > 0L || this.az > 0L;
    }

    public long fa() {
        return this.az;
    }

    public void m(long l) {
        this.az = l;
    }

    public String fb() {
        return this.aw.a();
    }

    @Override
    public long fc() {
        return this.aw.d();
    }

    @Override
    public void a(int n, @Nullable HashMap<String, Object> hashMap, boolean bl) {
        if (this.bv().bs()) {
            return;
        }
        super.a(n, hashMap, bl);
        HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
        hashMap2.put("playerId", this.a_());
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        assert (aks_1.a().e() != null);
        String string = String.format("emotes/%d%s", n, aks_1.a().c());
        aks_1.a().a(string, ao, hashMap2, (ake_1)new bni_1(this), false);
    }

    public flk_0 i(long l) {
        this.aD = Oz.c.a(l);
        return flk_0.a.get();
    }

    @Override
    public short dr() {
        return this.aD;
    }

    @Override
    public short fd() {
        return this.aB;
    }

    public void a(long l, short s2) {
    }

    public void fe() {
        fis_1.a().a((ajf_1)this, "level", "levelValue");
        this.cF();
    }

    protected void cF() {
    }

    @Override
    public byte bF() {
        return 0;
    }

    @Override
    public String toString() {
        return this.bb() != null ? super.toString() + " " + this.bb().b() : super.toString();
    }

    @Override
    public eph_2 T() {
        return bky_1.a();
    }

    @Override
    public void a(tk_0 tk_02) {
        super.a(tk_02);
        if (this.ap != null) {
            this.ap.a(tk_02);
        }
    }

    @Override
    public void a(rx_0 rx_02, rz_0 rz_02) {
        if (rx_02 == null) {
            return;
        }
        super.a(rx_02, rz_02);
        if (rx_02.a() == 1) {
            switch ((eoz_1)rx_02) {
                case r: 
                case f: {
                    this.z();
                    break;
                }
                case O: {
                    this.bj();
                    break;
                }
                case bc: {
                    boa_2.a(this);
                }
            }
        }
        if (rx_02.a() == 0) {
            switch ((erl_2)rx_02) {
                case d: {
                    this.z();
                }
            }
        }
    }

    @Override
    public blx_1 a(long l, aff_1 aff_12, short s2, eqy_1 eqy_12, vw_0 vw_02, boolean bl, eri_2<eoz_1> eri_22) {
        blx_1 blx_12 = super.a(l, aff_12, s2, eqy_12, vw_02, bl, eri_22);
        this.a(blx_12, true);
        return blx_12;
    }

    public void a(abu abu2, boolean bl) {
        this.b(abu2, bl);
        this.c(abu2, bl);
        this.d(abu2, bl);
        for (atm_1 atm_12 : atm_1.q) {
            this.a(atm_12, abu2, bl);
        }
    }

    public void a(blx_1 blx_12, boolean bl) {
        this.a(blx_12.bv(), bl);
        fis_1.a().a((ajf_1)blx_12, cr);
    }

    @Override
    public apd_0 bS() {
        if (this.cY != null && this.cY == epn_2.g) {
            return aQb.a();
        }
        return super.bS();
    }

    @Override
    public int cb() {
        float f2 = this.cu();
        if (Math.abs(f2) < 0.3f) {
            return super.cb();
        }
        if (f2 < 0.0f) {
            return 900018;
        }
        return 900017;
    }

    @Override
    public int cc() {
        float f2 = this.cu();
        if (Math.abs(f2) < 0.3f) {
            return super.cc();
        }
        if (f2 < 0.0f) {
            return 900021;
        }
        return 900020;
    }

    public bnx_2 ff() {
        return this.ap;
    }

    public void a(bnx_2 bnx_22) {
        this.ap = bnx_22;
    }

    @Override
    public int fg() {
        return this.aA.c();
    }

    public void m(int n) {
        this.aA.b(n);
    }

    @Override
    public Collection<Integer> fh() {
        return this.aA.b();
    }

    public void a(int[] nArray) {
        if (nArray == null) {
            return;
        }
        List<Integer> list = Arrays.stream(nArray).boxed().collect(Collectors.toList());
        this.aA.a(list);
    }

    @Override
    public int fi() {
        return this.aA.d();
    }

    public void n(int n) {
        this.aA.c(n);
    }

    @Override
    public boolean a(eqr_1 eqr_12) {
        return eqr_1.b.a(eqr_12);
    }

    public static String a(epq_2 epq_22, Iterable<?> iterable) {
        ArrayList<efh_0> arrayList = new ArrayList<efh_0>();
        epq_22.dR();
        TShortIntHashMap tShortIntHashMap = new TShortIntHashMap();
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (Object object : iterable) {
            Iterator<Object> iterator;
            short s2 = 0;
            if (object instanceof exk_2) {
                exk_2 exk_22 = (exk_2)object;
                if (!exf_1.a().a(exk_22, (Su)epq_22, epq_22.Q_())) continue;
                int n = exk_22.T().n();
                if (!tIntHashSet.contains(n)) {
                    s2 = exk_22.T().x();
                    tIntHashSet.add(n);
                }
                if (!exk_22.aU_()) continue;
                iterator = exk_22.iterator();
            } else {
                if (!(object instanceof bjw_1)) continue;
                bjw_1 bjw_12 = (bjw_1)object;
                if (!tIntHashSet.contains(bjw_12.n())) {
                    s2 = bjw_12.x();
                    tIntHashSet.add(bjw_12.n());
                }
                iterator = bjw_12.u();
            }
            if (s2 != 0) {
                tShortIntHashMap.put(s2, tShortIntHashMap.contains(s2) ? tShortIntHashMap.get(s2) + 1 : 1);
            }
            while (iterator.hasNext()) {
                arrayList.add((efh_0)iterator.next());
            }
        }
        TShortIntIterator tShortIntIterator = tShortIntHashMap.iterator();
        while (tShortIntIterator.hasNext()) {
            Object object;
            tShortIntIterator.advance();
            object = bhe_0.a().a(tShortIntIterator.key());
            ArrayList<exz_2> arrayList2 = ((exo_2)object).d(tShortIntIterator.value());
            for (exz_2 exz_22 : arrayList2) {
                for (efh_0 efh_02 : exz_22) {
                    arrayList.add(efh_02);
                }
            }
        }
        boolean bl = false;
        bow_1 bow_12 = new bow_1(bae.h(), arrayList, 0);
        return bow_12.b(epq_22);
    }

    public bnh_1 fj() {
        bmr_1 bmr_12 = new bmr_1(false);
        bmr_12.c(this.cY);
        bmr_12.g(this.cS);
        bmr_12.c(this.dp());
        bmr_12.k(this.cw);
        bmr_12.b(this.cv.b(), true);
        bmr_12.a(this.cv.a(), true);
        bmr_12.c(this.cv.c(), true);
        bmr_12.a(this.cv.m(), true);
        bmr_12.b(this.cv.k(), false);
        bmr_12.a(this.cv.j(), false);
        bmr_12.ai = this.ai;
        return bmr_12;
    }

    @Override
    public cSS[] aI() {
        ArrayList<cSS> arrayList = new ArrayList<cSS>(Arrays.asList(super.aI()));
        for (cSY cSY2 : this.al) {
            arrayList.add((cSS)cSY2.a());
        }
        return arrayList.toArray(cSS.k);
    }

    @Override
    public eep_0 fk() {
        return this.aC;
    }

    @Override
    public /* synthetic */ bor_0 bg() {
        return this.eU();
    }

    @Override
    public /* synthetic */ ead_0 fl() {
        return this.eE();
    }

    @Override
    public /* synthetic */ epq_1 Z_() {
        return this.ev();
    }

    @Override
    public /* synthetic */ epq_2 b(long l, aff_1 aff_12, short s2, eqy_1 eqy_12, vw_0 vw_02, boolean bl, eri_2 eri_22) {
        return this.a(l, aff_12, s2, eqy_12, vw_02, bl, eri_22);
    }

    @Override
    public /* synthetic */ eqm_2 cr() {
        return this.eH();
    }

    @Override
    public /* synthetic */ emu_0 c() {
        return this.N_();
    }

    @Override
    public /* synthetic */ eqm_0 fm() {
        return this.eV();
    }

    @Override
    public /* synthetic */ ro_0 O_() {
        return this.eK();
    }

    static /* synthetic */ Collection a(bnh_1 bnh_12) {
        return bnh_12.cL;
    }

    static /* synthetic */ Logger fn() {
        return cJ;
    }

    static /* synthetic */ Logger fo() {
        return cJ;
    }

    static /* synthetic */ Logger fp() {
        return cJ;
    }

    static /* synthetic */ Logger fq() {
        return cJ;
    }

    static /* synthetic */ Logger fr() {
        return cJ;
    }

    static /* synthetic */ eJG b(bnh_1 bnh_12) {
        return bnh_12.cW;
    }

    static /* synthetic */ Logger fs() {
        return cJ;
    }

    static /* synthetic */ Logger ft() {
        return cJ;
    }

    static /* synthetic */ Logger fu() {
        return cJ;
    }

    static /* synthetic */ Logger fv() {
        return cJ;
    }

    static /* synthetic */ Logger fw() {
        return cJ;
    }

    static /* synthetic */ Logger fx() {
        return cJ;
    }

    static /* synthetic */ Logger fy() {
        return cJ;
    }

    static /* synthetic */ Logger fz() {
        return cJ;
    }

    static /* synthetic */ Logger fA() {
        return cJ;
    }

    static /* synthetic */ Logger fB() {
        return cJ;
    }

    static /* synthetic */ long c(bnh_1 bnh_12) {
        return bnh_12.cN;
    }

    static {
        System.arraycopy(cs, 0, ct, 0, cs.length);
        System.arraycopy(blx_1.W, 0, ct, cs.length, blx_1.W.length);
        ao = new akr_1[]{akf_0.d(), ake_0.d(), aki_0.h()};
    }
}

