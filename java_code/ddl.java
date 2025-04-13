/*
 * Decompiled with CFR 0.152.
 */
class ddl
implements fzp_0 {
    final /* synthetic */ long a;
    final /* synthetic */ ddi_0 b;

    ddl(ddi_0 ddi_02, long l) {
        this.b = ddi_02;
        this.a = l;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.b.d.b(this.a);
        }
    }
}

