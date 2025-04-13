/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IN
 */
public class in_1
implements jg_1 {
    private final ln_2 a;

    public in_1(ln_2 ln_22) {
        this.a = ln_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(1);
        dataOutput.writeFloat(this.a.a()[0] * 33.0f);
        dataOutput.writeFloat(this.a.a()[1] * 33.0f);
        dataOutput.writeFloat(this.a.c()[0]);
        dataOutput.writeFloat(this.a.c()[1]);
        dataOutput.writeFloat(this.a.d()[0]);
        dataOutput.writeFloat(this.a.d()[1]);
        dataOutput.writeFloat(this.a.e()[0]);
        dataOutput.writeFloat(this.a.e()[1]);
        byte by = (byte)this.a.f().ordinal();
        dataOutput.writeByte(by);
    }
}

