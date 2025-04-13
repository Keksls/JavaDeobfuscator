/*
 * Decompiled with CFR 0.152.
 */
public class aiE
extends avh_2 {
    protected ahh_0 a;

    public aiE(ahh_0 ahh_02) {
        this.a = ahh_02;
    }

    public void a(ahh_0 ahh_02) {
        this.a = ahh_02;
    }

    public ahh_0 a() {
        return this.a;
    }

    @Override
    public boolean b() {
        if (this.j) {
            return true;
        }
        if (this.a != null) {
            if (Math.abs(this.b - this.a.J()) > 0.01f) {
                this.j = true;
            } else if (Math.abs(this.c - this.a.K()) > 0.01f) {
                this.j = true;
            } else if (Math.abs(this.d - this.a.L()) > 0.01f) {
                this.j = true;
            }
        }
        return this.j;
    }

    @Override
    public void a(int n) {
        if (this.a != null) {
            this.b = this.a.J();
            this.c = this.a.K();
            this.d = this.a.L();
        }
    }

    @Override
    public boolean a(float f2, float f3, float f4, float[] fArray) {
        float f5;
        float f6;
        if (!this.i) {
            return false;
        }
        float f7 = this.j() - f2;
        float f8 = f7 * f7 + (f6 = this.k() - f3) * f6 + (f5 = this.l() - f4) * f5;
        if (f8 > this.h * this.h) {
            return false;
        }
        float f9 = Hw.k(f8);
        float f10 = 0.5f * (1.0f + Hw.i((float)Math.PI * f9 / this.h));
        if (f10 <= 0.0f) {
            return false;
        }
        fArray[0] = f10 * this.e;
        fArray[1] = f10 * this.f;
        fArray[2] = f10 * this.g;
        return true;
    }
}

