/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awz
 */
public class awz_2
extends awd_2<awl_2> {
    public static final awz_2 a = new awz_2();

    private awz_2() {
    }

    @Override
    protected byte a() {
        return 9;
    }

    public awl_2 a(DataInput dataInput, float f2) {
        float f3 = awz_2.e(dataInput, f2);
        float f4 = awz_2.e(dataInput, f2);
        float f5 = awz_2.e(dataInput, f2);
        float f6 = awz_2.e(dataInput, f2);
        float f7 = awz_2.e(dataInput, f2);
        float f8 = awz_2.e(dataInput, f2);
        float f9 = awz_2.e(dataInput, f2);
        float f10 = awz_2.e(dataInput, f2);
        float f11 = awz_2.e(dataInput, f2);
        float f12 = awz_2.e(dataInput, f2);
        float f13 = awz_2.e(dataInput, f2);
        float f14 = awz_2.e(dataInput, f2);
        mj_1 mj_12 = new mj_1();
        mj_12.a(f3);
        mj_12.b(f4);
        mj_12.c(f5);
        mj_12.d(f6);
        mj_12.e(f7);
        mj_12.f(f8);
        mj_12.g(f9);
        mj_12.h(f10);
        mj_12.i(f11);
        mj_12.j(f12);
        mj_12.k(f13);
        mj_12.l(f14);
        return new awl_2(mj_12);
    }

    @Override
    protected boolean a(awl_2 awl_22, awl_2 awl_23) {
        mj_1 mj_12 = awl_22.b();
        mj_1 mj_13 = awl_23.b();
        return mj_12.a() == mj_13.a() && mj_12.b() == mj_13.b() && mj_12.c() == mj_13.c() && mj_12.d() == mj_13.d() && mj_12.e() == mj_13.e() && mj_12.f() == mj_13.f() && mj_12.g() == mj_13.g() && mj_12.h() == mj_13.h() && mj_12.i() == mj_13.i() && mj_12.j() == mj_13.j() && mj_12.k() == mj_13.k() && mj_12.l() == mj_13.l();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

