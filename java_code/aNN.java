/*
 * Decompiled with CFR 0.152.
 */
class aNN
extends adj_0 {
    float f;

    aNN(String string, String string2, ava_1 ava_12) {
        super(string, string2, ava_12);
    }

    @Override
    public void a(int n) {
        this.f += (float)n;
        super.a(n);
        int n2 = 30000;
        if (this.f > 30000.0f) {
            this.a(false);
            return;
        }
        if (this.f > 20000.0f) {
            this.a.a("radius", Hw.b((this.f - 20000.0f) / 10000.0f, 0.4f, 1.0f));
            return;
        }
        this.a.a("gStrength", 1.0f);
        this.a.a("radius", Hw.b(1.0f - this.f / 10000.0f, 0.4f, 1.0f));
    }
}

