/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGW
 */
public final class egw_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Drop basique", new eFu[0]), new eFv("Drop am\u00e9lior\u00e9", new eFu("Drop Am\u00e9lior\u00e9 (1 = oui, 0 = non (defaut)", eFx.c)));
    private boolean w;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public egw_0() {
        this.M();
    }

    public egw_0 aD() {
        egw_0 egw_02 = new egw_0();
        return egw_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        this.w = ((efh_0)this.c).F() >= 1 && ((efh_0)this.c).a(0, this.aZ(), eFb.a) == 1;
        epq_2 epq_22 = (epq_2)this.f;
        epq_2 epq_23 = epq_22.gj();
        if (epq_23 == null) {
            return;
        }
        this.f = epq_23;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (!this.D()) {
            return;
        }
        if (!(this.d instanceof ekp_0)) {
            this.ba();
            return;
        }
        if (!(this.f instanceof epq_2)) {
            this.ba();
            return;
        }
        sq_0 sq_02 = (sq_0)((Object)this.d);
        if (!(this.h instanceof efq_0)) {
            this.ba();
            return;
        }
        Su su = sq_02.v();
        if (!(su instanceof eZj)) {
            this.ba();
            return;
        }
        epq_2 epq_22 = (epq_2)this.f;
        epq_2 epq_23 = epq_22.gj();
        if (epq_23 == null) {
            this.ba();
            return;
        }
        if (epq_23 instanceof ezm_0) {
            ((efq_0)this.h).l().a((eZj)((Object)su), (ezm_0)((Object)epq_23), true, this.w);
        }
        this.m = 3920;
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
        this.w = false;
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

