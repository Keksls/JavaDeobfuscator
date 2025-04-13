/*
 * Decompiled with CFR 0.152.
 */
class aNO
extends adj_0 {
    float f;
    float g;
    final /* synthetic */ adN h;
    final /* synthetic */ ava_1 i;

    aNO(String string, String string2, ava_1 ava_12, adN adN2, ava_1 ava_13) {
        this.h = adN2;
        this.i = ava_13;
        super(string, string2, ava_12);
        this.f = 0.0f;
        this.g = 0.0f;
    }

    @Override
    public void a(int n) {
        super.a(n);
        float f2 = this.h.a();
        float f3 = 1.0f * f2 * (float)n;
        this.f += f3 * 0.0011f;
        this.g += f3 * 0.0013f;
        this.i.a("gStrength", f2);
        this.i.a("gDistordLow", this.f * 0.0013f, this.f * 0.0011f);
        this.i.a("gDistordHigh", -(this.g * 0.011f + this.g * 0.023f), 1.5f * this.g * 0.013f);
        abY abY2 = ans_0.D().c().b();
        this.i.a("camera", abY2.g_() / 1024.0f, abY2.h_() / 1024.0f, abY2.f());
    }
}

