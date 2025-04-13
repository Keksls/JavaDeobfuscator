/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class PK
extends Pw {
    private Long a;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.a);
        return this.a((byte)4, byteBuffer.array());
    }

    @Override
    public int a() {
        return 742;
    }

    public void a(Long l) {
        this.a = l;
    }
}

