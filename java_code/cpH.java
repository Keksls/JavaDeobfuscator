/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpH
extends Pw {
    private long a;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    public void a(long l) {
        this.a = l;
    }

    @Override
    public int a() {
        return 12442;
    }
}

