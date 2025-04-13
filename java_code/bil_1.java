/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIl
 */
class bil_1
implements fzp_0 {
    final /* synthetic */ exk_2 a;
    final /* synthetic */ bik_0 b;

    bil_1(bik_0 bik_02, exk_2 exk_22) {
        this.b = bik_02;
        this.a = exk_22;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.b.c(this.a);
        }
    }
}

