/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from azd
 */
public class azd_2 {
    private final mp_2 a;

    public azd_2(mp_2 mp_22) {
        this.a = mp_22;
    }

    public void a(DataInput dataInput) {
        int n = dataInput.readByte() & 0xFF;
        if (n == 0) {
            return;
        }
        int n2 = dataInput.readInt();
        short s2 = dataInput.readShort();
        short s3 = dataInput.readShort();
        short s4 = dataInput.readShort();
        short s5 = dataInput.readShort();
        short[] sArray = new short[n];
        for (int k = 0; k < n; ++k) {
            sArray[k] = dataInput.readShort();
        }
        short[] sArray2 = new short[n * 2];
        for (int k = 0; k < n * 2; ++k) {
            sArray2[k] = dataInput.readShort();
        }
        this.a.a(s2);
        this.a.b(s3);
        this.a.c(s4);
        this.a.d(s5);
        this.a.a(n2);
        this.a.a(sArray2);
        this.a.b(sArray);
    }
}

