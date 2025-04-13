/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czI
 */
public class czi_2
extends Pw {
    private final long a;
    private final short b;

    public czi_2(long l, short s2) {
        this.a = l;
        this.b = s2;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.a);
        byteBuffer.putShort(this.b);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 15116;
    }
}

