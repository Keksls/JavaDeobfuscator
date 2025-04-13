/*
 * Decompiled with CFR 0.152.
 */
class dbm
implements fzp_0 {
    final /* synthetic */ int a;
    final /* synthetic */ dbl b;

    dbm(dbl dbl2, int n) {
        this.b = dbl2;
        this.a = n;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            cpy_0 cpy_02 = new cpy_0();
            cpy_02.b(this.a);
            azu_0.j().K().c(cpy_02);
            azu_0.j().b(this.b);
        }
    }
}

