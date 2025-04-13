/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAX
 */
public class bax_1
extends bbb_2 {
    private bbb_1 v;
    private final fo_1 w = new bay_1(this, 22);

    bax_1() {
    }

    @Override
    public Tv ap_() {
        return this.v.v();
    }

    @Override
    public cSS[] az_() {
        return this.v.aI();
    }

    @Override
    public short aL() {
        return this.v.aL();
    }

    @Override
    public String al_() {
        return this.v.al_();
    }

    @Override
    public Tv[] r() {
        return this.v.r();
    }

    @Override
    public void ar_() {
        this.v.a(this.l);
        this.v.ar_();
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        return this.v.b(tv, tF);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.v.release();
        this.v = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        assert (this.v == null);
        this.v = (bbb_1)bFX.h.b().b();
    }

    @Override
    public void c(ph_0 ph_02) {
        this.v.c(ph_02);
    }

    @Override
    public void u() {
        super.u();
        this.ar_();
    }

    @Override
    protected fo_1 ad() {
        return this.w;
    }

    static /* synthetic */ aff_1 a(bax_1 bax_12) {
        return bax_12.e;
    }

    static /* synthetic */ String a(bax_1 bax_12, String string) {
        bax_12.l = string;
        return bax_12.l;
    }

    static /* synthetic */ void a(bax_1 bax_12, abm_1 abm_12) {
        bax_12.a(abm_12);
    }
}

