/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clD
 */
public class cld_1
extends Pw {
    private final int a;
    private final long b;
    private final boolean c;

    public cld_1(int n, long l, boolean bl) {
        this.a = n;
        this.b = l;
        this.c = bl;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(13);
        byteBuffer.putInt(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.put(this.c ? (byte)1 : 0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12935;
    }
}

