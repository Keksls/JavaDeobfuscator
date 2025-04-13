/*
 * Decompiled with CFR 0.152.
 */
public class bbH
extends bak_0 {
    public bbH(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected void r() {
        bvx_2 bvx_22;
        blx_1 blx_12 = this.a(this.f());
        if (blx_12 == null) {
            a.error((Object)"D\u00e9but de tour demand\u00e9 pour un fighter inexistant ??");
            return;
        }
        if (this.n() && !(bvx_22 = (bvx_2)this.b()).S(blx_12)) {
            a.error((Object)("impossible de d\u00e9buter le tour du fighter " + blx_12.a_()));
            bvx_22.v();
        }
    }

    @Override
    protected void l() {
    }
}

