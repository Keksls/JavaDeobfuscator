/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from Jc
 */
public class jc_1
implements jg_1 {
    private final lh_2 a;

    public jc_1(lh_2 lh_22) {
        this.a = lh_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(9);
        dataOutput.writeFloat(this.a.h()[0]);
        dataOutput.writeFloat(this.a.h()[1]);
        dataOutput.writeFloat(this.a.j()[0]);
        dataOutput.writeFloat(this.a.j()[1]);
        dataOutput.writeFloat(this.a.l()[0]);
        dataOutput.writeFloat(this.a.l()[1]);
        dataOutput.writeFloat(this.a.i()[0]);
        dataOutput.writeFloat(this.a.i()[1]);
        dataOutput.writeFloat(this.a.k()[0]);
        dataOutput.writeFloat(this.a.k()[1]);
        dataOutput.writeFloat(this.a.m()[0]);
        dataOutput.writeFloat(this.a.m()[1]);
        dataOutput.writeFloat(this.a.a()[0]);
        dataOutput.writeFloat(this.a.a()[1]);
        dataOutput.writeFloat(this.a.c()[0]);
        dataOutput.writeFloat(this.a.c()[1]);
        dataOutput.writeFloat(this.a.d()[0]);
        dataOutput.writeFloat(this.a.d()[1]);
        dataOutput.writeFloat(this.a.e()[0]);
        dataOutput.writeFloat(this.a.e()[1]);
        dataOutput.writeFloat(this.a.f()[0]);
        dataOutput.writeFloat(this.a.f()[1]);
        dataOutput.writeFloat(this.a.g()[0]);
        dataOutput.writeFloat(this.a.g()[1]);
    }
}

