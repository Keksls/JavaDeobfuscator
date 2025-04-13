/*
 * Decompiled with CFR 0.152.
 */
class bgD
implements emh_0 {
    final /* synthetic */ bmr_1 a;
    final /* synthetic */ enu_0 b;
    final /* synthetic */ bgB c;

    bgD(bgB bgB2, bmr_1 bmr_12, enu_0 enu_02) {
        this.c = bgB2;
        this.a = bmr_12;
        this.b = enu_02;
    }

    @Override
    public emg_0 N_() {
        emg_0 emg_02 = new emg_0();
        emg_02.a(this.a.N_());
        emg_02.b(this.b);
        return emg_02;
    }

    @Override
    public long T_() {
        return this.a.T_();
    }

    @Override
    public /* synthetic */ emu_0 c() {
        return this.N_();
    }
}

