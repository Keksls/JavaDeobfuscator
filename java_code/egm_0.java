/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGM
 */
public final class egm_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Min de la Charac = valeur", new eFu("valeur", eFx.b)), new eFv("Min de la Charac = valeur. valeur en % du max", new eFu("valeur", eFx.b), new eFu("valeur en % du max de la charac de la cible (0 = non, 1 = oui)", eFx.c)));
    private boolean w;
    private eps_0 x;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public egm_0(eps_0 eps_02) {
        this.x = eps_02;
        this.M();
    }

    private egm_0() {
    }

    public egm_0 aD() {
        egm_0 egm_02 = new egm_0();
        egm_02.x = this.x;
        return egm_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        this.w = false;
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).F() >= 1) {
            this.m = ((efh_0)this.c).a(0, s2, eFb.a);
        }
        if (((efh_0)this.c).F() >= 2) {
            boolean bl = this.w = ((efh_0)this.c).a(1, s2, eFb.a) == 1;
        }
        if (this.w) {
            rs_0 rs_02 = this.f.b(this.x);
            this.m = Hw.d((float)(rs_02.c() * this.m) / 100.0f);
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null || !this.f.a(this.x)) {
            this.ba();
            return;
        }
        rs_0 rs_02 = this.f.b(this.x);
        int n = rs_02.e();
        if (this.D()) {
            rs_02.h(this.m);
            this.m = rs_02.e() - n;
        } else {
            rs_02.h(rs_02.e() + this.m);
        }
    }

    @Override
    public void al() {
        if (this.f == null || !this.f.a(this.x)) {
            return;
        }
        rs_0 rs_02 = this.f.b(this.x);
        rs_02.h(rs_02.e() - this.m);
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
        this.x = null;
        this.w = false;
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

