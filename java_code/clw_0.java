/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clw
 */
public class clw_0
extends Pw {
    private long a;
    private boolean b = false;
    private int c;
    private int e;
    private short f;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9 + (this.b ? 10 : 0));
        byteBuffer.putLong(this.a);
        if (this.b) {
            byteBuffer.put((byte)1);
            byteBuffer.putInt(this.c);
            byteBuffer.putInt(this.e);
            byteBuffer.putShort(this.f);
        } else {
            byteBuffer.put((byte)0);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13727;
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(int n, int n2, short s2) {
        this.b = true;
        this.c = n;
        this.e = n2;
        this.f = s2;
    }
}

