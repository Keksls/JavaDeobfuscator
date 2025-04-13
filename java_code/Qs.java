/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class Qs
extends Pw {
    public boolean a = true;
    private long b;
    private long c;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.b);
        byteBuffer.putLong(this.c);
        if (this.a) {
            return this.a((byte)6, byteBuffer.array());
        }
        return this.a((byte)2, byteBuffer.array());
    }

    @Override
    public final int a() {
        return 1102;
    }

    public void a(long l) {
        this.b = l;
    }

    public void b(long l) {
        this.c = l;
    }

    public void a(boolean bl) {
        this.a = bl;
    }
}

