/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmR
 */
public class cmr_0
extends Pw {
    private long a;
    private int b;
    private int c;
    private short e;
    private boolean f;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(19);
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putShort(this.e);
        byteBuffer.put((byte)(this.f ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12206;
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(int n, int n2, short s2) {
        this.b = n;
        this.c = n2;
        this.e = s2;
    }

    public void c() {
        this.f = true;
    }
}

