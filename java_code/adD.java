/*
 * Decompiled with CFR 0.152.
 */
public class adD
extends ado_0 {
    private float w;
    private float x;
    private float y;
    private float z;
    private float A;
    private float B;
    private final String C;
    private float D = 1.0f;
    private float E = 1.0f;
    private float F = 1.0f;
    private float G = 0.1f;
    private float H = 0.0f;

    public adD() {
        super(new adF());
        this.f = 128.0f;
        this.a = 100.0f;
        this.w = 300.0f;
        this.G = 0.25f;
        this.x = 40.0f;
        this.y = 60.0f;
        this.z = 0.0f;
        this.A = -1.5707964f;
        this.B = 0.31415927f;
        this.C = "textures/rain.tga";
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(true);
        this.f = f2;
        this.a = f3 * 0.001f;
        this.w = f4 * 0.001f;
        this.x = f5;
        this.y = f6;
        this.z = f7;
        this.d();
    }

    private void d() {
        avx_2 avx_22 = auj_1.a.a();
        ays_2 ays_22 = ayu_2.a().a((aui_2)avx_22, -1296775008915292150L, auc_1.a().c() + this.C, false);
        this.g.a(0, ays_22);
    }

    public final void a(float f2, float f3, float f4, float f5, float f6) {
        this.D = f2;
        this.E = f3;
        this.F = f4;
        this.G = f5;
        this.H = f6;
    }

    public void a(float f2) {
        this.z = f2;
    }

    public final void a(float f2, float f3) {
        this.A = f2;
        this.B = f3;
    }

    @Override
    protected boolean b() {
        return true;
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    protected void a(adr_0 adr_02) {
        float f2 = Hw.d();
        float f3 = 1.0f;
        float f4 = 10.0f;
        float f5 = 1.0f + Hw.h(f2 * f2 * 0.7853982f) * 9.0f;
        float f6 = Hw.a(1.0f, f5);
        float f7 = (f6 - 1.0f) / 9.0f;
        float f8 = this.e.e_();
        float f9 = this.e.f_();
        float f10 = this.e.A();
        adr_02.a = this.t.c() + Hw.d() * this.t.h() + f8;
        adr_02.b = this.t.e() + Hw.d() * this.t.i() + f9;
        adr_02.c = this.t.f() + f10;
        adr_02.d = 0.0f;
        adr_02.e = 0.0f;
        adr_02.f = 0.1f * this.y * (1.0f + f7);
        adr_02.g = 0.0f;
        adr_02.h = 0.0f;
        adr_02.i = this.z;
        adr_02.u = this.x * (2.0f + 2.0f * f7);
        adr_02.t = f7 * 0.5f + 0.9f;
        adr_02.o = this.w / (1.0f + f7);
        adr_02.n = 0.0f;
        adr_02.j = this.D;
        adr_02.k = this.E;
        adr_02.l = this.F;
        adr_02.m = this.G + f7 * this.H;
        adr_02.p = 0.0f;
        adr_02.q = 0.0f;
        adr_02.s = 1.0f;
        adr_02.r = 1.0f;
        adr_02.v = this.A + Hw.a(-1.0f, 1.0f) * this.B;
        this.g.a(new adE(this));
    }

    @Override
    protected final void a(adr_0 adr_02, float f2) {
        adr_02.a(f2);
    }
}

