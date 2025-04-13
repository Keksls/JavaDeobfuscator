/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqr
 */
public class cqr_0
extends Pw {
    private int a;
    private byte b;
    private int c;

    public void b(int n) {
        this.a = n;
    }

    public void a(byte by) {
        this.b = by;
    }

    public void c(int n) {
        this.c = n;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putInt(this.a);
        byteBuffer.put(this.b);
        byteBuffer.putInt(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12976;
    }
}

