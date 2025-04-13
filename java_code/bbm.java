/*
 * Decompiled with CFR 0.152.
 */
public class bbm
extends bak_0 {
    private long e;

    public bbm(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected void r() {
        Object object;
        blx_1 blx_12 = this.a(this.f());
        if (blx_12 == null) {
            a.error((Object)"D\u00e9but de tour demand\u00e9 pour un fighter inexistant ??");
            return;
        }
        if (!blx_12.a(eoz_1.ah)) {
            object = blx_12.bv();
            ((biI)object).d(blx_12.Y());
        }
        object = (bvx_2)this.b();
        ((bvx_2)object).A().f(this.e);
        if (this.n() && !((eml_1)object).R(blx_12)) {
            a.error((Object)("impossible de d\u00e9buter le tour du fighter " + blx_12.a_()));
            ((bvx_2)object).v();
        }
        cYH.a().a(blx_12);
        if (azu_0.j().k() == blx_12) {
            bua_0.a.a(new bux_2());
        }
    }

    public void d(long l) {
        this.e = l;
    }

    @Override
    protected void l() {
    }
}

