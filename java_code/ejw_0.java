/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJw
 */
public class ejw_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Pas de param", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ejw_0() {
        this.M();
    }

    public ejw_0 aD() {
        ejw_0 ejw_02 = new ejw_0();
        this.n = 1;
        return ejw_02;
    }

    @Override
    public void M() {
        super.M();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f != null) {
            this.f.c(eoz_1.s);
            this.f.c(eoz_1.m);
            this.c(sd_02, bl);
            this.f.b(eps_0.b).o();
            this.f.b(eps_0.l).g(0);
        } else {
            this.j(true);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
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
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

