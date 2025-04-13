/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IM
 */
public class im_1 {
    private final mp_2 a;

    public im_1(mp_2 mp_22) {
        this.a = mp_22;
    }

    public void a(DataOutput dataOutput) {
        short[] sArray;
        short[] sArray2 = this.a.g();
        if (sArray2 == null || sArray2.length <= 1) {
            dataOutput.writeByte(0);
            return;
        }
        int n = sArray2.length;
        dataOutput.writeByte(n);
        dataOutput.writeInt(this.a.f());
        dataOutput.writeShort(this.a.a());
        dataOutput.writeShort(this.a.b());
        dataOutput.writeShort(this.a.c());
        dataOutput.writeShort(this.a.d());
        for (int k = 0; k < n; ++k) {
            dataOutput.writeShort(sArray2[k]);
        }
        for (short s2 : sArray = this.a.e()) {
            dataOutput.writeShort(s2);
        }
    }
}

