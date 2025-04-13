/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dcZ
 */
class dcz_0
implements fzp_0 {
    final /* synthetic */ short a;
    final /* synthetic */ fiL b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;
    final /* synthetic */ dcX e;

    dcz_0(dcX dcX2, short s2, fiL fiL2, long l, int n) {
        this.e = dcX2;
        this.a = s2;
        this.b = fiL2;
        this.c = l;
        this.d = n;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.e.a(this.a, this.b, this.c, this.d);
        } else {
            this.e.s();
        }
    }
}

