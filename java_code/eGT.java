/*
 * Decompiled with CFR 0.152.
 */
public class eGT
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Pas de param", new eFu[0]), new eFv("D\u00e9clenchement des triggers KO", new eFu("D\u00e9clenche les triggers KO (oui = 0 (defaut), non = 1)", eFx.c)));
    private boolean w;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eGT() {
        this.M();
        this.c(192);
    }

    public eGT aD() {
        eGT eGT2 = new eGT();
        this.n = 1;
        return eGT2;
    }

    @Override
    public void M() {
        super.M();
        this.c(192);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null) {
            this.j(true);
            return;
        }
        if (!this.f.a(eps_0.b)) {
            this.ba();
            return;
        }
        this.f.b(eps_0.b).o();
        if (this.w) {
            this.f.c(eoz_1.al);
        }
        if (this.f.a(eps_0.l)) {
            this.f.b(eps_0.l).g(0);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        this.w = false;
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).F() == 0) {
            return;
        }
        if (((efh_0)this.c).F() >= 1) {
            this.w = ((efh_0)this.c).a(0, this.aZ(), eFb.a) == 1;
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

    @Override
    public void z() {
        super.z();
        this.w = false;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

