/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnH
extends Pw {
    private long a;
    private aff_1 b;

    public void a(long l) {
        this.a = l;
    }

    public void a(aff_1 aff_12) {
        this.b = aff_12;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(18);
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b.d());
        byteBuffer.putInt(this.b.e());
        byteBuffer.putShort(this.b.f());
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12254;
    }
}

