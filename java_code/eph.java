/*
 * Decompiled with CFR 0.152.
 */
class eph {
    float a = 1.0f;
    float b = 1.0f;

    eph() {
    }

    eph a(float f2, float f3) {
        this.a = f2;
        this.b = f3;
        return this;
    }

    eph a() {
        this.a = 0.0f;
        this.b = 0.0f;
        return this;
    }
}

