/*
 * Decompiled with CFR 0.152.
 */
class aNR
extends adj_0 {
    int f;
    final /* synthetic */ ava_1 g;

    aNR(String string, String string2, ava_1 ava_12, ava_1 ava_13) {
        this.g = ava_13;
        super(string, string2, ava_12);
        this.f = 0;
    }

    @Override
    public void a(int n) {
        this.f += n;
        super.a(n);
        float f2 = (float)this.f * 0.0011f;
        float f3 = (float)this.f * 0.0013f;
        this.g.a("gDistordLow", -f2 * 0.0013f, f2 * 0.0011f);
        this.g.a("gDistordHigh", f3 * 0.011f + f3 * 0.023f, f3 * 0.013f);
        abY abY2 = ans_0.D().c().b();
        this.g.a("camera", abY2.g_() / 1024.0f, abY2.h_() / 1024.0f, abY2.f());
    }
}

