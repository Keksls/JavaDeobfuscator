/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from aww
 */
public class aww_2
extends awd_2<awg_1> {
    public static final aww_2 a = new aww_2();

    private aww_2() {
    }

    @Override
    protected byte a() {
        return 7;
    }

    public awg_1 a(DataInput dataInput, float f2) {
        float f3 = aww_2.e(dataInput, f2);
        mc_1 mc_12 = new mc_1();
        mc_12.a(f3);
        return new awg_1(mc_12);
    }

    @Override
    protected boolean a(awg_1 awg_12, awg_1 awg_13) {
        return awg_12.b().a() == awg_13.b().a();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

