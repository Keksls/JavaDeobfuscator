/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bby
 */
class bby_0
implements abb_0 {
    final /* synthetic */ blx_1 a;
    final /* synthetic */ biI b;
    final /* synthetic */ bbx_0 c;

    bby_0(bbx_0 bbx_02, blx_1 blx_12, biI biI2) {
        this.c = bbx_02;
        this.a = blx_12;
        this.b = biI2;
    }

    @Override
    public void animationEnded(abu abu2) {
        abu2.b(this);
        this.c.a(this.a, this.b);
    }
}

