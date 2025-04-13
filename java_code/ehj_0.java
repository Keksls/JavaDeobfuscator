/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHj
 */
public class ehj_0
extends ejh_0
implements eGq,
eKf {
    private static final aqr_2 y = new eFw(new eFv("Dommages", new eFu("Valeur", eFx.b)), new eFv("Prise en compte des modificateurs (0=fixe + non-r\u00e9ductible, 1=non-r\u00e9ductible, 2=fixe, 3=default)", new eFu("Valeur", eFx.b), new eFu("NONE(0) + DMG_MODIFIER(1) + RES_MODIFIER(2)", eFx.c)), new eFv("Ratio de la valeur des PV max/courant/manquant de la cible/caster", new eFu("Ratio (%)", eFx.b), new eFu("NONE(0) + DMG_MODIFIER(1) + RES_MODIFIER(2)", eFx.c), new eFu("CASTER : 1=max 2=current 3=missing | TARGET : 4=max 5=current 6=missing", eFx.c)));
    efa_0 v;
    eKg w;
    int x;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;

    @Override
    public aqr_2 c_() {
        return y;
    }

    ehj_0() {
    }

    public ehj_0(efa_0 efa_02, eKg eKg2) {
        this.v = efa_02;
        this.w = eKg2;
        this.M();
    }

    public static ehj_0 a(So<efh_0> so, efa_0 efa_02, eKg eKg2, int n, Su su) {
        ehj_0 ehj_02 = new ehj_0(efa_02, eKg2);
        ehj_02.b(so, efa_02, eKg2, n, su);
        return ehj_02;
    }

    void b(So<efh_0> so, efa_0 efa_02, eKg eKg2, int n, Su su) {
        this.i = efc_0.ci.a();
        this.l = ((ejh_0)efc_0.ci.b()).e();
        this.v = efa_02;
        this.w = eKg2;
        this.f = su;
        this.m = n;
        this.n = -1;
        this.x = 3;
        this.h = so;
        this.A = 0;
        this.z = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = false;
        this.F = false;
        this.M();
    }

    public ehj_0 aD() {
        ehj_0 ehj_02 = new ehj_0();
        this.a(ehj_02);
        return ehj_02;
    }

    @Override
    private void a(ehj_0 ehj_02) {
        ehj_02.z = this.z;
        ehj_02.A = this.A;
        ehj_02.B = this.B;
        ehj_02.C = this.C;
        ehj_02.D = this.D;
        ehj_02.E = this.E;
        ehj_02.w = this.w;
        ehj_02.v = this.v;
        ehj_02.x = this.x;
        ehj_02.F = this.F;
    }

    @Override
    public void M() {
        super.M();
        this.c(2);
        this.a(this.v);
        if (this.a(eff_0.d)) {
            this.c(2215);
        }
        if (this.a(eff_0.v)) {
            this.c(2218);
        }
        if (this.a(eff_0.w)) {
            this.c(2217);
        }
        if (this.a(eff_0.u)) {
            this.c(2216);
        }
        if (this.aM()) {
            this.c(2268);
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.e == null || this.f == null) {
            this.j(true);
            return;
        }
        if (!this.f.a(eps_0.b) && !this.f.a(eps_0.Y)) {
            this.j(true);
            return;
        }
        if (this.aQ() && this.E) {
            this.m = (int)Math.ceil((float)this.m * 0.8f);
            if (this.m() instanceof efq_0) {
                efq_0 efq_02 = (efq_0)this.m();
                efq_02.a(this.f);
                this.c(2233);
            }
        }
        if (this.m < 0) {
            this.m = 0;
            a.warn((Object)("HPLoss with negative value : " + ((efh_0)this.c).i()));
        }
        if (!this.f.p()) {
            this.a(this.m, this.e, this.f);
        } else if (this.f.a(eps_0.l)) {
            this.m = 1;
            this.f.b(eps_0.l).d(this.m);
        } else {
            this.j(true);
        }
        this.aG();
    }

    private void a(int n, Su su, Su su2) {
        rs_0 rs_02;
        if (this.c == null || !((efh_0)this.c).a(eff_0.A)) {
            rs_0 rs_03;
            rs_02 = su.b(eps_0.aa);
            if (rs_02 != null && rs_02.c() > 0 && rs_02.k()) {
                int n2 = rs_02.d(n / 2);
                n -= n2;
                if (this.D()) {
                    this.C = n2;
                }
            }
            if ((rs_03 = su2.b(eps_0.Y)) != null && rs_03.c() > 0 && rs_03.k()) {
                int n3 = rs_03.d(n);
                n -= n3;
                if (this.D()) {
                    this.B = n3;
                }
            }
        }
        if ((rs_02 = su2.b(eps_0.T)) != null && rs_02.c() > 0 && rs_02.k()) {
            int n4 = rs_02.d(n);
            n -= n4;
        }
        if (n > 0) {
            su2.b(eps_0.b).d(n);
        }
    }

    private void aG() {
        uo_0 uo_02 = this.f.k();
        if (uo_02 == null || this.e == null) {
            return;
        }
        un_0 un_02 = uo_02.a(this.e.G(), this.e.H(), this.e.I());
        if (un_02 == un_0.a) {
            this.c(29);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.e == null || this.f == null) {
            return;
        }
        if (!this.f.a(eps_0.b) && !this.f.a(eps_0.Y)) {
            return;
        }
        if (this.f.p()) {
            this.m = 1;
            return;
        }
        this.F = this.aM();
        this.aN();
        this.aF();
    }

    private boolean aM() {
        if (this.c != null && ((efh_0)this.c).a(eff_0.G)) {
            return false;
        }
        if (this.k() == null) {
            return true;
        }
        return ((efi_0)this.k()).G_() != 12 && ((efi_0)this.k()).G_() != 11;
    }

    private void aN() {
        this.aE();
        if (this.c != null) {
            short s2 = this.aZ();
            switch (((efh_0)this.c).F()) {
                case 1: {
                    this.m = ((efh_0)this.c).a(0, s2, eFb.a);
                    break;
                }
                case 2: {
                    this.m = ((efh_0)this.c).a(0, s2, eFb.a);
                    this.x = ((efh_0)this.c).a(1, s2, eFb.a);
                    break;
                }
                case 3: {
                    this.m = ((efh_0)this.c).a(0, s2, eFb.a);
                    this.x = ((efh_0)this.c).a(1, s2, eFb.a);
                    this.w = eKg.a((byte)((efh_0)this.c).a(2, s2, eFb.a));
                    break;
                }
                default: {
                    a.error((Object)("Nombre de param\u00e9tres incorrect dans un HPLoss : " + ((efh_0)this.c).F() + ", effectId : " + ((efh_0)this.c).i()));
                }
            }
        }
        this.m = eiu_0.a(this.m, this.w, this.e, this.f);
    }

    public void aE() {
        this.m = 0;
        this.w = eKg.a;
        this.x = 3;
    }

    void aF() {
        boolean bl = this.c != null && ((efh_0)this.c).a(1L);
        boolean bl2 = this.c != null && ((efh_0)this.c).v();
        eKj eKj2 = new eKj(this.e, this.f, this.v, (efh_0)this.c);
        eKj2.c(this.D);
        eKj2.b(this.m);
        eKj2.a(this.x);
        eKj2.a(bl2);
        eKj2.b(bl);
        eKj2.c(this.f.a(eoz_1.i));
        eKj2.d(this.z);
        eKj2.e(this.A);
        eKj2.d(this.F);
        eKj2.b();
        this.a(eKj2.c());
        this.m = eKj2.a();
        if (this.aQ()) {
            this.aP();
        }
    }

    private void aP() {
        rs_0 rs_02 = this.f.b(eps_0.Q);
        if (rs_02 == null) {
            return;
        }
        int n = rs_02.a();
        if (n > 0 && xc_0.a(100) <= n) {
            this.E = true;
            this.b((byte)7);
        }
    }

    private boolean aQ() {
        return this.D() && this.f != null && this.e != null && (this.c == null || !((efh_0)this.c).a(eff_0.b));
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    protected boolean aA() {
        return true;
    }

    @Override
    public void a(int n, float f2, boolean bl) {
        super.a(n, f2, bl);
        switch (n) {
            case 0: {
                if (!bl) {
                    this.m += xh_0.a((float)this.m * f2 / 100.0f);
                    break;
                }
                this.m = xh_0.a((float)this.m * f2 / 100.0f);
                break;
            }
            case 1: {
                if (bl) {
                    this.m = xh_0.a(f2);
                    break;
                }
                this.m = (int)((float)this.m + f2);
                break;
            }
            case 6: {
                this.A = xh_0.a(f2);
                break;
            }
            case 5: {
                this.z = xh_0.a(f2);
                break;
            }
        }
        this.m = Math.max(0, this.m);
    }

    @Override
    public int g(int n) {
        return this.D += n;
    }

    @Override
    protected boolean bq_() {
        return this.bi();
    }

    @Override
    public int a() {
        return this.B;
    }

    @Override
    public int b() {
        return this.C;
    }

    @Override
    public efa_0 br_() {
        return this.v;
    }

    @Override
    public void z() {
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = false;
        this.w = eKg.a;
        this.v = efa_0.a;
        this.x = 3;
        this.F = false;
        super.z();
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(this.B).f(this.C));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.B = iq_02.e();
            this.C = iq_02.x();
        }
    }

    @Override
    private void a(efa_0 efa_02) {
        if (efa_02 == null) {
            return;
        }
        switch (efa_02) {
            case a: {
                break;
            }
            case d: {
                this.c(8);
                break;
            }
            case b: {
                this.c(5);
                break;
            }
            case c: {
                this.c(6);
                break;
            }
            case e: {
                this.c(7);
                break;
            }
            case f: {
                this.c(9);
                break;
            }
            case g: {
                this.c(11);
            }
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

