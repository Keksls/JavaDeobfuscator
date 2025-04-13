/*
 * Decompiled with CFR 0.152.
 */
public class aiC
implements aiB {
    public final int a;
    public final int b;
    public final int c;
    public final int e;
    final afd_1 f = new afd_1();
    float g = 1.0f;

    public aiC(int n, int n2) {
        this.a = -n;
        this.b = n;
        this.c = -n2;
        this.e = n2;
    }

    @Override
    public void a(float f2) {
        this.g = f2;
    }

    @Override
    public afd_1 a(float f2, float f3) {
        if (Math.abs(f2) / (float)this.b >= Math.abs(f3) / (float)this.e) {
            float f4 = (float)this.a * this.g;
            if (f2 <= f4 - 0.01f) {
                float f5 = f4;
                float f6 = f3 * f5 / f2;
                this.f.b(f5, f6);
                return this.f;
            }
            float f7 = (float)this.b * this.g;
            if (f2 >= f7 + 0.01f) {
                float f8 = f7;
                float f9 = f3 * f8 / f2;
                this.f.b(f8, f9);
                return this.f;
            }
        } else {
            float f10 = (float)this.c * this.g;
            if (f3 <= f10 - 0.01f) {
                float f11 = f10;
                float f12 = f2 * f11 / f3;
                this.f.b(f12, f11);
                return this.f;
            }
            float f13 = (float)this.e * this.g;
            if (f3 >= f13 + 0.01f) {
                float f14 = f13;
                float f15 = f2 * f14 / f3;
                this.f.b(f15, f14);
                return this.f;
            }
        }
        return null;
    }
}

