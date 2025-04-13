/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cBp
extends Pw {
    private long a;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.a);
        return this.a((byte)2, byteBuffer.array());
    }

    @Override
    public int a() {
        return 22318;
    }

    public void a(long l) {
        this.a = l;
    }
}

