/*
 * Decompiled with CFR 0.152.
 */
class adC
extends adr_0 {
    adC() {
    }

    @Override
    public void a(float f2) {
        this.d += this.g;
        this.e += this.h;
        this.f += this.i;
        if (this.v != 0.0f) {
            float f3 = Hw.i(this.v);
            float f4 = Hw.h(this.v);
            this.a += (this.d + f3 * 0.125f * this.f) * f2;
            this.b += (this.e - f3 * 0.125f * this.f) * f2;
            this.c += f4 * this.f * f2;
        } else {
            this.a += this.d * f2;
            this.b += this.e * f2;
            this.c += this.f * f2;
        }
        this.n += f2;
    }
}

