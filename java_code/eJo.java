/*
 * Decompiled with CFR 0.152.
 */
public final class eJo
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Carac \u00e0 inverser", new eFu("Carac 1", eFx.c), new eFu("Carac 2", eFx.c)));
    private byte w;
    private byte x;
    private int y;
    private int z;

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().c(this.w).a(this.y).f(this.x).g(this.z));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.w = Hw.b((long)iq_02.i());
            this.y = iq_02.e();
            this.x = Hw.b((long)iq_02.x());
            this.z = iq_02.z();
        }
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eJo() {
        this.M();
    }

    public eJo aD() {
        eJo eJo2 = new eJo();
        return eJo2;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        this.w = (byte)((efh_0)this.c).a(0, this.aZ(), eFb.a);
        this.x = (byte)((efh_0)this.c).a(1, this.aZ(), eFb.a);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null) {
            this.ba();
            return;
        }
        eps_0 eps_02 = eps_0.a(this.w);
        eps_0 eps_03 = eps_0.a(this.x);
        if (eps_02 == null || eps_03 == null) {
            a.error((Object)"Impossible d'executer l'effet, l'une des carac est inconnue");
            this.ba();
            return;
        }
        rs_0 rs_02 = this.f.b(eps_02);
        rs_0 rs_03 = this.f.b(eps_03);
        if (rs_02 == null || rs_03 == null) {
            a.warn((Object)"Impossible d'executer l'effet, l'une des carac est inconnue");
            this.ba();
            return;
        }
        if (this.D()) {
            this.y = rs_02.a();
            this.z = rs_03.a();
        }
        rs_02.d(this.y);
        rs_02.c(this.z);
        rs_03.d(this.z);
        rs_03.c(this.y);
    }

    @Override
    public void al() {
        eps_0 eps_02 = eps_0.a(this.w);
        eps_0 eps_03 = eps_0.a(this.x);
        if (eps_02 == null || eps_03 == null) {
            return;
        }
        rs_0 rs_02 = this.f.b(eps_02);
        rs_0 rs_03 = this.f.b(eps_03);
        if (rs_02 == null || rs_03 == null) {
            return;
        }
        rs_02.d(this.z);
        rs_02.c(this.y);
        rs_03.d(this.y);
        rs_03.c(this.z);
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
        super.z();
        this.w = (byte)-1;
        this.x = (byte)-2;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

