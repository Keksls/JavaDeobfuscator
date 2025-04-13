/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from LP
 */
public class lp_1 {
    private final lm_2 a;

    public lp_1(lm_2 lm_22) {
        this.a = lm_22;
    }

    public void a(DataOutput dataOutput) {
        int n = this.a.a().a() << 6;
        int n2 = this.a.b();
        if (n2 >= 63) {
            dataOutput.writeShort(n |= 0x3F);
            dataOutput.writeInt(n2);
        } else {
            dataOutput.writeShort(n |= n2);
        }
    }
}

