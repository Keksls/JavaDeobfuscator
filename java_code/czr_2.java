/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czr
 */
public class czr_2
extends Pw {
    public static final byte a = 1;
    public static final byte b = 2;
    private long c;
    private byte e;
    private byte f;

    public void a(byte by) {
        this.e = by;
    }

    public void a(long l) {
        this.c = l;
    }

    public void b(byte by) {
        this.f = by;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.c);
        byteBuffer.put(this.e);
        byteBuffer.put(this.f);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 1129;
    }
}

