/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnW
extends cnO {
    private byte f;

    @Override
    public byte[] b() {
        int n = 33;
        ByteBuffer byteBuffer = ByteBuffer.allocate(33);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.e);
        byteBuffer.putLong(this.c);
        byteBuffer.putLong(this.b);
        byteBuffer.put(this.f);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12809;
    }

    public void a(byte by) {
        this.f = by;
    }
}

