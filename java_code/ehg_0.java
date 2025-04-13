/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHg
 */
public final class ehg_0
extends eHs {
    private static final aqr_2 x = new eFw(new eFv("Se rapproche au maximum de la cible", new eFu[0]), new eFv("Rapproche le caster de la cible", new eFu("nombre de case d'\u00e9cart (0 possible)", eFx.b)));

    @Override
    public aqr_2 c_() {
        return x;
    }

    public ehg_0 aD() {
        return new ehg_0();
    }

    @Override
    public void M() {
        super.M();
        this.c(193);
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public boolean aE() {
        return this.e != null && this.g != null && !this.aM() && !this.aN() && !this.aS() && !this.aP();
    }

    @Override
    boolean aF() {
        return false;
    }

    @Override
    public eKm aG() {
        if (this.e instanceof eKm) {
            return (eKm)this.e;
        }
        return null;
    }

    @Override
    aff_1 aI() {
        return this.g;
    }

    @Override
    boolean aJ() {
        return true;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

