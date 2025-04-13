/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGQ
 */
public final class egq_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Id de la charac", new eFu("Id de la charac", eFx.c)), new eFv("Ratio", new eFu("Id de la charac", eFx.c), new eFu("Ratio \u00e0 copier (defaut = 100%)", eFx.b)));
    private byte w = (byte)-1;
    private int x;

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().c(this.w).a(this.x));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.w = Hw.b((long)iq_02.i());
            this.x = iq_02.e();
        }
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    public egq_0() {
        this.M();
    }

    public egq_0 aD() {
        egq_0 egq_02 = new egq_0();
        egq_02.w = this.w;
        egq_02.x = this.x;
        return egq_02;
    }

    @Override
    public void j(sd_0 sd_02) {
    }

    @Override
    public void Y() {
        eps_0 eps_02;
        if (!this.D()) {
            return;
        }
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).F() >= 1) {
            this.w = (byte)((efh_0)this.c).a(0, this.aZ(), eFb.a);
        }
        int n = 100;
        if (((efh_0)this.c).F() >= 2) {
            n = ((efh_0)this.c).a(1, this.aZ(), eFb.a);
        }
        if ((eps_02 = eps_0.a(this.w)) == null) {
            a.error((Object)("Charac parametree inconnue " + this.w));
            return;
        }
        if (!this.e.a(eps_02) || !this.f.a(eps_02)) {
            return;
        }
        int n2 = this.e.b(eps_02).c();
        this.x = n2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : xh_0.a((float)(n2 * n) / 100.0f);
        this.m = xh_0.a((float)(this.e.c(eps_02) * n) / 100.0f);
        super.Y();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.e == null || this.f == null) {
            this.ba();
            return;
        }
        eps_0 eps_02 = eps_0.a(this.w);
        if (eps_02 == null) {
            a.error((Object)("Charac parametree inconnue " + this.w));
            this.ba();
            return;
        }
        if (!this.e.a(eps_02) || !this.f.a(eps_02)) {
            this.ba();
            return;
        }
        this.f.b(eps_02).g(this.x);
        this.f.b(eps_02).b(this.m);
    }

    @Override
    public boolean Q() {
        return true;
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
        this.w = (byte)-1;
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

