/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHP
 */
public final class ehp_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Params", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ehp_0() {
        this.M();
    }

    public ehp_0 aD() {
        ehp_0 ehp_02 = new ehp_0();
        return ehp_02;
    }

    @Override
    public void j(sd_0 sd_02) {
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.aE()) {
            this.ba();
            return;
        }
        this.h.e().g((ti_0)((Object)this.f));
    }

    private boolean aE() {
        return this.f == null || this.h == null || this.h.e() == null || !(this.f instanceof ti_0);
    }

    @Override
    public void al() {
        if (this.aE()) {
            return;
        }
        if (!this.P) {
            return;
        }
        this.h.e().f((ti_0)((Object)this.f));
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

