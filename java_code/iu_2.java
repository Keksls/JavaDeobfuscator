/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IU
 */
public class iu_2
implements jg_1 {
    private final lv_2 a;

    public iu_2(lv_2 lv_22) {
        this.a = lv_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(6);
    }
}

