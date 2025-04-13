/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnW
 */
class bnw_1
implements emi_0 {
    private final bmr_1 a;

    bnw_1(bmr_1 bmr_12) {
        this.a = bmr_12;
    }

    @Override
    public void a(enu_0 enu_02, enu_0 enu_03) {
        fam_0 fam_02 = this.a.cB();
        if (fam_02 != null) {
            if (this.a.a(enw_0.i)) {
                fam_02.b(-1);
            } else if (!fam_02.c(-1)) {
                fam_02.a(new fap_0(fal_0.c));
            }
        }
        this.a.cg().z();
        bgB.a.a(enu_02, enu_03);
    }
}

