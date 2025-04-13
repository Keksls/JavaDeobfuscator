/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJy
 */
public final class ejy_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Default", new eFu("Valeur", eFx.b)), new eFv("Modif valeur courante", new eFu("Valeur en %", eFx.b), new eFu("Modifie la valeur courante (0 non 1 oui (defaut))", eFx.c), new eFu("Diminue \u00e0 la d\u00e9sapplication (0 g\u00e9n\u00e9ralement. Si vous h\u00e9sitez, demandez ! Bug \u00e0 l'horizon)", eFx.c)));
    private ru_0 w;
    private boolean x = true;
    private boolean y = false;

    @Override
    public aqr_2 c_() {
        return v;
    }

    private ejy_0() {
        this.M();
    }

    public ejy_0(ru_0 ru_02) {
        this.w = ru_02;
        this.M();
    }

    public ejy_0 aD() {
        ejy_0 ejy_02 = new ejy_0();
        ejy_02.w = this.w;
        return ejy_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        this.m = 0;
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        if (((efh_0)this.c).F() >= 3) {
            this.x = ((efh_0)this.c).a(1, this.aZ(), eFb.a) == 1;
            this.y = ((efh_0)this.c).a(2, this.aZ(), eFb.a) == 1;
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null) {
            this.ba();
            return;
        }
        rs_0 rs_02 = this.f.b(this.w);
        if (rs_02 == null) {
            this.ba();
            return;
        }
        int n = rs_02.c();
        this.m = rs_02.a(this.m);
        int n2 = rs_02.c() - n;
        if (this.x) {
            int n3 = n2;
            if (rs_02.p() == eps_0.b) {
                n3 = -n2 > rs_02.a() ? -(rs_02.a() - 1) : n2;
            }
            rs_02.c(n3);
        }
    }

    @Override
    public void al() {
        super.al();
        if (this.f == null) {
            return;
        }
        rs_0 rs_02 = this.f.b(this.w);
        if (rs_02 == null) {
            return;
        }
        if (!this.P) {
            return;
        }
        int n = rs_02.c();
        rs_02.a(-this.m);
        if (!this.y) {
            return;
        }
        int n2 = rs_02.c() - n;
        if (rs_02.a() <= 0) {
            return;
        }
        int n3 = n2;
        if (rs_02.p() == eps_0.b) {
            n3 = n2 > rs_02.a() ? rs_02.a() - 1 : n2;
        }
        rs_02.d(n3);
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
        this.x = true;
        this.y = false;
        super.z();
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().h(this.y).h(this.x).aj());
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.y = iq_02.U();
            this.x = iq_02.W();
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

