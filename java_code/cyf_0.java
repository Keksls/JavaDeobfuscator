/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYf
 */
class cyf_0
implements fjv_2 {
    final /* synthetic */ boolean a;
    final /* synthetic */ cYe b;

    cyf_0(cYe cYe2, boolean bl) {
        this.b = cYe2;
        this.a = bl;
    }

    @Override
    public void onTweenEvent(fjg_2 fjg_22, fju_2 fju_22) {
        switch (fju_22) {
            case a: {
                fjg_22.b(this);
                if (this.a) {
                    ado_1.a().a(new cYg(this), 2500L, 1);
                    break;
                }
                if (this.b.h.size() > 0) {
                    ado_1.a().a(new cyh_0(this), 2000L, 1);
                    break;
                }
                if (this.b.e != null) {
                    this.b.f.getAppearance().c(this.b.e);
                    this.b.e = null;
                }
                this.b.f = null;
                this.b.g = null;
                fis_1.a().a("splashText", (Object)null);
            }
        }
    }
}

