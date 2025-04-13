/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cmb
extends Pw {
    private final long a;
    private final bpp_1 b;

    public cmb(long l, bpp_1 bpp_12) {
        this.a = l;
        this.b = bpp_12;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16 + this.b.b());
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b.e());
        this.b.a(byteBuffer);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13795;
    }
}

