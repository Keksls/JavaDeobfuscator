/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from KF
 */
public class kf_2
implements ki_2 {
    private final li_2 a;

    public kf_2(li_2 li_22) {
        this.a = li_22;
    }

    @Override
    public void a(DataInput dataInput) {
        lk_2 lk_22;
        this.a.a(dataInput.readFloat(), dataInput.readFloat());
        this.a.b(dataInput.readFloat(), dataInput.readFloat());
        this.a.c(dataInput.readFloat(), dataInput.readFloat());
        kj_1 kj_12 = this.a.b();
        do {
            lk_22 = new lk_2();
            kj_12.a(lk_22);
            kk_2 kk_22 = new kk_2(lk_22);
            kk_22.a(dataInput);
        } while (lk_22.a().a() != kl_1.a);
    }
}

