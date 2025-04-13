/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IW
 */
public class iw_2
implements jg_1 {
    private final lz_2 a;

    public iw_2(lz_2 lz_22) {
        this.a = lz_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeFloat(33.0f - this.a.a()[0] * 33.0f);
        dataOutput.writeFloat(33.0f - this.a.a()[1] * 33.0f);
    }
}

