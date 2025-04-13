/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awP
 */
public class awp_2
extends awe_2<awn_2> {
    public static final awp_2 c = new awp_2();

    private awp_2() {
    }

    @Override
    protected byte a() {
        return 1;
    }

    @Override
    protected boolean a(awn_2 awn_22, awn_2 awn_23) {
        return awn_22.a.c() == awn_23.a.c() && awn_22.a.d() == awn_23.a.d() && awn_22.a.e() == awn_23.a.e() && awn_22.a.g() == awn_23.a.g() && awn_22.a.f() == awn_23.a.f() && awn_22.a.h() == awn_23.a.h() && awn_22.a.i() == awn_23.a.i() && awn_22.a.j() == awn_23.a.j() && awn_22.a.k() == awn_23.a.k() && awn_22.a.l() == awn_23.a.l() && awn_22.a.m() == awn_23.a.m() && awn_22.a.n() == awn_23.a.n() && awn_22.a.o() == awn_23.a.o() && awn_22.a.p() == awn_23.a.p() && awn_22.a.q() == awn_23.a.q() && awn_22.a.r() == awn_23.a.r() && awn_22.a.s() == awn_23.a.s() && awn_22.a.t() == awn_23.a.t() && awn_22.a.a() == awn_23.a.a() && awn_22.a.b() == awn_23.a.b();
    }

    public awn_2 c(DataInput dataInput, float f2) {
        boolean bl = dataInput.readBoolean();
        int n = awp_2.d(dataInput, f2);
        int n2 = awp_2.d(dataInput, f2);
        float f3 = awp_2.e(dataInput, f2);
        float f4 = awp_2.e(dataInput, f2);
        float f5 = awp_2.e(dataInput, f2);
        float f6 = awp_2.e(dataInput, f2);
        float f7 = awp_2.e(dataInput, f2);
        float f8 = awp_2.e(dataInput, f2);
        float f9 = awp_2.e(dataInput, f2);
        float f10 = awp_2.e(dataInput, f2);
        float f11 = awp_2.e(dataInput, f2);
        float f12 = awp_2.e(dataInput, f2);
        float f13 = awp_2.e(dataInput, f2);
        float f14 = awp_2.e(dataInput, f2);
        float f15 = awp_2.e(dataInput, f2);
        float f16 = awp_2.e(dataInput, f2);
        float f17 = awp_2.e(dataInput, f2);
        float f18 = awp_2.e(dataInput, f2);
        float f19 = awp_2.e(dataInput, f2);
        float f20 = awp_2.e(dataInput, f2);
        mb_1 mb_12 = new mb_1();
        mb_12.a(f19);
        mb_12.b(f20);
        mb_12.a(n);
        mb_12.b(n2);
        mb_12.c(f3);
        mb_12.d(f5);
        mb_12.e(f4);
        mb_12.f(f6);
        mb_12.g(f7);
        mb_12.h(f8);
        mb_12.i(f9);
        mb_12.j(f10);
        mb_12.k(f11);
        mb_12.l(f12);
        mb_12.m(f13);
        mb_12.n(f14);
        mb_12.o(f15);
        mb_12.p(f16);
        mb_12.q(f17);
        mb_12.r(f18);
        mb_12.a(bl);
        return new awn_2(mb_12);
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.c(dataInput, f2);
    }
}

