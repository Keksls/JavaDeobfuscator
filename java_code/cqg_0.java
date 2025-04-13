/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqg
 */
public class cqg_0
extends Pw {
    private long a;
    private int b;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13777;
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(int n) {
        this.b = n;
    }
}

