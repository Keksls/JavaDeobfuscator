/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGC
 */
public final class egc_0
extends ejh_0 {
    private static final aqr_2 w = new eFw(new eFv("Default", new eFu[0]), new eFv("Ratio de la valeur transmise", new eFu("Ratio (default 100%) (-2 pour recalculer les d\u00e9g\u00e2ts sur la nouvelle cible)", eFx.b)), new eFv("Transmission (target/caster)", new eFu("Ratio (default 100%) (-2 pour recalculer les d\u00e9g\u00e2ts sur la nouvelle cible)", eFx.b), new eFu("Transmis \u00e0 la cible de cet effet (oui = 1, defaut = transmis au caster)", eFx.c)));
    public static final int v = -2;
    private boolean x;

    @Override
    public aqr_2 c_() {
        return w;
    }

    public egc_0() {
        this.M();
    }

    public egc_0 aD() {
        egc_0 egc_02 = new egc_0();
        egc_02.x = this.x;
        return egc_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        this.m = -1;
        this.x = false;
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).F() >= 1) {
            this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        }
        if (((efh_0)this.c).F() >= 2) {
            this.x = ((efh_0)this.c).a(1, this.aZ(), eFb.a) == 1;
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (!this.D()) {
            return;
        }
        sd_0 sd_03 = this.m(sd_02);
        if (sd_03 == null) {
            return;
        }
        if (this.x) {
            sd_03.b(this.f);
        } else {
            sd_03.b(this.e);
        }
        if (this.m > 0) {
            sd_03.a(0, (float)this.m, true);
        } else if (this.m == -2) {
            sd_03.h(null);
        }
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
        this.x = false;
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

