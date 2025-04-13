/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbl
 */
public class bbl_0
extends bak_0 {
    private final int e;
    private int f;

    public bbl_0(int n, int n2, int n3, int n4, int n5) {
        super(n, n2, n3, n5);
        this.e = n4;
    }

    @Override
    protected void r() {
        if (!this.n()) {
            return;
        }
        bvx_2 bvx_22 = (bvx_2)this.b();
        bxo_2 bxo_22 = bvx_22.A();
        blx_1 blx_12 = bxo_22.H();
        long l = this.f();
        if (azu_0.j().c(ddv_0.a()) && ddv_0.a().c().a_() == l) {
            azu_0.j().b(ddv_0.a());
        }
        this.a(bvx_22, bxo_22, blx_12, l);
        azu_0.j().K().c(new cne(bxo_22.x()));
    }

    private void a(bvx_2 bvx_22, bxo_2 bxo_22, blx_1 blx_12, long l) {
        if (blx_12 == null) {
            if (!bxo_22.p(l)) {
                a.error((Object)("impossible de terminer le tour du fighter " + l));
                bvx_22.v();
            }
            return;
        }
        if (blx_12.a_() != this.f()) {
            a.info((Object)"fin de tour pr\u00e9matur\u00e9e du client");
            return;
        }
        bxo_22.a().g(l);
        bxo_22.a().b(l, this.e);
        bxo_22.a().c(l, this.f);
        biI biI2 = blx_12.bv();
        if (bvx_22.F(blx_12)) {
            biI2.c(blx_12.Y());
        }
        if (!bvx_22.T(blx_12)) {
            a.error((Object)("impossible de terminer le tour du fighter " + blx_12.a_()));
            bvx_22.v();
        }
    }

    @Override
    protected void l() {
    }

    public void e(int n) {
        this.f = n;
    }
}

