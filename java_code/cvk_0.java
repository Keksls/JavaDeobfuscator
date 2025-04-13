/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVk
 */
class cvk_0
implements fjv_2 {
    final /* synthetic */ boolean a;
    final /* synthetic */ cVh b;

    cvk_0(cVh cVh2, boolean bl) {
        this.b = cVh2;
        this.a = bl;
    }

    @Override
    public void onTweenEvent(fjg_2 fjg_22, fju_2 fju_22) {
        switch (fju_22) {
            case a: {
                fjg_22.b(this);
                if (this.a) {
                    ado_1.a().a(new cvl_0(this), 10000L, 1);
                    break;
                }
                if (!this.b.c.isEmpty()) {
                    ado_1.a().a(new cvm_0(this), 1000L, 1);
                    break;
                }
                if (this.b.e != null) {
                    this.b.d.getAppearance().c(this.b.e);
                    this.b.e = null;
                }
                this.b.b = null;
                fis_1.a().a("unlockedAchievement", (Object)null);
            }
        }
    }
}

