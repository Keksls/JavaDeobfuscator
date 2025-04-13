/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmT
 */
public class cmt_0
extends Pw {
    private long a;
    private boolean b;
    private boolean c;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.a);
        byteBuffer.put(this.b ? (byte)1 : 0);
        byteBuffer.put(this.c ? (byte)1 : 0);
        return this.a((byte)3, byteBuffer.array());
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public void b(boolean bl) {
        this.c = bl;
    }

    @Override
    public int a() {
        return 13537;
    }
}

