/*
 * Decompiled with CFR 0.152.
 */
public class cUu
extends cSS {
    @Override
    public cSY n() {
        return cSY.B;
    }

    @Override
    public cSS v() {
        return new cUu();
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        bFZ bFZ2 = (bFZ)this.l;
        bFZ2.a(Tv.D, azu_0.j().k());
        cdw_0.n().c(600044L);
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
        return bgf_12.m() == bmr_12.a_() || cSW.a(bgf_12.m());
    }

    @Override
    public String r() {
        return "rotate";
    }

    @Override
    protected int t() {
        return cUL.at.aH;
    }
}

