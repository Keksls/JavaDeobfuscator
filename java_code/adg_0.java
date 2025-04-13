/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from adG
 */
class adg_0
extends adr_0 {
    protected float w;
    protected boolean x;
    protected float y;
    protected float z;

    adg_0() {
    }

    @Override
    public void a(float f2) {
        if (!this.x) {
            this.g = this.y / this.w;
            this.i = this.z;
            this.d += this.g * f2;
            this.e += this.h * f2;
            this.f += this.i * f2;
            this.a += this.d * f2;
            this.b += this.e * f2;
            this.c += this.f * f2;
            if (this.m < 0.3f) {
                this.m += 0.005f;
            }
            this.g = 0.0f;
            this.h = 0.0f;
            this.i = 0.0f;
        } else {
            this.t *= 1.0025f;
            this.u = this.t;
            this.m *= 0.99f;
            if (this.m < 0.01f) {
                this.n = this.o;
            }
        }
        this.n += f2;
    }
}

