/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpE
extends Pw {
    private byte a;
    private short b;

    public void a(byte by) {
        this.a = by;
    }

    public void a(short s2) {
        this.b = s2;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(3);
        byteBuffer.put(this.a);
        byteBuffer.putShort(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13468;
    }
}

