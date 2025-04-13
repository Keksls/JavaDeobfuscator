/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpp
 */
public class cpp_0
extends Pw {
    private long a;
    private short b;

    public void a(long l) {
        this.a = l;
    }

    public void a(short s2) {
        this.b = s2;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.a);
        byteBuffer.putShort(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13412;
    }
}

