/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class PL
extends Pw {
    private int a = 793;
    private int b;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.b);
        return this.a((byte)4, byteBuffer.array());
    }

    @Override
    public int a() {
        return this.a;
    }

    public void c() {
        this.a = 740;
    }

    public void a(int n) {
        this.b = n;
    }
}

