/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJz
 */
public class ejz_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Mise \u00e0 jour du modificateur final", new eFu("Valeur", eFx.b)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ejz_0 aD() {
        ejz_0 ejz_02 = new ejz_0();
        return ejz_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (!(sd_02 instanceof eKf)) {
            return;
        }
        if (!this.D()) {
            return;
        }
        eKf eKf2 = (eKf)((Object)sd_02);
        eKf2.g(this.m);
    }

    @Override
    public void j(sd_0 sd_02) {
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
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
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

