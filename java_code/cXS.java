/*
 * Decompiled with CFR 0.152.
 */
class cXS
implements fzp_0 {
    final /* synthetic */ bsx_2 a;
    final /* synthetic */ byte b;
    final /* synthetic */ long c;
    final /* synthetic */ byte d;
    final /* synthetic */ cXQ e;

    cXS(cXQ cXQ2, bsx_2 bsx_22, byte by, long l, byte by2) {
        this.e = cXQ2;
        this.a = bsx_22;
        this.b = by;
        this.c = l;
        this.d = by2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            cXQ.a(this.a, this.b, this.c, this.d);
        }
    }
}

