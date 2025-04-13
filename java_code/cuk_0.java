/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUk
 */
public class cuk_0
extends cSS
implements afy_0 {
    @Override
    public cSY n() {
        return cSY.N;
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        bmv_1 bmv_12 = (bmv_1)this.l;
        bMn bMn2 = bmv_12.cB();
        if (bMn2 != null) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (!bmr_12.a(false, true)) {
                return;
            }
            fis_1.a().a("voteList", true);
            azu_0.j().a(ddH.a());
        }
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.ak()) {
            return false;
        }
        if (bvz_2.a.a()) {
            return false;
        }
        if (!(this.l instanceof bmv_1)) {
            return false;
        }
        bMn bMn2 = ((bmv_1)this.l).cB();
        if (bMn2 == null) {
            return false;
        }
        faV faV2 = bmr_12.fE();
        int n = bMn2.F();
        if (n == 0) {
            return false;
        }
        if (n == 34) {
            return false;
        }
        if (n != faV2.n()) {
            return false;
        }
        faX faX2 = bMn2.D();
        if (faX2 == null) {
            return false;
        }
        if (faX2.v()) {
            return false;
        }
        bmr_1 bmr_13 = azu_0.j().k();
        return bmr_13.a(enw_0.d);
    }

    @Override
    public String q() {
        bmr_1 bmr_12 = azu_0.j().k();
        fda fda2 = (fda)bmr_12.fE();
        return super.q();
    }

    @Override
    public String r() {
        return "voteList";
    }

    @Override
    public cSS v() {
        return new cuk_0();
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        azu_0.j().a(ddH.a());
    }

    @Override
    protected int t() {
        return cUL.F.aH;
    }
}

