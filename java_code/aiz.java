/*
 * Decompiled with CFR 0.152.
 */
public class aiz
implements aiB {
    final afd_1 a = new afd_1();
    final float b;
    float c = 1.0f;

    public aiz(float f2) {
        this.b = f2;
    }

    @Override
    public void a(float f2) {
        this.c = f2;
    }

    @Override
    public afd_1 a(float f2, float f3) {
        float f4 = this.b * this.c;
        float f5 = f4 * f4;
        float f6 = afq_2.c(f2, f3);
        if (f6 <= f5 + 0.01f) {
            return null;
        }
        float f7 = f4 / Hw.k(f6);
        this.a.b(f7 * f2, f7 * f3);
        return this.a;
    }
}

