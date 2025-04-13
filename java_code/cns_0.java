/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnS
 */
public class cns_0
extends cnO {
    private short f;
    private short g;

    @Override
    public byte[] b() {
        int n = 27;
        if (this.e != 0L) {
            n += 10;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.putLong(this.c);
        byteBuffer.putShort(this.g);
        if (this.e != 0L) {
            byteBuffer.put((byte)1);
            byteBuffer.putLong(this.e);
            byteBuffer.putShort(this.f);
        } else {
            byteBuffer.put((byte)0);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12309;
    }

    public void a(short s2) {
        this.f = s2;
    }

    public void b(short s2) {
        this.g = s2;
    }
}

