/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnm
 */
public class cnm_0
extends Pw {
    private long a;
    private long b;
    private byte c;
    private long e;
    private int f;
    private int g;
    private short h;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(35);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.e);
        byteBuffer.putLong(this.b);
        byteBuffer.put(this.c);
        byteBuffer.putInt(this.f);
        byteBuffer.putInt(this.g);
        byteBuffer.putShort(this.h);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13003;
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.e = l;
    }

    public void c(long l) {
        this.b = l;
    }

    public void a(byte by) {
        this.c = by;
    }

    public void a(int n, int n2, short s2) {
        this.f = n;
        this.g = n2;
        this.h = s2;
    }
}

