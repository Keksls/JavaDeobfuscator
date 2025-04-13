/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnu
extends Pw {
    private byte a = (byte)-1;
    private short b = 0;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(3);
        byteBuffer.put(this.a);
        byteBuffer.putShort(this.b);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 14013;
    }

    public void a(short s2) {
        this.b = s2;
    }

    public void a(byte by) {
        this.a = by;
    }
}

