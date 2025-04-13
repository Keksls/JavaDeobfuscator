/*
 * Decompiled with CFR 0.152.
 */
class aNQ
extends adj_0 {
    int f;
    final /* synthetic */ ava_1 g;

    aNQ(String string, String string2, ava_1 ava_12, ava_1 ava_13) {
        this.g = ava_13;
        super(string, string2, ava_12);
        this.f = 0;
    }

    @Override
    public void a(int n) {
        this.f += n;
        super.a(n);
        float f2 = Hw.i((float)Math.PI / 180 * (float)this.f / 271.0f);
        float f3 = Hw.h((float)Math.PI / 180 * (float)this.f / 233.0f);
        float f4 = 2.0f * Hw.i((float)Math.PI / 180 * (float)this.f / 2503.0f);
        float f5 = 2.0f * Hw.h((float)Math.PI / 180 * (float)this.f / 3373.0f);
        this.g.a("gDistordLow", f2, f3);
        this.g.a("gDistordHigh", f4, f5);
    }
}

