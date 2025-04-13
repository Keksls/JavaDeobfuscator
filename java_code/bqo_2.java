/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bqo
 */
class bqo_2
implements afb_0 {
    final /* synthetic */ biI a;
    final /* synthetic */ bql_2 b;

    bqo_2(bql_2 bql_22, biI biI2) {
        this.b = bql_22;
        this.a = biI2;
    }

    @Override
    public void pathStarted(afe_0 afe_02, apl_1 apl_12) {
        if (this.b.i != null) {
            this.b.i.animationEnded(this.a);
        }
        this.a.b(this);
    }
}

