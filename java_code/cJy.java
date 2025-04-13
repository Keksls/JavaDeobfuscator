/*
 * Decompiled with CFR 0.152.
 */
class cJy
implements fzp_0 {
    final /* synthetic */ bwj_0 a;

    cJy(bwj_0 bwj_02) {
        this.a = bwj_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 2) {
            dhx dhx2 = new dhx();
            dhx2.a(this.a);
            dhx2.b(Long.parseLong(string));
            dhx2.a_(19218);
            add_2.b().a(dhx2);
        }
    }
}

