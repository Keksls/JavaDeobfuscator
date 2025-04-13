/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.io.LittleEndianDataInputStream
 */
import com.google.common.base.Charsets;
import com.google.common.io.LittleEndianDataInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * Renamed from EN
 */
public final class en_1
implements eg_1 {
    private final LittleEndianDataInputStream a;

    public en_1(LittleEndianDataInputStream littleEndianDataInputStream) {
        this.a = littleEndianDataInputStream;
    }

    @Override
    public byte a() {
        return this.a.readByte();
    }

    @Override
    public short b() {
        return this.a.readShort();
    }

    @Override
    public int c() {
        return this.a.readInt();
    }

    @Override
    public float d() {
        return this.a.readFloat();
    }

    @Override
    public String e() {
        byte by;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((by = this.a.readByte()) != 0) {
            byteArrayOutputStream.write(by);
            if (byteArrayOutputStream.size() <= 1024) continue;
            throw new IOException("Unable to detect end String marker");
        }
        return byteArrayOutputStream.toString(Charsets.UTF_8.name());
    }

    @Override
    public byte[] a(int n) {
        byte[] byArray = new byte[n];
        this.a.read(byArray);
        return byArray;
    }

    @Override
    public short[] b(int n) {
        short[] sArray = new short[n];
        for (int k = 0; k < n; ++k) {
            sArray[k] = this.a.readShort();
        }
        return sArray;
    }

    @Override
    public int[] c(int n) {
        int[] nArray = new int[n];
        for (int k = 0; k < n; ++k) {
            nArray[k] = this.a.readInt();
        }
        return nArray;
    }

    @Override
    public float[] d(int n) {
        float[] fArray = new float[n];
        for (int k = 0; k < n; ++k) {
            fArray[k] = this.a.readFloat();
        }
        return fArray;
    }

    @Override
    public void close() {
        this.a.close();
    }
}

