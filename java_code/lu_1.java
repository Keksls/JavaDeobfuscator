/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from LU
 */
public class lu_1
implements lo_1 {
    private final lr_2 a;

    public lu_1(lr_2 lr_22) {
        this.a = lr_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        float[] fArray = this.a.a();
        float[] fArray2 = this.a.c();
        float[] fArray3 = this.a.d();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray[1]);
        dataOutput.writeFloat(fArray2[1]);
        dataOutput.writeFloat(fArray3[1]);
        List<lk_2> list = this.a.b().a();
        for (lk_2 lk_22 : list) {
            lq_1 lq_12 = new lq_1(lk_22);
            lq_12.a(dataOutput);
        }
    }
}

