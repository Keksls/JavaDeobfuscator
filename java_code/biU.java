/*
 * Decompiled with CFR 0.152.
 */
class biU
implements abb_0 {
    final /* synthetic */ bjl_0 a;
    final /* synthetic */ bjl_0 b;
    final /* synthetic */ biS c;

    biU(biS biS2, bjl_0 bjl_02, bjl_0 bjl_03) {
        this.c = biS2;
        this.a = bjl_02;
        this.b = bjl_03;
    }

    @Override
    public void animationEnded(abu abu2) {
        this.c.d.b(this);
        if (this.c.e != null) {
            this.c.e.a(this.a, this.b, this.c.d);
            if (this.c.e.b()) {
                this.c.e = null;
            }
        }
    }
}

