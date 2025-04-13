/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqc
extends Pw {
    private long a;
    private byte b;
    private byte c;

    public void a(long l) {
        this.a = l;
    }

    public void a(byte by) {
        this.b = by;
    }

    public void b(byte by) {
        this.c = by;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.a);
        byteBuffer.put(this.b);
        byteBuffer.put(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13611;
    }
}

