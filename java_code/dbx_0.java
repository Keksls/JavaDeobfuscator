/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dbX
 */
class dbx_0
implements fzp_0 {
    final /* synthetic */ exk_2 a;
    final /* synthetic */ bMi b;
    final /* synthetic */ short c;
    final /* synthetic */ dbU d;

    dbx_0(dbU dbU2, exk_2 exk_22, bMi bMi2, short s2) {
        this.d = dbU2;
        this.a = exk_22;
        this.b = bMi2;
        this.c = s2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            cqj_0 cqj_02 = new cqj_0();
            cqj_02.b(this.a.a());
            cqj_02.a(this.b.j().a());
            cqj_02.b(this.c);
            azu_0.j().K().c(cqj_02);
            this.d.a(this.b, this.a, this.c);
        }
    }
}

