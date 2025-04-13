/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Qw
extends Pw {
    protected long a;
    protected long b;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public final int a() {
        return 1139;
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.b = l;
    }
}

