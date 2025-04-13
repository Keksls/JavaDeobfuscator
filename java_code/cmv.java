/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cmv
extends Pw {
    private int a;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12516;
    }

    public void b(int n) {
        this.a = n;
    }
}

