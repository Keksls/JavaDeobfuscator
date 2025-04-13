/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dad
 */
class dad_0
implements fzp_0 {
    final /* synthetic */ exk_2 a;
    final /* synthetic */ dab_0 b;

    dad_0(dab_0 dab_02, exk_2 exk_22) {
        this.b = dab_02;
        this.a = exk_22;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.b.a(this.a);
        }
    }
}

