/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGL
 */
public abstract class egl_0
extends ejh_0 {
    private static final aqr_2 w = new eFw(new eFv("Ajout/Retrait au max de la caracteristique", new eFu("Id de la caracteristique", eFx.c), new eFu("Modification de la valeur", eFx.b)));
    protected ru_0 v;

    @Override
    public aqr_2 c_() {
        return w;
    }

    protected egl_0() {
    }

    protected egl_0(ru_0 ru_02) {
        this.v = ru_02;
        this.M();
    }

    public ru_0 aE() {
        return this.v;
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).F() < 2) {
            this.j(true);
            return;
        }
        this.m = ((efh_0)this.c).a(1, s2, eFb.a);
        int n = ((efh_0)this.c).a(0, s2, eFb.a);
        if (n != -1 || this.v == null) {
            eps_0 eps_02 = eps_0.a((byte)n);
            if (eps_02 == null) {
                a.error((Object)("Param\u00e9trage foireux d'un effet de modification du max d'une caracteristique " + ((efh_0)this.c).i()));
            } else {
                this.v = eps_02;
            }
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null) {
            this.ba();
            return;
        }
        rs_0 rs_02 = this.aD();
        if (rs_02 == null) {
            this.j(true);
            return;
        }
        this.a(rs_02);
    }

    @Override
    public void al() {
        if (this.f == null) {
            return;
        }
        rs_0 rs_02 = this.aD();
        if (rs_02 == null) {
            return;
        }
        this.b(rs_02);
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
    public void z() {
        this.v = null;
        super.z();
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().c(this.v != null ? (int)this.v.a() : -1));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            this.v = eps_0.a(Hw.b((long)iO2.r().i()));
        }
    }

    @Override
    abstract void a(rs_0 var1);

    abstract void b(rs_0 var1);

    private rs_0 aD() {
        rs_0 rs_02 = null;
        switch (this.v.b()) {
            case 0: {
                rs_02 = this.f.b(this.v);
                break;
            }
            default: {
                a.warn((Object)("On veut appliquer une modification du max de charac sur autre chose qu'une fighterCharac " + this.v));
            }
        }
        return rs_02;
    }
}

