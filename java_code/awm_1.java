/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awM
 */
public class awm_1
extends awg_2<awj_1> {
    public static final awm_1 c = new awm_1();

    private awm_1() {
    }

    @Override
    protected byte a() {
        return 2;
    }

    public awj_1 c(DataInput dataInput, float f2) {
        boolean bl = dataInput.readBoolean();
        byte by = dataInput.readByte();
        mi_1 mi_12 = mi_1.values()[by];
        int n = awm_1.d(dataInput, f2);
        mh_1 mh_12 = new mh_1();
        mh_12.a(n);
        mh_12.a(mi_12);
        mh_12.a(bl);
        return new awj_1(mh_12);
    }

    @Override
    protected boolean a(awj_1 awj_12, awj_1 awj_13) {
        return awj_12.a.a() == awj_13.a.a();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.c(dataInput, f2);
    }
}

