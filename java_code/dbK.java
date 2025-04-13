/*
 * Decompiled with CFR 0.152.
 */
class dbK
implements fzp_0 {
    final /* synthetic */ bop_0 a;
    final /* synthetic */ bmr_1 b;
    final /* synthetic */ byte c;
    final /* synthetic */ dbJ d;

    dbK(dbJ dbJ2, bop_0 bop_02, bmr_1 bmr_12, byte by) {
        this.d = dbJ2;
        this.a = bop_02;
        this.b = bmr_12;
        this.c = by;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.d.a(this.a);
            this.b.cH().c(this.c);
        }
    }
}

