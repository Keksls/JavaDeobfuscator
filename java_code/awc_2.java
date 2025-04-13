/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awC
 */
public class awc_2
extends awd_2<awo_1> {
    public static final awc_2 a = new awc_2();

    private awc_2() {
    }

    @Override
    protected byte a() {
        return 10;
    }

    public awo_1 a(DataInput dataInput, float f2) {
        float f3 = awc_2.e(dataInput, f2);
        mm_1 mm_12 = new mm_1();
        mm_12.a(f3);
        return new awo_1(mm_12);
    }

    @Override
    protected boolean a(awo_1 awo_12, awo_1 awo_13) {
        return awo_12.b().a() == awo_13.b().a();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

