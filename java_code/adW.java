/*
 * Decompiled with CFR 0.152.
 */
class adW
extends adX {
    private int a;
    private int b;
    private float c;
    private float d;
    private float e;
    private float f;

    adW() {
    }

    @Override
    void a(float f2, float f3, int n, int n2) {
        this.a = n;
        this.b = n2;
        float f4 = f2 * f2 / (float)(n * n);
        float f5 = f3 * f3 / (float)(n2 * n2);
        this.c = (1.0f - f4) * (1.0f - f5);
        this.d = (1.0f - f4) * f5;
        this.e = f4 * (1.0f - f5);
        this.f = f4 * f5;
    }

    @Override
    float a(int n, int n2, float f2, float[] fArray, int n3) {
        int n4 = n + this.a;
        int n5 = n2 + this.b;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        if (n5 >= 0 && n5 < n3) {
            f3 = fArray[n + n5 * n3];
            if (n4 >= 0 && n4 < n3) {
                f5 = fArray[n4 + n5 * n3];
            }
        }
        if (n4 >= 0 && n4 < n3) {
            f4 = fArray[n4 + n2 * n3];
        }
        return f2 * this.c + f3 * this.d + f4 * this.e + f5 * this.f;
    }
}

