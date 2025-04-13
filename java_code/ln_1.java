/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from LN
 */
public class ln_1 {
    private final kj_1 a;

    public ln_1(kj_1 kj_12) {
        this.a = kj_12;
    }

    public void a(DataOutput dataOutput) {
        List<lk_2> list = this.a.a();
        for (lk_2 lk_22 : list) {
            lq_1 lq_12 = new lq_1(lk_22);
            lq_12.a(dataOutput);
        }
    }
}

