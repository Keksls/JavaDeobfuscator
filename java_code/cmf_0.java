/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmF
 */
public class cmf_0
extends Pw {
    private long a;
    private byte b;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.a);
        byteBuffer.put(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13478;
    }

    public void a(byte by) {
        this.b = by;
    }

    public void a(long l) {
        this.a = l;
    }
}

