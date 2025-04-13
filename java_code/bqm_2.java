/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bqm
 */
class bqm_2
implements abb_0 {
    final /* synthetic */ biI a;
    final /* synthetic */ bql_2 b;

    bqm_2(bql_2 bql_22, biI biI2) {
        this.b = bql_22;
        this.a = biI2;
    }

    @Override
    public void animationEnded(abu abu2) {
        this.a.b(this);
        this.b.b(this.a);
        this.a.a((ahg_0)null, 0);
        this.b.h = null;
    }
}

