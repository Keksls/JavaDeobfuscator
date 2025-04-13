/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from adx
 */
class adx_0
implements aey_2 {
    final /* synthetic */ adw_0 a;

    adx_0(adw_0 adw_02) {
        this.a = adw_02;
    }

    @Override
    public final float a(float f2, float f3, float f4) {
        float f5 = Hw.b(f4 * this.a.a + this.a.b, 0.0f, 1.0f);
        return f5 * this.a.c + (1.0f - this.a.c);
    }

    @Override
    public final afc_1 a() {
        return aez_2.a;
    }
}

