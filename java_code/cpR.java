/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpR
extends Pw {
    private byte[] a;

    public void a(byte[] byArray) {
        this.a = byArray;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + this.a.length);
        byteBuffer.putInt(this.a.length);
        byteBuffer.put(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12432;
    }
}

