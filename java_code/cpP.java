/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpP
extends Pw {
    private final boolean a;

    public cpP(boolean bl) {
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
        return 12364;
    }
}

