/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVG
 */
class cvg_0
implements fjv_2 {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;
    final /* synthetic */ cVA c;

    cvg_0(cVA cVA2, boolean bl, String string) {
        this.c = cVA2;
        this.a = bl;
        this.b = string;
    }

    @Override
    public void onTweenEvent(fjg_2 fjg_22, fju_2 fju_22) {
        switch (fju_22) {
            case a: {
                fjg_22.b(this);
                if (this.a) {
                    ado_1.a().a(new cvh_0(this), 2500 + this.b.length() * 25, 1);
                    break;
                }
                if (!this.c.f.isEmpty()) {
                    ado_1.a().a(new cvi_0(this), 2000L, 1);
                    break;
                }
                if (this.c.c != null) {
                    this.c.d.getAppearance().c(this.c.c);
                    this.c.c = null;
                }
                this.c.d = null;
                this.c.e = null;
                fis_1.a().a("splashText", (Object)null);
            }
        }
    }
}

