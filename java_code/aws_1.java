/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from aws
 */
public class aws_1
extends awd_2<awb_1> {
    public static final aws_1 a = new aws_1();

    private aws_1() {
    }

    @Override
    protected byte a() {
        return 4;
    }

    public awb_1 a(DataInput dataInput, float f2) {
        float f3 = aws_1.e(dataInput, f2);
        float f4 = aws_1.e(dataInput, f2);
        float f5 = aws_1.e(dataInput, f2);
        float f6 = aws_1.e(dataInput, f2);
        float f7 = aws_1.e(dataInput, f2);
        mw_1 mw_12 = new mw_1();
        mw_12.a(f3);
        mw_12.b(f4);
        mw_12.c(f5);
        mw_12.d(f6);
        mw_12.e(f7);
        return new awb_1(mw_12);
    }

    @Override
    protected boolean a(awb_1 awb_12, awb_1 awb_13) {
        mw_1 mw_12 = awb_12.b();
        mw_1 mw_13 = awb_13.b();
        return mw_12.a() == mw_13.a() && mw_12.b() == mw_13.b() && mw_12.c() == mw_13.c() && mw_12.d() == mw_13.d() && mw_12.e() == mw_13.e();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

