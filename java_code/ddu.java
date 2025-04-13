/*
 * Decompiled with CFR 0.152.
 */
class ddu
implements fzp_0 {
    final /* synthetic */ dds_0 a;

    ddu(dds_0 dds_02) {
        this.a = dds_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 2) {
            coa_0 coa_02 = new coa_0();
            azu_0.j().K().c(coa_02);
            azu_0.j().b(dds_0.a());
        }
        this.a.c = false;
    }
}

