/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TLongObjectProcedure;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from brd
 */
public class brd_0
implements ajh_1 {
    private static final Logger n = Logger.getLogger(brd_0.class);
    public static final String a = "mainSlot";
    public static final String b = "heroSlot0";
    public static final String d = "heroSlot1";
    public static final String e = "isPartyValid";
    public static final String f = "companyAwardsList";
    public static final String g = "companyAwardsPreview";
    public static final String h = "selectedReward";
    public static final String i = "heroesButtonText";
    public static final TLongObjectProcedure<bmk_1> j = new bre();
    static final abq_2<bvk_1> o = new abq_2<bvk_1>(new brf());
    final brc_0 p = new brc_0(-1);
    private final brc_0 q = new brc_0(0);
    private final brc_0 r = new brc_0(1);
    private bqu_1 s;
    private bvk_1 t;
    private boolean u = true;
    public static final brd_0 k;
    public final cbg_2 l = new cbg_2();
    final eQg m = new brh(this);

    public bvk_1 a() {
        return this.t;
    }

    public void a(long l) {
        blx_1 blx_12 = this.p.b().l();
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(l);
        if (bmr_12 != null && bmr_12.R() == blx_12.R()) {
            this.p.a(bzg_1.a.a(bmr_12));
            if (this.q.b() != null && this.q.b().l().a_() == l) {
                this.q.a(bzg_1.a.a((bnh_1)blx_12));
            }
            if (this.r.b() != null && this.r.b().l().a_() == l) {
                this.r.a(bzg_1.a.a((bnh_1)blx_12));
            }
            this.s = null;
        }
    }

    public int b() {
        int n = 0;
        if (this.q.b() != null) {
            ++n;
        }
        if (this.r.b() != null) {
            ++n;
        }
        return n;
    }

    public int c() {
        int n = 0;
        if (this.q.b() != null && !this.q.b().k()) {
            ++n;
        }
        if (this.r.b() != null && !this.r.b().k()) {
            ++n;
        }
        return n;
    }

    public boolean a(bmk_1 bmk_12) {
        boolean bl = false;
        if (this.q.b() != null) {
            bl = this.q.b().equals(bmk_12);
        }
        boolean bl2 = false;
        if (this.r.b() != null) {
            bl2 = this.r.b().equals(bmk_12);
        }
        return bl || bl2;
    }

    public static boolean b(bmk_1 bmk_12) {
        byn_1 byn_12 = azu_0.j().k().dE();
        if (!byn_12.d()) {
            return false;
        }
        return byn_12.a().f(bmk_12.f());
    }

    bmk_1 a(epl_0 epl_02) {
        cxq_0 cxq_02 = cxq_0.a;
        if (!epl_02.v()) {
            return cxq_02.b(epl_02.f());
        }
        return cxq_02.b(-epl_02.c());
    }

    private bmk_1 a(blx_1 blx_12) {
        cxq_0 cxq_02 = cxq_0.a;
        if (!blx_12.cX()) {
            return cxq_02.b(-blx_12.gO());
        }
        return cxq_02.b(blx_12.a_());
    }

    @Nullable
    public bmk_1 b(long l) {
        cxq_0 cxq_02 = cxq_0.a;
        if (l == 0L) {
            return null;
        }
        if (this.p.b().f() == l) {
            return this.p.b();
        }
        return cxq_02.b(l);
    }

    public void e() {
        if (euu_2.a() || euu_2.b()) {
            bmr_1 bmr_12 = azu_0.j().k();
            this.p.a(bzg_1.a.a(bmr_12));
        }
        this.f();
    }

    public void f() {
        this.a(azu_0.j().k());
    }

    public void a(bmr_1 bmr_12) {
        byn_1 byn_12 = bmr_12.dE();
        byn_12.a(new bri(this));
    }

    public void a(boolean bl) {
        if (this.q.b() != null) {
            if (bl) {
                this.a(this.q.b(), true);
            } else {
                this.a(this.q, true);
            }
        }
        if (this.r.b() != null) {
            if (bl) {
                this.a(this.r.b(), true);
            } else {
                this.a(this.r, true);
            }
        }
        cxq_0.a.f();
    }

    public void g() {
        this.p.a(null);
        this.q.a(null);
        this.r.a(null);
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.p;
        }
        if (string.equals(b)) {
            return this.q;
        }
        if (string.equals(d)) {
            return this.r;
        }
        if (string.equals(e)) {
            Object object;
            bmk_1 bmk_12 = this.p.b();
            if (bmk_12 == null) {
                return false;
            }
            blx_1 blx_12 = bmk_12.l();
            if (!(blx_12 instanceof bmr_1)) {
                return false;
            }
            bmr_1 bmr_12 = (bmr_1)blx_12;
            bmk_1 bmk_13 = this.q.b();
            bmk_1 bmk_14 = this.r.b();
            euk_2 euk_22 = new euk_2();
            this.a(bmr_12, euk_22);
            enX enX2 = enX.a;
            if (bmk_13 != null && !bmk_13.k()) {
                object = bmk_13.l();
                int n = bmp_1.a().c((blx_1)object);
                euk_22.b(bmp_1.a().d((blx_1)object));
                euk_22.d(((epq_2)object).fc());
                euk_22.c(n);
                enX2 = eul_2.a.a(euk_22);
            }
            object = enX.a;
            if (bmk_14 != null && !bmk_14.k()) {
                blx_1 blx_13 = bmk_14.l();
                int n = bmp_1.a().c(blx_13);
                euk_22.b(bmp_1.a().d(blx_13));
                euk_22.d(blx_13.fc());
                euk_22.c(n);
                object = eul_2.a.a(euk_22);
            }
            if (enX2 != enX.a) {
                n.error((Object)"Invalid hero on slot 0");
                return false;
            }
            if (object != enX.a) {
                n.error((Object)"Invalid hero on slot 1");
                return false;
            }
            return true;
        }
        if (string.equals(f)) {
            return o;
        }
        if (string.equals(g)) {
            if (this.s == null) {
                Object t = euw_2.a.d(euv_2.a.b(azu_0.j().k().U_()));
                this.s = new bqu_1((bmr_1)t);
            }
            return this.s;
        }
        if (string.equals(h)) {
            return this.t;
        }
        if (string.equals(i)) {
            bai_0 bai_02 = azu_0.j().n();
            String string2 = bai_02.b(bai_02.b());
            if (bkr_1.e.a(bai_02.g())) {
                return string2;
            }
            return bae.h().a("upgrade", new Object[0]);
        }
        return null;
    }

    public void c(bmk_1 bmk_12) {
        if (this.g(bmk_12)) {
            this.f(bmk_12);
            return;
        }
        if (eul_2.a.a(bmk_12.g()) != enX.a && !bmk_12.k()) {
            return;
        }
        this.d(bmk_12);
    }

    public void d(bmk_1 bmk_12) {
        if (this.q.b() != null && this.r.b() != null) {
            return;
        }
        brc_0 brc_02 = !bmk_12.k() ? this.i(bmk_12) : this.h(bmk_12);
        this.e(bmk_12);
        cxq_0.a.f();
        if (brc_02 != null) {
            this.a(brc_02, true, false);
        }
    }

    private void a(bmr_1 bmr_12, euk_2 euk_22) {
        Optional<Object> optional = bhh_1.a(end_0.b);
        euk_22.a(optional.orElse(null));
        boolean bl = euu_2.c();
        emg_0 emg_02 = bmr_12.N_();
        boolean bl2 = emg_02.a(enw_0.q);
        euk_22.a(bl || bl2);
        euk_22.a(this.c());
        euk_22.a(bmp_1.a().d(bmr_12));
        if (euk_22.c() == 0L) {
            euk_22.a(bmr_12.T_());
        }
        euk_22.c(bmr_12.fc());
        euk_22.b(bmr_12.bM());
        euk_22.b(bmr_12.bz() != null && bmr_12.bz().e() != elp_0.b);
    }

    private boolean g(bmk_1 bmk_12) {
        return this.a(this.q, bmk_12) || this.a(this.r, bmk_12);
    }

    private boolean a(brc_0 brc_02, bmk_1 bmk_12) {
        return brc_02.b() != null && brc_02.b().equals(bmk_12);
    }

    public void e(bmk_1 bmk_12) {
        fis_1.a().a((ajf_1)bmk_12, "isInParty");
        fis_1.a().a((ajf_1)bmk_12, "isInSlot");
        fis_1.a().a((ajf_1)bmk_12, "isInCompanyGuild");
        fis_1.a().a((ajf_1)bmk_12, "isInCompanyNation");
        fis_1.a().a((ajf_1)bmk_12, "canAddToParty");
        fis_1.a().a((ajf_1)bmk_12, "addToPartyError");
        fis_1.a().a("heroesDisplayer", (Object)null);
        fis_1.a().a("heroesDisplayer", this);
        cxq_0.a.a(j);
    }

    private brc_0 h(bmk_1 bmk_12) {
        if (this.q.b() == null && (!this.q.c() || this.r.b() != null || this.r.c())) {
            this.q.a(bmk_12);
            return this.q;
        }
        if (this.q.b() != null && this.q.b().f() == bmk_12.f()) {
            return this.q;
        }
        if (this.r.b() == null) {
            this.r.a(bmk_12);
            return this.r;
        }
        if (this.r.b().f() == bmk_12.f()) {
            return this.r;
        }
        return null;
    }

    private brc_0 i(bmk_1 bmk_12) {
        if (this.q.c()) {
            if (this.q.b() == null) {
                this.q.a(bmk_12);
                return this.q;
            }
            if (this.q.b().f() == bmk_12.f()) {
                return this.q;
            }
        }
        if (this.r.c()) {
            if (this.r.b() == null) {
                this.r.a(bmk_12);
                return this.r;
            }
            if (this.r.b().f() == bmk_12.f()) {
                return this.r;
            }
        }
        return null;
    }

    public boolean a(brc_0 brc_02, boolean bl, boolean bl2) {
        String string;
        if (brc_02 == null) {
            return false;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("companionsManagementDialog");
        if (fyy_02 == null) {
            return false;
        }
        frO frO2 = (frO)fyy_02.a(brc_02.a());
        if (frO2 == null) {
            return false;
        }
        frO2.setAnimatedElement(brc_02.b().l().bv());
        aby_0 aby_02 = (aby_0)frO2.getAnimatedElement();
        String string2 = string = bl ? "AnimApparition" : "AnimMort";
        if (!aby_02.k("AnimApparition")) {
            frO2.setAnimName("AnimStatique");
            return false;
        }
        frO2.setAnimName(string);
        if (bl) {
            aby_02.a(new brj(this, frO2, aby_02));
        } else {
            brk brk2 = new brk(this, brc_02, bl2);
            fpm_0.b().a(brk2);
            aby_02.a(new brl(this, brk2, brc_02, bl2, aby_02));
        }
        return true;
    }

    void a(brc_0 brc_02, boolean bl) {
        bmk_1 bmk_12 = brc_02.b();
        brc_02.a(null);
        this.e(bmk_12);
        if (!bl) {
            this.l();
        }
    }

    public void a(bmk_1 bmk_12, boolean bl) {
        brc_0 brc_02 = null;
        if (bmk_12.equals(this.q.b())) {
            brc_02 = this.q;
        } else if (bmk_12.equals(this.r.b())) {
            brc_02 = this.r;
        }
        if (brc_02 != null && !this.a(brc_02, false, bl)) {
            this.a(brc_02, bl);
        }
    }

    public void f(bmk_1 bmk_12) {
        this.a(bmk_12, false);
    }

    private void l() {
        bmk_1 bmk_12 = this.q.b();
        bmk_1 bmk_13 = this.r.b();
        if (this.q.c() && !this.r.c() && bmk_12 != null && bmk_12.k() && bmk_13 == null) {
            this.q.a(null);
            this.r.a(bmk_12);
            this.a(this.r, true, true);
        }
        if (this.r.c() && bmk_13 != null && bmk_12 == null) {
            this.r.a(null);
            this.q.a(bmk_13);
            this.a(this.q, true, true);
        }
        fis_1.a().a((ajf_1)this.q, "hero");
        fis_1.a().a((ajf_1)this.r, "hero");
        cxq_0.a.f();
    }

    public boolean h() {
        return this.q.c() && this.q.b() == null || this.r.c() && this.r.b() == null;
    }

    public void i() {
        fis_1.a().a((ajf_1)this.q, "remainingTime", "isUpgraded");
        fis_1.a().a((ajf_1)this.r, "remainingTime", "isUpgraded");
        cxq_0.a.f();
    }

    public void b(boolean bl) {
        this.u = bl;
    }

    public boolean j() {
        return this.u;
    }

    public void a(bvk_1 bvk_12) {
        fge fge2;
        boolean bl;
        this.k();
        this.t = bvk_12;
        fis_1.a().a((ajf_1)this, h, g);
        brk_1 brk_12 = bvk_12.g();
        if (brk_12 == null) {
            return;
        }
        byte by = this.b(this.t);
        if (by == -1) {
            return;
        }
        bjw_1 bjw_12 = brk_12.a();
        if (bjw_12.Y() && (bl = (fge2 = fgh.a.b(bjw_12.n())).k())) {
            this.s.a(fge2);
        }
        this.s.a(eyo_1.g().g(bjw_12.n()), by);
    }

    private byte b(bvk_1 bvk_12) {
        brk_1 brk_12 = bvk_12.g();
        if (brk_12 == null) {
            return -1;
        }
        bjw_1 bjw_12 = brk_12.a();
        exh_2[] exh_2Array = bjw_12.F().h();
        if (exh_2Array.length == 0) {
            return -1;
        }
        return exh_2Array[0].a();
    }

    public void k() {
        this.t = null;
        this.s = null;
        fis_1.a().a((ajf_1)this, h, g);
    }

    static {
        evd_1 evd_12 = (evd_1)evl_1.a.a(evg_1.q, 150);
        evd_12.a(new brg());
        k = new brd_0();
    }
}

