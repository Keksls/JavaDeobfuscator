/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bWo
 */
public final class bwo_2
implements fgw_0<bmr_0> {
    public static final bwo_2 a = new bwo_2();

    private bwo_2() {
    }

    @Override
    public void a(bmr_0 bmr_02) {
        bmt_0 bmt_02 = bmt_0.a(bmr_02.d());
        switch (bmt_02) {
            case a: {
                this.b(bmr_02);
            }
        }
    }

    private void b(bmr_0 bmr_02) {
        bMn bMn2 = (bMn)bmr_02.e();
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.bz() != null) {
            return;
        }
        if (bmr_12.fE().n() != bMn2.F()) {
            return;
        }
        if (!bmr_12.fE().a(fct_0.b)) {
            return;
        }
        String string = bae.h().a("attacked.protector.joinInFight", String.format("<b>%s</b>", bMn2.d()));
        fzm_0 fzm_02 = fpm_0.b().a(string, cfn_0.a(5), 2073L, 102, 1);
        fzm_02.a(new bwp_2(this, bMn2));
    }
}

