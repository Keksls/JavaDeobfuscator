/*
 * Decompiled with CFR 0.152.
 */
public final class eHc
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("PA et Pm a consommer", new eFu("PA a consommer (-1 = tout)", eFx.b), new eFu("PM a consommer (-1 = tout)", eFx.b)));
    private int w;
    private int x;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eHc() {
        this.M();
    }

    public eHc aD() {
        eHc eHc2 = new eHc();
        return eHc2;
    }

    @Override
    public void j(sd_0 sd_02) {
        int n;
        this.w = this.e.c(eps_0.c);
        this.x = this.e.c(eps_0.d);
        if (this.w == 0 && this.x == 0) {
            return;
        }
        int n2 = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        if (n2 >= 0) {
            this.w = Math.min(this.w, n2);
        }
        if ((n = ((efh_0)this.c).a(1, this.aZ(), eFb.a)) >= 0) {
            this.x = Math.min(this.x, n);
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        this.ba();
        if (this.e == null) {
            return;
        }
        efz_0 efz_02 = efz_0.a(this.h, new fiy((byte)this.w, (byte)this.x, 0), this.e);
        efz_02.a(this.e);
        efz_02.a(sf_0.c);
        efz_02.a(null, false);
    }

    @Override
    public boolean W() {
        return true;
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
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

