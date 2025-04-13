/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from KB
 */
public class kb_2
implements ki_2 {
    private final le_2 a;

    public kb_2(le_2 le_22) {
        this.a = le_22;
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
        kj_1 kj_12 = this.a.b();
        do {
            lk_22 = new lk_2();
            kj_12.a(lk_22);
            kk_2 kk_22 = new kk_2(lk_22);
            kk_22.a(dataInput);
        } while (lk_22.a().a() != kl_1.a);
    }
}

