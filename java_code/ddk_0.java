/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ddk
 */
class ddk_0
implements fzp_0 {
    final /* synthetic */ long a;
    final /* synthetic */ ddi_0 b;

    ddk_0(ddi_0 ddi_02, long l) {
        this.b = ddi_02;
        this.a = l;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.b.d.c(this.a);
        }
    }
}

