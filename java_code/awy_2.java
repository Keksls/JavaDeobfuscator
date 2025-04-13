/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awy
 */
public class awy_2
extends awd_2<awi_2> {
    public static final awy_2 a = new awy_2();

    private awy_2() {
    }

    @Override
    protected byte a() {
        return 8;
    }

    public awi_2 a(DataInput dataInput, float f2) {
        boolean bl = dataInput.readBoolean();
        float f3 = awy_2.e(dataInput, f2);
        float f4 = awy_2.e(dataInput, f2);
        float f5 = awy_2.e(dataInput, f2);
        mg_1 mg_12 = new mg_1();
        mg_12.a(f3);
        mg_12.b(f4);
        mg_12.c(f5);
        mg_12.a(bl);
        return awi_2.a(mg_12);
    }

    @Override
    protected boolean a(awi_2 awi_22, awi_2 awi_23) {
        mg_1 mg_12 = awi_22.b();
        mg_1 mg_13 = awi_23.b();
        return mg_12.a() == mg_13.a() && mg_12.b() == mg_13.b() && mg_12.c() == mg_13.c();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

