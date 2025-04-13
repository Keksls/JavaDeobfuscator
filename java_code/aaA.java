/*
 * Decompiled with CFR 0.152.
 */
public class aaA
extends aag<abr, Float> {
    float[] f;
    private int g;
    private int h;

    public aaA(abr abr2) {
        super(abr2);
    }

    protected Float i() {
        return Float.valueOf(this.c[this.h + 1].f());
    }

    @Override
    public void c(int n) {
        super.c(n);
        this.g += n;
        int n2 = this.j();
        if (this.g > n2) {
            this.g -= n2;
            int n3 = this.f.length;
            float f2 = Hw.a(0.0f, this.f[n3 - 1]);
            for (int k = 0; k < n3; ++k) {
                if (!(f2 < this.f[k])) continue;
                this.h = k;
                break;
            }
        }
    }

    private int j() {
        if (this.c[this.h + 1] instanceof aao_0) {
            return (int)((aao_0)this.c[this.h + 1]).j();
        }
        return this.c[0].g();
    }

    @Override
    public float f() {
        return ((Float)this.e()).floatValue();
    }

    @Override
    public int g() {
        return ((Float)this.e()).intValue();
    }

    @Override
    public String h() {
        return null;
    }

    @Override
    public int c() {
        return this.f.length + 1;
    }

    @Override
    protected /* synthetic */ Object d() {
        return this.i();
    }
}

