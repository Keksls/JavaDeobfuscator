/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbC
 */
public class bbc_0
extends bak_0 {
    private final byte[] e;

    public bbc_0(int n, int n2, int n3, int n4, byte[] byArray) {
        super(n, n2, n3, n4);
        this.e = byArray;
    }

    @Override
    protected void r() {
        bvx_2 bvx_22 = (bvx_2)this.b();
        if (bvx_22 == null) {
            a.error((Object)"Impossible de debuter un nouvezau tour de table, on ne connait pas le combat ");
            return;
        }
        if (this.n()) {
            bvx_22.A().v();
        }
        cYH.a().c();
    }

    @Override
    protected void l() {
    }
}

