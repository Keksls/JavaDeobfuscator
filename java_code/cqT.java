/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqT
extends Pw {
    private final long a;
    private final long b;

    public cqT(long l, long l2) {
        this.a = l;
        this.b = l2;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13104;
    }
}

