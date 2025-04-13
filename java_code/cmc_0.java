/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmC
 */
public class cmc_0
extends Pw {
    private long a;
    private long b;
    private short c;

    @Override
    public byte[] b() {
        int n = 18;
        ByteBuffer byteBuffer = ByteBuffer.allocate(18);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.putShort(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13875;
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.b = l;
    }

    public void a(short s2) {
        this.c = s2;
    }
}

