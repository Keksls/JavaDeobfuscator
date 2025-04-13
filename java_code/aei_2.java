/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aEI
 */
public class aei_2 {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public aei_2(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
    }

    public float a(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new RuntimeException("Time index out of bounds : t=" + f2);
        }
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        return (2.0f * f4 - 3.0f * f3 + 1.0f) * this.a + (f4 - 2.0f * f3 + f2) * this.c + (-2.0f * f4 + 3.0f * f3) * this.b + (f4 - f3) * this.d;
    }
}

