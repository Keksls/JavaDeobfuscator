/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cmq
extends Pw {
    private final long a;
    private final int b;

    public cmq(long l, int n) {
        this.a = l;
        this.b = n;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13836;
    }
}

