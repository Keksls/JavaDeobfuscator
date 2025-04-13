/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Ku
 */
public class ku_2
implements ki_2 {
    private final lx_2 a;

    public ku_2(lx_2 lx_22) {
        this.a = lx_22;
    }

    @Override
    public void a(DataInput dataInput) {
        lk_2 lk_22;
        this.a.a(dataInput.readBoolean());
        this.a.b(dataInput.readBoolean());
        this.a.c(dataInput.readBoolean());
        this.a.a(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.a.a(dataInput.readByte());
        this.a.a(dataInput.readInt());
        this.a.b(dataInput.readInt());
        this.a.a(jj_1.a(dataInput));
        this.a.b(jj_1.a(dataInput));
        this.a.b(dataInput.readByte());
        this.a.c(dataInput.readByte());
        kj_1 kj_12 = this.a.b();
        do {
            lk_22 = new lk_2();
            kj_12.a(lk_22);
            kk_2 kk_22 = new kk_2(lk_22);
            kk_22.a(dataInput);
        } while (lk_22.a().a() != kl_1.a);
    }
}

