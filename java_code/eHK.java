/*
 * Decompiled with CFR 0.152.
 */
public final class eHK
extends ehr_0 {
    private static final aqr_2 v = new eFw(new eFv("Retrait uniquement", new eFu("Zone a retirer (-1 pour tout retirer)", eFx.b)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eHK() {
        this.M();
    }

    public eHK aD() {
        return new eHK();
    }

    @Override
    protected boolean a(sr_0 sr_02) {
        return !sr_02.ab() || super.a(sr_02);
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
    public /* synthetic */ ehr_0 aE() {
        return this.aD();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

