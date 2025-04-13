/*
 * Decompiled with CFR 0.152.
 */
public class eJA
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("modifie la cible de l'effet d\u00e9clench\u00e9 par le caster", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eJA aD() {
        eJA eJA2 = new eJA();
        return eJA2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (sd_02 != null && bl && this.e != null) {
            sd_02.b(this.e);
        }
        this.j(true);
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        if (this.c != null) {
            // empty if block
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
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

