/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IY
 */
public class iy_2
implements jg_1 {
    private final lc_2 a;

    public iy_2(lc_2 lc_22) {
        this.a = lc_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(11);
        dataOutput.writeFloat(this.a.a()[0] * 33.0f);
        dataOutput.writeFloat(this.a.a()[1] * 33.0f);
    }
}

