/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJx
 */
public class ejx_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("modifie le caster de l'effet d\u00e9clench\u00e9 par la cible (le porteur de cet effet)", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ejx_0 aD() {
        ejx_0 ejx_02 = new ejx_0();
        return ejx_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (sd_02 != null && bl && sd_02.i() != null) {
            sd_02.a(sd_02.i());
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

