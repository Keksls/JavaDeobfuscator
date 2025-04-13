/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from LQ
 */
public class lq_1 {
    private final lk_2 a;

    public lq_1(lk_2 lk_22) {
        this.a = lk_22;
    }

    public void a(DataOutput dataOutput) {
        lm_2 lm_22 = this.a.a();
        lp_1 lp_12 = new lp_1(lm_22);
        lp_12.a(dataOutput);
        ll_2 ll_22 = this.a.b();
        if (ll_22 == null) {
            return;
        }
        lo_1 lo_12 = jk_2.a.b(ll_22);
        lo_12.a(dataOutput);
    }
}

