/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnb
extends Pw {
    private apl_1 a;
    private long b;

    @Override
    public byte[] b() {
        int n = this.a.a();
        int n2 = n * 10;
        ByteBuffer byteBuffer = ByteBuffer.allocate(8 + n2);
        byteBuffer.putLong(this.b);
        for (int k = 0; k < n; ++k) {
            int[] nArray = this.a.a(k);
            byteBuffer.putInt(nArray[0]);
            byteBuffer.putInt(nArray[1]);
            byteBuffer.putShort((short)nArray[2]);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12423;
    }

    public void a(apl_1 apl_12) {
        this.a = apl_12;
    }

    public void a(long l) {
        this.b = l;
    }
}

