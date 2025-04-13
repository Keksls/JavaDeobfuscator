/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXc
 */
class cxc_0
implements fzp_0 {
    final /* synthetic */ cxb_0 a;

    cxc_0(cxb_0 cxb_02) {
        this.a = cxb_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.a.c();
        }
    }
}

