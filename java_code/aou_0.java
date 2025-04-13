/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aOU
 */
class aou_0
implements afu_0 {
    final /* synthetic */ bvw_2 a;
    final /* synthetic */ aov_0 b;

    aou_0(bvw_2 bvw_22, aov_0 aov_02) {
        this.a = bvw_22;
        this.b = aov_02;
    }

    public void a(abz_0 abz_02, boolean bl) {
        if (!bl) {
            dbm_0.a().a(abz_02);
            aNC.c(abz_02);
            return;
        }
        fvE fvE2 = fta_0.getInstance().getMouseOver();
        if (fvE2 != null && fvE2 != fta_0.getInstance()) {
            return;
        }
        aNC.a(abz_02);
        dhg dhg2 = new dhg(abz_02, 0);
        if (aop_0.a(this.a, this.b.aH(), dhg2)) {
            dbm_0.a().a(dhg2);
        }
    }
}

