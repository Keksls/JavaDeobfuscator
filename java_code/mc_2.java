/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from Mc
 */
public class mc_2
implements lo_1 {
    private final lz_2 a;

    public mc_2(lz_2 lz_22) {
        this.a = lz_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        float[] fArray = this.a.a();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        List<lk_2> list = this.a.b().a();
        for (lk_2 lk_22 : list) {
            lq_1 lq_12 = new lq_1(lk_22);
            lq_12.a(dataOutput);
        }
    }
}

