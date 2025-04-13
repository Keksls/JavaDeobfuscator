/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IX
 */
public class ix_2
implements jg_1 {
    private final la_2 a;

    public ix_2(la_2 la_22) {
        this.a = la_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(1);
        dataOutput.writeFloat((float)this.a.b()[0] / 1000.0f);
        dataOutput.writeFloat((float)this.a.b()[1] / 1000.0f);
        dataOutput.writeFloat((float)this.a.a()[0] / 1000.0f);
        dataOutput.writeFloat((float)this.a.a()[1] / 1000.0f);
    }
}

