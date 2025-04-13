/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqn
 */
public class cqn_0
extends Pw {
    private int a;
    private long b;
    private long c;

    public void b(int n) {
        this.a = n;
    }

    public void a(long l) {
        this.b = l;
    }

    public void b(long l) {
        this.c = l;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        byteBuffer.putInt(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.putLong(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12038;
    }
}

