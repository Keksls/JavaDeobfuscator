/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Qo
extends Pw {
    private final long a;

    public Qo(long l) {
        this.a = l;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.a);
        return this.a((byte)2, byteBuffer.array());
    }

    public long c() {
        return this.a;
    }

    @Override
    public int a() {
        return 1083;
    }
}

