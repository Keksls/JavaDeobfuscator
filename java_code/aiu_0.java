/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aiU
 */
public class aiu_0
extends aiv_0 {
    private final float a = 4.8f;
    private static final float c = 9.81f;
    private static final float d = 1.0f;
    private float e = 1.0f;
    private final float f = 9.81f;
    private final float g;
    private final float h;
    private final float i;
    private float j;
    private final float k;
    private final float l;
    private final float m;
    private final float n;
    private int o;

    public aiu_0(ahh_0 ahh_02, float f2, float f3, float f4, double d2) {
        this(ahh_02, f2, f3, f4, d2, 1.0f);
    }

    public aiu_0(ahh_0 ahh_02, float f2, float f3, float f4, double d2, float f5) {
        super(ahh_02);
        this.e = f5;
        this.g = this.b.J();
        this.h = this.b.K();
        this.i = this.b.L();
        this.j = f4 - this.i;
        d2 = (float)Math.toRadians(d2 == 0.0 ? 1.0 : d2);
        float f6 = afq_2.b(f2 - this.g, f3 - this.h);
        float f7 = (float)Math.sqrt((double)(9.81f * f6) / Math.sin(2.0 * d2));
        double d3 = Math.atan((f3 - this.h) / (f2 - this.g));
        if (f2 - this.g < 0.0f) {
            d3 += Math.PI;
        }
        this.n = 2.0f * f7 * (float)Math.sin(d2) / 9.81f;
        double d4 = (double)f7 * Math.cos(d2);
        this.k = (float)(Math.cos(d3) * d4);
        this.l = (float)(Math.sin(d3) * d4);
        this.m = f7 * (float)Math.sin(d2);
        this.j /= this.n;
    }

    @Override
    public void a(int n) {
        this.o += n;
        float f2 = (float)this.o * (this.e / 1000.0f);
        if (this.b == null || f2 > this.n) {
            this.h();
            return;
        }
        float f3 = this.k * f2 + this.g;
        float f4 = this.l * f2 + this.h;
        float f5 = -4.905f * f2 * f2 + this.m * f2;
        float f6 = 8.6f * f5 + this.i + f2 * this.j;
        this.b.b(f3, f4, f6);
    }

    @Override
    public float f() {
        return this.n * 1000.0f / this.e;
    }
}

