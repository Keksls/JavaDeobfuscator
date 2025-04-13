/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpT
extends Pw {
    private byte a;
    private boolean b;
    private long c;
    private byte e;

    public void a(byte by) {
        this.a = by;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public void a(long l) {
        this.c = l;
    }

    public void b(byte by) {
        this.e = by;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(11);
        byteBuffer.putLong(this.c);
        byteBuffer.put(this.e);
        byteBuffer.put(this.a);
        byteBuffer.put((byte)(this.b ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12261;
    }
}

