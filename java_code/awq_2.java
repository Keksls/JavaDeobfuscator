/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awQ
 */
public class awq_2
extends awe_2<awo_2> {
    public static final awq_2 c = new awq_2();

    private awq_2() {
    }

    @Override
    protected byte a() {
        return 2;
    }

    public awo_2 c(DataInput dataInput, float f2) {
        float f3 = awq_2.e(dataInput, f2);
        float f4 = awq_2.e(dataInput, f2);
        float f5 = awq_2.e(dataInput, f2);
        float f6 = awq_2.e(dataInput, f2);
        float f7 = awq_2.e(dataInput, f2);
        me_1 me_12 = new me_1();
        me_12.a(f3);
        me_12.b(f4);
        me_12.c(f5);
        me_12.d(f6);
        me_12.e(f7);
        return new awo_2(me_12);
    }

    @Override
    protected boolean a(awo_2 awo_22, awo_2 awo_23) {
        return awo_22.a.a() == awo_23.a.a() && awo_22.a.b() == awo_23.a.b() && awo_22.a.c() == awo_23.a.c() && awo_22.a.d() == awo_23.a.d() && awo_22.a.e() == awo_23.a.e();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.c(dataInput, f2);
    }
}

