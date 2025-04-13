/*
 * Decompiled with CFR 0.152.
 */
class cVx
implements fzp_0 {
    final /* synthetic */ short a;
    final /* synthetic */ cVw b;

    cVx(cVw cVw2, short s2) {
        this.b = cVw2;
        this.a = s2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.b.a(this.a);
        } else {
            fis_1.a().a((ajf_1)bkr_2.v, "currentLevel");
        }
    }
}

