/*
 * Decompiled with CFR 0.152.
 */
class cZo
implements fzp_0 {
    final /* synthetic */ String a;
    final /* synthetic */ cZl b;

    cZo(cZl cZl2, String string) {
        this.b = cZl2;
        this.a = string;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n != 2) {
            return;
        }
        azu_0.j().K().c(new cnr(this.a));
    }
}

