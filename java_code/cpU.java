/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpU
extends Pw {
    private boolean a;
    private boolean b;
    private byte c;
    private byte e;

    public void a(boolean bl) {
        this.a = bl;
    }

    public void b(boolean bl) {
        this.b = bl;
    }

    public void a(byte by) {
        this.c = by;
    }

    public void b(byte by) {
        this.e = by;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.put((byte)(this.a ? 1 : 0));
        byteBuffer.put((byte)(this.b ? 1 : 0));
        byteBuffer.put(this.c);
        byteBuffer.put(this.e);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12854;
    }
}

