/*
 * Decompiled with CFR 0.152.
 */
class brk
implements ans_1 {
    final /* synthetic */ brc_0 a;
    final /* synthetic */ boolean b;
    final /* synthetic */ brd_0 c;

    brk(brd_0 brd_02, brc_0 brc_02, boolean bl) {
        this.c = brd_02;
        this.a = brc_02;
        this.b = bl;
    }

    @Override
    public void dialogUnloaded(String string) {
        if ("companionsManagementDialog".equals(string)) {
            this.c.a(this.a, this.b);
            fpm_0.b().b(this);
        }
    }
}

