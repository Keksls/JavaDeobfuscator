/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from LX
 */
public class lx_1
implements lo_1 {
    private final lu_2 a;

    public lx_1(lu_2 lu_22) {
        this.a = lu_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        float[] fArray = this.a.a();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        float[] fArray2 = this.a.e();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.a.c();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        float[] fArray4 = this.a.f();
        dataOutput.writeFloat(fArray4[0]);
        dataOutput.writeFloat(fArray4[1]);
        float[] fArray5 = this.a.d();
        dataOutput.writeFloat(fArray5[0]);
        dataOutput.writeFloat(fArray5[1]);
        float[] fArray6 = this.a.g();
        dataOutput.writeFloat(fArray6[0]);
        dataOutput.writeFloat(fArray6[1]);
        List<lk_2> list = this.a.b().a();
        for (lk_2 lk_22 : list) {
            lq_1 lq_12 = new lq_1(lk_22);
            lq_12.a(dataOutput);
        }
    }
}

