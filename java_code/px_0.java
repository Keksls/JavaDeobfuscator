/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Px
 */
public class px_0
extends Pw {
    protected final byte a;
    protected final int b;

    public byte c() {
        return this.a;
    }

    public px_0(byte by, int n) {
        this.a = by;
        this.b = n;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(13);
        byteBuffer.put(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putLong(System.nanoTime());
        return this.a(this.a, byteBuffer.array());
    }

    @Override
    public int a() {
        return 336;
    }
}

