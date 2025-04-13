/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIG
 */
public class eig_0
extends ejh_0 {
    private static final aqr_2 B = new eFw(new eFv("Standard", new eFu("area ID", eFx.a)), new eFv("Niveau de la zone", new eFu("area ID", eFx.a), new eFu("area Level", eFx.b)), new eFv("Dur\u00e9e de la zone apr\u00e8s la fin de cet effet", new eFu("area ID", eFx.a), new eFu("area Level", eFx.c), new eFu("L'area reste apres la fin de cet effet (1 = Oui, 0 = Non (default))", eFx.c)), new eFv("Direction de la zone", new eFu("area ID", eFx.a), new eFu("area Level", eFx.c), new eFu("L'area reste apres la fin de cet effet (1 = Oui, 0 = Non (default))", eFx.c), new eFu("area Direction (default = caster if he exists else 7)", eFx.b)));
    protected ekk_0 v;
    protected long w;
    protected short x;
    protected boolean y = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = true;
    protected aej_2 z;
    static final int A = 15;

    public eig_0() {
        this.M();
    }

    public eig_0(boolean bl, boolean bl2, boolean bl3) {
        this.C = bl;
        this.D = bl2;
        this.E = bl3;
    }

    public static eig_0 a(So<efh_0> so, aff_1 aff_12, int n) {
        eig_0 eig_02 = new eig_0();
        eig_02.i = efc_0.du.a();
        eig_02.l = ((ejh_0)efc_0.du.b()).e();
        eig_02.M();
        eig_02.g.g(aff_12);
        eig_02.m = n;
        eig_02.w = so.f().a((byte)2);
        eig_02.n = -1;
        eig_02.x = (short)-1;
        eig_02.h = so;
        return eig_02;
    }

    @Override
    public void z() {
        super.z();
        this.y = false;
        this.v = null;
        this.z = null;
    }

    public eig_0 aD() {
        return new eig_0();
    }

    public eig_0 aE() {
        eig_0 eig_02 = this.aD();
        eig_02.w = this.w;
        eig_02.v = this.v;
        eig_02.y = this.y;
        eig_02.C = this.C;
        eig_02.D = this.D;
        eig_02.E = this.E;
        eig_02.x = this.x;
        return eig_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        ekk_0 ekk_02 = elg_0.a().i(this.m);
        if (ekk_02 != null && this.g != null) {
            this.a(ekk_02);
            if (this.h == null || this.h.g() == null) {
                a.warn((Object)"Impossible d'ajouter une zone d'effet au combat le contexte est null ou l'effectAreaManager est null");
                return;
            }
            this.c(sd_02, bl);
            this.v.af();
            this.h.g().a(this.v);
        } else {
            a.error((Object)("Impossible d'ajouter une zone inconnue " + this.m));
            this.j(true);
        }
    }

    @Override
    protected void a(ekk_0 ekk_02) {
        aej_2 aej_22 = this.z != null ? this.z : (this.e != null ? this.e.F() : aej_2.h);
        this.v = ekk_02.b(new elb_0(this.w, this.g.d(), this.g.e(), this.g.f(), this.h, this.aF() != null ? this.aF().a_() : 0L, this.aF(), this.x, aej_22));
        this.v.d(!this.y);
        if (this.as() && !this.y) {
            this.v.a(this);
        }
    }

    protected Su aF() {
        return this.e;
    }

    public void d(boolean bl) {
        this.C = bl;
    }

    @Override
    public boolean Q() {
        return this.C;
    }

    @Override
    public boolean R() {
        return this.D;
    }

    @Override
    public boolean S() {
        return this.E;
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        if (this.c != null) {
            this.m = ((efh_0)this.c).a(0, s2, eFb.a);
        }
        this.w = this.h.f().a((byte)2);
        this.b(s2);
        if (((efh_0)this.c).F() >= 3) {
            boolean bl = this.y = ((efh_0)this.c).a(2, s2, eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 4) {
            this.z = aej_2.a(((efh_0)this.c).a(3, s2, eFb.a));
        }
    }

    private void b(short s2) {
        this.x = ((efh_0)this.c).F() >= 2 ? (short)((efh_0)this.c).a(1, s2, eFb.a) : this.aZ();
    }

    @Override
    public void al() {
        if (this.v != null && !this.y && this.as()) {
            this.h.g().b(this.v);
        }
        super.al();
    }

    @Override
    public aqr_2 c_() {
        return B;
    }

    public void e(boolean bl) {
        this.y = bl;
    }

    @Override
    public void a(short s2) {
        this.x = s2;
    }

    public ekk_0 aG() {
        return this.v;
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().b(this.w).d(this.x).a(this.y).e(this.z != null ? this.z.a() : -1));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.w = iq_02.B();
            this.x = Hw.c((long)iq_02.m());
            this.y = iq_02.t();
            this.z = iq_02.r() == -1 ? null : aej_2.a(iq_02.r());
        }
    }

    public static sr_0<efh_0, elb_0> a(efh_0 efh_02, efi_0 efi_02) {
        short s2 = efi_02.c();
        int n = efh_02.a(0, s2, eFb.a);
        return elg_0.a().i(n);
    }

    @Override
    public void a(aej_2 aej_22) {
        this.z = aej_22;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aE();
    }
}

