/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Kh
 */
public class kh_2 {
    private final kj_1 a;

    public kh_2(kj_1 kj_12) {
        this.a = kj_12;
    }

    public void a(DataInput dataInput) {
        lk_2 lk_22;
        do {
            lk_22 = new lk_2();
            this.a.a(lk_22);
            kk_2 kk_22 = new kk_2(lk_22);
            kk_22.a(dataInput);
        } while (lk_22.a().a() != kl_1.a);
    }
}

