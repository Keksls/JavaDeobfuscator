/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIU
 */
class biu_0
implements fzp_0 {
    final /* synthetic */ exk_2 a;
    final /* synthetic */ bit_1 b;

    biu_0(bit_1 bit_12, exk_2 exk_22) {
        this.b = bit_12;
        this.a = exk_22;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.b.a(this.a.a());
        }
    }
}

