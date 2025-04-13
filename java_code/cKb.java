/*
 * Decompiled with CFR 0.152.
 */
class cKb
implements fzp_0 {
    final /* synthetic */ fug_0 a;

    cKb(fug_0 fug_02) {
        this.a = fug_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            dfc dfc2 = new dfc();
            dfc2.a_(17139);
            dfc2.a(this.a.getText());
            add_2.b().a(dfc2);
            this.a.c("");
            fis_1.a().a("electionSloganDirty", false);
        }
    }
}

