/*
 * Decompiled with CFR 0.152.
 */
class daD
implements fzp_0 {
    final /* synthetic */ daB a;

    daD(daB daB2) {
        this.a = daB2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n != 8) {
            return;
        }
        azu_0.j().b(this.a);
        azu_0.j().b(cgu_2.a());
        cgu_2.a().g();
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null && (bmr_12.eE() == null || bmr_12.eE().ac_() != 4)) {
            daE daE2 = new daE(this);
            azu_0.j().a(bmr_12, daE2);
        } else {
            daB.c();
        }
    }
}

