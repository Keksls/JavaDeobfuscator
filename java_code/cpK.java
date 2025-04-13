/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpK
extends Pw {
    private long a;

    public void a(long l) {
        this.a = l;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13267;
    }
}

