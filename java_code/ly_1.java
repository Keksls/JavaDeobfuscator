/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from LY
 */
public class ly_1
implements lo_1 {
    private final lv_2 a;

    public ly_1(lv_2 lv_22) {
        this.a = lv_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        List<lk_2> list = this.a.b().a();
        for (lk_2 lk_22 : list) {
            lq_1 lq_12 = new lq_1(lk_22);
            lq_12.a(dataOutput);
        }
    }
}

