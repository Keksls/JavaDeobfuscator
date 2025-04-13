/*
 * Decompiled with CFR 0.152.
 */
public final class eGu
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Params", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eGu() {
        this.M();
    }

    public eGu aD() {
        eGu eGu2 = new eGu();
        return eGu2;
    }

    @Override
    public void j(sd_0 sd_02) {
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null) {
            this.ba();
            return;
        }
        if (!(this.f instanceof sr_0)) {
            this.ba();
            return;
        }
        sr_0 sr_02 = (sr_0)this.f;
        sr_02.a(this.g);
        sr_02.af();
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
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

