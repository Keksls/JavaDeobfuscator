/*
 * Decompiled with CFR 0.152.
 */
public abstract class ban
extends alc_1 {
    protected static final bwi_0 e = new bwi_0();
    private bwh_0 f;
    private final int g;

    public ban(int n, int n2, int n3, int n4) {
        super(n, n2, n3);
        this.g = n4;
    }

    private void u() {
        if (this.f == null) {
            this.f = bwj_1.a().a(this.g);
        }
    }

    public bwh_0 n() {
        this.u();
        return this.f;
    }

    protected int p() {
        return this.g;
    }

    public boolean r() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        this.u();
        if (bmr_12.cP() == null || this.f == null) {
            return false;
        }
        return bmr_12.cP() == this.f;
    }

    public blx_1 d(long l) {
        this.u();
        if (this.f != null) {
            return this.f.e(l);
        }
        return null;
    }

    public ss_0 s() {
        this.u();
        if (this.f == null) {
            a.error((Object)("combat non trouv\u00e9 : " + this.g));
            return null;
        }
        return this.f.i();
    }

    public So t() {
        this.u();
        if (this.f != null) {
            return this.f.h();
        }
        return bgg_0.k();
    }

    @Override
    protected void l() {
        blx_1 blx_12 = this.d(this.f());
        blx_1 blx_13 = this.d(this.h());
        bbI.a(blx_12, blx_13);
    }
}

