/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aiT
 */
public class ait_0
extends aiv_0 {
    private static final float a = 1.0f;
    private final float c = 1.0f;
    private int d;
    private final float e;
    private float f = 0.0f;
    private float g = 10.0f;
    private final float h = this.b.J();
    private final float i = this.b.K();

    public ait_0(ahh_0 ahh_02, float f2, float f3) {
        super(ahh_02);
        this.f = f2 - this.h;
        this.g = f3 - this.i;
        this.e = 1000.0f;
    }

    @Override
    public void a(int n) {
        this.d += n;
        float f2 = (float)this.d * 0.001f;
        if (this.b == null || f2 > this.e) {
            this.h();
            return;
        }
        float f3 = f2 / this.e;
        this.b.b(this.h + this.f * f3, this.i + this.g * f3);
    }

    @Override
    public float f() {
        return this.e;
    }
}

