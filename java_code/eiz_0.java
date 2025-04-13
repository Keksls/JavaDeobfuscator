/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIz
 */
public class eiz_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Param standard (le level de l'aura = level du sort)", new eFu("id de l'aura", eFx.a)));
    private sr_0 w;
    private long x;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eiz_0 aD() {
        eiz_0 eiz_02 = new eiz_0();
        eiz_02.x = this.x;
        eiz_02.w = this.w;
        return eiz_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        ekc_0 ekc_02 = elg_0.a().d(this.m);
        if (ekc_02 != null && this.f != null && this.g != null) {
            short s2 = this.aZ();
            this.w = ekc_02.b(new elb_0(this.x, this.g.d(), this.g.e(), this.g.f(), this.h, this.f.a_(), this.f, s2, this.f.F()));
            this.c(sd_02, bl);
            if (this.h.g() != null) {
                this.h.g().a(this.w);
            }
        } else {
            this.j(true);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        if (this.c != null) {
            this.m = ((efh_0)this.c).a(0, s2, eFb.a);
        }
        this.x = this.h.f().a((byte)2);
    }

    @Override
    public void al() {
        if (this.w != null) {
            this.h.g().b(this.w);
        }
        super.al();
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
        return true;
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().b(this.x));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            this.x = iO2.r().B();
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

