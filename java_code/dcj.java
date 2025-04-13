/*
 * Decompiled with CFR 0.152.
 */
class dcj
implements fzp_0 {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ dce c;

    dcj(dce dce2, int n, int n2) {
        this.c = dce2;
        this.a = n;
        this.b = n2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            cAf cAf2 = new cAf();
            cAf2.d(this.a);
            cAf2.b(this.c.c.B());
            cAf2.c(this.b);
            azu_0.j().K().c(cAf2);
            this.c.c.l().d(this.a);
            ado_1.a().a(new dck_0(this), 1000L, 1);
        }
    }
}

