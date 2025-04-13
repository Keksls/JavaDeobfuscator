/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cAc
extends Pw {
    private int a = 0;

    public void b(int n) {
        this.a = n;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.a);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 14274;
    }
}

