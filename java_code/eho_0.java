/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHO
 */
public final class eho_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("D\u00e9faut", new eFu("Id de la propri\u00e9t\u00e9", eFx.b)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eho_0() {
        this.M();
    }

    @Override
    public sd_0<efh_0, efi_0> x() {
        eho_0 eho_02 = new eho_0();
        eho_02.m = this.m;
        return eho_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null) {
            this.j(true);
            return;
        }
        eoz_1 eoz_12 = eoz_1.a(this.m);
        if (eoz_12 == null) {
            this.j(true);
            return;
        }
        this.f.e(eoz_12);
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
    public void j(sd_0 sd_02) {
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
    }
}

