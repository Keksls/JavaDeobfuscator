/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpQ
extends Pw {
    private boolean a;

    public void a(boolean bl) {
        this.a = bl;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        byteBuffer.put((byte)(this.a ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12123;
    }
}

