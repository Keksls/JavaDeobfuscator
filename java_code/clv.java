/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class clv
extends Pw {
    private long a;
    private long b;
    private byte c;
    private int e;
    private int f;
    private short g;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(27);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.put(this.c);
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(this.f);
        byteBuffer.putShort(this.g);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13555;
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.b = l;
    }

    public void a(byte by) {
        this.c = by;
    }

    public void a(int n, int n2, short s2) {
        this.e = n;
        this.f = n2;
        this.g = s2;
    }
}

