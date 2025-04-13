/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpS
extends Pw {
    private long a;
    private byte b;

    public void a(long l) {
        this.a = l;
    }

    public void a(byte by) {
        this.b = by;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.a);
        byteBuffer.put(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12830;
    }
}

