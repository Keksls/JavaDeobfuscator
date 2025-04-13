/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cne
extends Pw {
    private final int a;

    public cne(int n) {
        this.a = n;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12961;
    }
}

