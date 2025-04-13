/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmJ
 */
public class cmj_0
extends Pw {
    private long a;
    private long b;

    @Override
    public byte[] b() {
        int n = 16;
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.b);
        byteBuffer.putLong(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12302;
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.b = l;
    }
}

