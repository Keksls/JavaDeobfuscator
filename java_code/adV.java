/*
 * Decompiled with CFR 0.152.
 */
class adV
extends adX {
    private int a;
    private float b;
    private float c;

    adV() {
    }

    @Override
    void a(float f2, float f3, int n, int n2) {
        this.a = n2;
        this.b = f3 * f3 / (float)(n2 * n2);
        this.c = 1.0f - this.b;
    }

    @Override
    float a(int n, int n2, float f2, float[] fArray, int n3) {
        int n4 = n2 + this.a;
        float f3 = 0.0f;
        if (n4 >= 0 && n4 < n3) {
            f3 = fArray[n + n4 * n3];
        }
        return f2 * this.c + f3 * this.b;
    }
}

