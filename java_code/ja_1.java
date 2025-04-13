/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from Ja
 */
public class ja_1
implements jg_1 {
    private final ld_2 a;

    public ja_1(ld_2 ld_22) {
        this.a = ld_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        dataOutput.writeBoolean(this.a.e());
        dataOutput.writeFloat(this.a.a()[0] * 33.0f * 33.0f);
        dataOutput.writeFloat(this.a.a()[1] * 33.0f * 33.0f);
        dataOutput.writeFloat(this.a.c()[0] * 33.0f * 33.0f);
        dataOutput.writeFloat(this.a.c()[1] * 33.0f * 33.0f);
        dataOutput.writeFloat(this.a.d()[0] * 33.0f * 33.0f);
        dataOutput.writeFloat(this.a.d()[1] * 33.0f * 33.0f);
    }
}

