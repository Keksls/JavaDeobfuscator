/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Kj
 */
public class kj_2 {
    private final lm_2 a;

    public kj_2(lm_2 lm_22) {
        this.a = lm_22;
    }

    public void a(DataInput dataInput) {
        int n = dataInput.readUnsignedShort();
        int n2 = n >> 6;
        this.a.a(kl_1.a(n2));
        int n3 = n & 0x3F;
        if (n3 == 63) {
            n3 = dataInput.readInt();
        }
        this.a.a(n3);
    }
}

