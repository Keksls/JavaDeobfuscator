/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnM
extends Pw {
    private byte a;
    private long b;

    @Override
    public byte[] b() {
        int n = 9;
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.b);
        byteBuffer.put(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12952;
    }

    public void a(byte by) {
        this.a = by;
    }

    public void a(long l) {
        this.b = l;
    }
}

