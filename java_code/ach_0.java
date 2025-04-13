/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from acH
 */
class ach_0
extends ahm_0 {
    private static final float a = 0.005f;
    private final air_0 c = new air_0();
    private float d = 0.1f;
    private float e = 0.1f;
    private float f = 1.0f;
    private float g;
    private float h;
    private float i;

    ach_0(acb_0 acb_02) {
        super(acb_02);
        this.c.b(2.0f);
        this.c.a(0.005f);
    }

    @Override
    public float e_() {
        return 0.0f;
    }

    @Override
    public float f_() {
        return 0.0f;
    }

    @Override
    public final float g_() {
        return this.g;
    }

    @Override
    public final float h_() {
        return this.h;
    }

    @Override
    public float i_() {
        return 0.0f;
    }

    @Override
    public final float f() {
        return this.i;
    }

    @Override
    public void a(int n) {
        this.c.a(n);
        if (this.l()) {
            this.k();
        }
    }

    final void a(ahq_0 ahq_02, float f2, float f3, float f4) {
        this.d = f2;
        this.e = f3;
        this.i = this.f = f4;
        if (ahq_02 == null) {
            this.g = 0.0f;
            this.h = 0.0f;
            this.c.c(0.0f);
        } else {
            this.g = ahq_02.g_();
            this.h = ahq_02.h_();
            this.c.c(ahq_02.A());
        }
        this.m();
    }

    final void a(abY abY2, boolean bl, int n) {
        this.a(abY2);
        this.c.e(abY2.A());
        this.a(n);
        this.a(abY2, bl);
    }

    private void a(abY abY2) {
        float f2 = abY2.g_() * this.d;
        float f3 = abY2.h_() * this.d;
        if (this.g_() != f2 || this.h_() != f3) {
            this.g = f2;
            this.h = f3;
            this.m();
        }
    }

    private void a(abY abY2, boolean bl) {
        float f2 = abY2.f() - 1.0f;
        float f3 = 0.005f * this.c.a();
        float f4 = this.f + (f2 + f3) * this.e;
        if (this.f() != f4) {
            this.i = f4;
            this.m();
        }
    }
}

