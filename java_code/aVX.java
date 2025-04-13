/*
 * Decompiled with CFR 0.152.
 */
class aVX
implements fzp_0 {
    final /* synthetic */ avw_0 a;

    aVX(avw_0 avw_02) {
        this.a = avw_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.a.d();
        } else {
            aXj.a("You HAVE to validate your command with a dev");
        }
    }
}

