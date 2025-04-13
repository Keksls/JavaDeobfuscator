/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from KD
 */
public class kd_1
implements ki_2 {
    private final lh_2 a;

    public kd_1(lh_2 lh_22) {
        this.a = lh_22;
    }

    @Override
    public void a(DataInput dataInput) {
        lk_2 lk_22;
        this.a.a(dataInput.readFloat(), dataInput.readFloat());
        this.a.b(dataInput.readFloat(), dataInput.readFloat());
        this.a.c(dataInput.readFloat(), dataInput.readFloat());
        this.a.d(dataInput.readFloat(), dataInput.readFloat());
        this.a.e(dataInput.readFloat(), dataInput.readFloat());
        this.a.f(dataInput.readFloat(), dataInput.readFloat());
        this.a.g(dataInput.readFloat(), dataInput.readFloat());
        this.a.h(dataInput.readFloat(), dataInput.readFloat());
        this.a.i(dataInput.readFloat(), dataInput.readFloat());
        this.a.j(dataInput.readFloat(), dataInput.readFloat());
        this.a.k(dataInput.readFloat(), dataInput.readFloat());
        this.a.l(dataInput.readFloat(), dataInput.readFloat());
        kj_1 kj_12 = this.a.b();
        do {
            lk_22 = new lk_2();
            kj_12.a(lk_22);
            kk_2 kk_22 = new kk_2(lk_22);
            kk_22.a(dataInput);
        } while (lk_22.a().a() != kl_1.a);
    }
}

