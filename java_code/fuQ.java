/*
 * Decompiled with CFR 0.152.
 */
class fuQ
implements fzu {
    final /* synthetic */ fup_0 a;

    fuQ(fup_0 fup_02) {
        this.a = fup_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        boolean bl = this.a.getAppearance().o();
        if (fzs2.g()) {
            return bl;
        }
        if (this.a.getAppearance().isChecked()) {
            fza_0.a().f();
        } else {
            fza_0.a().g();
        }
        fzs2.b(true);
        return bl;
    }
}

