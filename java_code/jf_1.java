/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from Jf
 */
public class jf_1
implements jg_1 {
    private final lk_1 a;

    public jf_1(lk_1 lk_12) {
        this.a = lk_12;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(10);
        dataOutput.writeFloat(this.a.a()[0] * 33.0f);
        dataOutput.writeFloat(this.a.a()[1] * 33.0f);
    }
}

