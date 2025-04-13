/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbM
 */
class cbm_2
extends cbr_1 {
    private static final int e = 2800;
    private int f;
    private int g;

    cbm_2() {
    }

    @Override
    void a(ahg_0 ahg_02) {
        super.a(ahg_02);
        if (this.f > 0) {
            return;
        }
        int n = 2800;
        ahq_0 ahq_02 = ahg_02.s();
        aeh_2 aeh_22 = new aeh_2(-15.0f, 15.0f, -15.0f, 15.0f, 0.0f, 36.0f);
        adh_0 adh_02 = new adh_0();
        adh_02.c(2800);
        adh_02.a(aeh_22);
        adh_02.a(ahq_02);
        float f2 = 2.0f;
        float f3 = 60000.0f;
        float f4 = 100.0f;
        float f5 = 128.0f;
        adh_02.a(128.0f, 100.0f, 60000.0f, 2.0f);
        aui_1.a().a(adh_02);
        this.f = adh_02.f();
        this.b = true;
    }

    private void b() {
        if (this.g != 0) {
            return;
        }
        adj_0 adj_02 = new adj_0(aNM.a() + "freeze.cgfx", "freeze");
        aNM.a(adj_02, new cbn_2(this, 0.0f));
        this.g = adj_02.f();
    }

    private void f() {
        if (this.g == 0) {
            return;
        }
        aNM.a(this.g);
        this.g = 0;
    }

    @Override
    void a() {
        super.a();
        if (this.f != 0) {
            auh_1 auh_12 = aui_1.a().b(this.f);
            if (auh_12 != null) {
                auh_12.a(false);
                aui_1.a().b(auh_12);
                auh_12.a();
            }
            this.f = 0;
        }
        this.f();
        this.b = false;
    }

    @Override
    public void a(boolean bl) {
        adh_0 adh_02;
        super.a(bl);
        if (!bl && (adh_02 = (adh_0)aui_1.a().b(this.f)) != null) {
            adh_02.e(400);
        }
    }

    @Override
    void a(ahg_0 ahg_02, float f2, float f3) {
        if (!this.b) {
            return;
        }
        float f4 = this.d.a();
        if (f4 == 0.0f) {
            this.a();
            return;
        }
        this.b();
        adh_0 adh_02 = (adh_0)aui_1.a().b(this.f);
        if (adh_02 != null) {
            int n = (int)(this.c && f4 > 0.33f ? 2800.0f * f4 : 0.0f);
            adh_02.d(n);
            float f5 = 0.5235988f * Math.min(1.0f, 0.4f + f3);
            float f6 = 1.5707964f - f5;
            float f7 = 1.5707964f + f5;
            adh_02.a(0.05f * (float)Math.cos(Hw.a(f6, f7)));
        }
    }
}

