/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Kk
 */
public class kk_2 {
    private final lk_2 a;

    public kk_2(lk_2 lk_22) {
        this.a = lk_22;
    }

    public void a(DataInput dataInput) {
        lm_2 lm_22 = this.a.a();
        kj_2 kj_22 = new kj_2(lm_22);
        kj_22.a(dataInput);
        ll_2 ll_22 = lm_22.a().b();
        if (ll_22 == null) {
            return;
        }
        this.a.a(ll_22);
        ki_2 ki_22 = jk_2.a.a(ll_22);
        ki_22.a(dataInput);
    }
}

