/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class PB
extends Pw {
    private byte a;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(0);
        return this.a(this.a, byteBuffer.array());
    }

    @Override
    public int a() {
        return 318;
    }

    public void a(byte by) {
        this.a = by;
    }
}

