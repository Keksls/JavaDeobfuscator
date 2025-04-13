/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnL
extends cnO {
    private byte f;
    private long g;

    @Override
    public byte[] b() {
        int n = 25;
        ByteBuffer byteBuffer = ByteBuffer.allocate(25);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.c);
        byteBuffer.putLong(this.g);
        byteBuffer.put(this.f);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13635;
    }

    public void a(long l) {
        this.g = l;
    }

    public void a(byte by) {
        this.f = by;
    }
}

