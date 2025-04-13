/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cmw
extends Pw {
    private int a;
    private byte b;
    private long c;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(13);
        byteBuffer.putInt(this.a);
        byteBuffer.put(this.b);
        byteBuffer.putLong(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12983;
    }

    public void b(int n) {
        this.a = n;
    }

    public void a(byte by) {
        this.b = by;
    }

    public void a(long l) {
        this.c = l;
    }
}

