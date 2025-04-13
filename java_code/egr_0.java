/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGR
 */
public final class egr_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Copie de Charac entre cible et caster", new eFu("Id de la charac \u00e0 copier", eFx.c)), new eFv("La cible copie le max de la charac du caster", new eFu("Id de la charac \u00e0 copier", eFx.c), new eFu("1 pour cible copie caster, 0 sinon (defaut)", eFx.c)), new eFv("Ratio de la valeur a copier", new eFu("Id de la charac \u00e0 copier", eFx.c), new eFu("1 pour cible copie caster, 0 sinon (defaut)", eFx.c), new eFu("% \u00e0 copier, (defaut = 100)", eFx.c)));
    private rv_0 w;
    int x;
    private boolean y;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public egr_0() {
        this.M();
    }

    public egr_0 aD() {
        egr_0 egr_02 = new egr_0();
        return egr_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        this.m = -1;
        this.y = false;
        this.x = 100;
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        if (((efh_0)this.c).F() > 1) {
            boolean bl = this.y = ((efh_0)this.c).a(1, this.aZ(), eFb.a) == 1;
        }
        if (((efh_0)this.c).F() > 2) {
            this.x = ((efh_0)this.c).a(2, this.aZ(), eFb.a);
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        eps_0 eps_02 = eps_0.a((byte)this.m);
        if (eps_02 == null) {
            this.ba();
            a.error((Object)("Erreur de saisie, charac inexistante " + this.m));
            return;
        }
        epa_1 epa_12 = (epa_1)(this.y ? this.e.b(eps_02) : this.f.b(eps_02));
        epa_1 epa_13 = (epa_1)(this.y ? this.f.b(eps_02) : this.e.b(eps_02));
        if (epa_13 == null || epa_12 == null) {
            this.ba();
            return;
        }
        this.w = new egs_0(this, epa_13);
        epa_12.a(this.w);
        if (this.x == 100) {
            epa_13.c(epa_12);
        } else {
            epa_13.a(epa_12, this.x);
        }
    }

    @Override
    public void al() {
        rs_0 rs_02;
        if (!this.as()) {
            return;
        }
        eps_0 eps_02 = eps_0.a((byte)this.m);
        if (eps_02 == null) {
            return;
        }
        rs_0 rs_03 = rs_02 = this.y ? this.e.b(eps_02) : this.f.b(eps_02);
        if (rs_02 != null) {
            rs_02.b(this.w);
        }
        super.al();
    }

    @Override
    public boolean Q() {
        return true;
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
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(this.y).a(this.x));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.y = iq_02.t();
            this.x = iq_02.e();
        }
    }

    @Override
    public void z() {
        this.y = false;
        this.x = 100;
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

