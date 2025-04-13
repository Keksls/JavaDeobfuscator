/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqj
 */
public class cqj_0
extends Pw {
    private long a;
    private long b;
    private int c;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.putInt(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12760;
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.b = l;
    }

    public void b(int n) {
        this.c = n;
    }
}

