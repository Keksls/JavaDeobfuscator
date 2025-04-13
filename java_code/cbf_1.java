/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbF
 */
class cbf_1
extends cbr_1 {
    private int e;

    cbf_1() {
    }

    @Override
    void a(ahg_0 ahg_02) {
        super.a(ahg_02);
        this.b = true;
    }

    private void b() {
        if (this.e != 0) {
            return;
        }
        adj_0 adj_02 = new adj_0(aNM.a() + "freeze.cgfx", "freeze");
        aNM.a(adj_02, new cbg_1(this, 0.0f));
        this.e = adj_02.f();
    }

    private void f() {
        if (this.e == 0) {
            return;
        }
        aNM.a(this.e);
        this.e = 0;
    }

    @Override
    void a() {
        super.a();
        this.f();
        this.b = false;
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
    }
}

