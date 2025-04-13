/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class biI
extends biE
implements eql_2 {
    private static final Logger aL = Logger.getLogger(biI.class);
    public static final boolean aJ = false;
    final blx_1 aM;
    final biR aN = new biR(this);
    private final biS aO = new biS(this);
    private boolean aP;
    private bwu_0 aQ = bwy_0.g();
    private float aR = 0.0f;
    private aoe_0 aS = null;
    private boolean aT;
    private biX aU;
    private boolean aV;
    private boolean aW;
    private short aX;

    public biI(blx_1 blx_12) {
        super(blx_12.a_());
        if (blx_12.bo()) {
            this.p = ali_1.a;
            this.g(ahi_0.k.a());
        } else {
            this.p = new cfb_2(blx_12);
            this.g(ahi_0.j.a());
        }
        this.aM = blx_12;
        this.aM.a((eql_2)this);
        this.j(this.at());
        this.g(this.aM);
        this.a(this.aM);
        this.h(this.aM);
        this.aF();
        this.a(new biM(this));
    }

    @Override
    public int az() {
        return this.aM.bA();
    }

    public blx_1 bI() {
        return this.aM;
    }

    public void bJ() {
        this.aM.bL();
    }

    @Override
    public void a(epq_2 epq_22) {
        if (epq_22.X_() != 0) {
            this.m(String.valueOf(epq_22.X_()));
        }
    }

    @Override
    public void b(epq_2 epq_22) {
    }

    @Override
    public void c(epq_2 epq_22) {
    }

    @Override
    public void d(epq_2 epq_22) {
    }

    @Override
    public void e(epq_2 epq_22) {
    }

    @Override
    public void f(epq_2 epq_22) {
    }

    @Override
    public void g(epq_2 epq_22) {
        this.b((float)epq_22.G(), (float)epq_22.H(), (float)epq_22.I());
    }

    @Override
    public void h(epq_2 epq_22) {
        this.a(epq_22.F());
    }

    @Override
    public void i(epq_2 epq_22) {
    }

    @Override
    public void j(epq_2 epq_22) {
    }

    @Override
    public void a(Uk uk) {
        this.aM.aQ();
    }

    @Override
    public long a() {
        return super.a();
    }

    @Override
    public byte X() {
        if (this.aM != null) {
            return this.aM.X();
        }
        return super.X();
    }

    @Override
    public short aU() {
        if (this.aM != null) {
            return this.aM.fV();
        }
        return super.aU();
    }

    public void d(short s2) {
        this.aW = true;
        this.aX = s2;
    }

    public void bK() {
        this.aW = false;
        this.aX = (short)-1;
    }

    @Override
    public short af() {
        if (this.aW) {
            return this.aX;
        }
        if (this.aM != null) {
            return this.aM.W();
        }
        return super.af();
    }

    @Override
    public final boolean at() {
        if (this.aT) {
            return false;
        }
        if (afz_0.d().j() && !this.bu() && this.aM.gY() == 0) {
            this.a(false, YU.b);
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return true;
        }
        bvx_2 bvx_22 = bmr_12.cP();
        if (bvx_22 != null) {
            tg_0 tg_02 = bvx_22.g();
            if (!bvx_22.r(this.aM) && bvx_22.K() && tg_02.d(this.G(), this.H()) && !this.aM.a(erl_2.aM)) {
                if (!this.aP) {
                    this.aP = true;
                    this.P = true;
                    this.a(false, YU.c);
                }
                return false;
            }
        }
        if (this.aP) {
            this.aP = false;
            this.P = true;
            this.a(true, YU.c);
        }
        if (this.aM.hm()) {
            return false;
        }
        return super.at();
    }

    @Override
    protected apl_1 a(bsx_2 bsx_22, apl_1 apl_12) {
        return bsx_22.a(this.aM, apl_12);
    }

    @Override
    protected boolean by() {
        return !(this.aM instanceof bmv_1);
    }

    @Override
    protected boolean bz() {
        if (!(this.aM instanceof bnh_1)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.aM;
        return bnh_12.f(erl_2.au);
    }

    @Override
    protected boolean bA() {
        if (!(this.aM instanceof bnh_1)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.aM;
        return bnh_12.f(erl_2.aN);
    }

    @Override
    protected boolean bB() {
        if (!(this.aM instanceof bnh_1)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.aM;
        return bnh_12.f(erl_2.aZ);
    }

    @Override
    protected boolean bC() {
        if (!(this.aM instanceof bnh_1)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.aM;
        return bnh_12.f(erl_2.ba);
    }

    @Override
    public int bi() {
        return this.aM.N();
    }

    @Override
    public boolean bj() {
        return this.aM.O();
    }

    @Override
    public void a(apl_1 apl_12, boolean bl, boolean bl2) {
        this.a(apl_12, bl, bl2, afm_0.p);
    }

    @Override
    public void a(apl_1 apl_12, boolean bl, boolean bl2, afm_0 afm_02) {
        this.cn();
        super.a(apl_12, bl, bl2, afm_02);
        int[] nArray = apl_12.d();
        if (nArray != null && nArray.length == 3) {
            this.aM.c(nArray[0], nArray[1], (short)nArray[2]);
        }
        if (this.aM.bz() != null && this.aM.gO() == epn_2.g.s()) {
            this.aN.g();
            this.aN.c();
            this.aN.i();
            this.b(new biJ(this));
        }
    }

    @Override
    public void a(aej_2 aej_22) {
        if (aej_22 == null) {
            aL.error((Object)"Unable to set a Direction8 to null", (Throwable)new Exception());
            return;
        }
        super.a(aej_22);
        this.aM.c(aej_22);
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        bvx_2 bvx_22 = this.aM.bz();
        if (this.az() != -1 && this.az() == bmr_12.cQ() && this.aM.ak() && bvx_22 != null && !bvx_22.z()) {
            this.c(aej_22);
        }
    }

    @Override
    public boolean a(acb_0 acb_02) {
        if (!super.a(acb_02)) {
            return false;
        }
        if (this.aM != null && this.aM.f(eoz_1.at)) {
            this.bO();
        }
        return true;
    }

    @Override
    public byte aT() {
        if (this.aM.ak()) {
            return 4;
        }
        return super.aT();
    }

    public void b(aej_2 aej_22) {
        this.a(aej_22);
        clf_1 clf_12 = new clf_1(aej_22);
        azu_0.j().K().c(clf_12);
    }

    public void bL() {
        aNC.a(this);
    }

    public void bM() {
        this.ad();
    }

    public void g(float f2) {
        this.aR += f2;
        this.b = true;
    }

    public void h(float f2) {
        this.aR -= f2;
        this.b = true;
    }

    @Override
    public float L() {
        return super.L() + this.aR;
    }

    @Override
    public void a(ArrayList<Fz> arrayList) {
        abz_0 abz_02 = this.aM.bB();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            Fz fz = arrayList.get(k);
            if (abz_02 != null && abz_02.a(fz)) continue;
            Object r2 = abo_0.a(fz.getClass());
            r2.a(this, (Fz)fz);
        }
    }

    public void bN() {
        this.aN.b();
        this.aN.f();
        this.aN.h();
        this.aO.d();
    }

    public void bO() {
        this.aN.c();
        this.aN.g();
        this.aN.i();
        this.aN.j();
        this.aO.e();
    }

    @Override
    public void aO() {
        this.aN.i();
    }

    @Override
    public void aP() {
        this.aN.h();
    }

    public void bP() {
        this.aN.a();
    }

    @Override
    public String N() {
        blx_1 blx_12 = this.aM;
        if (blx_12 == null) {
            aL.error((Object)("Actor sans characterInfo id=" + this.a() + " gfxId=" + this.z()));
            return super.N();
        }
        epq_1 epq_12 = blx_12.Z_();
        if (epq_12 != null && (epq_12 == epn_2.p || epq_12.s() == 2382)) {
            int n;
            int n2 = n = this.aQ == null ? Integer.MAX_VALUE : this.aQ.a();
            if (n == 1 || n == 0) {
                return null;
            }
        }
        return super.N();
    }

    public bwu_0 bQ() {
        return this.aQ;
    }

    public void a(bwu_0 bwu_02) {
        assert (bwu_02 != null) : "utiliser plutot NoneAttack.getInstance()";
        this.aQ = bwu_02;
    }

    public int b(bwu_0 bwu_02) {
        if (this.aQ.a(bwu_02)) {
            bwa_0.a(this, this.aQ.f(), bwu_02.f());
            return 0;
        }
        return bwa_0.c(this, bwu_02);
    }

    public void bR() {
        if (this.aM instanceof bnh_1) {
            this.aM.bj();
        }
        this.aN.c((byte)-1);
    }

    public void bS() {
        if (this.aM instanceof bnh_1) {
            bwa_0.c(this, bwy_0.g());
        }
        this.aN.p();
    }

    public int bT() {
        if (this.aM != null) {
            return this.aM.Z_().d();
        }
        return 0;
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public azj_2 h() {
        if (this.aM instanceof bmv_1 && (this.aM.ab_() || this.aM.a(erl_2.o))) {
            return azf_2.s;
        }
        if (this.aM.a(erl_2.p)) {
            return azf_2.h;
        }
        if (this.aM.a(erl_2.q)) {
            return azf_2.m;
        }
        return azf_2.e;
    }

    public void bU() {
        FreeParticleSystem freeParticleSystem = aij_0.a().a(15000);
        freeParticleSystem.a(this);
        if (this.aM != null && this.aM.ak()) {
            freeParticleSystem.a(this.aM.bA());
        }
        aik_0.a().b(freeParticleSystem);
    }

    @Override
    public void R() {
        this.bP();
        this.aO.a(this);
        this.aX();
        dbm_0.a().a(this);
        this.ck();
        super.R();
    }

    public void bV() {
        this.R();
    }

    public void bW() {
        this.aN.m();
    }

    public void c(aej_2 aej_22) {
        this.aN.a(aej_22);
    }

    public void bX() {
        this.aN.n();
    }

    public void bY() {
        this.aN.q();
    }

    public void bZ() {
        this.aN.d();
    }

    public void ca() {
        this.aN.e();
    }

    public void cb() {
        this.aN.r();
    }

    public void c(byte by) {
        this.aN.a(by);
    }

    public void d(byte by) {
        this.aN.b(by);
    }

    public void a(ejh_0 ejh_02, boolean bl) {
        this.aO.b(ejh_02, bl);
    }

    public void b(ejh_0 ejh_02, boolean bl) {
        this.aO.a(ejh_02, bl);
    }

    public void c(ejh_0 ejh_02, boolean bl) {
        this.aO.c(ejh_02, bl);
    }

    public void e(byte by) {
        this.aN.c(by);
    }

    public void cc() {
        this.aN.o();
    }

    public void cd() {
        this.aN.p();
    }

    public void ce() {
        this.aN.k();
    }

    public void cf() {
        this.aN.l();
    }

    @Override
    public final String bh() {
        if (this.aM instanceof bnh_1) {
            return this.F() + "-Fin";
        }
        return super.bh();
    }

    @Override
    public UL bn() {
        return this.aM.Z_().E();
    }

    @Override
    public int bo() {
        return this.bn().b();
    }

    @Override
    public UL bl() {
        return this.aM.Z_().F();
    }

    @Override
    public int bm() {
        return this.bl().b();
    }

    @Override
    protected void aS() {
        if (this.aT() < 8) {
            return;
        }
        FreeParticleSystem freeParticleSystem = aij_0.a().a(999998);
        freeParticleSystem.a(this.C, this.D, this.E);
        aik_0.a().b(freeParticleSystem);
        this.aA.add(freeParticleSystem.ac());
    }

    @Override
    protected void aV() {
        if (this.aT() < 8) {
            return;
        }
        try {
            String string = "currentPathLayer";
            float[] fArray = new float[]{1.0f, 0.0f, 0.0f, 0.9f};
            aif_0 aif_02 = aii_0.a().d("currentPathLayer");
            if (aif_02 == null) {
                aif_02 = aii_0.a().b("currentPathLayer");
            }
            String string2 = "currentPathCellLayer";
            float[] fArray2 = new float[]{0.0f, 0.0f, 1.0f, 0.9f};
            aif_0 aif_03 = aii_0.a().d("currentPathCellLayer");
            if (aif_03 == null) {
                aif_03 = aii_0.a().b("currentPathCellLayer");
            }
            if (this.av != null) {
                acs_0 acs_02 = acs_0.b();
                aii_0.a().e("currentPathLayer");
                aii_0.a().e("currentPathCellLayer");
                for (int k = 0; k < this.av.a(); ++k) {
                    int[] nArray = this.av.a(k);
                    DisplayedScreenElement displayedScreenElement = acs_02.b(nArray[0], nArray[1], nArray[2], acV.c);
                    if (displayedScreenElement == null) continue;
                    if (k != this.aw) {
                        aif_02.a(fArray);
                        aii_0.a().a(displayedScreenElement.j(), "currentPathLayer");
                        continue;
                    }
                    aif_03.a(fArray2);
                    aii_0.a().a(displayedScreenElement.j(), "currentPathCellLayer");
                }
            }
        }
        catch (Exception exception) {
            aL.error((Object)"", (Throwable)exception);
        }
    }

    public void a(int n, boolean bl) {
        try {
            fii fii2 = fij.a().a(n);
            if (bOE.a(fii2)) {
                return;
            }
            if (bl) {
                bOE.a(this, fii2);
            } else {
                bOE.b(this, fii2);
            }
        }
        catch (Exception exception) {
            aL.error((Object)("Erreur d'animation li\u00e9e au visuel " + n), (Throwable)exception);
            this.e(this.ab());
        }
    }

    public void a(ezr_0 ezr_02, short s2) {
        this.a(ezr_02, s2, this.aM.gX());
    }

    @Override
    public boolean aE() {
        blx_1 blx_12 = this.aM;
        if (blx_12 == null) {
            return false;
        }
        if (blx_12.ak()) {
            return super.aE();
        }
        if (blx_12.bo()) {
            return super.aE();
        }
        cSS[] cSSArray = blx_12.aI();
        if (cSSArray != null && cSSArray.length > 0) {
            for (int k = 0; k < cSSArray.length; ++k) {
                cSS cSS2 = cSSArray[k];
                if (cSS2 == null) continue;
                cSS2.a(blx_12);
                if (!cSS2.p() || !cSS2.c()) continue;
                return super.aE();
            }
        }
        return false;
    }

    public void b(int n, int n2, int n3) {
        this.a(new int[]{n, n2, n3}, new int[]{this.G(), this.H(), this.I()});
    }

    @Override
    protected void a(int[] nArray, int[] nArray2) {
        super.a(nArray, nArray2);
        if (this.aM == null || !this.aM.bo()) {
            return;
        }
        if (this.av == null || this.aw < 0 || this.aw == this.av.a()) {
            return;
        }
        if (this.bk() instanceof afX || this.bk() instanceof afT) {
            return;
        }
        FreeParticleSystem freeParticleSystem = aij_0.a().a(800189);
        freeParticleSystem.a(nArray[0], (float)nArray[1], (float)nArray[2]);
        aik_0.a().b(freeParticleSystem);
    }

    public biS cg() {
        return this.aO;
    }

    public void ch() {
        this.aO.b(this);
    }

    public void ci() {
        this.aO.c(this);
    }

    public void cj() {
        this.aO.g();
    }

    @Override
    public boolean bu() {
        bmr_1 bmr_12 = azu_0.j().k();
        return bmr_12 != null && this.a() == bmr_12.a_();
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        fis_1.a().a((ajf_1)this.aM, "visible");
    }

    @Override
    protected String i(int n) {
        try {
            return biE.k(n);
        }
        catch (gm_0 gm_02) {
            aL.error((Object)"Exception levee", (Throwable)gm_02);
            return null;
        }
    }

    public void ck() {
        if (this.aS != null) {
            this.aS.a();
            this.aS = null;
        }
    }

    public void a(bos_2 bos_22) {
        this.aS = aoe_0.a((abu)this, bos_22, "blason", null);
    }

    public void u(boolean bl) {
        this.aT = bl;
    }

    @Override
    public apl_1 a(int n, int n2, short s2, boolean bl, boolean bl2) {
        long l = this.aM.T_();
        cct_1 cct_12 = ccs_1.a().a(l);
        biI.aI.b = cct_12 == null || !cct_12.c() ? 400 : 1200;
        return super.a(n, n2, s2, bl, bl2);
    }

    public void a(biX biX2) {
        this.aU = biX2;
    }

    public biX cl() {
        return this.aU;
    }

    public boolean cm() {
        return this.aV;
    }

    public void v(boolean bl) {
        this.aV = bl;
    }

    public void cn() {
        if (yz_0.e(this.be(), this.bf(), (int)this.bg())) {
            if (!agn.a().equals(this.aZ())) {
                this.a(agn.a());
                this.e("AnimArtefact-Nager-Statique");
            }
        } else if (agn.a().equals(this.aZ())) {
            this.a(agm.a());
            this.e(this.ab());
        }
    }

    @Override
    protected boolean a(afr_2 afr_22, int n, int n2, float[] fArray) {
        boolean bl = super.a(afr_22, n, n2, fArray);
        if (bl) {
            this.w(false);
        }
        return bl;
    }

    @Override
    protected boolean b(afr_2 afr_22, int n, int n2, float[] fArray) {
        boolean bl = super.b(afr_22, n, n2, fArray);
        if (bl) {
            this.w(true);
        }
        return bl;
    }

    private void w(boolean bl) {
        bnh_1 bnh_12;
        bMk bMk2;
        if (this.aM instanceof bnh_1 && (bMk2 = (bnh_12 = (bnh_1)this.aM).er()) != null && bMk2.g() != null && bMk2.g().at() == !bl) {
            bMk2.g().c(bl);
        }
    }

    @Override
    public Byte bv() {
        fgb fgb2 = this.co();
        if (fgb2 == null) {
            return null;
        }
        return (byte)fgb2.b().a();
    }

    @Nullable
    private fgb co() {
        if (this.aM == null || !(this.aM instanceof bnh_1)) {
            return null;
        }
        bMk bMk2 = ((bnh_1)this.aM).es();
        if (bMk2 == null) {
            return null;
        }
        ffu_0 ffu_02 = bMk2.f();
        if (ffu_02 == null) {
            return null;
        }
        if (ffu_02.e() != 0) {
            return fgd.a.b(ffu_02.e());
        }
        return fgd.a.a((Integer)ffu_02.a().c());
    }

    @Override
    public Integer bw() {
        fgb fgb2 = this.co();
        if (fgb2 == null) {
            return null;
        }
        return fgb2.a();
    }

    public String toString() {
        return "CharacterActor{m_characterInfo=" + this.aM + "}";
    }
}

