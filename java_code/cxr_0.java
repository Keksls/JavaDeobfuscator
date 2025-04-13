/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXR
 */
class cxr_0
implements fzp_0 {
    final /* synthetic */ bsx_2 a;
    final /* synthetic */ byte b;
    final /* synthetic */ boolean c;
    final /* synthetic */ byte d;
    final /* synthetic */ boolean e;
    final /* synthetic */ cXQ f;

    cxr_0(cXQ cXQ2, bsx_2 bsx_22, byte by, boolean bl, byte by2, boolean bl2) {
        this.f = cXQ2;
        this.a = bsx_22;
        this.b = by;
        this.c = bl;
        this.d = by2;
        this.e = bl2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.a.a(this.b, this.c, this.d, this.e, false);
        }
    }
}

