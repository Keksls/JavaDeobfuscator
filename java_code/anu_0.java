/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aNU
 */
class anu_0
extends adj_0 {
    float f;
    float g;
    float h;
    float i;
    long j;
    final /* synthetic */ adN k;
    final /* synthetic */ ava_1 l;

    anu_0(String string, String string2, ava_1 ava_12, adN adN2, ava_1 ava_13) {
        this.k = adN2;
        this.l = ava_13;
        super(string, string2, ava_12);
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0L;
    }

    @Override
    public void a(int n) {
        super.a(n);
        this.j += (long)n;
        float f2 = this.k.a();
        float f3 = 7.0f * (float)n;
        float f4 = 20.0f * f2 * (float)n;
        float f5 = this.b();
        this.f += f4 * 0.0011f;
        this.g += f4 * 0.0013f;
        this.h += f3 * 0.05f;
        this.i += f3 * 0.06f;
        float f6 = Hw.g((float)Math.PI / 180 * this.h * 0.13f) * 0.2f;
        float f7 = Hw.f((float)Math.PI / 180 * this.h * 0.11f) * 0.2f;
        float f8 = Hw.g((float)Math.PI / 180 * this.i * -0.34f) * 0.2f;
        float f9 = Hw.f((float)Math.PI / 180 * this.i * 0.2f) * 0.2f;
        this.l.a("gStrength", f2);
        this.l.a("caniculeToTemporal", f5);
        this.l.a("gDistordLow", this.f * 0.0013f, this.f * 0.0011f);
        this.l.a("gDistordHigh", -(this.g * 0.011f + this.g * 0.023f), 1.5f * this.g * 0.013f);
        this.l.a("gHeatDistordLow", f6, f7);
        this.l.a("gHeatDistordHigh", f8, f9);
        abY abY2 = ans_0.D().c().b();
        this.l.a("camera", abY2.g_() / 1024.0f, abY2.h_() / 1024.0f, abY2.f());
    }

    private float b() {
        long l = this.j % 141000L;
        if (l < 70000L) {
            return 0.0f;
        }
        if (l < 85000L) {
            return (float)(l - 70000L) / 15000.0f;
        }
        if (l < 135000L) {
            return 1.0f;
        }
        long l2 = l - 70000L - 15000L - 50000L;
        return 1.0f - (float)l2 / 6000.0f;
    }
}

