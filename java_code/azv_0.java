/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aZV
 */
class azv_0
implements fzp_0 {
    final /* synthetic */ azu_0 a;

    azv_0(azu_0 azu_02) {
        this.a = azu_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n != 8) {
            return;
        }
        this.a.b(daB.a());
        this.a.b(cgu_2.a());
        cgu_2.a().g();
        bmr_1 bmr_12 = this.a.k();
        if (bmr_12 != null && (bmr_12.eE() == null || bmr_12.eE().ac_() != 4)) {
            azw_0 azw_02 = new azw_0(this);
            this.a.a(bmr_12, azw_02);
        } else {
            this.a.P();
        }
    }
}

