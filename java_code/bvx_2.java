/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.framework.graphics.engine.material.Material;
import gnu.trove.set.hash.TByteHashSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bvX
 */
public class bvx_2
extends elm_0<blx_1>
implements ajh_1,
bwh_0 {
    public static final String[] a = new String[0];
    protected static final Material b = (Material)Material.d.c();
    private final ArrayList<bwf_0> G;
    private final HashSet<blx_1> H = new HashSet(0);
    private final bvz_1 I;
    private final List<ena_1<blx_1>> J = new ArrayList<ena_1<blx_1>>();
    private final TByteHashSet K;
    private final TByteHashSet L;
    private final bhl_2 M;
    private final List<blx_1> N = new ArrayList<blx_1>();
    private int O;
    final bwc_0 d;
    boolean e;
    private List<Long> P;
    private List<Long> Q;
    private bwd_1 R;
    private long S;
    private long T;
    private boolean U;
    private flf_0 V;
    private LocalDateTime W;
    private final EnumMap<end_1, CellParticleSystem> X = new EnumMap(end_1.class);
    private final bas Y;

    public bvx_2(int n, emr_2 emr_22, tg_0 tg_02, TByteHashSet tByteHashSet, TByteHashSet tByteHashSet2, elp_0 elp_02) {
        this(n, emr_22, tg_02, tByteHashSet, tByteHashSet2);
        this.l = elp_02;
    }

    public bvx_2(int n, emr_2 emr_22, tg_0 tg_02, TByteHashSet tByteHashSet, TByteHashSet tByteHashSet2) {
        super(n, emr_22, tg_02);
        this.x = new bxp_2(this).e();
        this.J.add(new bxq_2((bxo_2)this.x));
        this.d = new bwc_0(tg_02);
        this.I = new bvz_1(this);
        this.G = new ArrayList();
        this.g = new bwe_0(this);
        this.K = tByteHashSet;
        this.L = tByteHashSet2;
        this.M = new bhl_2(n);
        this.D.a(this.M);
        this.Y = new bas(n);
    }

    public void b() {
        this.R = new bwd_1();
    }

    @Override
    public long a(byte by) {
        throw new UnsupportedOperationException("Le client ne doit pas donner un Id d'effectuser");
    }

    @Override
    protected void a(enh_1 enh_12) {
    }

    @Override
    public void a(blx_1 blx_12, byte by, boolean bl) {
        if (!(blx_12 instanceof bmv_1)) {
            super.a(blx_12, by, bl);
            return;
        }
        bmv_1 bmv_12 = (bmv_1)blx_12;
        long l = bmv_12.cP();
        blx_1 blx_13 = bmf_2.a().c(l);
        if (blx_13 == null) {
            super.a(blx_12, by, bl);
            return;
        }
        this.a(blx_12, by, bl, blx_13);
    }

    @Override
    public boolean l() {
        if (!this.au()) {
            return false;
        }
        TByteHashSet tByteHashSet = new TByteHashSet();
        boolean bl = this.a(tByteHashSet);
        if (bl) {
            return false;
        }
        for (byte by : tByteHashSet) {
            this.t(by);
        }
        return true;
    }

    @Override
    public void m() {
        bwj_1.a().b(this);
        this.T = 0L;
        this.J.clear();
        this.M.a();
        this.I.b();
        if (this.R != null) {
            this.R.c();
        }
        super.m();
    }

    @Override
    public emk_2 n() {
        return null;
    }

    protected void a(blx_1 blx_12) {
        super.k(blx_12);
        blx_12.a(blx_12, this.j());
        for (int k = 0; k < this.J.size(); ++k) {
            try {
                this.J.get(k).d(blx_12);
                continue;
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public epq_2 a(int n, int n2) {
        Object t = super.a(n, n2);
        if (t != null && ((epq_2)t).fW()) {
            return null;
        }
        return t;
    }

    @Override
    public void b(blx_1 blx_12) {
        super.j(blx_12);
        for (int k = 0; k < this.J.size(); ++k) {
            try {
                this.J.get(k).e(blx_12);
                continue;
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public void c(blx_1 blx_12) {
        super.i(blx_12);
        for (int k = 0; k < this.J.size(); ++k) {
            try {
                this.J.get(k).f(blx_12);
                continue;
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public void d(blx_1 blx_12) {
        for (int k = 0; k < this.J.size(); ++k) {
            try {
                this.J.get(k).g(blx_12);
                continue;
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        blx_12.c(false);
        super.h(blx_12);
    }

    @Override
    public void a(epq_2 epq_22) {
        if (epq_22.Z() != -1 && this.y.o(epq_22.G(), epq_22.H())) {
            this.y.h(epq_22);
        }
    }

    @Override
    public void a(blx_1 blx_12, List<int[]> list, emu_2 emu_22) {
        bvu_2.a.b(blx_12);
    }

    @Override
    public void a(sr_0 sr_02) {
        super.a(sr_02);
        if (!this.e(sr_02)) {
            return;
        }
        apw_0.a().a(sr_02, this);
        Su su = sr_02.v();
        if (su instanceof blx_1) {
            bvu_2.a.a(sr_02, (blx_1)su);
        }
        ((aNF)ans_0.D().c()).a(apw_0.a());
        if (sr_02.w() == ele_0.b.a() && azu_0.j().c(cYT.a())) {
            cYT.a().h();
        }
    }

    @Override
    public boolean e(sr_0 sr_02) {
        bhf_2 bhf_22;
        if (sr_02.w() == ele_0.d.a() && this.a(bhf_22 = (bhf_2)sr_02)) {
            return false;
        }
        if (!sr_02.a(eld_0.e)) {
            return true;
        }
        return azu_0.j().k().Y() == sr_02.Y();
    }

    public boolean a(bhf_2 bhf_22) {
        byte by;
        if (!bhf_22.ay()) {
            return false;
        }
        Su su = bhf_22.v();
        if (su == null) {
            return true;
        }
        blx_1 blx_12 = (blx_1)this.w.a(su.a_());
        if (blx_12 == null) {
            return true;
        }
        byte by2 = this.w.r(blx_12);
        return by2 != (by = this.w.r(azu_0.j().k()));
    }

    public bwc_0 p() {
        return this.d;
    }

    @Override
    public long r() {
        return this.T;
    }

    @Override
    public Optional<blx_1> ae_() {
        return Optional.ofNullable((blx_1)this.w.a(this.T));
    }

    @Override
    public bas s() {
        return this.Y;
    }

    @Override
    public void b(sr_0 sr_02) {
        Object object;
        super.b(sr_02);
        if (sr_02 instanceof bhr_2) {
            object = ((bhr_2)((Object)sr_02)).aq();
            dbm_0.a().a(object.q());
        }
        this.f(sr_02);
        apw_0.a().c(sr_02);
        object = azu_0.j().m();
        if (object != null) {
            ((bOw)object).y();
        }
        if (!this.e) {
            dfu_0 dfu_02 = new dfu_0((ekk_0)sr_02);
            dfu_02.a_(17998);
            dfu_02.a(false);
            add_2.b().a(dfu_02);
        }
    }

    @Override
    public void d(sr_0 sr_02) {
        aPc.f().b(this, sr_02);
    }

    private boolean a(TByteHashSet tByteHashSet) {
        Iterator iterator = this.w.b(enw_2.c()).iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            blx_1 blx_12 = (blx_1)iterator.next();
            tByteHashSet.add(blx_12.Y());
            if (tByteHashSet.size() < this.ai()) continue;
            bl = true;
            break;
        }
        return bl;
    }

    @Override
    public void e(blx_1 blx_12) {
        if (!this.I.c()) {
            return;
        }
        this.I.b();
        this.f(blx_12);
    }

    @Override
    void f(blx_1 blx_12) {
        azu_0.j().b(cZa.a());
        long l = blx_12.a_();
        short s2 = this.A().u();
        cnc cnc2 = new cnc(l, s2);
        azu_0.j().K().c(cnc2);
    }

    public void a(@NotNull ena_1 ena_12) {
        if (!this.J.contains(ena_12)) {
            this.J.add(ena_12);
        }
    }

    @Override
    public void b(@NotNull ena_1 ena_12) {
        this.J.remove(ena_12);
    }

    @Override
    public void g(blx_1 blx_12) {
        if (!this.N.contains(blx_12)) {
            this.N.add(blx_12);
        }
    }

    public void a(enb_1 enb_12) {
        Object object;
        blx_1 blx_12 = bzf_1.a(enb_12.d());
        if (blx_12 == null) {
            p.error((Object)String.format("Joueur #%d \u00e0 l'origine du verrouillage du combat id=%d inconnu", enb_12.d(), this.c()));
        } else {
            object = azu_0.j().k();
            if (((blx_1)object).Y() == enb_12.e()) {
                fis_1.a().a("currentFightLocked", enb_12.b());
            }
        }
        if (enb_12.b()) {
            this.K.add(enb_12.e());
        } else {
            this.K.remove(enb_12.e());
        }
        if (enb_12.c()) {
            object = bae.h().a("fight.autoLocked", new Object[0]);
        } else {
            String string = enb_12.b() ? "fight.lockedBy" : "fight.unlockedBy";
            object = bae.h().a(string, blx_12 == null ? null : blx_12.dp());
        }
        aul_0.a().d((String)object);
    }

    @Override
    public void a(sr_0 sr_02, apq_2 apq_22) {
    }

    @Override
    public void b(sr_0 sr_02, apq_2 apq_22) {
    }

    public boolean b(long l) {
        if (this.Q == null) {
            return false;
        }
        return this.Q.contains(l);
    }

    public boolean c(long l) {
        if (this.P == null) {
            return false;
        }
        return this.P.contains(l);
    }

    public void a(boolean bl) {
        Iterator iterator = this.j().iterator();
        if (bl) {
            while (iterator.hasNext()) {
                blx_1 blx_12 = (blx_1)iterator.next();
                blx_12.bv().b(bvx_2.u());
            }
        }
    }

    protected static Material u() {
        b.b(0.2f, 0.2f, 0.2f);
        return b;
    }

    public void v() {
        p.error((Object)"ASK FOR FIGHT RECOVERY PROCESS");
        this.A().c();
        cmZ cmZ2 = new cmZ();
        cmZ2.b(this.c());
        azu_0.j().K().c(cmZ2);
    }

    @Override
    public void b(byte[] byArray) {
        p.error((Object)"PROCESSING FIGHT RECOVERY");
        this.a_(byArray);
        this.A().b();
    }

    public boolean h(blx_1 blx_12) {
        return this.H.add(blx_12);
    }

    public boolean i(blx_1 blx_12) {
        return this.H.remove(blx_12);
    }

    public boolean j(blx_1 blx_12) {
        return this.H.contains(blx_12);
    }

    public boolean k(blx_1 blx_12) {
        for (blx_1 blx_13 : this.j()) {
            if (!(blx_13 instanceof bnh_1) || blx_13 == blx_12 || this.H.contains(blx_13)) continue;
            return false;
        }
        return true;
    }

    public long b(byte by) {
        return ((blx_1)this.s(by)).a_();
    }

    @Override
    public boolean l(blx_1 blx_12) {
        return this.w.i(blx_12);
    }

    public void a(bwf_0 bwf_02) {
        if (!this.G.contains(bwf_02)) {
            this.G.add(bwf_02);
        }
    }

    public void a(epq_2 epq_22, fin_0 fin_02, aff_1 aff_12) {
        int n;
        for (n = 0; n < this.J.size(); ++n) {
            try {
                this.J.get(n).a((blx_1)epq_22, fin_02, aff_12);
                continue;
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        if (epq_22 == null || fin_02 == null) {
            return;
        }
        n = fin_02.k();
        short s2 = epq_22.dr();
        this.O += fin_02.a(s2 > n ? n : (int)s2);
    }

    public boolean w() {
        if (this.W == null) {
            return true;
        }
        return !this.W.plusSeconds((long)Math.floor((float)this.O / 2.0f)).isAfter(LocalDateTime.now());
    }

    public flf_0 x() {
        return this.V;
    }

    public void a(flf_0 flf_02) {
        this.V = flf_02;
    }

    public int y() {
        int n = (int)(System.currentTimeMillis() - this.S) / 60000;
        if (n >= 0) {
            return n;
        }
        return 0;
    }

    @Override
    public String[] d() {
        return a;
    }

    @Override
    public Object b(String string) {
        return null;
    }

    @Override
    public boolean z() {
        return super.z() || this.e;
    }

    public bxo_2 A() {
        return (bxo_2)super.O();
    }

    public void m(blx_1 blx_12) {
        super.g(blx_12);
    }

    @Override
    public Si<efh_0> B() {
        return bgh_0.a();
    }

    @Override
    protected void a(int n) {
        if (this.C()) {
            apv_0.a().a(this);
            azu_0.j().a(cYW.a());
            abY abY2 = ans_0.D().c().b();
            abY2.a(ans_0.F().k().bv());
            int n2 = (n + 600) / 1000;
            if (this.R != null) {
                this.R.b(n2);
            }
            fis_1.a().a("totalCountdown", n2);
            for (int k = 0; k < this.J.size(); ++k) {
                try {
                    this.J.get(k).b();
                    continue;
                }
                catch (Exception exception) {
                    p.error((Object)"Exception levee", (Throwable)exception);
                }
            }
        }
    }

    public boolean C() {
        bmr_1 bmr_12 = azu_0.j().k();
        return this.w.i(bmr_12) || bmr_12.dm() != null && bmr_12.dm().c() == this.c();
    }

    @Override
    public void D() {
        this.l = elp_0.f;
        if (this.C()) {
            apv_0.a().b();
            abY abY2 = ans_0.D().c().b();
            abY2.a(ans_0.F().k().bv());
            azu_0.j().b(cYW.a());
            this.L.clear();
            this.K.clear();
            this.R.c();
            for (int k = 0; k < this.J.size(); ++k) {
                try {
                    this.J.get(k).c();
                    continue;
                }
                catch (Exception exception) {
                    p.error((Object)"Exception levee", (Throwable)exception);
                }
            }
        }
    }

    @Override
    public void E() {
        super.E();
        this.S = System.currentTimeMillis();
        for (int k = 0; k < this.J.size(); ++k) {
            try {
                this.J.get(k).a();
                continue;
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public void o() {
        this.e = true;
        int n = this.J.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.J.get(k).d();
                continue;
            }
            catch (RuntimeException runtimeException) {
                p.error((Object)"Exception levee", (Throwable)runtimeException);
            }
        }
        super.o();
        this.aI();
    }

    @Override
    public void F() {
        super.F();
        for (int k = 0; k < this.J.size(); ++k) {
            try {
                this.J.get(k).e();
                continue;
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public void n(blx_1 blx_12) {
        Object object;
        super.f(blx_12);
        if (blx_12.bo()) {
            object = this.f(blx_12.Y());
            blx_1 blx_13 = null;
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                blx_1 blx_14 = (blx_1)iterator.next();
                if (!this.z(blx_14)) continue;
                blx_13 = blx_14;
                break;
            }
            if (blx_13 != null) {
                if (blx_13 instanceof bmv_1) {
                    bua_0.a.a(new bue_1(blx_13.gO(), ((bmv_1)blx_13).cL()));
                } else if (blx_13 instanceof bnh_1) {
                    bua_0.a.a(new bue_1(blx_13.gO(), ((bnh_1)blx_13).b(Xd.b)));
                } else {
                    bua_0.a.a(new bue_1(blx_13.gO(), 0L));
                }
            }
            fis_1.a().a("currentFightLocked", this.c(this.x(blx_12)));
            fis_1.a().a("currentFightRequestHelp", this.d(blx_12.Y()));
        } else if (blx_12 instanceof bmv_1) {
            byr_1 byr_12;
            object = (bmv_1)blx_12;
            long l = azu_0.j().n().u();
            long l2 = ((bmv_1)object).cQ();
            byp_1 byp_12 = dbO.a().d();
            if (byp_12 != null && (byr_12 = byp_12.c(-l2)) != null) {
                epa_1 epa_12 = ((epq_2)object).a_(eps_0.b);
                epa_12.a(new bvy_2(this, byr_12));
            }
            if (l2 > 0L && eBo.a.a(l, l2) != null) {
                bua_0.a.a(new buu_2());
            } else {
                ((blx_1)object).bj();
            }
        }
        for (int k = 0; k < this.J.size(); ++k) {
            try {
                this.J.get(k).c(blx_12);
                continue;
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public boolean c(byte by) {
        return this.K != null && this.K.contains(by);
    }

    public void a(byte by, boolean bl) {
        if (bl) {
            this.L.add(by);
        } else {
            this.L.remove(by);
        }
    }

    public boolean d(byte by) {
        return this.L.contains(by);
    }

    public TByteHashSet G() {
        return this.L;
    }

    public TByteHashSet H() {
        return this.K;
    }

    public void o(blx_1 blx_12) {
        super.e(blx_12);
        bmr_1 bmr_12 = azu_0.j().k();
        blx_1 blx_13 = this.A().H();
        if (this.l == elp_0.e) {
            return;
        }
        if (blx_12.U_() != bmr_12.U_()) {
            return;
        }
        if (blx_13 != null && blx_13.U_() == blx_12.U_()) {
            return;
        }
        cZa.a(bzf_1.a(bmr_12));
    }

    public void p(@NotNull blx_1 blx_12) {
        super.d(blx_12);
        this.T = blx_12.a_();
        long l = this.q(blx_12.a_()) / 1000L;
        this.f(l);
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_12.a(eps_0.c, eps_0.b, eps_0.d, eps_0.e);
        if (bvx_2.a(blx_12, bmr_12)) {
            azu_0.j().b(cyv_0.a());
            if (!blx_12.gk()) {
                azu_0.j().a(cZa.a());
            }
            cdw_0.n().c(600077L);
            this.g(blx_12.a_());
        } else {
            fyy_0 fyy_02;
            cdw_0.n().c(600078L);
            fit_1 fit_12 = fis_1.a().e("itemDetail", "inventoryDialog");
            if (fit_12 != null && (fyy_02 = fpm_0.b().h().d("inventoryDialog")) != null) {
                fis_1.a().a("itemDetail", "usableNow", fyy_02);
            }
        }
        bvu_2.a.a();
        bvu_2.a.a(blx_12);
        aln_2.a().c(new byc_0(blx_12.a_()));
        baa_0.a().a(this);
        for (int k = 0; k < this.J.size(); ++k) {
            try {
                this.J.get(k).a(blx_12);
                continue;
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        if (blx_12 instanceof bmv_1) {
            return;
        }
        this.W = LocalDateTime.now();
    }

    @Override
    public void f(long l) {
        if (this.R != null) {
            this.R.b(l);
            fis_1.a().a("totalCountdown", l);
        }
    }

    public static boolean a(blx_1 blx_12, bmr_1 bmr_12) {
        if (blx_12 == null) {
            return false;
        }
        return blx_12.bp();
    }

    @Override
    public void g(long l) {
        this.I.a(this.q(l), l);
    }

    public void q(@NotNull blx_1 blx_12) {
        blx_1 blx_13;
        if (this.R != null) {
            this.R.c();
        }
        apw_0.a().e();
        cYZ.o().a((bpl_0)null);
        cYZ.o().m();
        this.aH();
        super.c(blx_12);
        long l = azu_0.j().k().U_();
        if (blx_12.U_() == l && azu_0.j().c(cZa.a())) {
            bvu_2.a.a();
        }
        long l2 = blx_12.B_();
        blx_1 blx_14 = (blx_1)this.n(l2);
        if ((blx_12.U_() == l || blx_14.U_() == l) && (blx_13 = this.A().A(l)) != null) {
            cZa.a(blx_13);
        }
        for (int k = 0; k < this.J.size(); ++k) {
            try {
                this.J.get(k).b(blx_12);
                continue;
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        if (azu_0.j().c(cZa.a())) {
            azu_0.j().b(cZa.a());
        }
        if (!azu_0.j().c(cyv_0.a())) {
            azu_0.j().a(cyv_0.a());
        }
        this.W = null;
        this.O = 0;
    }

    private void aH() {
        if (!this.I.c()) {
            return;
        }
        this.I.b();
    }

    @Override
    public void I() {
        super.I();
        bvu_2.a.a();
        this.I.b();
        if (this.R != null) {
            this.R.c();
            this.R = null;
            this.S = 0L;
        }
        this.H.clear();
        cYZ.o().a((bpl_0)null);
        cYZ.o().m();
        azu_0.j().k().ch();
        azu_0.j().k().eU().b();
        int n = this.N.size();
        for (int k = 0; k < n; ++k) {
            blx_1 blx_12 = this.N.get(k);
            cef_0.a();
            cef_0.a(false, blx_12);
        }
        Iterator<ena_1<blx_1>> iterator = this.J.iterator();
        while (iterator.hasNext()) {
            try {
                iterator.next().g();
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        cYH.d();
        this.J();
    }

    public void J() {
        for (CellParticleSystem cellParticleSystem : this.X.values()) {
            cellParticleSystem.Z();
            aik_0.a().b(cellParticleSystem.ac());
        }
        this.X.clear();
    }

    @Override
    public void a(VZ vZ) {
        ejh_0 ejh_02 = (ejh_0)vZ.g();
        if (ejh_02 == null) {
            return;
        }
        Su su = ejh_02.i();
        if (su != null && su instanceof blx_1) {
            ((blx_1)su).bD().a(ejh_02);
        }
        if (!ejh_02.bm_()) {
            super.a(vZ);
        }
    }

    @Override
    public void a(eke_0 eke_02) {
        super.a(eke_02);
        this.d.a(eke_02.au());
        if (!this.A.d(eke_02)) {
            this.A.a(eke_02);
        }
    }

    public void r(blx_1 blx_12) {
    }

    @Override
    public void a(@NotNull ti_0 ti_02) {
        if (ti_02 instanceof bbh_2) {
            bbh_2 bbh_22 = (bbh_2)ti_02;
            this.b(bbh_22);
        }
    }

    private void aI() {
        int n = this.G.size();
        for (int k = 0; k < n; ++k) {
            this.G.get(k).a(this);
        }
        this.G.clear();
    }

    public boolean K() {
        return this.U;
    }

    @Override
    public void b(boolean bl) {
        this.U = bl;
    }

    public Collection<blx_1> L() {
        return this.w.b(enw_2.a(enw_2.i()));
    }

    @Override
    public void h(long l) {
        super.h(l);
        this.I.b();
        long l2 = this.q(this.T);
        this.I.a(l2, this.T);
        this.R.c(l2 / 1000L);
        fis_1.a().a("totalCountdown", l2);
    }

    @Override
    public void M() {
        super.M();
        for (int k = 0; k < this.J.size(); ++k) {
            try {
                this.J.get(k).bj_();
                continue;
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public void a(List<Long> list) {
        this.Q = list;
    }

    @Override
    public void b(List<Long> list) {
        this.P = list;
    }

    public void a(aff_1 aff_12, end_1 end_12) {
        Optional<bxf_1> optional = bxf_1.a(end_12);
        if (optional.isEmpty()) {
            return;
        }
        CellParticleSystem cellParticleSystem = aij_0.a().b(optional.get().b());
        cellParticleSystem.a(aff_12.d(), (float)aff_12.e(), (float)aff_12.f());
        cellParticleSystem.j(0);
        aik_0.a().b(cellParticleSystem);
        this.X.put(end_12, cellParticleSystem);
    }

    public Optional<end_1> b(@NotNull aff_1 aff_12) {
        for (Map.Entry<end_1, CellParticleSystem> entry : this.X.entrySet()) {
            CellParticleSystem cellParticleSystem = entry.getValue();
            if (!aff_12.b((int)cellParticleSystem.e(), (int)cellParticleSystem.f())) continue;
            return Optional.of(entry.getKey());
        }
        return Optional.empty();
    }

    public void a(end_1 end_12) {
        CellParticleSystem cellParticleSystem = this.X.get((Object)end_12);
        if (cellParticleSystem == null) {
            return;
        }
        cellParticleSystem.Z();
        if (!aik_0.a().a((IsoParticleSystem)cellParticleSystem)) {
            return;
        }
        aik_0.a().b(cellParticleSystem.ac());
    }

    public blx_1 N() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.ak() && bmr_12.bz() == this) {
            blx_1 blx_12 = this.A().H();
            if (blx_12 != null && blx_12.bp()) {
                return blx_12;
            }
            return bmr_12;
        }
        return bmr_12;
    }

    public String toString() {
        return "Fight{" + this.c() + "}";
    }

    @Override
    public /* synthetic */ void b(epq_2 epq_22) {
        this.r((blx_1)epq_22);
    }

    @Override
    public /* synthetic */ void c(@NotNull epq_2 epq_22) {
        this.q((blx_1)epq_22);
    }

    @Override
    public /* synthetic */ void d(@NotNull epq_2 epq_22) {
        this.p((blx_1)epq_22);
    }

    @Override
    public /* synthetic */ void e(epq_2 epq_22) {
        this.o((blx_1)epq_22);
    }

    @Override
    public /* synthetic */ void f(epq_2 epq_22) {
        this.n((blx_1)epq_22);
    }

    @Override
    public /* synthetic */ void g(epq_2 epq_22) {
        this.m((blx_1)epq_22);
    }

    @Override
    public /* synthetic */ eof_2 O() {
        return this.A();
    }

    @Override
    public /* synthetic */ void h(epq_2 epq_22) {
        this.d((blx_1)epq_22);
    }

    @Override
    public /* synthetic */ void i(epq_2 epq_22) {
        this.c((blx_1)epq_22);
    }

    @Override
    public /* synthetic */ void j(epq_2 epq_22) {
        this.b((blx_1)epq_22);
    }

    @Override
    protected /* synthetic */ void k(epq_2 epq_22) {
        this.a((blx_1)epq_22);
    }

    @Override
    public /* synthetic */ va_0 P() {
        return this.A();
    }

    @Override
    public /* synthetic */ aiD q() {
        return this.p();
    }

    @Override
    public /* synthetic */ blx_1 e(long l) {
        return (blx_1)super.n(l);
    }

    static /* synthetic */ Logger Q() {
        return p;
    }
}

