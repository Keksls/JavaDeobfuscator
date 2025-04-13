/*
 * Decompiled with CFR 0.152.
 */
class cIO
implements fzp_0 {
    final /* synthetic */ fzs a;

    cIO(fzs fzs2) {
        this.a = fzs2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            cIi.cancel();
            cIi.closeOptionsDialog(this.a);
        }
    }
}

