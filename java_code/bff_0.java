/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFF
 */
class bff_0
implements afy_0 {
    final /* synthetic */ biI a;
    final /* synthetic */ evt_1 b;
    final /* synthetic */ bfc_0 c;

    bff_0(bfc_0 bfc_02, biI biI2, evt_1 evt_12) {
        this.c = bfc_02;
        this.a = biI2;
        this.b = evt_12;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        this.a.c(this);
        if (n == this.c.G() && n2 == this.c.H()) {
            this.c.a(this.a, this.b);
        }
    }
}

