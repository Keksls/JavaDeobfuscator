/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awL
 */
public class awl_1
extends awg_2<awi_1> {
    public static final awl_1 c = new awl_1();

    private awl_1() {
    }

    @Override
    protected byte a() {
        return 1;
    }

    public awi_1 c(DataInput dataInput, float f2) {
        float f3 = awl_1.e(dataInput, f2);
        float f4 = awl_1.e(dataInput, f2);
        md_1 md_12 = new md_1();
        md_12.a(f3);
        md_12.b(f4);
        return new awi_1(md_12);
    }

    @Override
    protected boolean a(awi_1 awi_12, awi_1 awi_13) {
        return awi_12.a.b() == awi_13.a.b() && awi_12.a.a() == awi_13.a.a();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.c(dataInput, f2);
    }
}

