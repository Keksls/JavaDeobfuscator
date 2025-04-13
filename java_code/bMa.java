/*
 * Decompiled with CFR 0.152.
 */
class bMa
implements ffb_0 {
    private final bmr_1 a;
    private final exh_2 b;
    private int c = -1;

    bMa(bmr_1 bmr_12, exh_2 exh_22) {
        this.a = bmr_12;
        this.b = exh_22;
    }

    @Override
    public void a(String string) {
    }

    @Override
    public void a(int n) {
    }

    @Override
    public void b(int n) {
    }

    @Override
    public void c(int n) {
    }

    @Override
    public void d(int n) {
        exk_2 exk_22 = this.a.cG().a(this.a.dC(), this.b);
        if (exk_22 == null || !exk_22.aQ_()) {
            return;
        }
        ffu_0 ffu_02 = exk_22.f();
        short s2 = ffu_02.i();
        if (this.c == s2) {
            return;
        }
        this.a.bI();
        this.c = s2;
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
    }
}

