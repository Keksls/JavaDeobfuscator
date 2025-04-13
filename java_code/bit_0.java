/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIt
 */
class bit_0
implements fzp_0 {
    final /* synthetic */ exk_2 a;
    final /* synthetic */ bis_1 b;

    bit_0(bis_1 bis_12, exk_2 exk_22) {
        this.b = bis_12;
        this.a = exk_22;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.b.a(this.a.a());
        }
    }
}

