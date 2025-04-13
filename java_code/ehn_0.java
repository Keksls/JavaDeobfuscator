/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHN
 */
public class ehn_0
extends ejh_0 {
    private static final aqr_2 w = new eFw(new eFv("Pas de params", new eFu[0]));
    protected int v;

    @Override
    public aqr_2 c_() {
        return w;
    }

    public ehn_0() {
    }

    public ehn_0(int n) {
        this.v = n;
        this.M();
    }

    public ehn_0 aD() {
        ehn_0 ehn_02 = new ehn_0();
        ehn_02.v = this.v;
        return ehn_02;
    }

    @Override
    public void j(sd_0 sd_02) {
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null || this.f.x_() == null) {
            this.ba();
            return;
        }
        ((eJL)this.f.x_()).a(this.v, true, true);
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
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

