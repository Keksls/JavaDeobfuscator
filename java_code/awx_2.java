/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awx
 */
public class awx_2
extends awd_2<awh_1> {
    public static final awx_2 a = new awx_2();

    private awx_2() {
    }

    @Override
    protected byte a() {
        return 11;
    }

    public awh_1 a(DataInput dataInput, float f2) {
        float f3 = awx_2.e(dataInput, f2);
        mf_1 mf_12 = new mf_1();
        mf_12.a(f3);
        return new awh_1(mf_12);
    }

    @Override
    protected boolean a(awh_1 awh_12, awh_1 awh_13) {
        return awh_12.b().a() == awh_13.b().a();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

