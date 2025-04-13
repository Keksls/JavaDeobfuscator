/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IR
 */
public class ir_1
implements jg_1 {
    private final ls_2 a;

    public ir_1(ls_2 ls_22) {
        this.a = ls_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(3);
        dataOutput.writeFloat(this.a.a()[0] * 33.0f);
        dataOutput.writeFloat(this.a.a()[1] * 33.0f);
    }
}

