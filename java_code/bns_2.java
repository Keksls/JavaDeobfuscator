/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnS
 */
class bns_2
implements abb_0 {
    final /* synthetic */ biI a;
    final /* synthetic */ bnq_2 b;

    bns_2(bnq_2 bnq_22, biI biI2) {
        this.b = bnq_22;
        this.a = biI2;
    }

    @Override
    public void animationEnded(abu abu2) {
        this.a.a(this.b.o);
        this.b.o = null;
        this.a.b(this);
    }
}

