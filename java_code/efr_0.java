/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eFR
 */
public class efr_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Ordre \u00e0 une cr\u00e9ature cibl\u00e9 sur une autre cr\u00e9ature", new eFu("Id", eFx.a)));
    private long w;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public efr_0() {
        this.M();
    }

    public efr_0 aC() {
        return new efr_0();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f != null && this.f instanceof epq_2 && this.m >= 0) {
            ((epq_2)this.f).b(this.m, this.f);
        }
    }

    @Override
    public void al() {
        if (this.f != null && this.f instanceof epq_2 && this.m >= 0) {
            ((epq_2)this.f).c(this.m, this.f);
        }
        super.al();
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        this.m = this.c != null ? ((efh_0)this.c).a(0, s2, eFb.a) : -1;
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
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(this.w));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            this.w = iO2.r().k();
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aC();
    }
}

