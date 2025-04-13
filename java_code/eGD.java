/*
 * Decompiled with CFR 0.152.
 */
public class eGD
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("En fonction du caster", new eFu("Valeur en %", eFx.b), new eFu("Augmente la valeur courante (0 non 1 oui)", eFx.c), new eFu("Diminue \u00e0 la d\u00e9sapplication (0 g\u00e9n\u00e9ralement. Si vous h\u00e9sitez, demandez ! Bug \u00e0 l'horizon)", eFx.c)));
    private eps_0 w;
    private boolean x = true;
    private boolean y = true;
    private int z = 0;

    @Override
    public aqr_2 c_() {
        return v;
    }

    private eGD() {
        this.M();
    }

    public eGD(eps_0 eps_02) {
        this.w = eps_02;
        this.M();
    }

    public eGD aD() {
        eGD eGD2 = new eGD();
        eGD2.w = this.w;
        return eGD2;
    }

    @Override
    public void M() {
        super.M();
        this.c(3);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null || !this.f.a(this.w)) {
            this.j(true);
            return;
        }
        if (this.f != null && this.f.a(this.w)) {
            rs_0 rs_02 = this.f.b(this.w);
            int n = rs_02.d();
            int n2 = rs_02.c();
            rs_02.e(this.m);
            if (this.D()) {
                this.m = rs_02.d() - n;
                this.z = rs_02.c() - n2;
            }
            if (this.x) {
                rs_02.c(this.z);
                this.P = true;
            }
        } else {
            this.j(true);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        short s2 = this.aZ();
        int n = ((efh_0)this.c).a(0, s2, eFb.a);
        this.x = ((efh_0)this.c).a(1, s2, eFb.a) != 0;
        boolean bl = this.y = ((efh_0)this.c).a(2, s2, eFb.a) != 0;
        if (this.e != null && this.e.a(this.w)) {
            this.m = n * this.e.b(this.w).c() / 100;
        }
    }

    @Override
    public void al() {
        if (this.P && this.f != null && this.f.a(this.w)) {
            rs_0 rs_02 = this.f.b(this.w);
            if (rs_02.a() > 0) {
                rs_02.d(this.z > rs_02.a() ? rs_02.a() - 1 : this.z);
            }
            rs_02.e(-this.m);
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
        return false;
    }

    @Override
    public void z() {
        super.z();
        this.z = 0;
        this.x = true;
        this.y = true;
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().d(this.x).e(this.y).a(this.z));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.x = iq_02.O();
            this.y = iq_02.Q();
            this.z = iq_02.e();
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

