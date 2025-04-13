/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Ko
 */
public class ko_2
implements ki_2 {
    private final lr_2 a;

    public ko_2(lr_2 lr_22) {
        this.a = lr_22;
    }

    @Override
    public void a(DataInput dataInput) {
        lk_2 lk_22;
        float f2 = dataInput.readFloat();
        float f3 = dataInput.readFloat();
        float f4 = dataInput.readFloat();
        float f5 = dataInput.readFloat();
        float f6 = dataInput.readFloat();
        float f7 = dataInput.readFloat();
        this.a.a(f2, f5);
        this.a.b(f3, f6);
        this.a.c(f4, f7);
        kj_1 kj_12 = this.a.b();
        do {
            lk_22 = new lk_2();
            kj_12.a(lk_22);
            kk_2 kk_22 = new kk_2(lk_22);
            kk_22.a(dataInput);
        } while (lk_22.a().a() != kl_1.a);
    }
}

