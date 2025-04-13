/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnn
 */
public class cnn_0
extends Pw {
    private long a;
    private long b;
    private int c;
    private int e;
    private short f;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(26);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.e);
        byteBuffer.putShort(this.f);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12777;
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.b = l;
    }

    public void a(int n, int n2, short s2) {
        this.c = n;
        this.e = n2;
        this.f = s2;
    }
}

