/*
 * Decompiled with CFR 0.152.
 */
public class cUp
extends cSS {
    @Override
    public cSY n() {
        return cSY.z;
    }

    @Override
    public cSS v() {
        return new cUp();
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        azu_0.j().k().a(false, true);
        if (this.l instanceof bFZ) {
            bFZ bFZ2 = (bFZ)this.l;
            ((pj_0)bFZ2).a(Tv.x, azu_0.j().k());
        } else {
            b.error((Object)("Cannot REPACK a non-itemizable element of type " + this.getClass().getName()));
        }
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.cW() || bmr_12.ak() || bvz_2.a.a()) {
            return false;
        }
        if (!(this.l instanceof bFZ)) {
            return false;
        }
        bgf_1 bgf_12 = ((bFZ)this.l).aH_();
        if (bgf_12.m() != bmr_12.a_() && !cSW.a(bgf_12.m())) {
            return false;
        }
        this.c(bgf_12.n());
        return true;
    }

    @Override
    public String r() {
        bgf_1 bgf_12 = this.a();
        if (bgf_12 != null && bgf_12.aM_()) {
            return "remove";
        }
        if (this.d()) {
            return "repack";
        }
        return "repack.impossible";
    }

    private bgf_1 a() {
        if (this.l instanceof bgf_1) {
            return (bap_2)this.l;
        }
        if (this.l instanceof bFZ) {
            return ((bFZ)this.l).aG_();
        }
        return null;
    }

    @Override
    protected int t() {
        return cUL.G.aH;
    }
}

