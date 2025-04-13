/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnc
extends Pw {
    private final long a;
    private final short b;

    public cnc(long l, short s2) {
        this.a = l;
        this.b = s2;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.a);
        byteBuffer.putShort(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13663;
    }
}

