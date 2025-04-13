/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqa
extends Pw {
    private byte a;
    private byte b;
    private short c;

    public void a(byte by) {
        this.a = by;
    }

    public void b(byte by) {
        this.b = by;
    }

    public void a(short s2) {
        this.c = s2;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.put(this.a);
        byteBuffer.put(this.b);
        byteBuffer.putShort(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12672;
    }
}

