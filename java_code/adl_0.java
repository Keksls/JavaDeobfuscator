/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from adl
 */
public class adl_0
extends adf_0 {
    private float f = 5.0f;
    private float g = 0.025f;
    private float h = 1500.0f;
    private int i;

    public final void d() {
        this.i = 0;
        adN adN2 = new adN(1.0f);
        this.a(adN2);
    }

    @Override
    public void a(int n) {
        super.a(n);
        this.i += n;
        float f2 = this.f * this.g();
        float f3 = (float)this.i / this.h * 1.5707964f;
        float f4 = Hw.h(f3);
        float f5 = !this.b() ? 0.0f : f4;
        float f6 = !this.c() ? 0.0f : f4;
        this.e.a(f2 * f5, f2 * f6);
        this.e.f(this.g() * this.g * (Hw.h(0.7f * f3) - 0.5f));
    }

    public void a(float f2, float f3, float f4) {
        this.h = f2;
        this.f = f3;
        this.g = f4;
    }
}

