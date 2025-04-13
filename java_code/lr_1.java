/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from LR
 */
public class lr_1
implements lo_1 {
    private final ln_2 a;

    public lr_1(ln_2 ln_22) {
        this.a = ln_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        float[] fArray = this.a.a();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        dataOutput.writeByte(this.a.f().a());
        float[] fArray2 = this.a.c();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.a.d();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        float[] fArray4 = this.a.e();
        dataOutput.writeFloat(fArray4[0]);
        dataOutput.writeFloat(fArray4[1]);
        List<lk_2> list = this.a.b().a();
        for (lk_2 lk_22 : list) {
            lq_1 lq_12 = new lq_1(lk_22);
            lq_12.a(dataOutput);
        }
    }
}

