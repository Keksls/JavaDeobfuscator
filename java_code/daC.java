/*
 * Decompiled with CFR 0.152.
 */
class daC
implements fzp_0 {
    final /* synthetic */ daB a;

    daC(daB daB2) {
        this.a = daB2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 2) {
            if (!string.isEmpty()) {
                if (string.length() <= 220) {
                    PH pH = new PH(string);
                    azu_0.j().K().c(pH);
                    String string2 = bae.h().a("contactModerator.waiting", new Object[0]);
                    fzn_0 fzn_02 = new fzn_0(102, 0, string2, 2L);
                    fpm_0.b().a(fzn_02);
                } else {
                    aUh.a("contactModerator.tooLong", new Object[0]);
                }
            } else {
                aUh.a("contactModerator.tooShort", new Object[0]);
            }
        }
    }
}

