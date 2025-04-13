/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from Jd
 */
public class jd_1
implements jg_1 {
    private final lj_2 a;

    public jd_1(lj_2 lj_22) {
        this.a = lj_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(14);
        dataOutput.writeFloat(this.a.a()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.a()[1] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.c()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.c()[1] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.d()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.d()[1] * ((float)Math.PI / 180));
    }
}

