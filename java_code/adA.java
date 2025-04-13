/*
 * Decompiled with CFR 0.152.
 */
public class adA
extends ado_0 {
    public adA() {
        super(new adB());
        this.f = 1.0f;
        this.a = 0.0f;
    }

    public void a(float f2, float f3) {
        this.a(true);
        this.f = f2;
        this.a = f3 * 0.001f;
        avx_2 avx_22 = auj_1.a.a();
        ays_2 ays_22 = ayu_2.a().a((aui_2)avx_22, -1296775008915292148L, auc_1.a().c() + "textures/raindrop.tga", false);
        this.g.a(0, ays_22);
    }

    @Override
    protected boolean b() {
        return false;
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    protected void a(adr_0 adr_02) {
        float f2 = this.e.e_();
        float f3 = this.e.f_();
        float f4 = this.e.A();
        adr_02.a = f2 + Hw.a(this.t.c(), this.t.b());
        adr_02.b = f3 + Hw.a(this.t.e(), this.t.d());
        adr_02.c = f4 + this.t.g();
        adr_02.o = 0.33f;
        adr_02.n = 0.0f;
        adr_02.j = 1.0f;
        adr_02.k = 1.0f;
        adr_02.l = 1.0f;
        adr_02.m = 1.0f;
        adr_02.p = 0.0f;
        adr_02.q = 0.0f;
        adr_02.s = 1.0f;
        adr_02.r = 1.0f;
        float f5 = Hw.a(7.0f, 11.0f);
        adr_02.t = f5 * 2.0f;
        adr_02.u = f5;
    }

    @Override
    protected void a(adr_0 adr_02, float f2) {
        adr_02.a(f2);
    }
}

