/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbO
 */
class cbo_2
extends cbj_2 {
    private static final cbk_2 e = new cbk_2();
    private cbq_1 f;

    cbo_2() {
        super(e);
    }

    @Override
    void a(ahg_0 ahg_02) {
        super.a(ahg_02);
        this.f = new cbq_1();
        this.f.a(true);
        this.f.a(ahg_02.s());
        aui_1.a().a(this.f);
    }

    @Override
    void a() {
        super.a();
        if (this.f != null) {
            this.f.a(false);
            this.f = null;
        }
    }

    @Override
    void a(float f2, int n, long l) {
        super.a(f2, n, l);
        if (f2 == 0.0f && this.f != null) {
            this.f.a(false);
            this.f = null;
        }
    }

    @Override
    void a(ahg_0 ahg_02, float f2, float f3) {
        super.a(ahg_02, f2, f3);
    }

    static {
        cbo_2.e.f = 10.0f;
        cbo_2.e.h = 0.05f;
        cbo_2.e.e = 80.0f;
        cbo_2.e.j = 1.0f;
    }
}

