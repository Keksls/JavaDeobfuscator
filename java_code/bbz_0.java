/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbz
 */
class bbz_0
implements afy_0 {
    final /* synthetic */ blx_1 a;
    final /* synthetic */ bbx_0 b;

    bbz_0(bbx_0 bbx_02, blx_1 blx_12) {
        this.b = bbx_02;
        this.a = blx_12;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        this.b.a(afe_02, this.a);
        afe_02.c(this);
    }
}

