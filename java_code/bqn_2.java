/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bqn
 */
class bqn_2
implements abb_0 {
    final /* synthetic */ bfr_0 a;
    final /* synthetic */ biI b;
    final /* synthetic */ aej_2 c;
    final /* synthetic */ bql_2 d;

    bqn_2(bql_2 bql_22, bfr_0 bfr_02, biI biI2, aej_2 aej_22) {
        this.d = bql_22;
        this.a = bfr_02;
        this.b = biI2;
        this.c = aej_22;
    }

    @Override
    public void animationEnded(abu abu2) {
        this.a.c(true);
        this.b.b(this);
        this.d.a(this.b, this.a);
        this.b.e(this.b.ab());
        this.b.a(this.c);
        if (this.d.g != null) {
            this.d.g.animationEnded(abu2);
        }
        this.d.g = null;
        this.d.i = null;
        this.d.e.a((ead_0)null);
    }
}

