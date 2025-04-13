/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aub
 */
public class aub_1 {
    private final ft_0 a;

    public aub_1(ft_0 ft_02) {
        this.a = ft_02;
    }

    public void a(Fx fx, Fx fx2) {
        fx2.a(!fx.b() && fx.j());
        if (fx.j()) {
            fx2.a(this.a.f());
            fx2.c(this.a.h());
            fx2.b(this.a.g());
            fx2.d(this.a.i());
        } else {
            fx2.a(this.a.f() * fx.d() + this.a.g() * fx.f());
            fx2.b(this.a.f() * fx.e() + this.a.g() * fx.g());
            fx2.c(this.a.h() * fx.d() + this.a.i() * fx.f());
            fx2.d(this.a.h() * fx.e() + this.a.i() * fx.g());
        }
        fx2.b(!fx.c() && fx.k());
        if (fx.k()) {
            fx2.e(this.a.j() + fx.h());
            fx2.f(this.a.k() + fx.i());
        } else {
            fx2.e(this.a.j() * fx.d() + this.a.k() * fx.f() + fx.h());
            fx2.f(this.a.j() * fx.e() + this.a.k() * fx.g() + fx.i());
        }
        fx2.g(fx.l() * this.a.p() + this.a.l());
        fx2.h(fx.m() * this.a.q() + this.a.m());
        fx2.i(fx.n() * this.a.r() + this.a.n());
        fx2.j(fx.o() * this.a.s() + this.a.o());
    }
}

