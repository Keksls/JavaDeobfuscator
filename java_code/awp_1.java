/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awp
 */
public class awp_1
extends awd_2<avx_1> {
    public static final awp_1 a = new awp_1();

    private awp_1() {
    }

    @Override
    protected byte a() {
        return 1;
    }

    public avx_1 a(DataInput dataInput, float f2) {
        float f3 = awp_1.e(dataInput, f2);
        float f4 = awp_1.e(dataInput, f2);
        float f5 = awp_1.e(dataInput, f2);
        float f6 = awp_1.e(dataInput, f2);
        byte by = dataInput.readByte();
        mq_2 mq_22 = new mq_2();
        mq_22.a(f3);
        mq_22.a(mr_2.values()[by]);
        mq_22.b(f4);
        mq_22.c(f5);
        mq_22.d(f6);
        return new avx_1(mq_22);
    }

    @Override
    protected boolean a(avx_1 avx_12, avx_1 avx_13) {
        mq_2 mq_22 = avx_12.b();
        mq_2 mq_23 = avx_13.b();
        return mq_22.a() == mq_23.a() && mq_22.c() == mq_23.c() && mq_22.d() == mq_23.d() && mq_22.e() == mq_23.e();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

