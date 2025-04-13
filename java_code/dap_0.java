/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dap
 */
class dap_0
implements fzp_0 {
    final /* synthetic */ adt_1 a;
    final /* synthetic */ dao b;

    dap_0(dao dao2, adt_1 adt_12) {
        this.b = dao2;
        this.a = adt_12;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.b.b(this.a);
        }
    }
}

