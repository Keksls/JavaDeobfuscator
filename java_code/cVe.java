/*
 * Decompiled with CFR 0.152.
 */
class cVe
implements afy_0 {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ cVc c;

    cVe(cVc cVc2, int n, int n2) {
        this.c = cVc2;
        this.a = n;
        this.b = n2;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        this.c.a(this.a, this.b);
    }
}

