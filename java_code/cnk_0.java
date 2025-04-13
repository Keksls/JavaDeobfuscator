/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnk
 */
public final class cnk_0
extends Pw {
    private long a;
    private int b;

    public void a(long l) {
        this.a = l;
    }

    public void b(int n) {
        this.b = n;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12263;
    }
}

