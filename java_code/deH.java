/*
 * Decompiled with CFR 0.152.
 */
class deH
implements fzp_0 {
    final /* synthetic */ String a;
    final /* synthetic */ deG b;

    deH(deG deG2, String string) {
        this.b = deG2;
        this.a = string;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n != 2) {
            return;
        }
        if (this.a.equalsIgnoreCase(string)) {
            byp_2.a().u();
            azu_0.j().b(cZu.a());
        }
    }
}

