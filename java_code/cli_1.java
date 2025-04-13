/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cli
 */
public class cli_1
extends Pw {
    private int a;
    private long b = -1L;

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
        return 13433;
    }

    public void b(int n) {
        this.a = n;
    }

    public void a(long l) {
        this.b = l;
    }
}

