/*
 * Decompiled with CFR 0.152.
 */
class dbZ
implements ffb_0 {
    final exk_2 b;
    final /* synthetic */ dbU a;

    dbZ(dbU dbU2, exk_2 exk_22) {
        this.a = dbU2;
        this.b = exk_22;
        ffu_0 ffu_02 = this.b.f();
        ffu_02.a(this);
        wt_0 wt_02 = new wt_0(ffu_02.l());
        wu_0 wu_02 = wc_0.p().a();
        ww_0 ww_02 = wt_02.g(wu_02);
        ww_0 ww_03 = new ww_0(ffu_02.a().f());
        int n = ww_02.d(ww_03);
        ww_03.a(n + 1);
        wt_02.a(ww_03);
    }

    @Override
    public void a(String string) {
    }

    @Override
    public void a(int n) {
        this.a.h();
        fis_1.a().a((ajf_1)this.b, this.b.d());
    }

    @Override
    public void b(int n) {
        this.a.h();
        fis_1.a().a((ajf_1)this.b, this.b.d());
    }

    @Override
    public void c(int n) {
        if (n == 0) {
            this.a.e(this.b);
        }
        fis_1.a().a((ajf_1)this.b, this.b.d());
        this.a();
    }

    @Override
    public void d(int n) {
    }

    @Override
    public void a(wu_0 wu_02) {
    }

    @Override
    public void b(wu_0 wu_02) {
    }

    @Override
    public void c(wu_0 wu_02) {
    }

    @Override
    public void e(int n) {
        this.a();
    }

    public void a() {
        exk_2 exk_22;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        exk_2 exk_23 = bmr_12.cG().a(bmr_12.dC(), exh_2.w);
        if (exk_23 != null && exk_23 == this.b) {
            bmr_12.bI();
        }
        if ((exk_22 = bmr_12.cG().a(bmr_12.dC(), exh_2.y)) != null && exk_22 == this.b) {
            bmr_12.bI();
        }
    }
}

