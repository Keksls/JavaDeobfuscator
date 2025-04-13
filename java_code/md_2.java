/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from Md
 */
public class md_2
implements lo_1 {
    private final la_2 a;

    public md_2(la_2 la_22) {
        this.a = la_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        int[] nArray = this.a.a();
        dataOutput.writeShort(nArray[0]);
        dataOutput.writeShort(nArray[1]);
        int[] nArray2 = this.a.b();
        dataOutput.writeShort(nArray2[0]);
        dataOutput.writeShort(nArray2[1]);
    }
}

