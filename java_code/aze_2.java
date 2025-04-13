/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from aze
 */
public class aze_2 {
    private final mp_2 a;

    public aze_2(mp_2 mp_22) {
        this.a = mp_22;
    }

    public void a(DataOutput dataOutput) {
        short[] sArray = this.a.g();
        if (sArray == null || sArray.length <= 1) {
            dataOutput.writeByte(0);
            return;
        }
        int n = sArray.length;
        dataOutput.writeByte(n);
        dataOutput.writeInt(this.a.f());
        dataOutput.writeShort(this.a.a());
        dataOutput.writeShort(this.a.b());
        dataOutput.writeShort(this.a.c());
        dataOutput.writeShort(this.a.d());
        for (int k = 0; k < n; ++k) {
            dataOutput.writeShort(sArray[k]);
        }
        short[] sArray2 = this.a.e();
        for (int k = 0; k < sArray2.length; ++k) {
            dataOutput.writeShort(sArray2[k]);
        }
    }
}

