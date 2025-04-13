/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axa
 */
public class axa_1 {
    private float d;
    private float e;
    private float f;
    public float a;
    public float b;
    public float c;
    private final float[] g = new float[9];

    public void a(float f2, float f3, float f4) {
        this.d = f2;
        this.e = f3;
        this.f = f4;
        float f5 = (float)Math.sin(this.d);
        float f6 = (float)Math.sin(this.e);
        float f7 = (float)Math.sin(this.f);
        float f8 = (float)Math.cos(this.d);
        float f9 = (float)Math.cos(this.e);
        float f10 = (float)Math.cos(this.f);
        this.g[0] = f8 * f9;
        this.g[1] = f8 * f6 * f7 - f5 * f10;
        this.g[2] = f8 * f6 * f10 + f5 * f7;
        this.g[3] = f5 * f9;
        this.g[4] = f5 * f6 * f7 + f8 * f10;
        this.g[5] = f5 * f6 * f10 - f8 * f7;
        this.g[6] = -f6;
        this.g[7] = f9 * f7;
        this.g[8] = f9 * f10;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f2 - f5;
        float f9 = f3 - f6;
        float f10 = f4 - f7;
        this.a = this.g[0] * f8 + this.g[1] * f9 + this.g[2] * f10;
        this.b = this.g[3] * f8 + this.g[4] * f9 + this.g[5] * f10;
        this.c = this.g[6] * f8 + this.g[7] * f9 + this.g[8] * f10;
        this.a += f5;
        this.b += f6;
        this.c += f7;
    }
}

