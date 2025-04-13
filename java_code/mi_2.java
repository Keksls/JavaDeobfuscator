/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from Mi
 */
public class mi_2
implements lo_1 {
    private final lf_2 a;

    public mi_2(lf_2 lf_22) {
        this.a = lf_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeShort(this.a.a().a());
        int[] nArray = this.a.b();
        dataOutput.writeShort(nArray[0]);
        dataOutput.writeShort(nArray[1]);
        dataOutput.writeBoolean(this.a.c());
    }
}

