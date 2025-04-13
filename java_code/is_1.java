/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IS
 */
public class is_1
implements jg_1 {
    private final lt_2 a;

    public is_1(lt_2 lt_22) {
        this.a = lt_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(4);
        dataOutput.writeFloat(this.a.a()[0]);
        dataOutput.writeFloat(this.a.a()[1]);
        dataOutput.writeFloat(this.a.c()[0]);
        dataOutput.writeFloat(this.a.c()[1]);
        dataOutput.writeFloat(this.a.d()[0]);
        dataOutput.writeFloat(this.a.d()[1]);
        dataOutput.writeFloat(this.a.e()[0]);
        dataOutput.writeFloat(this.a.e()[1]);
        dataOutput.writeFloat(this.a.f()[0] * 33.0f);
        dataOutput.writeFloat(this.a.f()[1] * 33.0f);
    }
}

