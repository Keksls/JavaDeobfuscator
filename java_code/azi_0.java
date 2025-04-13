/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aZi
 */
public class azi_0
extends adS {
    float q;
    float r;
    boolean s;
    boolean t;
    final float u;
    final float v;

    public azi_0(ahh_0 ahh_02, float f2, float f3) {
        super(ahh_02);
        this.q = f2;
        this.r = f3;
        this.u = ahh_02.G();
        this.v = ahh_02.H();
    }

    @Override
    public void a(int n) {
        super.a(n);
        ahh_0 ahh_02 = this.a();
        ahh_02.b(ahh_02.J() + this.q, ahh_02.K() + this.r);
        int n2 = 12;
        if ((float)ahh_02.G() > this.u + 12.0f) {
            this.q = -this.q;
        }
        if ((float)ahh_02.G() < this.u - 12.0f) {
            this.q = -this.q;
        }
        if ((float)ahh_02.H() > this.v + 12.0f) {
            this.r = -this.r;
        }
        if ((float)ahh_02.H() < this.v - 12.0f) {
            this.r = -this.r;
        }
    }
}

