/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cgi
 */
class cgi_1
implements fzp_0 {
    final /* synthetic */ bMn a;
    final /* synthetic */ int b;
    final /* synthetic */ cgh_2 c;

    cgi_1(cgh_2 cgh_22, bMn bMn2, int n) {
        this.c = cgh_22;
        this.a = bMn2;
        this.b = n;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if ((n & 8) != 8) {
            return;
        }
        this.c.a(this.a, this.b);
    }
}

