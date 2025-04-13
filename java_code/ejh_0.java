/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eJH
 */
public abstract class ejh_0
extends sd_0<efh_0, efi_0> {
    private static final int v = 2040;
    private int w = eme_1.a();
    private byte x = (byte)-1;
    private int y = -1;
    private sd_0 z;
    private boolean A = false;
    VW N = VW.a();
    long O = -1L;
    private boolean B = false;
    private eKw C = new eKw(this);
    private boolean D = false;
    protected boolean P = false;

    public short aZ() {
        int n;
        if (this.l() != null && (n = ((efn_0)this.l()).g()) != -1) {
            return (short)n;
        }
        if (this.k() == null) {
            return 0;
        }
        return ((efi_0)this.k()).c();
    }

    public void h(boolean bl) {
        this.D = bl;
    }

    public void ba() {
        this.A = true;
    }

    public void i(boolean bl) {
        this.B = bl;
    }

    public boolean bb() {
        return this.B;
    }

    @Override
    public List<List<Su>> a(efh_0 efh_02, apq_2 apq_22, So<efh_0> so, int n, int n2, short s2) {
        return this.C.a(efh_02, apq_22, so, n, n2, s2);
    }

    @Override
    public void z() {
        super.z();
        this.m = 0;
        this.N = VW.a();
        this.B = false;
        this.C = null;
        acl_1.b(this);
    }

    public boolean bc() {
        return this.D;
    }

    public boolean a(eff_0 eff_02) {
        if (this.c == null) {
            return false;
        }
        return ((efh_0)this.c).a(eff_02);
    }

    public void c(sd_0 sd_02, boolean bl) {
        if (this.aD() || this.A) {
            return;
        }
        this.A = true;
        if (this.h != null && this.h.b() != null && !bl) {
            this.h.b().a(this);
        }
        this.y = sd_02 != null ? ((ejh_0)sd_02).bf() : -1;
        if (this.h != null && this.h.b() != null && bl) {
            this.h.b().b(this);
        }
    }

    private boolean aD() {
        efn_0 efn_02 = (efn_0)this.l();
        if (efn_02 != null && efn_02.n()) {
            return true;
        }
        return this.c != null && ((efh_0)this.c).ac();
    }

    public void j(boolean bl) {
        this.A = bl;
    }

    public boolean aO() {
        return this.A;
    }

    @Override
    public void ad() {
        if (this.v() == null && this.l() != null && ((efn_0)this.l()).f() != null) {
            this.a(((efn_0)this.l()).f());
        }
        super.ad();
    }

    @Override
    public void ai() {
        this.i(true);
        super.ai();
    }

    @Override
    public final void h(sd_0 sd_02) {
        this.j(sd_02);
        efn_0 efn_02 = (efn_0)this.l();
        this.aE();
        if (efn_02 == null || !efn_02.k()) {
            return;
        }
        this.a(efn_02);
    }

    private void aE() {
        Sr sr = this.l();
        if (!(sr instanceof efn_0)) {
            return;
        }
        List<eft_0> list = ((efn_0)sr).o();
        if (list == null || list.isEmpty()) {
            return;
        }
        for (eft_0 eft_02 : list) {
            try {
                eft_02.b(this);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    private void a(efn_0 efn_02) {
        switch (efn_02.m()) {
            case b: {
                this.b(efn_02.j());
                break;
            }
            case c: {
                this.b(Math.max(this.n() * efn_02.j() / 100, 1));
            }
        }
    }

    public void j(sd_0 sd_02) {
    }

    @Override
    protected void ae() {
        super.ae();
        Sr sr = this.l();
        if (!(sr instanceof efn_0)) {
            return;
        }
        List<eft_0> list = ((efn_0)sr).o();
        if (list == null || list.isEmpty()) {
            return;
        }
        for (eft_0 eft_02 : list) {
            try {
                eft_02.a(this);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public final void a(sd_0 sd_02, boolean bl) {
        try {
            this.b(sd_02, bl);
        }
        catch (Exception exception) {
            a.error((Object)("Exception lors de l'execution d'un effet " + (this.c != null ? ((efh_0)this.c).i() : this.bt_())), (Throwable)exception);
        }
        this.P = true;
        if (!this.A) {
            try {
                this.c(sd_02, bl);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee lors de la notification de l'execution", (Throwable)exception);
            }
        }
        this.A = false;
        super.a(sd_02, bl);
    }

    protected abstract void b(sd_0 var1, boolean var2);

    @Override
    public boolean W() {
        return super.W() || this.c != null && ((efh_0)this.c).a(eff_0.e);
    }

    @Override
    public boolean a(byte by) {
        boolean bl = false;
        try {
            byte by2;
            bl |= super.a(by);
            if (this.h == null || !(this.h instanceof efq_0)) {
                return bl;
            }
            switch (by) {
                case 3: {
                    by2 = 31;
                    break;
                }
                case 1: {
                    by2 = 11;
                    break;
                }
                case 2: {
                    by2 = 21;
                    break;
                }
                case 4: {
                    by2 = 41;
                    break;
                }
                case 6: {
                    by2 = 61;
                    break;
                }
                default: {
                    a.error((Object)("Pas de type de trigger global correspondant " + by));
                    return bl;
                }
            }
            Iterator<Su> iterator = this.h.c().k();
            while (iterator.hasNext()) {
                Su su = iterator.next();
                bl |= su.a(this.L(), this, by2);
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception catch\u00e9e : ", (Throwable)exception);
        }
        return bl;
    }

    @Override
    @Nullable
    protected Su f(sd_0 sd_02) {
        if (sd_02 == null || this.c == null) {
            return this.f;
        }
        sc_0 sc_02 = ((efh_0)this.c).A();
        try {
            switch (sc_02) {
                case a: {
                    a.error((Object)("Pas de type de cibles sp\u00e9cifi\u00e9e pour un effet d\u00e9clench\u00e9, on retrourne la cible originale, id : " + ((efh_0)this.c).i()));
                    return this.f;
                }
                case b: {
                    return this.f;
                }
                case c: {
                    return this.A().f();
                }
                case d: {
                    return this.e;
                }
                case e: {
                    return sd_02.h();
                }
                case f: {
                    return sd_02.i();
                }
            }
            a.error((Object)("Type de cible d'effet declench\u00e9 inconnue " + sc_02));
            return this.f;
        }
        catch (Exception exception) {
            a.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du triggering target sur l'effet " + ((efh_0)this.c).i()), (Throwable)exception);
            return null;
        }
    }

    @Override
    @Nullable
    protected Su g(sd_0 sd_02) {
        if (this.c == null || sd_02 == null) {
            return this.e;
        }
        SA sA = ((efh_0)this.c).B();
        if (sA == null) {
            return this.e;
        }
        try {
            switch (sA) {
                case a: {
                    a.error((Object)("Pas de type de caster sp\u00e9cifi\u00e9 pour un effet d\u00e9clench\u00e9, on retourne la cible originale, id : " + ((efh_0)this.c).i()));
                    return this.e;
                }
                case b: {
                    return this.e;
                }
                case c: {
                    return this.A().f();
                }
                case d: {
                    return this.f;
                }
                case e: {
                    return sd_02.h();
                }
                case f: {
                    return sd_02.i();
                }
            }
            a.error((Object)("Type de cible d'effet declench\u00e9 inconnue " + sA));
            return this.e;
        }
        catch (Exception exception) {
            a.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du triggering caster sur l'effet " + ((efh_0)this.c).i()), (Throwable)exception);
            return null;
        }
    }

    @Override
    protected boolean av() {
        boolean bl = super.av();
        if (this.f != null && !this.f.t() && this.f.ax_() && this.f.u()) {
            this.f.a(true);
            bl = true;
            this.f.c(this.e);
            if (this.f != null) {
                this.f.a(false);
            }
        }
        if (this.f != null && this.f.p() && this.f.l() && this.f.u()) {
            this.f.a(true);
            bl = true;
            this.f.b(this.e);
            if (this.f != null) {
                this.f.a(false);
            }
        }
        return bl;
    }

    protected Long bn_() {
        if (this.c != null) {
            if (((efh_0)this.c).y() && this.e != null) {
                return this.e.a_();
            }
            if (((efh_0)this.c).z() && this.f != null) {
                return this.f.a_();
            }
        }
        if (this.f != null) {
            return this.f.a_();
        }
        if (this.e != null) {
            return this.e.a_();
        }
        return null;
    }

    @Override
    public void am() {
        if (this.d == null) {
            return;
        }
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).h() != 2) {
            return;
        }
        if (this.h.d() == null) {
            return;
        }
        if (!this.aF()) {
            return;
        }
        efp_0 efp_02 = (efp_0)this.c;
        this.h.d().a(new VY(this, this.bn_()), efp_02.d(this.aZ()));
    }

    private boolean aF() {
        if (this.bn_() == null) {
            a.error((Object)("[DESIGN EFFECT] Pas de point d'attache dans la timeline (#" + this.c() + " " + this.ag() + ")"));
            return false;
        }
        return true;
    }

    @Override
    public void an() {
        if (this.c == null || ((efh_0)this.c).h() != 2 || this.h.d() == null) {
            return;
        }
        efp_0 efp_02 = (efp_0)this.c;
        this.a(efp_02.c(this.aZ()));
    }

    public void bd() {
        if (!this.aq()) {
            this.an();
            return;
        }
        efp_0 efp_02 = (efp_0)this.c;
        vx_0 vx_02 = efp_02.c(this.aZ());
        int n = vx_02.e() - efp_02.d(this.aZ()).e();
        if (vx_02.d()) {
            ++n;
        }
        vx_02.b(n);
        this.a(vx_02);
    }

    @Override
    protected void a(vx_0 vx_02) {
        if (vx_02.f()) {
            return;
        }
        if (!this.aF()) {
            return;
        }
        va_0 va_02 = this.h.d();
        this.q = va_02.A();
        this.N = va_02.a(new VZ(this, this.bn_()), vx_02);
    }

    @Override
    public VW ap() {
        return this.N;
    }

    public long bo_() {
        if (this.c != null && ((efh_0)this.c).h() == 1 && this.O < 0L) {
            this.O = ((eFA)this.f()).a(this.aZ());
        }
        return this.O;
    }

    public void f(long l) {
        this.O = l;
    }

    @Override
    public boolean as() {
        if (this.s) {
            return false;
        }
        if (this.at()) {
            return true;
        }
        if (this.c != null) {
            switch (((efh_0)this.c).h()) {
                case 2: {
                    efp_0 efp_02 = (efp_0)this.c;
                    vx_0 vx_02 = efp_02.c(this.aZ());
                    return vx_02 != null && !vx_02.f();
                }
                case 1: {
                    eFA eFA2 = (eFA)((Object)this.c);
                    return eFA2.a(this.aZ()) > 0;
                }
                case 0: {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean bp_() {
        return this.f() == null || ((efh_0)this.f()).h() == 1;
    }

    @Override
    public boolean at() {
        if (this.c == null) {
            return false;
        }
        short s2 = this.aZ();
        switch (((efh_0)this.c).h()) {
            case 2: {
                efp_0 efp_02 = (efp_0)this.c;
                vx_0 vx_02 = efp_02.c(s2);
                return vx_02 != null && vx_02.e() < 0;
            }
            case 1: {
                eFA eFA2 = (eFA)((Object)this.c);
                return eFA2.a(s2) < 0;
            }
            case 0: {
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean aq() {
        if (this.c == null) {
            return false;
        }
        if (this.d == null) {
            return false;
        }
        if (((efh_0)this.c).h() != 2) {
            return false;
        }
        return !((efp_0)this.c).d(this.aZ()).f();
    }

    public efa_0 br_() {
        return null;
    }

    @Override
    public void O() {
        efa_0 efa_02 = this.br_();
        if (efa_02 == null) {
            efa_02 = this.be();
        }
        if (efa_02 == null) {
            return;
        }
        this.c(efa_02.j());
    }

    protected efa_0 be() {
        if (this.k() == null) {
            return null;
        }
        int n = ((efi_0)this.k()).G_();
        if (n == 11) {
            return ((fio_0)this.k()).v();
        }
        return null;
    }

    public int bf() {
        return this.w;
    }

    public boolean bg() {
        return this.P;
    }

    public int bh() {
        return this.y;
    }

    @Override
    public boolean ab() {
        if (this.c != null && !((efh_0)this.c).N() && !this.aA() && this.f != null && this.f.p()) {
            return false;
        }
        if (this.bq_()) {
            return false;
        }
        if (this.f != null && !this.f.F_()) {
            return false;
        }
        if (this.c == null) {
            return true;
        }
        if (!this.aG()) {
            return false;
        }
        efn_0 efn_02 = (efn_0)this.l();
        if (!(efn_02 != null && efn_02.e() || this.a_(null))) {
            return false;
        }
        if (this.ac()) {
            return false;
        }
        short s2 = this.aZ();
        boolean bl = true;
        if (this.l() == null || !((efn_0)this.l()).d()) {
            bl = xc_0.a(100) <= xh_0.a(((efh_0)this.c).b(s2));
        }
        return bl;
    }

    @Override
    protected boolean ac() {
        efn_0 efn_02 = (efn_0)this.l();
        return efn_02 != null && efn_02.h();
    }

    protected boolean bq_() {
        return false;
    }

    protected boolean bi() {
        if (this.d instanceof fie_0 && ((fie_0)this.d).H() == epg.a) {
            return false;
        }
        return this.f != null && this.f.a(eoz_1.av);
    }

    private boolean aG() {
        short s2 = this.aZ();
        int n = ((efh_0)this.c).O();
        int n2 = ((efh_0)this.c).P();
        return s2 >= n && s2 <= n2;
    }

    @Override
    public boolean c(sd_0 sd_02) {
        if (!this.aA() && this.f != null && this.f.p()) {
            return false;
        }
        if (this.c == null) {
            return true;
        }
        if (!this.a_(sd_02)) {
            return false;
        }
        if (!this.aG()) {
            return false;
        }
        short s2 = this.aZ();
        return xc_0.a(100) <= xh_0.a(((efh_0)this.c).b(s2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a_(sd_0 sd_02) {
        boolean bl;
        Su su = this.P() ? this.g(sd_02) : this.e;
        Su su2 = this.P() ? this.f(sd_02) : this.f;
        this.z = sd_02;
        try {
            bl = ((efh_0)this.c).Q() == null || ((efh_0)this.c).Q().b(su, su2 == null ? this.g : su2, this, this.h);
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
            bl = false;
        }
        finally {
            this.z = null;
        }
        return bl;
    }

    public sd_0 bj() {
        return this.z;
    }

    @Override
    protected boolean aA() {
        if (this.a(eff_0.n)) {
            return true;
        }
        if (this.aM()) {
            return true;
        }
        return this.J() != null && this.J().get(1010);
    }

    private boolean aM() {
        efi_0 efi_02 = (efi_0)this.k();
        if (efi_02 == null) {
            return false;
        }
        int n = efi_02.G_();
        if (n == 25) {
            return ((fio_0)efi_02).w() == 2040;
        }
        return false;
    }

    public byte bk() {
        return this.x;
    }

    public void b(byte by) {
        this.x = by;
    }

    @Override
    public Sl az() {
        return eFD.ad();
    }

    @Override
    public ic_1 ay() {
        return ic_1.n().a(this.B).a(this.x).a(iy_1.i().a(this.N.c()).a(this.N.e()).a(this.N.d())).a(this.O).b(this.P).o();
    }

    @Override
    protected void a(ic_1 ic_12) {
        this.B = ic_12.c();
        this.x = Hw.b((long)ic_12.e());
        iy_1 iy_12 = ic_12.g();
        this.N = new VW(iy_12.c(), Hw.c((long)iy_12.e()), iy_12.g());
        this.O = ic_12.j();
        this.P = ic_12.l();
    }

    private void b(int n, long l) {
        switch (n) {
            case 11: 
            case 25: {
                int n2 = fio_0.a(l);
                short s2 = fio_0.b(l);
                fio_0 fio_02 = fip_0.d().b(n2, s2);
                this.a(fio_02);
                break;
            }
            case 1: {
                if (this.k() != null) break;
                boolean bl = this.a(this.i(), l);
                if (!bl) {
                    bl = this.a(this.h(), l);
                }
                if (!bl) {
                    bl = this.e(l);
                }
                if (bl) break;
                a.error((Object)("Impossible de cr\u00e9er un \u00e9tat en tant que container d'un effet, id unique du container : " + l));
                break;
            }
            case 3: {
                if (this.h != null && this.h.g() != null) {
                    ekk_0 ekk_02 = (ekk_0)this.h.g().a(l);
                    if (ekk_02 != null) {
                        this.a(ekk_02);
                        break;
                    }
                    if (this.h instanceof efq_0) {
                        efq_0 efq_02 = (efq_0)this.h;
                        tg_0 tg_02 = efq_02.l().g();
                        a.error((Object)("Area inexistante " + l + " sur le contexte de type " + this.h.h() + " for fight " + efq_02.k() + " (instance=" + (Serializable)(tg_02 != null ? Short.valueOf(tg_02.q()) : "?") + ")"));
                        break;
                    }
                    a.error((Object)("Area inexistante " + l + " sur le contexte de type " + this.h.h()));
                    break;
                }
                a.error((Object)"contexte non ou mal initialis\u00e9");
                break;
            }
            case 12: {
                exk_2 exk_22 = eyo_1.g().g((int)l);
                if (exk_22 != null) {
                    this.a(exk_22);
                    break;
                }
                a.error((Object)("item par d\u00e9faut inconnu, referenceId = " + l));
                break;
            }
            case 14: {
                a.info((Object)"On ne devrait pas s\u00e9rialiser les effets des sets");
                break;
            }
            case 31: {
                a.info((Object)"On ne devrait pas s\u00e9rialiser les effets des sacs");
                break;
            }
            case 19: {
                break;
            }
            case 21: {
                this.a(eox_2.a(l, (efh_0)this.f()));
                break;
            }
            case 28: {
                this.a(eey_0.g);
                break;
            }
            case 32: {
                this.a(eey_0.i);
                break;
            }
            case 30: {
                this.a(eey_0.h);
                break;
            }
            case 36: {
                int n3 = eFm.a(l);
                short s3 = eFm.b(l);
                Object t = ezh_2.a.a(n3);
                if (t == null) break;
                this.a(new ezf_1((ezv_2)t, s3));
                break;
            }
            case 26: 
            case 29: 
            case 33: {
                efj_0 efj_02 = new efj_0();
                efj_02.a(n).a(l);
                this.a(efj_02.a());
            }
        }
    }

    @Override
    protected void a(int n, long l) {
        this.b(n, l);
    }

    @Override
    protected void b(sd_0<efh_0, efi_0> sd_02) {
        super.b(sd_02);
        this.x = ((ejh_0)sd_02).bk();
        this.N = sd_02.ap();
        this.D = ((ejh_0)sd_02).D;
    }

    private boolean e(long l) {
        fie_0 fie_02 = fih_0.a().c((int)l);
        if (fie_02 == null) {
            return false;
        }
        this.d = fie_02.c(fie_0.c((int)l));
        return true;
    }

    public boolean a(Su su, long l) {
        if (su == null) {
            return false;
        }
        se_0 se_02 = su.x_();
        if (se_02 == null) {
            return false;
        }
        for (sd_0 sd_02 : se_02) {
            if (sd_02.bt_() != efc_0.b.a()) continue;
            fie_0 fie_02 = ((eja_0)sd_02).aF();
            if (fie_02 == null) {
                a.error((Object)("Un StateRunningEffect avec un etat inexistant ??? re.getId() = " + sd_02.bt_()));
                continue;
            }
            if ((long)fie_02.q() != l) continue;
            this.a(fie_02);
            return true;
        }
        return false;
    }

    public boolean bl() {
        efh_0 efh_02 = (efh_0)this.f();
        if (efh_02 == null) {
            return false;
        }
        efi_0 efi_02 = (efi_0)this.k();
        if (efi_02 == null) {
            return false;
        }
        int n = efi_02.G_();
        if (n != 12 && n != 14 && n != 31) {
            return false;
        }
        return !efh_02.L();
    }

    @Override
    public boolean i(sd_0 sd_02) {
        try {
            return sd_02 != null && sd_02.n() == this.n() && (sd_02.j() == null || sd_02.j().equals(this.j())) && sd_02.h() == this.h() && sd_02.k() == this.k() && sd_02.f() == this.f() && sd_02.ap() == this.ap() && sd_02.bt_() == this.bt_() && sd_02.p() == this.p();
        }
        catch (Exception exception) {
            a.warn((Object)aho_2.a(exception));
            return false;
        }
    }

    public boolean bm_() {
        if (this.aD()) {
            return false;
        }
        if (this.h instanceof efq_0) {
            efq_0 efq_02 = (efq_0)this.h;
            elm_0 elm_02 = efq_02.l();
            if (elm_02.e() == elp_0.b) {
                return true;
            }
            if (elm_02.e() == elp_0.f) {
                return false;
            }
        }
        return this.P() || this.aq() || this.B;
    }

    public boolean bm() {
        if (this.aD()) {
            return false;
        }
        if (this.as() && !this.bl()) {
            return true;
        }
        return this.B;
    }

    @Override
    protected void t() {
        this.n = this.c != null && ((efh_0)this.c).x() >= 0 ? (int)((float)((efh_0)this.c).x() + (float)this.aZ() * ((efh_0)this.c).V()) : -1;
    }

    public boolean bn() {
        return this.d != null && ((efi_0)this.d).G_() == 19;
    }

    public boolean bo() {
        return this.d != null && ((efi_0)this.d).G_() == 36;
    }

    public boolean bp() {
        return this.d != null && ((efi_0)this.d).G_() == 25;
    }

    public boolean bq() {
        return this.d != null && ((efi_0)this.d).G_() == 32;
    }

    public boolean br() {
        return this.d != null && ((efi_0)this.d).G_() == 28;
    }

    public boolean bs() {
        return this.d != null && ((efi_0)this.d).G_() == 34;
    }

    public boolean bt() {
        if (this.k() == null) {
            return false;
        }
        if (!(this.k() instanceof fie_0)) {
            return false;
        }
        return ((fie_0)this.k()).s();
    }

    public boolean bu() {
        if (this.c == null) {
            return false;
        }
        return ((efh_0)this.c).b();
    }

    protected sd_0 m(sd_0 sd_02) {
        sd_0 sd_03 = sd_02 != null ? sd_02 : (this.l() != null ? ((efn_0)this.l()).f() : null);
        return sd_03;
    }

    public void bv() {
        if (this.A() == null && !this.r()) {
            this.q();
        }
    }

    @Override
    public final short aa() {
        efq_0 efq_02;
        if (this.h instanceof efq_0 && (efq_02 = (efq_0)this.h).m()) {
            return 2000;
        }
        return super.aa();
    }
}

