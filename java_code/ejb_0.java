/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJB
 */
public class ejb_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("modifie la valeur de l'effet d\u00e9clencheur", new eFu("PERCENT = 0 (% de l'ancienne valeur), VALUE = 1 (valeur sp\u00e9cifi\u00e9e)", eFx.c), new eFu("Valeur", eFx.b), new eFu("ADD = 0 (ajout\u00e9 \u00e0 l'ancienne), REPLACE = 1 (remplace l'ancienne)", eFx.c)));
    private int w = -1;
    private boolean x = false;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ejb_0 aD() {
        ejb_0 ejb_02 = new ejb_0();
        return ejb_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (sd_02 != null && this.w >= 0) {
            sd_02.a(this.w, (float)this.m, this.x);
        }
        this.j(true);
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c != null) {
            short s2 = this.aZ();
            this.w = ((efh_0)this.c).a(0, s2, eFb.a);
            this.m = ((efh_0)this.c).a(1, s2, eFb.a);
            this.x = ((efh_0)this.c).a(2, s2, eFb.a) != 0;
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
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

