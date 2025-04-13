/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bgT
 */
class bgt_2
implements afu_0 {
    final /* synthetic */ abz_0 a;
    final /* synthetic */ ekk_0 b;
    final /* synthetic */ bgs_2 c;

    bgt_2(bgs_2 bgs_22, abz_0 abz_02, ekk_0 ekk_02) {
        this.c = bgs_22;
        this.a = abz_02;
        this.b = ekk_02;
    }

    public void a(abz_0 abz_02, boolean bl) {
        if (bl) {
            fvE fvE2 = fta_0.getInstance().getMouseOver();
            if (fvE2 != null && fvE2 != fta_0.getInstance()) {
                return;
            }
            dhg dhg2 = new dhg(this.a, 0);
            dhg2.a(this.c.a(this.b), null);
            dbm_0.a().a(dhg2);
        } else {
            dbm_0.a().a(this.a);
        }
        this.b.e(bl);
    }
}

