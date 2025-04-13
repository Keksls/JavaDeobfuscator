/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from adm
 */
public class adm_0
extends adf_0 {
    private float f = 0.5f;
    private float g = 77.0f;
    private int h;

    @Override
    public void a(int n) {
        super.a(n);
        this.h += n;
        float f2 = this.g() * this.f;
        float f3 = (float)this.h / this.g * 1.5707964f;
        float f4 = !this.b() ? 0.0f : Math.abs(Hw.i(f3)) - 1.0f;
        float f5 = !this.c() ? 0.0f : -Math.abs(Hw.h(f3));
        this.e.a(f2 * f4, f2 * f5);
    }

    public final void d() {
        this.h = 0;
        adN adN2 = new adN(1.0f);
        this.a(adN2);
    }

    public final void a(float f2, float f3) {
        this.g = f2;
        this.f = f3;
    }
}

