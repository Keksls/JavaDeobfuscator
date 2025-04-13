/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ciJ
 */
class cij_1
implements fzp_0 {
    final /* synthetic */ long a;
    final /* synthetic */ cii_1 b;

    cij_1(cii_1 cii_12, long l) {
        this.b = cii_12;
        this.a = l;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        this.b.a(this.a, n == 8);
    }
}

