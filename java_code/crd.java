/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class crd
extends ps_0 {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private long[] d;

    public byte[] b() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        Short s2 = byteBuffer.getShort();
        this.d = new long[s2.shortValue()];
        for (int k = 0; k < s2; ++k) {
            this.d[k] = byteBuffer.getLong();
        }
        this.a = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.a);
        this.b = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.b);
        this.c = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.c);
        return true;
    }

    @Override
    public int a() {
        return 12273;
    }

    public byte[] c() {
        return ArrayUtils.clone((byte[])this.a);
    }

    public byte[] d() {
        return this.c;
    }

    public long[] e() {
        return ArrayUtils.clone((long[])this.d);
    }

    @Override
    public String toString() {
        return "CharacterInformationMessage{m_serializedCharacterInfo=" + Arrays.toString(this.a) + ", m_reservedIds=" + Arrays.toString(this.d) + "}";
    }
}

