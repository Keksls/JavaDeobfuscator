/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGa
 */
public final class ega_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Params", new eFu("Loot refId", eFx.b), new eFu("Quantit\u00e9", eFx.b)), new eFv("Params", new eFu("Loot refId", eFx.b), new eFu("Constante A (float) pour Quantit\u00e9 A^(lvl/B) ", eFx.b), new eFu("Constante B (int) pour Quantit\u00e9 A^(lvl/B) ", eFx.b)));
    private short w;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ega_0() {
        this.M();
    }

    public ega_0 aC() {
        ega_0 ega_02 = new ega_0();
        return ega_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        short s2 = this.aZ();
        this.m = ((efh_0)this.c).a(0, s2, eFb.a);
        if (((efh_0)this.c).F() == 2) {
            this.w = (short)((efh_0)this.c).a(1, s2, eFb.a);
        } else if (((efh_0)this.c).F() == 3) {
            float f2 = ((efh_0)this.c).a(1, s2);
            int n = ((efh_0)this.c).a(2, s2, eFb.a);
            this.w = (short)StrictMath.pow(f2, (float)s2 / (float)n);
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null || this.c == null) {
            this.ba();
            return;
        }
        if (!this.D()) {
            return;
        }
        Object r2 = eyo_1.g().d(this.m);
        if (r2 == null) {
            a.error((Object)("L'item a ajouter au loot n'existe pas " + this.m));
            this.ba();
            return;
        }
        if (!(this.f instanceof ezm_0) || !(this.f instanceof elw_0)) {
            this.ba();
            return;
        }
        elm_0 elm_02 = (elm_0)((elw_0)this.f).ck();
        elm_02.a((ezm_0)((Object)this.f), this.m, this.w);
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
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aC();
    }
}

