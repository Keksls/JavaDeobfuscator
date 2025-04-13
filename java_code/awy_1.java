/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awY
 */
public class awy_1
extends awh_2<aww_1> {
    public static final awy_1 c = new awy_1();

    private awy_1() {
    }

    @Override
    protected byte a() {
        return 1;
    }

    public aww_1 c(DataInput dataInput, float f2) {
        boolean bl = dataInput.readBoolean();
        int n = dataInput.readInt();
        float f3 = awy_1.e(dataInput, f2);
        float f4 = awy_1.e(dataInput, f2);
        float f5 = awy_1.e(dataInput, f2);
        float f6 = awy_1.e(dataInput, f2);
        float f7 = awy_1.e(dataInput, f2);
        float f8 = awy_1.e(dataInput, f2);
        float f9 = awy_1.e(dataInput, f2);
        float f10 = awy_1.e(dataInput, f2);
        float f11 = awy_1.e(dataInput, f2);
        float f12 = awy_1.e(dataInput, f2);
        float f13 = awy_1.e(dataInput, f2);
        float f14 = awy_1.e(dataInput, f2);
        float f15 = awy_1.e(dataInput, f2);
        float f16 = awy_1.e(dataInput, f2);
        float f17 = awy_1.e(dataInput, f2);
        float f18 = awy_1.e(dataInput, f2);
        float f19 = awy_1.e(dataInput, f2);
        float f20 = awy_1.e(dataInput, f2);
        float f21 = awy_1.e(dataInput, f2);
        float f22 = awy_1.e(dataInput, f2);
        float f23 = awy_1.e(dataInput, f2);
        float f24 = awy_1.e(dataInput, f2);
        float f25 = awy_1.e(dataInput, f2);
        float f26 = awy_1.e(dataInput, f2);
        float f27 = awy_1.e(dataInput, f2);
        ms_1 ms_12 = new ms_1();
        ms_12.a(n);
        ms_12.a(f3);
        ms_12.b(f4);
        ms_12.c(f5);
        ms_12.d(f6);
        ms_12.e(f7);
        ms_12.f(f8);
        ms_12.a(bl);
        ms_12.g(f9);
        ms_12.h(f10);
        ms_12.i(f11);
        ms_12.j(f12);
        ms_12.k(f13);
        ms_12.l(f14);
        ms_12.m(f15);
        ms_12.n(f16);
        ms_12.o(f17);
        ms_12.p(f18);
        ms_12.q(f25);
        ms_12.r(f26);
        ms_12.s(f27);
        ms_12.t(f19);
        ms_12.u(f20);
        ms_12.v(f21);
        ms_12.w(f22);
        ms_12.x(f23);
        ms_12.y(f24);
        return new aww_1(ms_12);
    }

    @Override
    protected boolean a(aww_1 aww_12, aww_1 aww_13) {
        ms_1 ms_12 = aww_12.d();
        ms_1 ms_13 = aww_13.d();
        return ms_12.b() == ms_13.b() && ms_12.c() == ms_13.c() && ms_12.d() == ms_13.d() && ms_12.e() == ms_13.e() && ms_12.i() == ms_13.i() && ms_12.f() == ms_13.f() && ms_12.g() == ms_13.g() && ms_12.h() == ms_13.h() && ms_12.j() == ms_13.j() && ms_12.k() == ms_13.k() && ms_12.l() == ms_13.l() && ms_12.m() == ms_13.m() && ms_12.n() == ms_13.n() && ms_12.o() == ms_13.o() && ms_12.p() == ms_13.p() && ms_12.q() == ms_13.q() && ms_12.r() == ms_13.r();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.c(dataInput, f2);
    }
}

