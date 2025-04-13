/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHa
 */
class bha_1
implements agu_0 {
    final /* synthetic */ bgz_0 a;

    bha_1(bgz_0 bgz_02) {
        this.a = bgz_02;
    }

    @Override
    public boolean c(ags_0 ags_02, ajb_1 ajb_12) {
        ags_0 ags_03 = this.a.b();
        if (ags_03 == null) {
            return false;
        }
        if (ags_02 != ags_03) {
            return false;
        }
        if (ags_03 == ags_0.d) {
            bvp_0 bvp_02 = (bvp_0)ajb_12;
            bmr_1 bmr_12 = this.a.f();
            if (bmr_12 == null) {
                return false;
            }
            return bvp_02.o() == bmr_12.a_();
        }
        return true;
    }

    @Override
    public void d(ags_0 ags_02, ajb_1 ajb_12) {
        this.a.a(ajb_12);
        this.a.c(ajb_12);
    }

    @Override
    public void e(ags_0 ags_02, ajb_1 ajb_12) {
        this.a.b(ajb_12);
    }
}

