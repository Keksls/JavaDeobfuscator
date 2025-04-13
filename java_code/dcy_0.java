/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dcY
 */
class dcy_0
implements fzp_0 {
    final /* synthetic */ bmr_1 a;
    final /* synthetic */ int b;
    final /* synthetic */ dcX c;

    dcy_0(dcX dcX2, bmr_1 bmr_12, int n) {
        this.c = dcX2;
        this.a = bmr_12;
        this.b = n;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.c.a(this.a, this.b);
        }
    }
}

