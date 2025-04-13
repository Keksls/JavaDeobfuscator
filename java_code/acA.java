/*
 * Decompiled with CFR 0.152.
 */
public class acA {
    public float a = 1.0f;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    private float e = 0.0f;
    private float f = 0.0f;
    private float g = 0.0f;
    private float h = 0.0f;
    private float i = 0.0f;
    private float j = 0.0f;
    private float k = 0.0f;
    private float l = 0.0f;
    private float m;
    private float n;

    acA() {
    }

    void a(float f2, float f3, float f4, float f5, float f6) {
        this.i = f2;
        this.j = f3;
        this.k = f4;
        this.l = f5;
        this.e = this.a;
        this.f = this.b;
        this.g = this.c;
        this.h = this.d;
        this.n = this.m = f6;
    }

    public boolean a(int n) {
        if (this.m < 0.0f) {
            if (this.m == Float.NEGATIVE_INFINITY) {
                return false;
            }
            this.a = this.e = this.i;
            this.b = this.f = this.j;
            this.c = this.g = this.k;
            this.d = this.h = this.l;
            this.m = Float.NEGATIVE_INFINITY;
            return this.a == 1.0f && this.b == 1.0f && this.c == 1.0f && this.d == 1.0f;
        }
        this.m -= (float)n;
        float f2 = 1.0f - this.m / this.n;
        this.a = this.e + (this.i - this.e) * f2;
        this.b = this.f + (this.j - this.f) * f2;
        this.c = this.g + (this.k - this.g) * f2;
        this.d = this.h + (this.l - this.h) * f2;
        return false;
    }
}

