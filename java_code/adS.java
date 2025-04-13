/*
 * Decompiled with CFR 0.152.
 */
public class adS
extends avk_2 {
    private static final adX q = new adT();
    private static final adX r = new adU();
    private static final adX s = new adV();
    private static final adX t = new adW();
    protected float[] a;
    protected int b;
    protected ahh_0 c;

    protected adS() {
        this.c(this.g);
    }

    protected adS(afr_2 afr_22) {
        super(afr_22);
        this.c(this.g);
    }

    protected adS(afr_2 afr_22, float f2) {
        super(afr_22, f2);
        this.c(this.g);
    }

    protected adS(ahh_0 ahh_02, float f2) {
        this.c = ahh_02;
        this.g = f2;
        this.c(this.g);
    }

    protected adS(ahh_0 ahh_02) {
        this(ahh_02, 3.0f);
        this.l = true;
        this.c(this.g);
    }

    public ahh_0 a() {
        return this.c;
    }

    public void a(ahh_0 ahh_02) {
        if (this.c instanceof aeg) {
            ((aeg)((Object)this.c)).b(this);
        }
        this.c = ahh_02;
        if (this.c instanceof aeg) {
            ((aeg)((Object)this.c)).a(this);
        }
    }

    private void c(float f2) {
        int n = Hw.c(f2 + 1.0f);
        if (n == this.b) {
            return;
        }
        this.b = n;
        this.a = new float[this.b * this.b * 4];
        float f3 = 1.0f / (this.h[0] + this.h[1] * this.g + this.h[2] * this.g * this.g);
        afq_2 afq_22 = new afq_2(0.0f, 0.0f);
        for (int k = 0; k < this.b * 2; ++k) {
            for (int i2 = 0; i2 < this.b * 2; ++i2) {
                int n2 = i2 - this.b;
                int n3 = k - this.b;
                afq_22.a(n2, n3);
                float f4 = afq_22.d();
                this.a[i2 + k * this.b * 2] = f4 == 0.0f ? 1.0f : (f4 > this.g ? 0.0f : Math.max(0.0f, 1.0f - f4 * f3));
            }
        }
    }

    @Override
    public final boolean b() {
        if (this.c != null && !this.c.at()) {
            return false;
        }
        return super.b();
    }

    @Override
    public void a(float f2) {
        if (f2 == this.g) {
            return;
        }
        super.a(f2);
        this.c(this.g);
    }

    private static adX a(int n, int n2) {
        if (n == 0) {
            if (n2 == 0) {
                return q;
            }
            return s;
        }
        if (n2 == 0) {
            return r;
        }
        return t;
    }

    public void a(aeo aeo2, float f2) {
        afk_2 afk_22 = aeo2.b();
        afr_2 afr_22 = this.c();
        float f3 = afr_22.a();
        float f4 = afr_22.b();
        float f5 = afr_22.c();
        int n = Hw.c(f3);
        int n2 = Hw.c(f4);
        int n3 = Hw.c(f5);
        int n4 = (int)Math.ceil(this.g);
        if (!afk_22.b(n - n4, n + n4, n2 - n4, n2 + n4)) {
            return;
        }
        float f6 = (float)n - f3;
        float f7 = (float)n2 - f4;
        int n5 = (int)Math.signum(f6);
        int n6 = (int)Math.signum(f7);
        adX adX2 = adS.a(n5, n6);
        adX2.a(f6, f7, n5, n6);
        f2 *= this.k;
        int n7 = this.b * 2;
        for (int k = 0; k < n7; ++k) {
            int n8 = n2 + k - this.b;
            for (int i2 = 0; i2 < n7; ++i2) {
                int n9 = n + i2 - this.b;
                float f8 = this.a[i2 + k * n7];
                float f9 = adX2.a(i2, k, f8, this.a, n7);
                if ((f9 *= f2) < 0.004f) continue;
                for (int i3 = 0; i3 < n7; i3 += n7) {
                    int n10 = n3 + i3 - this.b;
                    aeo2.a(n9, n8, n10, f9 * this.e.a(), f9 * this.e.b(), f9 * this.e.c(), f9 * this.f.a(), f9 * this.f.b(), f9 * this.f.c());
                }
            }
        }
    }

    @Override
    public afr_2 c() {
        if (this.c != null) {
            return new afr_2(this.c.J(), this.c.K(), this.c.L());
        }
        return super.c();
    }

    @Override
    public void a(afr_2 afr_22) {
        if (this.c != null) {
            throw new RuntimeException("La source est attach\u00e9e \u00e0 une cible, on ne changera pas la position de la cible \u00e0 travers la source.");
        }
        super.a(afr_22);
    }
}

