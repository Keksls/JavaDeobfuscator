/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpt
 */
public class cpt_0
extends Pw {
    private long a;
    private long b;
    private short c;
    private long e;
    private short f = (short)-1;
    private long g = 0L;

    @Override
    public byte[] b() {
        int n = 28;
        if (this.g != 0L && this.f >= 0) {
            n += 8;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.e);
        byteBuffer.putLong(this.b);
        byteBuffer.putShort(this.c);
        if (this.f >= 0 && this.g != 0L) {
            byteBuffer.putShort(this.f);
            byteBuffer.putLong(this.g);
        } else {
            byteBuffer.putShort(this.f);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13013;
    }

    public void a(long l) {
        this.b = l;
    }

    public void a(short s2) {
        this.c = s2;
    }

    public void b(long l) {
        this.e = l;
    }

    public void b(short s2) {
        this.f = s2;
    }

    public void c(long l) {
        this.g = l;
    }

    public void e(long l) {
        this.a = l;
    }
}

