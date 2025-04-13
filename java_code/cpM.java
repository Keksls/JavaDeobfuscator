/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpM
extends Pw {
    private long a;
    private boolean b;

    public void a(long l) {
        this.a = l;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.a);
        byteBuffer.put((byte)(this.b ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12366;
    }
}

