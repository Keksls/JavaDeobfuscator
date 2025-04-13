/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bwB
 */
class bwb_0
implements abb_0 {
    final /* synthetic */ biI a;
    final /* synthetic */ bwu_0 b;

    bwb_0(biI biI2, bwu_0 bwu_02) {
        this.a = biI2;
        this.b = bwu_02;
    }

    @Override
    public void animationEnded(abu abu2) {
        this.a.b(this);
        int n = this.a.bQ().f();
        this.a.a(this.b);
        bwa_0.a(this.a, n, this.b.f());
        this.b.d(this.a);
    }
}

