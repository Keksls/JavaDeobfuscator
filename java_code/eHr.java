/*
 * Decompiled with CFR 0.152.
 */
public final class eHr
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Pas de param", new eFu[0]));
    private boolean w;

    public static eHr aD() {
        return new eHr();
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    @Override
    public sd_0<efh_0, efi_0> x() {
        eHr eHr2 = new eHr();
        return eHr2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null) {
            return;
        }
        this.c(sd_02, bl);
        if (this.f instanceof epq_2) {
            ((epq_2)this.f).hD();
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
    public void j(sd_0 sd_02) {
    }
}

