/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cnV
extends Pw {
    private final int a;
    private final long b;

    public cnV(int n, long l) {
        this.a = n;
        this.b = l;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putInt(this.a);
        byteBuffer.putLong(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13223;
    }
}

