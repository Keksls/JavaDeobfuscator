/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cld
 */
public class cld_0
extends Pw {
    private final int a;
    private final long b;

    public cld_0(int n, long l) {
        this.a = n;
        this.b = l;
    }

    @Override
    public byte[] b() {
        int n = 12;
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putInt(this.a);
        byteBuffer.putLong(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13659;
    }
}

