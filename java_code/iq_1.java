/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IQ
 */
public class iq_1
implements jg_1 {
    private final lr_2 a;

    public iq_1(lr_2 lr_22) {
        this.a = lr_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(2);
        dataOutput.writeFloat(this.a.a()[0] * 33.0f);
        dataOutput.writeFloat(this.a.a()[1] * 33.0f);
        dataOutput.writeFloat(this.a.c()[0] * 33.0f);
        dataOutput.writeFloat(this.a.c()[1] * 33.0f);
        dataOutput.writeFloat(this.a.d()[0] * 33.0f);
        dataOutput.writeFloat(this.a.d()[1] * 33.0f);
    }
}

