/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aOK
 */
public class aok_0
extends aiE {
    protected static final Logger l = Logger.getLogger(aok_0.class);
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;

    public aok_0(ahh_0 ahh_02) {
        super(ahh_02);
        this.a(-0.4f, -0.4f, -0.4f);
    }

    @Override
    public void a(float f2, float f3, float f4) {
        super.a(f2, f3, f4);
        this.o = f2;
        this.p = f3;
        this.q = f4;
    }

    @Override
    public boolean a(float f2, float f3, float f4, float[] fArray) {
        if (!aol_0.d().c()) {
            return false;
        }
        float f5 = f2 - this.b;
        float f6 = f3 - this.c;
        float f7 = afq_2.c(f5, f6);
        if (f7 > this.h * this.h) {
            return false;
        }
        float f8 = Hw.k(f7);
        float f9 = aol_0.d().b();
        float f10 = f9 - this.m / 2.0f;
        float f11 = f9 + this.m / 2.0f;
        float f12 = f5 / f8;
        float f13 = f6 / f8;
        float f14 = (float)Math.acos(f12);
        float f15 = (float)Math.asin(f13);
        if (f15 > 0.0f) {
            f14 *= -1.0f;
        }
        if ((double)f14 > -Math.PI && f14 < 0.0f) {
            f14 = (float)((double)f14 + Math.PI * 2);
        }
        if (f14 >= f10 && f14 <= f11) {
            float f16 = Math.abs(f14 - f9);
            float f17 = (1.0f - f16 / this.m) * (1.0f - f8 / (this.h + 1.0f));
            fArray[0] = f17 * this.e;
            fArray[1] = f17 * this.f;
            fArray[2] = f17 * this.g;
        }
        return true;
    }

    @Override
    public boolean b() {
        return super.b() || aol_0.d().c() && aol_0.d().a() != this.n;
    }

    @Override
    public void a(int n) {
        super.a(n);
        this.n = aol_0.d().a();
        this.e = this.o * this.n;
        this.f = this.p * this.n;
        this.g = this.q * this.n;
    }

    public void h(float f2) {
        this.m = f2;
    }
}

