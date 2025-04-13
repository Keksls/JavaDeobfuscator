/*
 * Decompiled with CFR 0.152.
 */
class fvc
implements fzu {
    final /* synthetic */ String a;
    final /* synthetic */ fru_0 b;
    final /* synthetic */ String c;
    final /* synthetic */ fvb_0 d;

    fvc(fvb_0 fvb_02, String string, fru_0 fru_02, String string2) {
        this.d = fvb_02;
        this.a = string;
        this.b = fru_02;
        this.c = string2;
    }

    @Override
    public boolean run(fzs fzs2) {
        this.d.k.c(this.a);
        this.d.j.b(this.b);
        if (this.c != null) {
            ado_1.a().a(new fvd_0(this), 1L, 1);
        }
        return false;
    }
}

