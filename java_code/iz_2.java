/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IZ
 */
public class iz_2
implements jg_1 {
    private final lb_2 a;

    public iz_2(lb_2 lb_22) {
        this.a = lb_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(2);
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
    }
}

