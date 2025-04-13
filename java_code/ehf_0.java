/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHf
 */
public final class ehf_0
extends eHs {
    private static final aqr_2 x = new eFw(new eFv("Distance a parcourir", new eFu("valeur", eFx.b)));

    @Override
    public aqr_2 c_() {
        return x;
    }

    public ehf_0 aD() {
        return new ehf_0();
    }

    @Override
    public void M() {
        super.M();
        this.c(194);
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
        return this.e != null && this.g != null && !this.aM() && !this.aN() && !this.aR() && !this.aP();
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
        return false;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

