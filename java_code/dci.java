/*
 * Decompiled with CFR 0.152.
 */
class dci
implements fzp_0 {
    final /* synthetic */ fgo_0 a;
    final /* synthetic */ int b;
    final /* synthetic */ dce c;

    dci(dce dce2, fgo_0 fgo_02, int n) {
        this.c = dce2;
        this.a = fgo_02;
        this.b = n;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            cqm_0 cqm_02 = new cqm_0();
            cqm_02.a(this.c.c.B(), this.a, this.b);
            azu_0.j().K().c(cqm_02);
            this.c.c.l().b(this.a, this.b);
            this.c.c.l().d(this.b);
            switch (this.a) {
                case a: {
                    bwy_2.h().j().k().c();
                    break;
                }
                case b: {
                    fis_1.a().a((ajf_1)bwy_2.h(), "climateInventory");
                    break;
                }
            }
        }
    }
}

