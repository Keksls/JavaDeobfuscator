/*
 * Decompiled with CFR 0.152.
 */
public class eIS
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Renvoi de sort (complet)", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eIS aD() {
        eIS eIS2 = new eIS();
        return eIS2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (sd_02 != null && bl) {
            if (sd_02.h() != null && !sd_02.h().a(erl_2.F)) {
                Su su = sd_02.h();
                sd_02.a(su.G(), su.H(), su.I());
            } else {
                this.j(true);
            }
        } else if (this.D()) {
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

