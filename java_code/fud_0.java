/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fud
 */
class fud_0
implements adv_1 {
    final /* synthetic */ ftx_0 a;

    fud_0(ftx_0 ftx_02) {
        this.a = ftx_02;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        adh_2 adh_22 = (adh_2)adt_12;
        if (adh_22.c() == 1) {
            this.a.setValue(this.a.getValue() + this.a.getButtonJump());
        } else if (adh_22.c() == 2) {
            this.a.setValue(this.a.getValue() - this.a.getButtonJump());
        }
        this.a.c();
        return false;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }
}

