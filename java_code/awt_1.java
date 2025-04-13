/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.DataInput;
import java.io.DataOutput;
import org.apache.log4j.Logger;

/*
 * Renamed from awt
 */
public class awt_1
extends awd_2<awc_1> {
    public static final awt_1 a = new awt_1();
    private static final Logger p = Logger.getLogger(awt_1.class);

    private awt_1() {
    }

    @Override
    protected byte a() {
        return 12;
    }

    public awc_1 a(DataInput dataInput, float f2) {
        afr_2 afr_22 = awt_1.g(dataInput, f2);
        afr_2 afr_23 = awt_1.g(dataInput, f2);
        afr_2 afr_24 = awt_1.g(dataInput, f2);
        afr_2 afr_25 = awt_1.g(dataInput, f2);
        afc_2 afc_22 = new afc_2();
        afc_22.b(0L);
        afc_22.c_(1000000L);
        afc_22.a(afr_22);
        afc_22.b(afr_23);
        afc_22.c(afr_24);
        afc_22.d(afr_25);
        return new awc_1(afc_22);
    }

    private void a(DataOutput dataOutput, afr_2 afr_22, afr_2 afr_23) {
        dataOutput.writeFloat(afr_22.a);
        dataOutput.writeFloat(afr_23.a);
        dataOutput.writeFloat(afr_22.b);
        dataOutput.writeFloat(afr_23.b);
        dataOutput.writeFloat(afr_22.c);
        dataOutput.writeFloat(afr_23.c);
    }

    @Override
    protected boolean a(awc_1 awc_12, awc_1 awc_13) {
        return awc_12.b().equals(awc_13.b()) && awc_12.c().equals(awc_13.c()) && awc_12.d().equals(awc_13.d()) && awc_12.d().equals(awc_13.e());
    }

    private static afr_2 g(DataInput dataInput, float f2) {
        float f3 = awt_1.e(dataInput, f2);
        float f4 = awt_1.e(dataInput, f2);
        float f5 = awt_1.e(dataInput, f2);
        return new afr_2(f3, f4, f5);
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

