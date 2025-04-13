/*
 * Decompiled with CFR 0.152.
 */
class alr
implements afy_0 {
    final /* synthetic */ akx_2 a;
    final /* synthetic */ int b;
    final /* synthetic */ alq_0 c;

    alr(alq_0 alq_02, akx_2 akx_22, int n) {
        this.c = alq_02;
        this.a = akx_22;
        this.b = n;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        this.a.b(this.b);
    }
}

