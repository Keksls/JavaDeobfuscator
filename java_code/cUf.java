/*
 * Decompiled with CFR 0.152.
 */
public class cUf
extends cSS {
    @Override
    public cSY n() {
        return cSY.A;
    }

    @Override
    public cSS v() {
        return new cUf();
    }

    private static boolean a() {
        bmr_1 bmr_12 = azu_0.j().k();
        return bmr_12.di() == bmr_12.dj();
    }

    private czu_0 b() {
        if (cUf.a()) {
            return cxm_0.a();
        }
        return czb_0.a();
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        azu_0.j().k().a(false, true);
        czu_0 czu_02 = this.b();
        bFZ bFZ2 = (bFZ)this.l;
        bgf_1 bgf_12 = bFZ2.aG_();
        czu_02.a(bgf_12);
        czu_02.b(new cUg(this, bgf_12));
        czu_02.a(new cUh(this, bgf_12));
        czu_02.c(() -> {});
        czu_02.a(cZV.b);
        azu_0.j().a(czu_02);
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
        return "move";
    }

    @Override
    protected int t() {
        return cUL.l.aH;
    }
}

