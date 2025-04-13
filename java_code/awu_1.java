/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awu
 */
public class awu_1
extends awd_2<awe_1> {
    public static final awu_1 a = new awu_1();

    private awu_1() {
    }

    @Override
    protected byte a() {
        return 5;
    }

    public awe_1 a(DataInput dataInput, float f2) {
        float f3 = awu_1.e(dataInput, f2);
        float f4 = awu_1.e(dataInput, f2);
        float f5 = awu_1.e(dataInput, f2);
        float f6 = awu_1.e(dataInput, f2);
        float f7 = awu_1.e(dataInput, f2);
        float f8 = awu_1.e(dataInput, f2);
        mz_1 mz_12 = new mz_1();
        mz_12.a(f3);
        mz_12.b(f4);
        mz_12.c(f5);
        mz_12.d(f6);
        mz_12.e(f7);
        mz_12.f(f8);
        return new awe_1(mz_12);
    }

    @Override
    protected boolean a(awe_1 awe_12, awe_1 awe_13) {
        mz_1 mz_12 = awe_12.b();
        mz_1 mz_13 = awe_13.b();
        return mz_12.a() == mz_13.a() && mz_12.b() == mz_13.b() && mz_12.c() == mz_13.c() && mz_12.d() == mz_13.d() && mz_12.e() == mz_13.e() && mz_12.f() == mz_13.f();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

