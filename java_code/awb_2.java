/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awB
 */
public class awb_2
extends awd_2<awn_1> {
    public static final awb_2 a = new awb_2();

    private awb_2() {
    }

    @Override
    protected byte a() {
        return 14;
    }

    public awn_1 a(DataInput dataInput, float f2) {
        float f3 = awb_2.e(dataInput, f2);
        float f4 = awb_2.e(dataInput, f2);
        float f5 = awb_2.e(dataInput, f2);
        ml_1 ml_12 = new ml_1();
        ml_12.a(f3);
        ml_12.b(f4);
        ml_12.c(f5);
        return new awn_1(ml_12);
    }

    @Override
    protected boolean a(awn_1 awn_12, awn_1 awn_13) {
        ml_1 ml_12 = awn_12.b();
        ml_1 ml_13 = awn_13.b();
        return ml_12.a() == ml_13.a() && ml_12.b() == ml_13.b() && ml_12.c() == ml_13.c();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

