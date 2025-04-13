/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bak
 */
public abstract class bak_0
extends aku_1 {
    private bwh_0 e;
    private final int f;

    protected bak_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3);
        this.f = n4;
    }

    private void s() {
        if (this.e == null) {
            this.e = bwj_1.a().a(this.f);
        }
    }

    public bwh_0 b() {
        this.s();
        return this.e;
    }

    public boolean n() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        this.s();
        if (bmr_12.cP() == null && this.e == null) {
            return false;
        }
        return bmr_12.cP() == this.e;
    }

    public bvx_2 o() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null) {
            return bmr_12.bz();
        }
        return null;
    }

    public blx_1 a(long l) {
        this.s();
        if (this.e != null) {
            return this.e.e(l);
        }
        return bmf_2.a().c(l);
    }

    public ss_0 p() {
        this.s();
        if (this.e == null) {
            return null;
        }
        return this.e.i();
    }

    public So q() {
        this.s();
        if (this.e != null) {
            return this.e.h();
        }
        return bgg_0.k();
    }

    @Override
    public final void a() {
        try {
            this.r();
        }
        catch (Exception exception) {
            a.error((Object)String.format("Erreur lors de l'ex\u00e9cution de la %s #%d", this.getClass().getSimpleName(), this.e()), (Throwable)exception);
        }
        finally {
            this.j();
        }
    }

    protected abstract void r();
}

