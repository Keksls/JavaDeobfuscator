/*
 * Decompiled with CFR 0.152.
 */
class dch
implements fzp_0 {
    final /* synthetic */ dce a;

    dch(dce dce2) {
        this.a = dce2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.a.c();
        }
    }
}

