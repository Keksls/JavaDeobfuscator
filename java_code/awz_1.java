/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awZ
 */
public class awz_1
extends awh_2<awx_1> {
    public static final awz_1 c = new awz_1();

    private awz_1() {
    }

    @Override
    protected boolean a(awx_1 awx_12, awx_1 awx_13) {
        mt_1 mt_12 = awx_12.d();
        mt_1 mt_13 = awx_13.d();
        return mt_12.b() == mt_13.b() && mt_12.c() == mt_13.c() && mt_12.d() == mt_13.d() && mt_12.e() == mt_13.e() && mt_12.i() == mt_13.i() && mt_12.f() == mt_13.f() && mt_12.g() == mt_13.g() && mt_12.h() == mt_13.h() && mt_12.j() == mt_13.j() && mt_12.k() == mt_13.k() && mt_12.l() == mt_13.l() && mt_12.m() == mt_13.m() && mt_12.n() == mt_13.n() && mt_12.o() == mt_13.o() && mt_12.p() == mt_13.p() && mt_12.q() == mt_13.q() && mt_12.r() == mt_13.r() && mt_12.B() == mt_13.B() && mt_12.C() == mt_13.C();
    }

    @Override
    protected byte a() {
        return 2;
    }

    public awx_1 c(DataInput dataInput, float f2) {
        boolean bl = dataInput.readBoolean();
        int n = dataInput.readInt();
        float f3 = awz_1.e(dataInput, f2);
        float f4 = awz_1.e(dataInput, f2);
        float f5 = awz_1.e(dataInput, f2);
        float f6 = awz_1.e(dataInput, f2);
        float f7 = awz_1.e(dataInput, f2);
        float f8 = awz_1.e(dataInput, f2);
        float f9 = awz_1.e(dataInput, f2);
        float f10 = awz_1.e(dataInput, f2);
        float f11 = awz_1.e(dataInput, f2);
        float f12 = awz_1.e(dataInput, f2);
        float f13 = awz_1.e(dataInput, f2);
        float f14 = awz_1.e(dataInput, f2);
        float f15 = awz_1.e(dataInput, f2);
        float f16 = awz_1.e(dataInput, f2);
        float f17 = awz_1.e(dataInput, f2);
        float f18 = awz_1.e(dataInput, f2);
        float f19 = awz_1.e(dataInput, f2);
        float f20 = awz_1.e(dataInput, f2);
        mp_2 mp_22 = new mp_2();
        azd_2 azd_22 = new azd_2(mp_22);
        azd_22.a(dataInput);
        float f21 = awz_1.e(dataInput, f2);
        int n2 = awz_1.f(dataInput, f2);
        float f22 = awz_1.e(dataInput, f2);
        float f23 = awz_1.e(dataInput, f2);
        float f24 = awz_1.e(dataInput, f2);
        mt_1 mt_12 = new mt_1();
        mt_12.a(n);
        mt_12.a(f3);
        mt_12.b(f4);
        mt_12.c(f5);
        mt_12.d(f6);
        mt_12.e(f7);
        mt_12.f(f8);
        mt_12.a(bl);
        mt_12.g(f9);
        mt_12.h(f10);
        mt_12.i(f11);
        mt_12.j(f12);
        mt_12.k(f13);
        mt_12.l(f14);
        mt_12.m(f15);
        mt_12.n(f16);
        mt_12.o(f17);
        mt_12.p(f18);
        mt_12.q(f22);
        mt_12.r(f23);
        mt_12.s(f24);
        mt_12.x(f19);
        mt_12.y(f20);
        mt_12.z(f21);
        mt_12.b(n2);
        return new awx_1(mt_12, mp_22);
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.c(dataInput, f2);
    }
}

