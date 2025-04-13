/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awr
 */
public class awr_1
extends awd_2<awa_1> {
    public static final awr_1 a = new awr_1();

    private awr_1() {
    }

    @Override
    protected byte a() {
        return 3;
    }

    public awa_1 a(DataInput dataInput, float f2) {
        float f3 = awr_1.e(dataInput, f2);
        mv_1 mv_12 = new mv_1();
        mv_12.a(f3);
        return new awa_1(mv_12);
    }

    @Override
    protected boolean a(awa_1 awa_12, awa_1 awa_13) {
        return awa_12.b().a() == awa_13.b().a();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

