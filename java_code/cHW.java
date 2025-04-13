/*
 * Decompiled with CFR 0.152.
 */
class cHW
implements fzp_0 {
    final /* synthetic */ bVo a;

    cHW(bVo bVo2) {
        this.a = bVo2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            dfc dfc2 = new dfc();
            dfc2.a_(16140);
            dfc2.a(this.a.b());
            add_2.b().a(dfc2);
        }
    }
}

