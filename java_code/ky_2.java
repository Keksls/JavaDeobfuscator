/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Ky
 */
public class ky_2
implements ki_2 {
    private final lb_2 a;

    public ky_2(lb_2 lb_22) {
        this.a = lb_22;
    }

    @Override
    public void a(DataInput dataInput) {
        lk_2 lk_22;
        this.a.a(dataInput.readFloat(), dataInput.readFloat());
        this.a.b(dataInput.readFloat(), dataInput.readFloat());
        this.a.c(dataInput.readFloat(), dataInput.readFloat());
        this.a.d(dataInput.readFloat(), dataInput.readFloat());
        this.a.e(dataInput.readFloat(), dataInput.readFloat());
        float f2 = dataInput.readFloat();
        float f3 = dataInput.readFloat();
        boolean bl = dataInput.readBoolean();
        boolean bl2 = dataInput.readBoolean();
        kj_1 kj_12 = this.a.b();
        do {
            lk_22 = new lk_2();
            kj_12.a(lk_22);
            kk_2 kk_22 = new kk_2(lk_22);
            kk_22.a(dataInput);
        } while (lk_22.a().a() != kl_1.a);
    }
}

