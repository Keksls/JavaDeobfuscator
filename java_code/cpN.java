/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpN
extends Pw {
    private long a;
    private long b;
    private byte c;

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.b = l;
    }

    public void a(byte by) {
        this.c = by;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.put(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13967;
    }
}

