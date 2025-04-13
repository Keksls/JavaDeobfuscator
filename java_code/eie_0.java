/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIE
 */
public class eie_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Set de Charac = valeur du caster", new eFu[0]), new eFv("Set de Charac = valeur. Max non sett\u00e9", new eFu("valeur", eFx.b)), new eFv("Set de Charac = valeur. Max settable", new eFu("valeur", eFx.b), new eFu("set max (0 = non, 1 = oui)", eFx.c)), new eFv("Set de Charac = valeur. Max settable + valeur en % du max", new eFu("valeur", eFx.b), new eFu("set max (0 = non, 1 = oui)", eFx.c), new eFu("valeur en % du max de la charac de la cible (0 = non, 1 = oui)", eFx.c)));
    private boolean w;
    private boolean x;
    private boolean y;
    private ru_0 z;

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(this.w).b(this.x));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.w = iq_02.t();
            this.x = iq_02.v();
        }
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    private eie_0() {
    }

    public eie_0(ru_0 ru_02) {
        this.z = ru_02;
        this.M();
    }

    public eie_0 aD() {
        eie_0 eie_02 = new eie_0();
        eie_02.z = this.z;
        return eie_02;
    }

    public ru_0 aE() {
        return this.z;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.D() && this.y && this.e != null && this.e.a(this.z)) {
            this.m = this.e.c(this.z);
        }
        switch (this.z.b()) {
            case 0: {
                if (this.f == null || !this.f.a(this.z)) break;
                rs_0 rs_02 = this.f.b(this.z);
                if (this.w) {
                    rs_02.g(this.m);
                }
                rs_02.b(this.m);
                break;
            }
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        this.y = true;
        this.w = false;
        this.x = false;
        if (this.c == null || ((efh_0)this.c).F() == 0) {
            return;
        }
        this.y = false;
        if (((efh_0)this.c).F() >= 1) {
            this.m = ((efh_0)this.c).a(0, s2, eFb.a);
        }
        if (((efh_0)this.c).F() >= 2) {
            boolean bl = this.w = ((efh_0)this.c).a(1, s2, eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 3) {
            boolean bl = this.x = ((efh_0)this.c).a(2, s2, eFb.a) == 1;
        }
        if (this.x) {
            rs_0 rs_02 = this.f.b(this.z);
            this.m = xh_0.a((float)(rs_02.c() * this.m) / 100.0f);
        }
    }

    @Override
    public void M() {
        super.M();
        if (this.z.b() == 0 && this.z == eps_0.J) {
            this.c(2140);
        }
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
    public void al() {
        super.al();
    }

    @Override
    public void z() {
        this.w = false;
        this.x = false;
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

