/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIv
 */
class biv_0
implements fzp_0 {
    final /* synthetic */ exk_2 a;
    final /* synthetic */ biu_1 b;

    biv_0(biu_1 biu_12, exk_2 exk_22) {
        this.b = biu_12;
        this.a = exk_22;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.b.a(this.a.a());
        }
    }
}

