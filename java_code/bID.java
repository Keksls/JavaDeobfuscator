/*
 * Decompiled with CFR 0.152.
 */
class bID
implements fzp_0 {
    final /* synthetic */ exk_2 a;
    final /* synthetic */ bic_0 b;

    bID(bic_0 bic_02, exk_2 exk_22) {
        this.b = bic_02;
        this.a = exk_22;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n != 2) {
            return;
        }
        this.b.h = string;
        this.b.h = aUh.b(this.b.h);
        if (this.b.h == null) {
            return;
        }
        this.b.h = cby_2.b(this.b.h);
        if (this.b.h.isEmpty()) {
            aUh.a("error.chat.operationNotPermited", new Object[0]);
            return;
        }
        this.b.i = Cz.a(this.b.h);
        this.b.a(this.a.a());
    }
}

