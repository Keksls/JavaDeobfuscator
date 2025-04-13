/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czj
 */
public class czj_1
extends Pw {
    public static final byte a = 0;
    public static final byte b = 1;
    private long c;
    private byte e;

    public void a(long l) {
        this.c = l;
    }

    public void a(byte by) {
        this.e = by;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.c);
        byteBuffer.put(this.e);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 1006;
    }
}

