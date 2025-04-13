/*
 * Decompiled with CFR 0.152.
 */
public class eHD
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Pas de param", new eFu[0]), new eFv("% PV restor\u00e9", new eFu("%", eFx.b)), new eFv("Uniquement si le controlleur original est encore en jeu", new eFu("%", eFx.b), new eFu("controleur encore en jeu (1 = oui, 0 == non (defaut))", eFx.b)), new eFv("Restore aussi les pvs virtuels", new eFu("%", eFx.b), new eFu("controleur encore en jeu (1 = oui, 0 == non (defaut))", eFx.c), new eFu("restore aussi les pvs virtuels (1 = oui, 0 == non (defaut))", eFx.c)), new eFv("Met les PA et PM au max", new eFu("%", eFx.b), new eFu("controleur encore en jeu (1 = oui, 0 == non (defaut))", eFx.c), new eFu("restore aussi les pvs virtuels (1 = oui, 0 == non (defaut))", eFx.c), new eFu("PA/PM au max (1 = oui, 0 == non (defaut))", eFx.c)));
    private int w = 0;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;
    private int A = 0;
    private boolean B = false;

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(this.w).a(this.x).b(this.y));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.w = iq_02.e();
            this.x = iq_02.t();
            this.y = iq_02.v();
        }
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eHD() {
        this.M();
    }

    public eHD aD() {
        eHD eHD2 = new eHD();
        this.n = 1;
        eHD2.B = this.B;
        eHD2.A = this.A;
        return eHD2;
    }

    @Override
    public void M() {
        super.M();
        this.c(202);
        this.c(1);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        epq_2 epq_22;
        if (this.B && this.f instanceof epq_2 && (epq_22 = ((epq_2)this.f).ci()) != null && !epq_22.o()) {
            this.ba();
            return;
        }
        if (this.f != null && this.f.a(eps_0.b) && !this.f.a(eoz_1.am)) {
            this.aE();
        } else {
            this.j(true);
        }
    }

    void aE() {
        if (this.z && this.D()) {
            int n = this.f.b(eps_0.b).c();
            this.m = Math.max(1, xh_0.a((float)n / 100.0f * (float)this.A));
            if (this.f.a(eps_0.T)) {
                int n2 = this.f.b(eps_0.T).c();
                this.w = Math.max(1, xh_0.a((float)n2 / 100.0f * (float)this.A));
            }
        }
        this.f.b(eps_0.b).b(this.m);
        if (this.x && this.f.a(eps_0.T)) {
            this.f.b(eps_0.T).b(this.w);
        }
        if (this.f instanceof epq_2 && this.l() != null && ((efn_0)this.l()).f() != null && this.aF()) {
            ((epq_2)this.f).E(true);
        }
        if (this.y) {
            if (this.f.a(eps_0.c)) {
                this.f.b(eps_0.c).n();
            }
            if (this.f.a(eps_0.d)) {
                this.f.b(eps_0.d).n();
            }
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        this.B = false;
        this.A = 0;
        short s2 = this.aZ();
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).F() <= 0) {
            this.m = 1;
            return;
        }
        this.A = ((efh_0)this.c).a(0, s2, eFb.a);
        this.z = true;
        if (((efh_0)this.c).F() > 1) {
            boolean bl = this.B = ((efh_0)this.c).a(1, s2, eFb.a) == 1;
        }
        if (((efh_0)this.c).F() > 2) {
            boolean bl = this.x = ((efh_0)this.c).a(2, s2, eFb.a) == 1;
        }
        if (((efh_0)this.c).F() > 3) {
            this.y = ((efh_0)this.c).a(3, s2, eFb.a) == 1;
        }
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

    private boolean aF() {
        return ((efn_0)this.l()).f().e(1010);
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

