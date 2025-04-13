/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cmZ
extends Pw {
    private int a = -1;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13481;
    }

    public void b(int n) {
        this.a = n;
    }
}

