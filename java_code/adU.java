/*
 * Decompiled with CFR 0.152.
 */
class adU
extends adX {
    private int a;
    private float b;
    private float c;

    adU() {
    }

    @Override
    void a(float f2, float f3, int n, int n2) {
        this.a = n;
        this.c = f2 * f2 / (float)(n * n);
        this.b = 1.0f - this.c;
    }

    @Override
    float a(int n, int n2, float f2, float[] fArray, int n3) {
        int n4 = n + this.a;
        float f3 = 0.0f;
        if (n4 >= 0 && n4 < n3) {
            f3 = fArray[n4 + n2 * n3];
        }
        return f2 * this.b + f3 * this.c;
    }
}

