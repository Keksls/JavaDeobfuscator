/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aNW
 */
class anw_0
extends adj_0 {
    float f;
    float g;
    float h;
    float i;
    float j;
    long k;
    final /* synthetic */ adN l;
    final /* synthetic */ ava_1 m;

    anw_0(String string, String string2, ava_1 ava_12, adN adN2, ava_1 ava_13) {
        this.l = adN2;
        this.m = ava_13;
        super(string, string2, ava_12);
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0L;
    }

    @Override
    public void a(int n) {
        super.a(n);
        this.k += (long)n;
        float f2 = this.l.a();
        float f3 = 7.0f * (float)n;
        float f4 = 20.0f * f2 * (float)n;
        float f5 = 5.0f * (float)n;
        this.f += f4 * 0.0011f;
        this.g += f4 * 0.0013f;
        this.h += f3 * 0.02f;
        this.i += f3 * 0.09f;
        this.j += f5 * 0.02f;
        float f6 = Hw.g((float)Math.PI / 180 * this.h * -0.34f) * 0.2f;
        float f7 = Hw.f((float)Math.PI / 180 * this.h * 0.2f) * 0.2f;
        float f8 = Hw.g((float)Math.PI / 180 * this.i * -0.34f) * 0.2f;
        float f9 = Hw.f((float)Math.PI / 180 * this.i * 0.2f) * 0.2f;
        float f10 = Hw.g((float)Math.PI / 180 * this.j * -0.1f) * 0.1f;
        float f11 = Hw.g((float)Math.PI / 180 * this.j * -0.4f) * 0.1f;
        float f12 = Hw.g((float)Math.PI / 180 * this.j * -0.7f) * 0.1f;
        this.m.a("gStrength", f2);
        this.m.a("gDistordLow", this.f * 0.0013f, this.f * 0.0011f);
        this.m.a("gDistordHigh", -(this.g * 0.011f + this.g * 0.023f), 1.5f * this.g * 0.013f);
        this.m.a("gHeatDistordLow", f6, f7);
        this.m.a("gHeatDistordHigh", f8, f9);
        this.m.a("gColorVariation", f10, f11, f12);
        abY abY2 = ans_0.D().c().b();
        this.m.a("camera", abY2.g_() / 1024.0f, abY2.h_() / 1024.0f, abY2.f());
    }
}

