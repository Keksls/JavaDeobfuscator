/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from Mm
 */
public class mm_2
implements lo_1 {
    private final lk_1 a;

    public mm_2(lk_1 lk_12) {
        this.a = lk_12;
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

