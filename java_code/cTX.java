/*
 * Decompiled with CFR 0.152.
 */
public class cTX
extends cSS
implements afy_0 {
    @Override
    public cSY n() {
        return cSY.n;
    }

    @Override
    public cSS v() {
        return new cTX();
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        bel_0 bel_02 = (bel_0)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        if (!bel_02.aB_() && bel_02.c(biI2.ap()) || bel_02.aB_() && biI2.ap().b(bel_02.G(), bel_02.H(), (int)bel_02.I())) {
            this.a();
        } else {
            biI2.b(this);
            b.info((Object)("Serching path to " + bel_02.P_()));
            bmr_12.a(dei.a(biI2, bel_02), true);
        }
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof bel_0)) {
            return false;
        }
        bel_0 bel_02 = (bel_0)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bel_02.m() != bmr_12.a_()) {
            return false;
        }
        if (bmr_12.cW() || bmr_12.ak() || bvz_2.a.a()) {
            return false;
        }
        bpc_2 bpc_22 = bmr_12.eE();
        if (!(bpc_22 instanceof bpy_2)) {
            return true;
        }
        bpy_2 bpy_22 = (bpy_2)bpc_22;
        return bpy_22.h() != this.l;
    }

    @Override
    public String r() {
        return "manageFlea";
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        this.a();
    }

    private void a() {
        bpy_2 bpy_22 = new bpy_2((bel_0)this.l);
        if (bpy_22.g()) {
            bpy_22.a();
        }
    }

    @Override
    protected int t() {
        return cUL.a.aH;
    }
}

