/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMr
 */
public class amr_1 {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final int e;
    private float f;
    private float g;
    private long h = -1L;

    public amr_1(float f2, float f3, float f4, float f5, int n) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.f = f2;
        this.g = f3;
        this.e = n;
    }

    public boolean a(long l) {
        if (this.h == -1L) {
            this.h = l;
            return true;
        }
        int n = (int)(l - this.h);
        int n2 = Hw.a(n, 0, this.e);
        this.f = this.a(this.a, this.c, n2, this.e);
        this.g = this.a(this.b, this.d, n2, this.e);
        return n < this.e;
    }

    public void a() {
        this.f = this.c;
        this.g = this.d;
    }

    public float b() {
        return this.g;
    }

    public float c() {
        return this.f;
    }

    private float a(float f2, float f3, int n, int n2) {
        float f4 = (float)n / (float)n2;
        float f5 = (0.5f - f4) * (1.0f - 2.0f * Math.abs(0.5f - f4));
        return f2 + (f3 - f2) * (f4 -= f5);
    }
}

