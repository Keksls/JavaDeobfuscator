/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from bmV
 */
public class bmv_1
extends blx_1
implements rv_0,
Sg,
fhi_0 {
    static final String[] al = new String[]{"shortcutBarManager"};
    public static final String[] am = new String[al.length + blx_1.W.length];
    private final ArrayList<cSY> ao = new ArrayList<cSY>(Arrays.asList(cSY.a, cSY.e, cSY.g, cSY.af, cSY.b, cSY.E, cSY.F, cSY.G, cSY.N, cSY.J));
    private static final abq_2<cUb> ap;
    public static final boolean an = true;
    short aq;
    private final bpa_0 ar = new bpa_0();
    private final float as = 0.0f;
    private final equ_1 at = new equ_1();
    long au;
    private bbu av;
    final TIntHashSet aw = new TIntHashSet();
    short ax = (short)-1;
    short ay = (short)-1;
    private bpg_1 az = null;
    long aA;
    long aB;
    private eaz_0<bmv_1> aC;
    private bmn_2 aD;
    private final bOw aE = new bOw();

    protected bmv_1() {
        this.cP = 1;
        this.cE();
        this.au = 0L;
        this.cY = bpb_1.a;
        int n = enp_2.a.b(ens_2.y);
        if (n > 0) {
            this.c(n);
        }
    }

    public static bmv_1 cy() {
        return new bmv_1();
    }

    @Override
    public boolean cp() {
        return true;
    }

    @Override
    public void co() {
        if (this.cY instanceof bpb_1) {
            bpb_1 bpb_12 = (bpb_1)this.cY;
            this.cV = new ept_0(bpb_12.A(), this.aq);
            this.ah = new bor_1(this);
        }
        if (this.aC != null) {
            this.aC.a();
        }
    }

    @Override
    public void V_() {
        super.V_();
        this.aF();
        eps_0[] eps_0Array = eps_0.values();
        for (int k = 0; k < eps_0Array.length; ++k) {
            eps_0 eps_02 = eps_0Array[k];
            this.a(this.a_(eps_02));
        }
        this.ar.a(((bpb_1)this.cY).g(), (short)(this.aq / 2), this);
        azu_0.j().k().ch();
        fis_1.a().a((ajf_1)this, "level", "levelValue", "nameAndLevel");
    }

    @Override
    public fib a(byte by, short s2, fio_0 fio_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (this.aq().U_() != bmr_12.U_()) {
            return null;
        }
        bOv bOv2 = this.aE.b(fid.b, by);
        if (bOv2 == null) {
            cJ.error((Object)String.format("[FIGHT] Trying to add a spell %d to shortcut bar %d / %d but this bar doesn't exist", fio_02.aT_(), by, s2));
            return null;
        }
        boq_0 boq_02 = boq_0.a(fie.a, fio_02.a(), fio_02.aT_(), fio_02.n());
        bOv2.a(boq_02, s2 == -1 ? bOv2.b() : s2);
        bOv2.j();
        if (this.aE == dcj_0.a().h()) {
            dcj_0.a().b(by);
        }
        return boq_02;
    }

    @Override
    @NotNull
    public bOw cg() {
        return this.aE;
    }

    @Override
    public long b() {
        return this.a_();
    }

    @Override
    public Sc c() {
        return eee_0.c;
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

    @Override
    public eph_2 T() {
        return bpc_1.a();
    }

    @Override
    @Nullable
    public exq_2 R_() {
        eBt eBt2 = eBo.a.c(this.aB);
        if (eBt2 == null) {
            return null;
        }
        return eBt2.h();
    }

    @Override
    @Nullable
    public TByteIntHashMap bc() {
        TByteIntHashMap tByteIntHashMap = super.bc();
        if (tByteIntHashMap != null) {
            return tByteIntHashMap;
        }
        if (this.cY != null) {
            return ((bpb_1)this.cY).e();
        }
        return null;
    }

    @Nullable
    public bMn cB() {
        ArrayList arrayList = new ArrayList();
        bMs.a.a((? super TProtector bMn2) -> bMn2.e() == this.a_(), arrayList);
        return !arrayList.isEmpty() ? (bMn)arrayList.get(0) : null;
    }

    @Override
    public int X_() {
        if (this.cY == null || !(this.cY instanceof bpb_1)) {
            return 0;
        }
        int n = super.X_();
        if (n != 0) {
            return n;
        }
        return ((bpb_1)this.cY).b();
    }

    @Override
    public bpl_0 c(long l) {
        return this.ar.a(l);
    }

    @Override
    public Iterable<bpl_0> bh() {
        eqy_1 eqy_12 = this.fC();
        if (eqy_12 == null) {
            return this.ar.a(this);
        }
        long l = eqy_12.m();
        if (l == -1L) {
            return this.ar.a(this);
        }
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            return this.ar.a(this);
        }
        return this.ar.a(blx_12);
    }

    @Override
    protected String bt() {
        return "Smiley_" + this.gO();
    }

    @Override
    protected String bu() {
        return "npcGfxPath";
    }

    @NotNull
    public String cD() {
        return ((bpb_1)this.cY).k();
    }

    @Override
    public void cw() {
        if (this.cY == null) {
            cJ.error((Object)"On essaie d'initialiser un monster qui ne possede pas de BreedInfo");
            return;
        }
        bpb_1 bpb_12 = (bpb_1)this.cY;
        biI biI2 = this.bv();
        biI2.b((byte)4);
        biI2.q(false);
        if (this.cQ == null || this.cQ.isEmpty()) {
            this.c(bpb_12.f());
        }
        this.ar.a(bpb_12.g(), this.aq, this);
        if (this.dq() || this.ak()) {
            this.co();
        }
        this.a(bpb_12);
        this.a((epq_1)bpb_12);
    }

    @Override
    protected void l(blx_1 blx_12) {
        if (this.a(eoz_1.aU) && blx_12 != null) {
            bOF.a(this, blx_12);
        }
    }

    private void a(bpb_1 bpb_12) {
        if (bpb_12.r() != null) {
            for (int n : bpb_12.r()) {
                erl_2 erl_22 = erl_2.a(n);
                if (erl_22 != null) {
                    this.e(erl_22);
                    this.c(erl_22);
                    continue;
                }
                cJ.error((Object)("id d'une propri\u00e9t\u00e9 de base (World) incorrect :" + n));
            }
        }
    }

    @Override
    protected void cE() {
        super.cE();
        new bmy_1(this, this.at.bk());
        new bmz_2(this, this.at.bm());
        new bmz_2(this, this.at.bl());
        new bnc_2(this, this.at.k());
        new bnd_2(this, this.at.bn());
        new bne_1(this, this.at.bo());
        new bna_1(this, this.at.bp());
        new bnb_2(this, this.at.bq());
    }

    @Override
    public boolean S_() {
        return super.S_() || this.aB > 0L;
    }

    @Override
    public void x() {
        super.x();
        this.aC = null;
    }

    @Override
    public void s() {
        super.s();
        if (this.S_()) {
            this.cH();
        }
    }

    @Override
    protected void dk() {
        if (this.hv() != eqi_2.e) {
            return;
        }
        this.a(new bnf_1());
    }

    @Override
    public void a(els_0 els_02) {
        Optional<ezi_1> optional;
        this.dk();
        if (!this.dq()) {
            this.co();
        }
        super.a(els_02);
        if (this.av != null) {
            this.av.u();
            this.av = null;
        }
        if (this.cW() != null) {
            optional = (bpb_1)this.cY;
            this.a((epq_1)((Object)optional));
            this.d((epq_1)((Object)optional));
        }
        if (this.a(eqr_1.d) && this.U_() == azu_0.j().n().u() && this.R_() != null) {
            optional = eBx.a(this);
            optional.ifPresent(ezi_12 -> aUh.c("companion.defaultEquipmentUsedInfo", this.dp(), ezi_12.a()));
        }
        if ((optional = this.aq()) != null && ((blx_1)((Object)optional)).bp()) {
            bmv_1.k(this);
        }
    }

    @Override
    public void bx() {
        this.co();
    }

    @Override
    public final void b_(boolean bl) {
        this.dR().g(25);
        if (this.ak() && this.bz() != null && !this.bz().af_().D()) {
            return;
        }
        Iterable<bpl_0> iterable = this.bh();
        if (bl) {
            this.a_(eps_0.b).y();
        }
        List<Long> list = enp_2.a.h(ens_2.aI);
        for (fio_0 fio_02 : iterable) {
            Object Spell = fio_02.r();
            if (fio_02.c() <= 0 && !((fin_0)Spell).x() || !((fin_0)Spell).w() || list.contains(((fin_0)Spell).i())) continue;
            fio_0 fio_03 = fio_02;
            for (efh_0 efh_02 : fio_03) {
                efh_02.a(fio_02, this, this.Q_(), efc_0.a(), this.G(), this.H(), this.I(), this, null, false);
            }
        }
        if (bl) {
            this.a_(eps_0.b).z();
        }
    }

    @Override
    public void az() {
        ajf_1 ajf_12;
        if (this.E_() && ((epq_2)((Object)(ajf_12 = this.ar()))).Z_() == epn_2.d) {
            this.b((epq_2)((Object)ajf_12));
        }
        super.az();
        if (this.cW() != null && !this.ab_()) {
            this.a((epq_1)this.cW());
        }
        if (!this.t()) {
            this.gP().a();
        }
        if (this.fO()) {
            long l = this.a_();
            this.bz().a(new bmx_1(this, l));
        } else {
            this.br();
            ajf_12 = this.bz();
            if (this.ab_()) {
                if (!((bvx_2)ajf_12).c(this.a_())) {
                    this.cH();
                } else {
                    this.a_(false);
                    this.br();
                }
            }
        }
    }

    public void cH() {
        if (this.ak()) {
            this.aq().bT();
        }
        biI biI2 = this.bv();
        if (this.S_() || this.a(erl_2.r) || !this.cW().a()) {
            biI2.c(false);
            biI2.u(true);
            boq_1.a().a(this, true);
        } else {
            bpo_1.a().b(this.cN);
            bpo_1.a().a(this, erl_2.o);
            boq_1.a().a(this, true);
            biI2.e("AnimStatiqueCadavre");
            biI2.c(true);
            biI2.g(ahi_0.e.a());
        }
    }

    @Override
    protected epq_1 cs() {
        return bpb_1.a;
    }

    @Override
    protected byte ct() {
        return 1;
    }

    @Override
    public void c(String string) {
        if ((string == null || string.length() == 0) && this.cY instanceof bpb_1) {
            string = ((bpb_1)this.cY).f();
        }
        super.c(string);
    }

    @Override
    @NotNull
    public eAG cv() {
        return eAD.a;
    }

    public short cI() {
        if (this.cY == null) {
            return 0;
        }
        return this.cY.s();
    }

    @Override
    public short dr() {
        return this.aq;
    }

    @Override
    public float cu() {
        return 0.0f;
    }

    @Override
    public eqm_2 cr() {
        return this.at;
    }

    public bpa_0 cJ() {
        return this.ar;
    }

    @Override
    public fiz<bpl_0> aZ() {
        return this.ar.i();
    }

    @Override
    public void a_(short s2) {
        this.aq = s2;
    }

    public long cL() {
        return this.au;
    }

    public void g(long l) {
        this.au = l;
    }

    public bbu cM() {
        return this.av;
    }

    public void a(bbu bbu2) {
        this.av = bbu2;
    }

    @Override
    public void a_(boolean bl) {
        super.a_(bl);
    }

    @Override
    protected faV au() {
        return new fdc(this);
    }

    public boolean e(int n) {
        return !this.aw.contains(n);
    }

    public void a(int n, boolean bl) {
        if (bl) {
            this.aw.remove(n);
        } else {
            this.aw.add(n);
        }
    }

    @Override
    public boolean W_() {
        if (!(this.fC() instanceof bOI)) {
            return true;
        }
        blx_1 blx_12 = this.ar();
        return blx_12 == null || blx_12 == this || blx_12.W_();
    }

    @Override
    public int cO() {
        return this.cY.t();
    }

    public long cP() {
        return this.aA;
    }

    public long cQ() {
        return this.aB;
    }

    public void h(long l) {
        this.aB = l;
    }

    public void a(eaz_0<bmv_1> eaz_02) {
        this.aC = eaz_02;
    }

    public eaz_0<bmv_1> cZ() {
        return this.aC;
    }

    @Override
    public Iterable<? extends fio_0> Y_() {
        if (this.aB > 0L) {
            return this.ar.c();
        }
        return null;
    }

    public void a(short s2, short s3) {
        bpb_1 bpb_12 = bpc_1.a().a(s2);
        this.c(bpb_12);
        this.a_(s3);
        biI biI2 = new biI(this);
        this.a(biI2);
        eri_2<erl_2> eri_22 = this.gZ();
        if (eri_22 != null) {
            eri_22.b();
        }
        this.cw();
        biI2.E();
        bon_1 bon_12 = boq_1.a().a(this.cL());
        if (bon_12 != null) {
            bon_12.a(this);
        }
    }

    @Override
    public byte bF() {
        return 1;
    }

    public short cS() {
        if (this.ax > 0) {
            return this.ax;
        }
        if (this.cY instanceof bpb_1) {
            return (short)Math.min(((bpb_1)this.cY).y(), 6);
        }
        return 0;
    }

    public short cT() {
        if (this.ay > 0) {
            return this.ay;
        }
        if (this.cY instanceof bpb_1) {
            return (short)Math.min(((bpb_1)this.cY).x(), 6);
        }
        return 0;
    }

    public boolean cU() {
        return this.cT() > 0 && this.cS() > 0;
    }

    @Override
    public boolean ab_() {
        return super.ab_() || this.a(erl_2.o);
    }

    public void m(blx_1 blx_12) {
    }

    public bpb_1 cW() {
        if (!(this.cY instanceof bpb_1)) {
            cJ.error((Object)("Un NPC n'a pas de breed de type MonsterBreed " + this.cY + ", mob ID = " + this.cN));
        }
        return (bpb_1)super.Z_();
    }

    @Override
    protected void aT() {
        super.aT();
        bpl_1.b(this.cY(), this);
        bpl_1.b(this.dn(), this);
    }

    @Override
    protected void aU() {
        super.aU();
        bpl_1.c(this.cY(), this);
        bpl_1.c(this.dn(), this);
    }

    @Override
    protected void aV() {
        super.aV();
        bpl_1.a(this.cY(), this);
        bpl_1.a(this.dn(), this);
    }

    public bpg_1 cY() {
        bpb_1 bpb_12 = this.cW();
        if (bpb_12 == null) {
            return null;
        }
        return bpb_12.j();
    }

    private bpg_1 dn() {
        return this.az;
    }

    public void a(bpg_1 bpg_12) {
        this.az = bpg_12;
    }

    @Override
    public void aF() {
        ((ept_0)this.gP()).a(this);
        bqz_1.a.a(this.bD());
    }

    @Override
    public void aG() {
        ((ept_0)this.gP()).b(this);
        bqz_1.a.b(this.bD());
    }

    @Override
    public void c(rx_0 rx_02) {
        super.c(rx_02);
        if (csg_1.a(rx_02)) {
            this.aD = new box_2(this);
        }
        if (this.aD == null) {
            return;
        }
        this.aD.a(rx_02);
    }

    @Override
    public void e(rx_0 rx_02) {
        super.e(rx_02);
        if (this.aD == null) {
            return;
        }
        this.aD.b(rx_02);
    }

    @Override
    public void a(tk_0 tk_02) {
        super.a(tk_02);
        if (this.aD == null) {
            return;
        }
        this.aD.a(tk_02);
    }

    @Override
    public void a(int n, Object object) {
        super.a(n, object);
        if (this.aD == null) {
            return;
        }
        this.aD.a(n, object);
    }

    public void a(bmn_2 bmn_22) {
        this.aD = bmn_22;
    }

    @Override
    public String dp() {
        if (box_2.a(this)) {
            return bae.h().a("hooded.monster", new Object[0]);
        }
        return super.dp();
    }

    @Override
    public boolean a(eqr_1 eqr_12) {
        if (this.cP == 5) {
            return eqr_1.d.a(eqr_12);
        }
        return eqr_1.c.a(eqr_12);
    }

    public int da() {
        return eEz.a(this.dr(), this.cW().l());
    }

    @Override
    public cSS[] aI() {
        boolean bl;
        int n;
        ArrayList<cSS> arrayList = new ArrayList<cSS>(Arrays.asList(super.aI()));
        for (int k = 0; k < this.ao.size(); ++k) {
            arrayList.add((cSS)this.ao.get(k).a());
        }
        ap.clear();
        Object object = ((bpb_1)this.cY).o();
        while (object.hasNext()) {
            object.advance();
            ap.add(new cUb((brw_1)object.value()));
        }
        arrayList.addAll(ap);
        ap.clear();
        object = this.cW().h();
        for (n = 0; n < ((ArrayList)object).size(); ++n) {
            arrayList.add(new cUa((bpp_1)((ArrayList)object).get(n)));
        }
        n = emp_0.b(azu_0.j().n().v(), emq_0.V) ? 1 : 0;
        boolean bl2 = bl = this.be() && this.do();
        if ((n != 0 || bl) && !this.ab_()) {
            arrayList.add(new ctq_0(this));
        }
        return arrayList.toArray(new cSS[arrayList.size()]);
    }

    private boolean do() {
        long[] lArray = cci_2.a.a(this.T_());
        if (lArray == null) {
            return true;
        }
        for (long l : lArray) {
            if (l != this.au) continue;
            return false;
        }
        return true;
    }

    private boolean dq() {
        return this.cP == 5 || this.C_();
    }

    @Override
    public Optional<fkU> dP() {
        return Optional.of(cdn_1.a);
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "shortcutBarManager": {
                return this.aE;
            }
        }
        return super.b(string);
    }

    @Override
    public /* synthetic */ bor_0 bg() {
        return this.cJ();
    }

    @Override
    public /* synthetic */ epq_1 Z_() {
        return this.cW();
    }

    @Override
    @Nullable
    public /* synthetic */ fgy_0 aa_() {
        return this.cB();
    }

    static /* synthetic */ Logger df() {
        return cJ;
    }

    static /* synthetic */ Logger dg() {
        return cJ;
    }

    static /* synthetic */ Logger dh() {
        return cJ;
    }

    static /* synthetic */ Logger di() {
        return cJ;
    }

    static /* synthetic */ Logger dj() {
        return cJ;
    }

    static /* synthetic */ long a(bmv_1 bmv_12) {
        return bmv_12.cN;
    }

    static /* synthetic */ Logger dl() {
        return cJ;
    }

    static /* synthetic */ Logger dm() {
        return cJ;
    }

    static {
        System.arraycopy(al, 0, am, 0, al.length);
        System.arraycopy(blx_1.W, 0, am, al.length, blx_1.W.length);
        ap = new abq_2<cUb>(new bmw_2());
    }
}

