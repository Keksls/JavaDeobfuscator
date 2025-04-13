/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awA
 */
public class awa_2
extends awd_2<awm_2> {
    public static final awa_2 a = new awa_2();

    private awa_2() {
    }

    @Override
    protected byte a() {
        return 13;
    }

    public awm_2 a(DataInput dataInput, float f2) {
        float f3 = awa_2.e(dataInput, f2);
        float f4 = awa_2.e(dataInput, f2);
        float f5 = awa_2.e(dataInput, f2);
        mk_1 mk_12 = new mk_1();
        mk_12.a(f3);
        mk_12.b(f4);
        mk_12.c(f5);
        return new awm_2(mk_12);
    }

    @Override
    protected boolean a(awm_2 awm_22, awm_2 awm_23) {
        mk_1 mk_12 = awm_22.b();
        mk_1 mk_13 = awm_23.b();
        return mk_12.a() == mk_13.a() && mk_12.b() == mk_13.b() && mk_12.c() == mk_13.c();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

